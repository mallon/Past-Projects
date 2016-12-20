<?php
$currentDirPath=ini_set('include_path', dirname(getcwd()));

function uploadRemoteImageAndAttach($imageUrl, $parentId, $author, $date){
    $get = wp_remote_get( $imageUrl );
    $type = wp_remote_retrieve_header( $get, 'content-type' );
    
    if (!$type)
        return false;
	
    $mirror = wp_upload_bits( basename( $imageUrl ), '', wp_remote_retrieve_body( $get ) );
    $attachment = array(
		'guid' => $imageUrl,
        'post_title'=> basename( $imageUrl ),
        'post_mime_type' => $type
    );
    
    if($author != ""){
	$attachment['post_author'] = $author;
    }
    if($date != ""){
	$attachment['post_date'] = $date; 
    }
    
	echo $parentId;
		
    if($parentId == ""){
	$attach_id = wp_insert_attachment( $attachment, $mirror['file']);    
    }else{
	$attach_id = wp_insert_attachment( $attachment, $mirror['file'], $parentId );    
    }
    $attach_data = wp_generate_attachment_metadata( $attach_id, $mirror['file'] );
    wp_update_attachment_metadata( $attach_id, $attach_data );
	$postContent = 	'<a href="'.wp_get_attachment_url($attach_id).'">'.
					wp_get_attachment_image($attach_id).
					'</a>'.
					get_post($parentId)->post_content
					;    
	$updatedPost = array(
      'ID'           => $parentId,
      'post_content' => $postContent
	);
	wp_update_post($updatedPost);									
    return $attach_id;
}

function copyDefaultPlugins($plugCategory){
	copy_directory('defaultPlugins/'.$plugCategory, '../wp-content/plugins');
}

function copyDefaultThemes($themeCategory){
	copy_directory('defaultThemes/'.$themeCategory, '../wp-content/themes');
}

function downloadAndActivatePlugin($plugin, $themeOrPluginFolder){
$pluginName='';
$pluginUrl='';
global $currentDirPath;
	foreach($plugin as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
				switch ($secKey) {
					case "Name": 		
						$pluginName=$secValue;
					break;
					case "Url": 		
						$pluginUrl=$secValue;
					break;
				}		
		}
	}

if ($pluginName <> "" and $pluginUrl <> ""){
	$data = file_get_contents($pluginUrl);
	$path = $currentDirPath.'\\wp-content'.$themeOrPluginFolder;
	file_put_contents($path.$pluginName.'.zip', $data);
	
	if($zip = zip_open($path.$pluginName.'.zip'))
    {
            while($entry = zip_read($zip))
            {
                    $is_file = substr(zip_entry_name($entry), -1) == '/' ? false : true;
                    $file_path = $path.zip_entry_name($entry);
                    if($is_file)
                    {
                            if(zip_entry_open($zip,$entry,"r")) 
                            {
                                    $fstream = zip_entry_read($entry, zip_entry_filesize($entry));
                                    file_put_contents($file_path, $fstream );
                                    chmod($file_path, 0777);
                            }
                            zip_entry_close($entry);
                    }
                    else
                    {
                            if(zip_entry_name($entry))
                            {
                                    mkdir($file_path);
                                    chmod($file_path, 0777);
                            }
                    }
            }
            zip_close($zip);
    }
	unlink($path.$pluginName.'.zip');
	if ($themeOrPluginFolder == '\\plugins\\'){
		activatePlugin($pluginName.'/'.$pluginName.'.php');
	}else{
		activateTheme($pluginName);
	}
}	
}

function activatePlugin($pluginNameInstaller)
{
    $current = get_option('active_plugins');
    $plugin = plugin_basename(trim($pluginNameInstaller));

    if(!in_array($plugin, $current))
    {
            $current[] = $plugin;
            sort($current);
            do_action('activatePlugin', trim($plugin));
            update_option('active_plugins', $current);
            do_action('activate_'.trim($plugin));
            do_action('activated_plugin', trim($plugin));
            return true;			
    }
    else
            return false;
}

function deleteAndDesactivatePlugin($pluginFilePathName){
	global $currentDirPath;
	$plugin = plugin_basename(trim($pluginFilePathName));
	deactivate_plugins($plugin);
	list($dirPlugin, $filePluginName) = explode("/", $plugin);
	recursiveRmdir($currentDirPath.'\\wp-content\\plugins\\'.$dirPlugin.'\\');
}

function activateTheme($themeName){
	echo 'Theme name : '.$themeName;
	update_option('template', $themeName);
	update_option('stylesheet', $themeName);
	update_option('current_theme', $themeName);
}

function deleteComment($postTitle, $postDate, $author){
	$post=get_page_by_title($postTitle, OBJECT, 'post');
	$user = get_user_by('login', $author);
	$args = array(
		'post_id' => $post->ID,
		'post_author' => $user->ID,
		'post_date' => $postDate
	);
	$comments = get_comments($args);
	$commentId=-1;
	foreach($comments as $comment){
		$commentId=$comment->comment_ID;
		wp_delete_comment($commentId);
	};	
}

function recursiveRmdir($dir) {
    foreach(glob($dir . '/*') as $file) {
        if(is_dir($file))
            recursiveRmdir($file);
        else
            unlink($file);
    }
    rmdir($dir);
}

function copy_directory( $source, $destination ) {
        if ( is_dir( $source ) ) {
        @mkdir( $destination );
        $directory = dir( $source );
        while ( FALSE !== ( $readdirectory = $directory->read() ) ) {
            if ( $readdirectory == '.' || $readdirectory == '..' ) {
                continue;
            }
            $PathDir = $source . '/' . $readdirectory; 
            if ( is_dir( $PathDir ) ) {
                copy_directory( $PathDir, $destination . '/' . $readdirectory );
                continue;
            }
            copy( $PathDir, $destination . '/' . $readdirectory );
        }

        $directory->close();
        }else {
        copy( $source, $destination );
        }
}
?>