<?php 
ini_set('include_path', dirname(getcwd()));
include('wp-admin/includes/user.php');

function buildDeletions($deletions){	
	foreach($deletions as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildDeletion($secValue);
		}
	}	
}

function buildDeletion($deletion){
	foreach($deletion as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "Page": 		
					deleteElements($secValue); //OK!				
				break;	
				case "Post": 		
					deleteElements($secValue); //OK!				
				break;	
				case "User": 		
					deleteElements($secValue); //OK!				
				break;
				case "Media": 		
					deleteElements($secValue); //OK!				
				break;
				case "Functionnality": 
					deleteElements($secValue); //OK!				
				break;
				case "Plugin": 		
					deleteElements($secValue);//OK!				
				break;
				case "Category": 		
					deleteElements($secValue);//OK!			
				break;
				case "Tag": 		
					deleteElements($secValue); //OK!				
				break;
				case "Menu": 		
					deleteElements($secValue); //OK!				
				break;
				case "Comment": 		
					deleteElements($secValue); //OK!					
				break;
			}
		}
	}
}	

function deleteElements($elements){
$title="";
$author="";
$functionalityName="";
$socialNetwork="";
	foreach($elements as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			switch ($secKey) {	
				case "PagesByTitle": 	
					$page=get_page_by_title(htmlspecialchars($secValue));
					wp_delete_post($page->ID, true);
				break;
				case "UsersByLogin": 		
					$user = get_user_by('login', $secValue);
					wp_delete_user($user->ID);					
				break;
				case "MediasByTitle": 		
					$unattached = array(
						'post_type' => 'attachment',
						'post_title' => $secValue
					);
					$attachment = get_posts($unattached);
					wp_delete_attachment($attachment[0]->ID);					
				break;
				case "PluginsByFileName": 
					deleteAndDesactivatePlugin($secValue);
				break;
				case "CategoriesByName": 
					$catId=get_cat_ID($secValue);
					wp_delete_category($catId);
				break;
				case "TagsByName": 
					$tag=get_term_by('name', $secValue, 'post_tag');
					wp_delete_term($tag->term_id, 'post_tag');
				break;
				case "MenusByName": 
					$menu=get_term_by('name', $secValue, 'nav_menu');
					wp_delete_term($menu->term_id, 'nav_menu');
				break;
				case "PostsByTitle": 
					while(get_page_by_title(htmlspecialchars($secValue), "OBJECT", "post") != NULL){
						$post=get_page_by_title(htmlspecialchars($secValue), "OBJECT", "post");
						wp_delete_post($post->ID, true);
					}					
				break;
				case "PostTitle": 
					$title = $secValue;
				break;
				case "CommentDate": 
					$postDate = $secValue;
				break;
				case "CommentAuthorName": 
					$author = $secValue;
				break;	
				case "FunctionalityType": 		
					$functionalityName = $secValue;
				break;		
				case "SocialNetwork": 
					$socialNetwork = $secValue;
				break;	
			}
			if ($title != "" and $author != "" and $postDate != ""){
				deleteComment($title, $postDate, $author);
			}
			if ($functionalityName != "" or $socialNetwork != ""){
				deleteDefaultPlugin($functionalityName, $socialNetwork);
			}	
		}
	}
}

?>