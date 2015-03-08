<?php 
ini_set('include_path', dirname(getcwd()));
include_once('wp-admin/includes/plugin.php');

$currentDirPath=dirname(getcwd());

function buildFieldFunctionalities($functionalities){
	foreach($functionalities as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneFunctionality($secValue);
		}
	}	
}
function buildFieldOneFunctionality($oneFunctionality){
$url = '';
$functionalityName = '';
$socialNetwork = '';
	foreach($oneFunctionality as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 		
					$functionalityId = $secValue;
				break;
				case "FunctionalityType": 					
					$functionalityName = $secValue;
				break;		
				case "SocialNetworks": 
					$socialNetwork = $secValue;
				break;	
				case "Plugin": 
					downloadAndActivatePlugin($secValue, '\\plugins\\');
				break;
			}
		}	
	}	
setDefaultPlugin($functionalityName, $socialNetwork);
}

function setDefaultPlugin($functionality, $socialNetwork){
	switch ($functionality) {
		case "eCommerce": 		
			copyDefaultPlugins('ECommerce');
			activatePlugin('woocommerce/woocommerce.php');
		break;
		case "forms": 
			copyDefaultPlugins('Forms');
			activatePlugin('contact-form-7/wp-contact-form-7.php');
		break;
		case "hamSpam": 		
			copyDefaultPlugins('HamSpam');
			activatePlugin('si-contact-form/si-contact-form.php');
		break;
		case "indexing": 		
			copyDefaultPlugins('Indexing');
			activatePlugin('google-sitemap-generator/sitemap.php');
		break;
		case "multilanguage": 		
			copyDefaultPlugins('Multilanguage');
			activatePlugin('qtranslate/qtranslate.php');
		break;
		case "pictures": 		
			copyDefaultPlugins('Pictures');
			activatePlugin('nextgen-gallery/nggallery.php');
		break;
		case "seo": 		
			copyDefaultPlugins('SEO');
			activatePlugin('all-in-one-seo-pack/all_in_one_seo_pack.php');
		break;
		case "socialNetwork": 	
			switch (strtolower($socialNetwork)){
				case "facebook": 		
				copyDefaultPlugins('SocialNetworks/Facebook');
				activatePlugin('facebook/facebook.php');
				break;
				case "twitter": 	
					copyDefaultPlugins('SocialNetworks/Twitter');
					activatePlugin('twitter-widget-pro/wp-twitter-widget.php');
				break;
			}
		break;
	}
}

function deleteDefaultPlugin($functionality, $socialNetwork){
	switch ($functionality) {
		case "eCommerce": 		
			deleteAndDesactivatePlugin('woocommerce/woocommerce.php');
		break;
		case "forms": 
			deleteAndDesactivatePlugin('contact-form-7/wp-contact-form-7.php');
		break;
		case "hamSpam": 		
			deleteAndDesactivatePlugin('si-contact-form/si-contact-form.php');
		break;
		case "indexing": 		;
			deleteAndDesactivatePlugin('google-sitemap-generator/sitemap.php');
		break;
		case "multilanguage": 		
			deleteAndDesactivatePlugin('qtranslate/qtranslate.php');
		break;
		case "pictures": 		
			deleteAndDesactivatePlugin('nextgen-gallery/nggallery.php');
		break;
		case "SEO": 		
			deleteAndDesactivatePlugin('all-in-one-seo-pack/all_in_one_seo_pack.php');
		break;
		case "socialNetwork": 	
			switch (strtolower($socialNetwork)){
				case "facebook": 		
				deleteAndDesactivatePlugin('facebook/facebook.php');
				break;
				case "twitter": 	
					deleteAndDesactivatePlugin('twitter-widget-pro/wp-twitter-widget.php');
				break;
			}
		break;
	}
}

?>