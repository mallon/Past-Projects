<?php 
ini_set('include_path', dirname(getcwd()));

function buildFieldSettings($settings){
	foreach($settings as $key => $value) { 
		foreach($value as $secKey => $secValue) {				
			switch ($secKey) {	
				case "GeneralSettings": 
					buildFieldGeneralSettings($secValue);
				break;
				case "WritingSettings": 					
					buildFieldWritingSettings($secValue);
				break;			
				case "ReadingSettings": 
					buildFieldReadingSettings($secValue);
				break;
				case "DiscussionSettings": 
					buildFieldDiscussionSettings($secValue);
				break;
				case "MediaSettings": 
					buildFieldMediaSettings($secValue);
				break;
				case "PermaLinkSettings": 
					buildFieldPermaLinkSettings($secValue);
				break;
			}
		}	
	}	
}
function buildFieldGeneralSettings($generalSettings){
	foreach($generalSettings as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "WebsiteTitle": 			
					update_option( 'blogname', $secValue );
				break;
				case "WebsiteTagline": 			
					update_option( 'blogdescription', $secValue );
				break;
				case "WebsiteAdress": 			
					update_option( 'home', $secValue );
				break;
				case "AdminMail": 	
					update_option( 'admin_email', $secValue );
				break;
				case "UserDefaultRole": 		
					update_option( 'default_role', $secValue );
				break;			
				case "TimeZone": 
					update_option( 'gmt_offset', intval($secValue));
				break;
				case "DateFormat": 
					update_option( 'date_format', $secValue );
				break;
				case "TimeFormat": 
					update_option( 'time_format', $secValue );
				break;
				case "WeekStartOn": 
					$day=1;
					switch ($secValue) {
						case "Sunday":$day=0; break;
						case "Monday":$day=1; break;
						case "Tuesday":$day=2; break;
						case "Wednesday":$day=3; break;
						case "Thursay":$day=4; break;
						case "Friday":$day=5; break;
						case "Saturday":$day=6; break;
					};
					update_option( 'start_of_week', $day);
				break;
				case "WordPressAdress": 
					update_option( 'siteurl', $secValue );
				break;				
				case "IsPublic": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'users_can_register', $flag );
				break;
			}
		}	
	}	
}

function buildFieldWritingSettings($writingSettings){
foreach($writingSettings as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "MailServer": 			
					update_option( 'mailserver_url', $secValue );
				break;
				case "Port": 			
					update_option( 'mailserver_port', $secValue );
				break;
				case "LoginName": 	
					update_option( 'mailserver_login', $secValue );
				break;
				case "Password": 		
					update_option( 'mailserver_pass', $secValue );
				break;			
				case "DefaultPostCategory": 					
					update_option( 'default_category', $categoriesCreated[$secValue]);
				break;
				case "DefaultMailCategory": 					
					update_option( 'default_email_category', $categoriesCreated[$secValue]);
				break;
				case "IsConvertingEmoticons": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'use_smilies', $flag );
				break;
				case "IsCorrectingInvalidXHTML": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'use_balanceTags', $flag );
				break;
			}
		}	
	}	
}
function buildFieldReadingSettings($readingSettings){
foreach($readingSettings as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "MaxNumberPostsForBlogPages":
					update_option( 'posts_per_page', $secValue );
				break;
				case "NumberRecentItemForFeeds": 			
					update_option( 'posts_per_rss', $secValue );
				break;
				case "IsDisplayingLastPostInFront": 					
					$flag="";
					switch ($secValue) {
						case 'false':$flag="page"; break;
						case 'true':$flag="posts"; break;
					}
					update_option( 'show_on_front', $flag);
				break;			
				case "IsIndexed": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'blog_public', $flag );
				break;
				case "IsShowingFullTextForFeed": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'rss_use_excerpt', $flag );
				break;
			}
		}	
	}
}

function buildCrossRefReadingSettings($readingSettings){
global $postsPageCreated;
	foreach($readingSettings as $key => $value) { 
		foreach($value as $secKey => $secValue) {				
			switch ($secKey) {	
				case "ReadingSettings": 
					foreach($secValue as $triKey => $triValue) {
						foreach($triValue as $quadKey => $quadValue) {
							switch ($quadKey) {	
								case "StaticFrontPage": 	
									update_option( 'page_on_front', $postsPageCreated[$quadValue]);
								break;
								case "StaticPostPage": 	
									update_option( 'page_for_posts', $postsPageCreated[$quadValue]);
								break;
							}
						}
					}	
				break;
			}
		}
	}		
}

function buildFieldDiscussionSettings($discussionSettings){
foreach($discussionSettings as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "NumberArticleDaysForAutoCloseComments":
					update_option( 'close_comments_days_old', $secValue );
					update_option( 'close_comments_for_old_posts', 1);					
				break;
				case "NestedCommentsLevel": 			
					update_option( 'thread_comments_depth', $secValue );
				break;
				case "NumberCommentsPerPageForBreakedComments": 
					update_option( 'comments_per_page', $secValue);
				break;			
				case "NumberOfLinksInCommentForModeration": 
					update_option( 'comment_max_links', $secValue );
				break;
				case "ModeratedWord": 
					update_option( 'moderation_keys', $secValue );
				break;
				case "ForbiddenWords": 
					update_option( 'blacklist_keys', $secValue );
				break;
				case "MaxAvatarRating": 
					update_option( 'avatar_rating', $secValue );
				break;
				case "UserDefaultAvatar": 
					update_option( 'avatar_default', $secValue );
				break;
				case "IsNotifyingLinkedBlogs": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'default_pingback_flag', $flag );
				break;
				case "IsAllowingLinkNotificationsFromBlogs": 
					$flag="";
					switch ($secValue) {
						case 'false':$flag="closed"; break;
						case 'true':$flag="open"; break;
					}
					update_option( 'default_ping_status', $flag );
				break;
				case "IsAllowingPublicComments": 
					$flag="";
					switch ($secValue) {
						case 'false':$flag="closed"; break;
						case 'true':$flag="open"; break;
					}
					update_option( 'default_comment_status', $flag );
				break;
				case "IsAskingNameAndMailCommentAuthor": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'require_name_email', $flag );
				break;
				case "IsAllowingAnonymousComments": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'comment_registration', $flag );
				break;
				case "IsBreakingCommentsIntoPages": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'page_comments', $flag );
				break;
				case "IsDisplayingLastPageForBreakedComments": 
					$flag='';
					switch ($secValue) {
						case 'false':$flag="newer"; break;
						case 'true':$flag="older"; break;
					}
					update_option( 'default_comments_page', $flag );
				break;
				case "IsDisplayingOlderCommentForEachPage": 
					$flag="";
					switch ($secValue) {
						case 'false':$flag="asc"; break;
						case 'true':$flag="desc"; break;
					}
					update_option( 'comment_order', $flag );
				break;
				case "IsMailingAdminForEachComments": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'comments_notify', $flag );
				break;
				case "IsHeldingCommentForModeration": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'moderation_notify', $flag );
				break;
				case "IsAskingAdminApprovement": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'comment_moderation', $flag );
				break;
				case "IsAskingPreviousAdminApprovement": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'comment_whitelist', $flag );
				break;
				case "IsShowingAvatar": 
					$flag=0;
					switch ($secValue) {
						case 'false':$flag=0; break;
						case 'true':$flag=1; break;
					}
					update_option( 'show_avatars', $flag );
				break;
			}
		}	
	}
}

function buildFieldMediaSettings($mediaSettings){
	foreach($mediaSettings as $key => $value) {
			foreach($value as $secKey => $secValue) {
				switch ($secKey) {	
					case "ThumbnailWidth":
						update_option( 'thumbnail_size_w', $secValue );				
					break;
					case "ThumbnailHeight": 			
						update_option( 'thumbnail_size_h', $secValue );
					break;
					case "MediumWidth": 			
						update_option( 'medium_size_w', $secValue );
					break;
					case "MediumHeight": 			
						update_option( 'medium_size_h', $secValue );
					break;
					case "LargeWidth": 			
						update_option( 'large_size_w', $secValue );
					break;
					case "LargeHeight": 			
						update_option( 'large_size_h', $secValue );
					break;
					case "IsCroppingThumbnailToExactDims": 	
						$flag=0;
						switch ($secValue) {
							case 'false':$flag=0; break;
							case 'true':$flag=1; break;
						}
						update_option( 'thumbnail_crop', $flag );
					break;
					case "IsOrganizeUploadsIntoFolders": 
						$flag=0;
						switch ($secValue) {
							case 'false':$flag=0; break;
							case 'true':$flag=1; break;
						}
						update_option( 'uploads_use_yearmonth_folders', $flag );
					break;
				}
			}
	}	
}
function buildFieldPermaLinkSettings($permaLinkSettings){
		foreach($permaLinkSettings as $key => $value) {
			foreach($value as $secKey => $secValue) {
				switch ($secKey) {	
					case "UrlForm":
						$flag="";
						switch ($secValue) {
							case defaultForm:$flag=null; break;
							case dayAndName:$flag='/%year%/%monthnum%/%day%/%postname%/'; break;
							case customStructure:$flag=$secValue; break;
							case monthAndName:$flag='/%year%/%monthnum%/%postname%/'; break;
							case numeric:$flag='/archives/%post_id%'; break;
							case postName:$flag='/%postname%/'; break;
						}
						update_option( 'permalink_structure', $flag );				
					break;
					case "UrlCategoryBase": 			
						update_option( 'category_base', $secValue );
					break;
					case "UrlTagBase": 			
						update_option( 'tag_base', $secValue );
					break;
				}
			}
		}			
}
?>