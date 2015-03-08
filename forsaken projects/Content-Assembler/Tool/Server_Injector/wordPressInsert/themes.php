<?php 
ini_set('include_path', dirname(getcwd()));

$currentDirPath=dirname(getcwd());

function buildFieldThemes($themes){
	foreach($themes as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneTheme($secValue);
		}
	}	
}

function buildFieldOneTheme($oneTheme){
$url = '';
$themeName = '';
	foreach($oneTheme as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 		
					$themeId = $secValue;
				break;
				case "ThemeType": 					
					$themeName = $secValue;
				break;
				case "Plugin": 
					downloadAndActivatePlugin($secValue, '\\themes\\');
				break;
			}
		}	
	}	
setDefaultTheme($themeName);
}

function setDefaultTheme($functionality){
	switch ($functionality) {
		case "responsive": 		
			copyDefaultThemes('Responsive');
			activateTheme('responsive');
		break;
		case "seo": 
			copyDefaultThemes('SEO');
			activateTheme('swift-basic');
		break;
		case "headerParallaxEffect": 		
			copyDefaultThemes('HPE');
			activateTheme('sixteen');
		break;
		case "business": 		 
			copyDefaultThemes('Business');
			activateTheme('alexandria');
		break;
		case "magazine": 		
			copyDefaultThemes('Magazine');
			activateTheme('ridizain');
		break;
		case "galleries": 		
			copyDefaultThemes('Galleries');
			activateTheme('pinboard');
		break;
	}
}

?>