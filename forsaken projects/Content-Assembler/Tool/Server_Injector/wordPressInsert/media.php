<?php 
ini_set('include_path', dirname(getcwd()));

function buildFieldMedias($Medias)
{
    foreach($Medias as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneMedia($secValue);
		}
	}	
}
function buildFieldOneMedia($oneMedia){
$newMedia = array();
$mediaId= "";
$url = "";
	foreach($oneMedia as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 			
					$mediaId = $secValue;
				break;
				case "Url": 					
					$url = $secValue;
				break;			
				case "Date": 
					$date = $secValue;
				break;
				case "Author": 
					$author= $secValue;
				break;
				case "UploadedTo": 
					$postId = $secValue;
				break;
			}
		}	
	}	
$postIdBDD = $GLOBALS['postsPageCreated'][$postId];
$mediaIdBDD = uploadRemoteImageAndAttach($url, $postIdBDD, $date, $author);
$GLOBALS['mediasCreated'][$mediaId] = $mediaIdBDD;
return $mediasCreated;
}
?>