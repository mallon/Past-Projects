<?php 
$currentDirPath=ini_set('include_path', dirname(getcwd()));
include('wp-admin/includes/bookmark.php');
echo $currentDirPath.'themes.php';
include($currentDirPath.'\wordPressInsert\themes.php');

function buildFieldAppearance($appearance){
	foreach($appearance as $key => $value) { 
		foreach($value as $secKey => $secValue) {				
			switch ($secKey) {	
				case "Themes": 
					buildFieldThemes($secValue);
				break;
				case "Header": 
					//TODO : changes do nothing...
					buildFieldHeader($secValue);
				break;	
				case "Widgets": 	
					buildFieldWidgets($secValue);
				break;
			}
		}	
	}	
}

//TODO : changes do nothing...
function buildFieldHeader($header){
$headerValues = array();
foreach($header as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "DefaultImage": 	
					$flag=0;
					switch ($secValue) {
						case 'false':$day=0; break;
						case 'true':$day=1; break;					
					}
					$headerValues['random-default'] = $flag;
				break;
				case "TextColor": 	
					$headerValues['default-text-color'] = $secValue;
				break;
				case "isShowingHeaderText": 	
					$flag=0;
					switch ($secValue) {
						case true:$day=1; break;
						case false:$day=0; break;
					}	
					$headerValues['header-text'] = $flag;
				break;				
				case "UploadImage": 			
					$headerValues['default-image'] = $secValue;
				break;
			}
		}	
	}
	
add_theme_support( 'custom-header', $headerValues );	
}

function buildCrossRefAppearance($appearance){
	foreach($appearance as $key => $value) { 
		foreach($value as $secKey => $secValue) {				
			switch ($secKey) {	
				case "Menus": 
					buildCrossRefMenus($secValue);
				break;
			}
		}
	}
}

//TODO : menu are correctly added, but pages, links and categories are not considered (?)
function buildCrossRefMenus($menus){	
$idPageBDD = array();
$idCatBDD = array();
$linkIds = array();
$menuIdBDD = 0;

	foreach($menus as $key => $value) {
		foreach($value as $secKey => $secValue) {
			foreach($secValue as $triKey => $triValue) {    
				foreach(get_object_vars($triValue)as $quadKey => $quadValue) {
					switch ($quadKey) {	
						
						case "MenuName": 	
							$menuIdBDD = wp_create_nav_menu($quadValue);
						break;	
						case "Links": 
							$linkIds = buildLinks($quadValue);
						break;
						case "Categories": 
							$i=0;
							foreach($quadValue as $quinKey => $quinValue) {	
								foreach(get_object_vars($quinValue) as $sixKey => $sixValue) {	
											$idCatBDD[$i] = $GLOBALS['categoriesCreated'][$sixValue];
											$i++;
								}
							}						
						break;	
						case "Pages": 
							$i=0;
							foreach($quadValue as $quinKey => $quinValue) {	
								foreach(get_object_vars($quinValue) as $sixKey => $sixValue) {	
											$idPageBDD[$i] = $GLOBALS['postsPageCreated'][$sixValue];
											$i++;
								}
							}	
						break;				
					}
				}
			}
			foreach($idPageBDD as $key => $value) {	
				$pageArray = array('menu-item-object-id' => $value,
									// 'menu-item-parent-id' => 0,
									// 'menu-item-position'  => 0,
									'menu-item-object' => 'page',												   
									'menu-item-type' => 'post_type',
									'menu-item-status' => 'publish');
				$thisMenuItem = wp_update_nav_menu_item($menuIdBDD, 0, $pageArray);	
			}
			foreach($idCatBDD as $key => $value) {	
				$catArray = array('menu-item-title' => get_the_category($value) -> name,
													   'menu-item-object' => 'category',
													   'menu-item-object-id' => $value);
				wp_update_nav_menu_item($menuIdBDD, 0, $catArray);	
			}
			foreach($linkIds as $key => $value) {	
				wp_update_nav_menu_item($menuIdBDD, 0, array('menu-item-title' => get_bookmark($value) -> link_name,
													   'menu-item-object' => 'link',
													   'menu-item-object-id' => $value)
				);
			}	
		}
	}			
								   
}

function buildLinks($links){
$linkData = array();
$linkIds = array();
$i = 0;
	foreach($links as $key => $value) {	
		foreach(get_object_vars($value) as $secKey => $secValue) {
				switch ($secKey) {	
					case "Name":
						$linkData['link_name']=$secValue;
					break;
					case "Url":
						$linkData['link_url']=$secValue;
					break;
					case "Text":
						$linkData['link_notes']=$secValue;
					break;
				}
			$linkIds[$i] = wp_insert_link($linkData);
			$i++;
		}
	}	
return $linkIds;
}	

function buildFieldWidgets($widgets){
	foreach($widgets as $key => $value) { 
		foreach($value as $secKey => $secValue) {
			buildFieldWidget($secValue);
		}
	}	
}
	
function buildFieldWidget($widget){

$mainWidgetArea = array();
$secondWidgetArea = array();
$severalWidg = array();
$counter=0;
$paramWidg=array($mainWidgetArea, $secondWidgetArea,  $severalWidg, $counter);
$type='';
foreach($widget as $key => $value) {
		 foreach(get_object_vars($value) as $secKey => $secValue) {
			$counter++;
			 switch ($secKey) {	
				 case "Type": 
					 $type='sidebar-1';
					 if ($secValue == 'secondaryArea'){
						 $type = 'sidebar-2';
					 }
				 break;
				 case "Calendars": 
					$newCDRS=buildCDRS($secValue);
					$paramWidg = setWidgetToSidebar($newCDRS, "calendar", $type, $paramWidg);
				 break;
				 case "WidgetCategories":
					$newCTS=buildCTS($secValue);
					$paramWidg = setWidgetToSidebar($newCTS, "categories", $type, $paramWidg);			
				 break;
				 case "WidgetMenus": 
					$newMNS=buildMNS($secValue);
					$paramWidg = setWidgetToSidebar($newMNS, "nav_menu", $type, $paramWidg);
				 break;			
				 case "WidgetFeeds": 
					$newFDS=buildFDS($secValue);
					$paramWidg = setWidgetToSidebar($newFDS, "rss", $type, $paramWidg);
				 break;
				 case "Metas": 
					$newMTS=buildMTS($secValue);
					$paramWidg = setWidgetToSidebar($newMTS, "meta", $type, $paramWidg);
				 break;
				 case "Archives": 
					$newACVS=buildACVS($secValue);
					$paramWidg = setWidgetToSidebar($newACVS, "archives", $type, $paramWidg);
				 break;				
				 case "WidgetPages": 
					$newPGS=buildPGS($secValue);
					$paramWidg = setWidgetToSidebar($newPGS, "pages", $type, $paramWidg);
				 break;
				 case "RecentComments": 
					$newCMTS=buildCMTS($secValue);
					$paramWidg = setWidgetToSidebar($newCMTS, "recent-comments", $type, $paramWidg);
				 break;
				 case "RecentsPosts":
					$newPSTS=buildPSTS($secValue);
					$paramWidg = setWidgetToSidebar($newPSTS, "recent-posts", $type, $paramWidg);
				 break;
				 case "Texts": 					 
					$newTXS=buildTXS($secValue);
					$paramWidg = setWidgetToSidebar($newTXS, "text", $type, $paramWidg);
				 break;
				 case "Searchs": 	
					$newSCS=buildSCS($secValue);
					$paramWidg = setWidgetToSidebar($newSCS, "search", $type, $paramWidg);
				 break;
				 case "TagClouds": 
					$newTGS=buildTGS($secValue);
					$paramWidg = setWidgetToSidebar($newTGS, "tag_cloud", $type, $paramWidg);
				 break;
				
			 }
		 }	
	 }
 update_option('sidebars_widgets', array("sidebar-1" => $paramWidg[0], "sidebar-2" => $paramWidg[1]));
}

function setWidgetToSidebar($arrayForWidget, $widgetName, $sidebarName, $paramWidg){
	foreach($arrayForWidget as $triKey => $triValue){
		if ($sidebarName == "sidebar-1"){		
			$paramWidg[0][$paramWidg[3]]=$widgetName."-".$paramWidg[3];
		}else{
			$paramWidg[1][$paramWidg[3]]=$widgetName."-".$paramWidg[3];
		}
		$paramWidg[2][$paramWidg[3]] = $triValue;
		update_option( 'widget_'.$widgetName, $paramWidg[2]);		
		$paramWidg[3]++;
	}
	$paramWidg[2] = array();
return $paramWidg;	
}

function buildCDRS($calendars){
$newCDRS = array();
$counter = 0;
	foreach($calendars as $key => $value) {
		$newCDRS = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newCDR['title'] = $quadValue;
						break;
					}	
				}
			}		
		}
		$newCDRS[$counter] = $newCDR;
		$counter++;
	}	

return $newCDRS;
}

function buildCTS($categories){
$newCTS = array();
$counter = 0;
	foreach($categories as $key => $value) {
		$newCT = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newCT['title'] = $quadValue;
						break;
						case "NumberOfDisplayedPosts": 
							$newCT['count'] = intval($quadValue);
						break;
						case "IsDisplayingSubCat": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newCT['hierarchical'] = $flag;
						break;
						case "IsDropDownList": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newCT['dropdown'] = $flag;
						break;
					}	
				}
			}		
		}
		$newCTS[$counter] = $newCT;
		$counter++;
	}	

return $newCTS;
}

function buildMNS($menus){
$newMNS = array();
$counter = 0;
	foreach($menus as $key => $value) {
		$newMN = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newMN['title'] = $quadValue;
						break;
						case "SelectedMenu": 
							$newMN['selectmenu'] = $quadValue;
						break;
					}	
				}
			}		
		}
		$newMNS[$counter] = $newMN;
		$counter++;
	}	

return $newMNS;
}

function buildFDS($feeds){
$newFDS = array();
$counter = 0;
	foreach($feeds as $key => $value) {
		$newFD = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newFD['title'] = $quadValue;
						break;
						case "DisplayItemContent": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newFD['show_summary'] = $flag;
						break;
						case "DisplayItemAuthor": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newFD['show_author'] = $flag;
						break;
						case "DisplayItemDate": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newFD['show_date'] = $flag;
						break;
						case "NumberOfItems": 
							$newFD['items'] = $quadValue;
						break;
						case "Url": 
							$newFD['url'] = $quadValue;
						break;
					}	
				}
			}		
		}
		$newFDS[$counter] = $newFD;
		$counter++;
	}	

return $newFDS;
}

function buildMTS($metas){
$newMTS = array();
$counter = 0;
	foreach($metas as $key => $value) {
		$newMT = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newMT['title'] = $quadValue;
						break;
					}	
				}
			}		
		}
		$newMTS[$counter] = $newMT;
		$counter++;
	}	

return $newMTS;
}

function buildACVS($archives){
$newACVS = array();
$counter = 0;
	foreach($archives as $key => $value) {
		$newACV = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newACV['title'] = $quadValue;
						break;
						case "IsDisplayingAsDropDown": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newACV['dropdown'] = $flag;
						break;
						case "IsShowingPostsCount": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newACV['count'] = $flag;
						break;
					}	
				}
			}		
		}
		$newACVS[$counter] = $newACV;
		$counter++;
	}	

return $newACVS;
}

function buildPGS($pages){
$newPGS = array();
$counter = 0;
	foreach($pages as $key => $value) {
		$newPST = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newPG['title'] = $quadValue;
						break;
						case "PageSorter": 
							$newPG['sortby'] = $quadValue;
						break;
						case "PageExcluded": 
							$newPG['exclude'] = $quadValue;
						break;
					}	
				}
			}		
		}
		$newPGS[$counter] = $newPG;
		$counter++;
	}	

return $newPGS;
}

function buildCMTS($rctComments){
$newCMTS = array();
$counter = 0;
	foreach($rctComments as $key => $value) {
		$newPST = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newCMT['title'] = $quadValue;
						break;
						case "NumberOfDisplayedComments": 
							$newCMT['number'] = $quadValue;
						break;
					}	
				}
			}		
		}
		$newCMTS[$counter] = $newCMT;
		$counter++;
	}	

return $newCMTS;
}

function buildPSTS($rctPosts){
$newPSTS = array();
$counter = 0;
	foreach($rctPosts as $key => $value) {
		$newPST = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newPST['title'] = $quadValue;
						break;
						case "NumberOfDisplayedPosts": 
							$newPST['number'] = $quadValue;
						break;
						case "IsDisplayingPostDate": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newPST['show_date'] = $flag;
						break;
					}	
				}
			}		
		}
		$newPSTS[$counter] = $newPST;
		$counter++;
	}	

return $newPSTS;
}

function buildTGS($tagCloud){
$newTGS = array();
$counter = 0;
	foreach($tagCloud as $key => $value) {
		$newTG = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newTG['title'] = $quadValue;
						break;
						case "Taxonomy": 
							$newTG['taxonomy'] = $quadValue;
						break;			
					}	
				}
			}		
		}
		$newTGS[$counter] = $newTG;
		$counter++;
	}	

return $newTGS;
}

function buildSCS($search){
$newSCS = array();
$counter = 0;
	foreach($search as $key => $value) {
		$newSC = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newSC['title'] = $quadValue;
						break;			
					}	
				}
			}		
		}
		$newSCS[$counter] = $newSC;
		$counter++;
	}	

return $newSCS;
}

function buildTXS($text){
$newTXS = array();
$counterText = 0;
	foreach($text as $key => $value) {
		$newTX = array();
		foreach(get_object_vars($value) as $secKey => $secValue) {	
			foreach($secValue as $triKey => $triValue) {
				foreach(get_object_vars($triValue) as $quadKey => $quadValue) {
					switch ($quadKey) {	
						case "Title": 
							$newTX['title'] = $quadValue;
						break;
						case "Content": 
							$newTX['text'] = $quadValue;
						break;
						case "IsAutoParagraphs": 
							$flag=0;
							switch ($quadValue) {
								case 'false':$flag=0; break;
								case 'true':$flag=1; break;					
							}
							$newTX['filter'] = $flag;
						break;				
					}	
				}
			}		
		}
		$newTXS[$counterText] = $newTX;
		$counterText++;
	}	

return $newTXS;
}

?>