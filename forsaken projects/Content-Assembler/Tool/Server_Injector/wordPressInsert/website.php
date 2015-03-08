<?php 
ini_set('include_path', dirname(getcwd()));

//Get data
echo '<html>
    <head>
		<title>Creation of WordPress configuration using official WordPress API and default 2013 Wordpress team theme (\'Twenty Thirteen\')</title>
    </head>
    <body>';
$data=$_REQUEST['jsonValues'];
$jsonDecoded = json_decode($data);
$ws = $jsonDecoded->Website;

//*******************************************************************************************************

//TODO: problem with the call to 'wp_load.php' and the use of 'gzuncompress'  after.
//Redefinition of 'gzuncompress' in 'wp-load.php' ???
require("/wp-load.php");
require ("wp-admin/includes/image.php");
include('tools.php');
include('pages.php');
include('users.php');
include('posts.php');
include('categories.php');
include('tags.php');
include('media.php');
include('functionnalities.php');
include('settings.php');
include('appearance.php');
include('comments.php');
include('deletions.php');

$usersCreated = array();
$postsPageCreated = array();
$categoriesCreated = array();
$tagsCreated = array();
$mediasCreated = array();
$commentsCreated = array();

build($ws);
buildCrossRef($ws);
//Exception for 'Comments' and 'Medias', because the 'Comment' update method 
//does not allow modification of Post ID (only its creation method)
//and 'Medias' need post/page bdd id.
buildCommentsAndMedia($ws);

function build($ws){
	foreach($ws as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			//We need to firstly build all no-cross-references fields
			switch ($secKey) {
				case "Appearance": 
					//Bugs : 1) 'CustomHeader' changes are not considered (?); 2) 'Menus' are added, but Pages/Links/Categories added are not considered (?).
					//3) Stay some bugs on different widget fields (unprecise documentation...)
					buildFieldAppearance($secValue);
				break;
				case "Categories": 
					buildFieldCategories($secValue);//OK !
				break;
				case "Tags": 
					buildFieldTags($secValue);//OK !
				break;				
				case "Functionnalities": 
					buildFieldFunctionalities($secValue);//OK !
				break;
				case "Settings": 
					buildFieldSettings($secValue); // 1/2 OK ==> Bug on "IsDisplayingLastPageForBreakedComments" 
												  //("default_comments_page")
				break;
				case "Users": 
					buildFieldUsers($secValue);//OK !
				break;
				case "Pages":					
					buildFieldPages($secValue); //OK !
				break;
				case "Posts": 
					buildFieldPosts($secValue);// 1/2 OK ==> stay one bug with link between cat. and post.
				break;
				case "Deletions":
					buildDeletions($secValue);
				break;		
			}
		}
	}
}

function buildCrossRef($ws){
	foreach($ws as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			//All fields  exists : we can build cross-references
			switch ($secKey) {
				case "Appearance": 
					//Bugs : Menus' are added, but Pages/Links/Categories added are not considered (?).
					buildCrossRefAppearance($secValue);					
					break;
				case "Pages":				
					buildCrossRefPages($secValue);//OK !
					break;
				case "Posts": 
					buildCrossRefPosts($secValue);//OK !
					break;
				case "Settings": 
					buildCrossRefReadingSettings($secValue);//OK !
					break;							
			}
		}
	}	
}

function buildCommentsAndMedia($ws){
	foreach($ws as $key => $value) {    
			foreach(get_object_vars($value)as $secKey => $secValue) {
				switch ($secKey) {
					case "Comments": 
						//Only 'Comments' is directly in the function
						buildFieldComments($secValue); //OK !
						break;	
					case "MediaLibrary": 
						buildFieldMedias($secValue);//OK !
					break;	
				}
			}
	}		
}
echo '</body>
</html>';
?>