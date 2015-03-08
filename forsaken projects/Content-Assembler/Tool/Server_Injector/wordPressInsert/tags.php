<?php 
ini_set('include_path', dirname(getcwd()));

function buildFieldTags($tags)
{
    foreach($tags as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneTag($secValue);
		}
	}	
}
function buildFieldOneTag($oneTag){
$newTag = array();
$tagId= "";
$tagName = "";
foreach($oneTag as $key => $value) {
	foreach($value as $secKey => $secValue) {
		switch ($secKey) {	
			case "IdName": 			
				$tagId = $secValue;
			break;
			case "Name": 					
				$tagName= $secValue;
			break;			
			case "Description": 
				$newTag['description'] = $secValue;
			break;
			case "Slug": 
				$newTag['slug'] = $secValue;
			break;
		}
	}	
}	
	
$tagIdBDD = wp_insert_Term($tagName, 'post_tag', $newTag);
$GLOBALS['tagsCreated'][$tagId] = $tagIdBDD;
return $tagsCreated;
}

?>