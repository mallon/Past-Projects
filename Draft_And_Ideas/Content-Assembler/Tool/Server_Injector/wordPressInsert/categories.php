<?php 
ini_set('include_path', dirname(getcwd()));
include('wp-admin/includes/taxonomy.php');

function buildFieldCategories($categories)
{
    foreach($categories as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneCategory($secValue);
		}
	}	
}
function buildFieldOneCategory($oneCategory){
$newCategory = array();
$categoryId= "";
$newCategory['taxonomy'] = 'category';
	foreach($oneCategory as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 			
					$categoryId = $secValue;
				break;
				case "Name": 					
					$newCategory['cat_name'] = $secValue;
				break;			
				case "Description": 
					$newCategory['category_description'] = $secValue;
				break;
				case "Slug": 
					$newCategory['category_nicename'] = $secValue;
				break;
			}
		}	
	}		
$categoryIdBDD = wp_insert_category($newCategory);
$GLOBALS['categoriesCreated'][$categoryId] = $categoryIdBDD;
}
?>