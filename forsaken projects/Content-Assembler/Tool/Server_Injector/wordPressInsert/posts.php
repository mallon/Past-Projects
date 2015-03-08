<?php 
ini_set('include_path', dirname(getcwd()));
include_once('tools.php');

function buildFieldPosts($posts){	
	foreach($posts as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOnePost($secValue);
		}
	}	
}
function buildFieldOnePost($onePost){
global $postsPageCreated;
$newPost = array('post_type' => 'post');
$url = '';
$postId = '';
$format = '';
	foreach($onePost as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 		
					$postId = $secValue;					
				break;		
				case "Format": 		
					$format = $secValue;	
				break;
				case "Title": 
					$newPost['post_title'] = $secValue;
				break;
				case "Status": 
					$newPost['post_status'] = $secValue;
				break;
				case "Content": 
					$newPost['post_content'] = $secValue;
				break;
				case "FeaturedImage": 
					$url = $secValue;
				break;
			}
		}	
	}	
$postIdBDD = wp_insert_post($newPost);
$featureImID = uploadRemoteImageAndAttach($url, $postIdBDD, "", "");
update_post_meta( $postIdBDD, '_thumbnail_id', $featureImID );
set_post_format( $postIdBDD , $format);
$GLOBALS['postsPageCreated'][$postId]=$postIdBDD;
return $postsPageCreated;
}

function buildCrossRefPosts($pages){
	foreach($pages as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildCrossRefOnePost($secValue);
		}
	}	
}
function buildCrossRefOnePost($onePost){
$updatePost = array();
$idPost = '';
	foreach($onePost as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 	
					$updatePost['ID'] = $GLOBALS['postsPageCreated'][$secValue];
					$idPost = $updatePost['ID'];
				break;
				case "Author": 	
					$updatePost['post_author'] = $GLOBALS['usersCreated'][$secValue];
				break;
				case "Categories": 
					//$post_categories = explode(",", $secValue);
					//$post_categories_ID = array();
					//foreach ($post_categories as $catKey => $catValue){
					//	$post_categories_ID[$catKey] = get_cat_ID($catValue);
					//}					
					wp_set_post_categories($idPost, $secValue);
				break;			
				case "Tags": 
					//$post_tags = explode(",", $secValue);
					//$post_tags_ID = array();
					//foreach ($post_tags as $tagKey => $tagValue){
					//	$tagId = get_term_by('name', $tagValue, 'post_tag')->term_id;
					//	$post_tags_ID[$tagKey] = $tagId;
					//}	
					wp_set_post_tags($idPost, $secValue);
				break;
			}	
		}
	}
wp_update_post($updatePost);	
}
?>