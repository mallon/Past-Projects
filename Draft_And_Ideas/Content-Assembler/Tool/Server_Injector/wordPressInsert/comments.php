<?php 
ini_set('include_path', dirname(getcwd()));
include_once('tools.php');

function buildFieldComments($comments){	
	foreach($comments as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneComment($secValue);
		}
	}	
}
function buildFieldOneComment($oneComment){
$newComment = array();
$newComment['comment_approved'] = 1;
$newComment['comment_type'] = 'comment';
$url = '';
$commentId = '';
	foreach($oneComment as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {
				case "IdName": 
					$commentId = $secValue;
				break;
				case "Content": 
					$newComment['comment_content'] = $secValue;
				break;
				case "AuthorComment": 				
					$newComment['comment_author'] = $secValue;
				break;
				case "CommentPostPage": 	
					$newComment['comment_post_ID'] = $GLOBALS['postsPageCreated'][$secValue];
				break;
			}
		}	
	}
$idCommentBDD = wp_insert_comment($newComment);
$GLOBALS['commentsCreated'][$commentId]=$idCommentBDD;
}
?>