<?php 
ini_set('include_path', dirname(getcwd()));
include_once('tools.php');

function buildFieldPages($pages){
	foreach($pages as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOnePage($secValue);
		}
	}	
}
function buildFieldOnePage($onePage){
$newPage = array('post_type' => 'page');
$url = '';
$postId = '';
	foreach($onePage as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 		
					$postId = $secValue;
				break;
				case "PageOrder": 
					$newPage['menu_order'] = $secValue;
				break;			
				case "Title": 
					$newPage['post_title'] = $secValue;
				break;
				case "PublicationDate": 
					$newPage['post_date'] = $secValue;
				break;
				case "Status": 
					$newPage['post_status'] = $secValue;
				break;
				case "PublicationDateGMT": 
					$newPage['post_date_gmt'] = $secValue;
				break;
				case "Content": 
					$newPage['post_content'] = $secValue;
				break;
				case "FeaturedImage": 
					$url = $secValue;
				break;			
			}
		}	
	}	
	
$postIdBDD = wp_insert_post($newPage);
$featureImID = uploadRemoteImageAndAttach($url, $postIdBDD, "", $newPage['post_date']);
update_post_meta( $postIdBDD, '_thumbnail_id', $featureImID );
$GLOBALS['postsPageCreated'][$postId]=$postIdBDD;
}

function buildCrossRefPages($pages){
	foreach($pages as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildCrossRefOnePage($secValue);
		}
	}	
}
function buildCrossRefOnePage($onePage){
$updatePage = array();
$idPage = 0;
	foreach($onePage as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 	
					$updatePage['ID'] = $GLOBALS['postsPageCreated'][$secValue];
					$idPage = $updatePage['ID'];
				break;
				case "Author": 	
					$updatePage['post_author'] = $GLOBALS['usersCreated'][$secValue];
				break;
				case "ParentPage": 
					$updatePage['post_parent'] = $GLOBALS['postsPageCreated'][$secValue];
				break;
			}	
		}
	}
wp_update_post($updatePage);	
}
?>