package org.inria.wordpress.WdpConfModel2JSON;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.inria.wordpress.WdpConfModel2JSON.tools.WdpConfModel2JSONTools;
import org.inria.wordpress.wdpdsl.wdpDsl.Appearance;
import org.inria.wordpress.wdpdsl.wdpDsl.Archive;
import org.inria.wordpress.wdpdsl.wdpDsl.Calendar;
import org.inria.wordpress.wdpdsl.wdpDsl.Category;
import org.inria.wordpress.wdpdsl.wdpDsl.Comment;
import org.inria.wordpress.wdpdsl.wdpDsl.Deletion;
import org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Functionality;
import org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Link;
import org.inria.wordpress.wdpdsl.wdpDsl.Media;
import org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Menu;
import org.inria.wordpress.wdpdsl.wdpDsl.Meta;
import org.inria.wordpress.wdpdsl.wdpDsl.Page;
import org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Plugin;
import org.inria.wordpress.wdpdsl.wdpDsl.Post;
import org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor;
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage;
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl;
import org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Search;
import org.inria.wordpress.wdpdsl.wdpDsl.Settings;
import org.inria.wordpress.wdpdsl.wdpDsl.Tag;
import org.inria.wordpress.wdpdsl.wdpDsl.TagCloud;
import org.inria.wordpress.wdpdsl.wdpDsl.Text;
import org.inria.wordpress.wdpdsl.wdpDsl.Theme;
import org.inria.wordpress.wdpdsl.wdpDsl.User;
import org.inria.wordpress.wdpdsl.wdpDsl.Website;
import org.inria.wordpress.wdpdsl.wdpDsl.Widget;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost;
import org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.functionalities;
import org.inria.wordpress.wdpdsl.wdpDsl.themes;

public class WdpConfModel2JSON {


	public WdpConfModel2JSON(URI uriModel) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(uriModel, true);
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject webSite = resource.getContents().get(0);
		
		Settings settings = (Settings) webSite.eGet(WdpConfModel2JSONTools.getStructFeatureAttribute(WdpConfModel2JSONTools
																								.getStructFeatureEList(webSite), "settings"));		
		GeneralSettings generalSettings = settings.getGeneral(); 
		String wordPressUrl = generalSettings.getWordPressAdress().getPathUrl();
										
		buildWebsiteJSON((Website)webSite, wordPressUrl);
	}

	private void buildWebsiteJSON(Website webSite, String wordPressUrl){
		String[] values = {
							buildUsersJSON(webSite), buildAppearanceJSON(webSite), buildCategoryJSON(webSite),
							buildMediaJSON(webSite), buildPagesJSON(webSite), buildPostsJSON(webSite),
							buildSettingsJSON(webSite), buildTagJSON(webSite), buildFunctionnalitiesJSON(webSite),
							buildComments(webSite), buildDeletion(webSite)
		};
		String postValuesList = WdpConfModel2JSONTools.toJsonArrayObject(	
										"Website", 
										WdpConfModel2JSONTools.toMultiJsonElement(values)
		);		
		executePHP(wordPressUrl,  postValuesList, "website.php");
	}
					
	private String buildUsersJSON(Website webSite){
				
		EList<User> users = webSite.getUsers();			
		if (users != null){
			String usersTab = "";
			for (User user : users){
										
				String keys[] = {"IdName", "UserName", "Password", "Role", "FirstName", "LastName", "NickName", 
								"PublicName", "Email", "Website", "Biography"
				};	
				String values[] = {	user.getName(), user.getUserName(), user.getPassword(), user.getUserRole().getLiteral(), user.getFirstName(),
									user.getLastName(), user.getNickName(), user.getPublicName(),
									user.getEmail(), user.getWebSite(), user.getBiography()
				};	
				
				List<List<String>> keysAndValues = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				usersTab += WdpConfModel2JSONTools.toJsonArrayObject("User", WdpConfModel2JSONTools
																				.toJsonObjectList(keysAndValues.get(0),
																									keysAndValues.get(1)));
							
				if (StringUtils.isNotBlank(usersTab) & user != users.get(users.size()-1)){
					usersTab += ",";
				}
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("Users",usersTab);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Users", "");
	}
	
	private String buildPostsJSON(Website webSite){
		
		EList<Post> posts = webSite.getPosts();		
		if (posts != null){
			String postsTab = "";
			for (Post post : posts){
				String categories = "";
				for (Category cat : post.getCategories()){
					categories += cat.getCategoryName();
					if (StringUtils.isNotBlank(categories) & WdpConfModel2JSONTools.isNotLastValue(cat, post.getCategories().toArray())){
						categories += ",";
					}
				}
				String tags = "";
				for (Tag tag : post.getTags()){
					tags += tag.getTagName();
					if (StringUtils.isNotBlank(tags) & WdpConfModel2JSONTools.isNotLastValue(tag, post.getTags().toArray())){
						tags += ",";
					}
				}
				
				String keys [] = {"IdName", "Format", "Categories", "Tags"};
				String values [] = {post.getName(), post.getFormat().getLiteral(), categories, tags};
				
				List<List<String>> keysAndValues = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				postsTab += WdpConfModel2JSONTools.toJsonArrayObject("Post", WdpConfModel2JSONTools
																				.toJsonObjectList(keysAndValues.get(0),
																									keysAndValues.get(1))
																				+ "," + getCommonAttributes(post)
							);
				
				if (StringUtils.isNotBlank(postsTab) & WdpConfModel2JSONTools.isNotLastValue(post, posts.toArray())){
					postsTab += ",";
				}
				
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("Posts",postsTab);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Posts", "");
	}
	
	private String buildPagesJSON(Website webSite){
		
		EList<Page> pages = webSite.getPages();		
		if (pages != null){
			String pagesTab = "";
			for (Page page : pages){		
				
				String parentStr = (page.getParent() == null?"": page.getParent().getName());
				
				System.out.println("Page parent : " + parentStr);
				
				String keys [] = {"IdName", "ParentPage", "PageOrder"};
				String values [] = {page.getName(), parentStr, String.valueOf(page.getOrder())};
				
				List<List<String>> keysAndValues = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				pagesTab += WdpConfModel2JSONTools.toJsonArrayObject("Page", WdpConfModel2JSONTools
																				.toJsonObjectList(keysAndValues.get(0),
																									keysAndValues.get(1))
																				+ "," + getCommonAttributes(page)
							);
				
				if (StringUtils.isNotBlank(pagesTab) & WdpConfModel2JSONTools.isNotLastValue(page, pages.toArray())){
					pagesTab += ",";
				}
			}		
					
			return WdpConfModel2JSONTools.toJsonArrayObject("Pages", pagesTab);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Pages", "");
	}
	
	private String buildAppearanceJSON(Website webSite){
		
		Appearance appearance = webSite.getAppearance();
		if (appearance != null){
				
			String others = "";
			
			String themeStr = "";
			for (Theme theme : appearance.getTheme()){
				String [] themeKeys = {"IdName", "ThemeType"};
				String[] themeAttr = {theme.getName(), theme.getThemeType().getLiteral()};
				List<List<String>> kVMenu = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(themeKeys, themeAttr);
				String themeAttrStr =  WdpConfModel2JSONTools.toJsonObjectList(kVMenu.get(0), kVMenu.get(1));
								
				Plugin plugin = theme.getDefaultPlugin();
				String pluginStr = "";
				if (plugin != null){
					String plugKeys [] = {"Name", "Url"};
					String plugValues [] = {plugin.getPluginName(), plugin.getUrl()==null?"":plugin.getUrl().getPathUrl()};
					List<List<String>> kVPlug= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(plugKeys, plugValues);
					pluginStr = WdpConfModel2JSONTools.toJsonArrayObject("Plugin", WdpConfModel2JSONTools.toJsonObjectList(kVPlug.get(0), kVPlug.get(1)));
				}
				
				String[] content = {themeAttrStr, pluginStr};
				themeStr = WdpConfModel2JSONTools.toJsonArrayObject("Theme", WdpConfModel2JSONTools.toMultiJsonElement(content));
								
				if (StringUtils.isNotBlank(themeStr) & WdpConfModel2JSONTools.isNotLastValue(theme, appearance.getTheme().toArray())){
					themeStr += ",";
				}	
			}
			others += WdpConfModel2JSONTools.toJsonArrayObject("Themes", themeStr);			
			
			String [] headerKeys = {"RandomImage", "TextColor", "IsShowingHeader"};
			String[] headerAttributes = {appearance.getAppearanceHeader()==null?"":String.valueOf(appearance.getAppearanceHeader().isRandomImage()), 
							appearance.getAppearanceHeader()==null?"":WdpConfModel2JSONTools.removeQuote(appearance.getAppearanceHeader().getTextColor()),
							String.valueOf(appearance.getAppearanceHeader()==null?"":appearance.getAppearanceHeader().isIsShowingHeaderText())
			};
			List<List<String>> kV = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(headerKeys, headerAttributes);
			others += WdpConfModel2JSONTools.manageComma(
										WdpConfModel2JSONTools.toJsonArrayObject("Header",
																						WdpConfModel2JSONTools
																							.toJsonArrayObject("Header", WdpConfModel2JSONTools
																															.toJsonObjectList(kV.get(0),kV.get(1))
																							)
																					)
																					, "before"
			);

			String menuStr = "";
			for (Menu menu : appearance.getAppearanceMenus()){
				String [] menuKeys = {"IdName", "MenuName"};
				String[] menuAttr = {menu.getName(), menu.getMenuName()};
				List<List<String>> kVMenu = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(menuKeys, menuAttr);
				String menusAttrStr =  WdpConfModel2JSONTools.toJsonObjectList(kVMenu.get(0), kVMenu.get(1));
				
				String categories = WdpConfModel2JSONTools.toJsonArrayObject("Categories",WdpConfModel2JSONTools
																												.toJsonObjectListGenKey("CategoryId", 
																														menu.getCategories().toArray()));
				String pages = WdpConfModel2JSONTools.toJsonArrayObject("Pages",WdpConfModel2JSONTools.toJsonObjectListGenKey("PageId", 
																												menu.getPages().toArray()));
				
				String linksStr = "";
				for (Link link : menu.getLinks()){				
					String keys [] = {"Name", "Url", "Text"};
					String values [] = {link.getName(), link.getUrl()==null?"":link.getUrl().getPathUrl(), link.getText()};
					List<List<String>> kVLink = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					linksStr += WdpConfModel2JSONTools.toJsonObjectList(kVLink.get(0), kVLink.get(1));
					if (StringUtils.isNotBlank(linksStr) & WdpConfModel2JSONTools.isNotLastValue(link, menu.getLinks().toArray())){
						linksStr += ",";
					}
				}
				String links = WdpConfModel2JSONTools.toJsonArrayObject("Links",linksStr);	
												
				String[] content = {menusAttrStr, categories, links, pages};
				menuStr = WdpConfModel2JSONTools.toJsonArrayObject("Menu", WdpConfModel2JSONTools.toMultiJsonElement(content));
								
				if (StringUtils.isNotBlank(menuStr) & WdpConfModel2JSONTools.isNotLastValue(menu, appearance.getAppearanceMenus().toArray())){
					menuStr += ",";
				}	
			}
			others += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("Menus", menuStr), "before");
			
			String[] widgetTabs = new String[appearance.getWidgets().size()];
			int i = 0;
			for (Widget widget : appearance.getWidgets()){
				String widgetTab = "";
				String calendarStr = "";
				for (Calendar calendar : widget.getCalendars()){				
					String keys [] = {"Title"};
					String values [] = {calendar.getTitle()};
					List<List<String>> kVCal = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					calendarStr += WdpConfModel2JSONTools.toJsonArrayObject("Calendar",WdpConfModel2JSONTools
																								.toJsonObjectList(kVCal.get(0), kVCal.get(1)));
					if (StringUtils.isNotBlank(calendarStr) & WdpConfModel2JSONTools.isNotLastValue(calendar, widget
																													.getCalendars().toArray())){
						calendarStr += ",";
					}
				}
				widgetTab +=  WdpConfModel2JSONTools.toJsonArrayObject("Calendars",calendarStr);
								
				String catStr = "";
				for (WidgetCategorie widgetCategorie : widget.getCategories()){				
					String keys [] = {"Title", "NumberOfDisplayedPosts", "IsDisplayingSubCat", "IsDropDownList"};
					String values [] = {widgetCategorie.getTitle(), String.valueOf(widgetCategorie.getNumberOfDisplayedPosts()), 
										String.valueOf(widgetCategorie.isIsDisplayingSubCat()), String.valueOf(widgetCategorie.isIsDropDownList())
					};
					List<List<String>> kVCat = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					catStr += WdpConfModel2JSONTools.toJsonArrayObject("WidgetCategory",WdpConfModel2JSONTools.toJsonObjectList(kVCat.get(0), kVCat.get(1)));

					if (StringUtils.isNotBlank(catStr) & WdpConfModel2JSONTools.isNotLastValue(widgetCategorie, widget.getCategories().toArray())){
						catStr += ",";
					}
				}
				widgetTab +=  WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("WidgetCategories",catStr), "before");
							
				String widgetMenusStr = "";
				for (WidgetMenu widgetMenu : widget.getCustomMenus()){				
					String keys [] = {"Title", "SelectedMenu"};
					String values [] = {widgetMenu.getTitle(), widgetMenu.getSelectedMenu()==null?"":widgetMenu.getSelectedMenu().getName()};
					List<List<String>> kVWidgMenu = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					widgetMenusStr += WdpConfModel2JSONTools.toJsonArrayObject("WidgetMenu",
																						WdpConfModel2JSONTools
																									.toJsonObjectList(kVWidgMenu.get(0), kVWidgMenu.get(1)));

					if (StringUtils.isNotBlank(widgetMenusStr) & WdpConfModel2JSONTools.isNotLastValue(widgetMenu, widget.getCustomMenus().toArray())){
						widgetMenusStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("WidgetMenus", widgetMenusStr), "before");
								
				String feeds = "";
				for (WidgetFeed widgetFeed : widget.getFeeds()){				
					String keys [] = {"Title", "DisplayItemContent", "DisplayItemAuthor", "DisplayItemDate", "NumberOfItems", "Url"};
					String values [] = {	widgetFeed.getTitle(), String.valueOf(widgetFeed.isIsDisplayingItemAuthor()),
											String.valueOf(widgetFeed.isIsDisplayingItemContent()),
											String.valueOf(widgetFeed.isIsDisplayingItemDate()), String.valueOf(Integer.valueOf(widgetFeed.getNumberOfItems())), 
											widgetFeed.getUrl()==null?"":widgetFeed.getUrl().getPathUrl()
					};
					
					List<List<String>> kVWidgFeed = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);	
					feeds +=WdpConfModel2JSONTools.toJsonArrayObject("WidgetFeed",WdpConfModel2JSONTools
																									.toJsonObjectList(kVWidgFeed.get(0), kVWidgFeed.get(1)));

					if (StringUtils.isNotBlank(feeds) & WdpConfModel2JSONTools.isNotLastValue(widgetFeed, widget.getFeeds().toArray())){
						feeds += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("WidgetFeeds", feeds), "before");
								
				String metaStr = "";
				for (Meta meta : widget.getMetas()){				
					String keys [] = {"Title", };
					String values [] = {meta.getTitle()};					
					
					List<List<String>> kVWidgMeta = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);	
					metaStr += WdpConfModel2JSONTools.toJsonArrayObject("Meta",WdpConfModel2JSONTools
																							.toJsonObjectList(kVWidgMeta.get(0), kVWidgMeta.get(1)));

					if (StringUtils.isNotBlank(metaStr) & WdpConfModel2JSONTools.isNotLastValue(meta, widget.getMetas().toArray())){
						metaStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("Metas", metaStr), "before");
								
				String archStr = "";
				for (Archive archive : widget.getWidgetArchives()){				
					String keys [] = {"Title", "IsDisplayingAsDropDown", "IsShowingPostsCount"};
					String values [] = {archive.getTitle(), String.valueOf(archive.isIsDisplayingAsDropDown()),
										String.valueOf(archive.isIsShowingPostsCount())};
					
					List<List<String>> kVWidgArchi = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);	
					archStr += WdpConfModel2JSONTools.toJsonArrayObject("Archive",WdpConfModel2JSONTools
																							.toJsonObjectList(kVWidgArchi.get(0), kVWidgArchi.get(1)));
					
					if (StringUtils.isNotBlank(archStr) & WdpConfModel2JSONTools.isNotLastValue(archive, widget.getWidgetArchives().toArray())){
						archStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("Archives", archStr), "before");
								
				widgetTab+= WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonObject("Type", 
																											widget.getType()==null?""
																													:widget.getType().getLiteral(), false)
																										    , "before"
				);
											
				String widgetPages = "";
				for (WidgetPage widgetPage : widget.getPages()){				
					String keys [] = {"Title", "PageSorter", "PageExcluded"};
					String values [] = {	widgetPage.getTitle(), widgetPage.getWidgetPagesSorter().getLiteral(),
											widgetPage.getIdPageExcluded()==null?"":widgetPage.getIdPageExcluded().getName()
					};
					List<List<String>> kVWidgPage= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					widgetPages +=WdpConfModel2JSONTools.toJsonArrayObject("WidgetPage",WdpConfModel2JSONTools
																									.toJsonObjectList(kVWidgPage.get(0), kVWidgPage.get(1)));

					if (StringUtils.isNotBlank(widgetPages) & WdpConfModel2JSONTools.isNotLastValue(widgetPage, widget.getPages().toArray())){
						widgetPages += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("WidgetPages", widgetPages), "before");
								
				String commStr = "";
				for (WidgetComment comment : widget.getRecentComments()){				
					String keys [] = {"Title", "NumberOfDisplayedComments"};
					String values [] = {comment.getTitle(), String.valueOf(Integer.valueOf(comment.getNumberOfDisplayedComments()))};
					List<List<String>> kVWidgComm= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);										
					commStr += WdpConfModel2JSONTools.toJsonArrayObject("RecentComment",WdpConfModel2JSONTools
																								.toJsonObjectList(kVWidgComm.get(0), kVWidgComm.get(1)));

					if (StringUtils.isNotBlank(commStr) & WdpConfModel2JSONTools.isNotLastValue(comment, widget.getRecentComments().toArray())){
						commStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("RecentComments", commStr), "before");
								
				String postStr = "";
				for (WidgetPost post : widget.getRecentPosts()){				
					String keys [] = {"Title", "NumberOfDisplayedPosts", "IsDisplayingPostDate"};
					String values [] = {post.getTitle(), String.valueOf(Integer.valueOf(post.getNumberOfDisplayedPosts())), 
										String.valueOf(post.isIsDisplayingPostDate())};
					List<List<String>> kVWidgPost= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);	
					postStr += WdpConfModel2JSONTools.toJsonArrayObject("RecentPost",WdpConfModel2JSONTools
																									.toJsonObjectList(kVWidgPost.get(0), kVWidgPost.get(1)));

					if (StringUtils.isNotBlank(postStr) & WdpConfModel2JSONTools.isNotLastValue(post, widget.getRecentPosts().toArray())){
						postStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("RecentsPosts", postStr), "before");
										
				String textStr = "";
				for (Text text : widget.getTexts()){				
					String keys [] = {"Title", "Content", "IsAutoParagraphs"};
					String values [] = {text.getTitle(), text.getContent(), String.valueOf(text.isIsAutoParagraphs())};
					List<List<String>> kVWidgTxt= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					textStr += WdpConfModel2JSONTools.toJsonArrayObject("Text",WdpConfModel2JSONTools
																							.toJsonObjectList(kVWidgTxt.get(0), kVWidgTxt.get(1)));

					if (StringUtils.isNotBlank(textStr) & WdpConfModel2JSONTools.isNotLastValue(text, widget.getTexts().toArray())){
						textStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("Texts", textStr), "before");
									
				String searchStr = "";
				for (Search search : widget.getSearchs()){				
					String keys [] = {"Title"};
					String values [] = {search.getTitle()};
					List<List<String>> kVWidgSrc= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					searchStr += WdpConfModel2JSONTools.toJsonArrayObject("Search",WdpConfModel2JSONTools
																								.toJsonObjectList(kVWidgSrc.get(0), kVWidgSrc.get(1)));

					if (StringUtils.isNotBlank(searchStr) & WdpConfModel2JSONTools.isNotLastValue(search, widget.getSearchs().toArray())){
						searchStr += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("Searchs", searchStr), "before");
								
				String clouds = "";
				for (TagCloud tagCloud : widget.getTagClouds()){				
					String keys [] = {"Title", "Taxonomy"};
					String values [] = {tagCloud.getTitle(), String.valueOf(tagCloud.getTaxonomy())};	
					List<List<String>> kVWidgCld= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
					clouds +=WdpConfModel2JSONTools.toJsonArrayObject("TagCloud",WdpConfModel2JSONTools
																						.toJsonObjectList(kVWidgCld.get(0), kVWidgCld.get(1)));
					if (StringUtils.isNotBlank(clouds) & WdpConfModel2JSONTools.isNotLastValue(tagCloud, widget.getTagClouds().toArray())){
						clouds += ",";
					}
				}
				widgetTab += WdpConfModel2JSONTools.manageComma(WdpConfModel2JSONTools.toJsonArrayObject("TagClouds", clouds), "before");
				widgetTabs[i] = WdpConfModel2JSONTools.toJsonArrayObject("Widget",widgetTab);		
				i++;
			}
			
			String[] content = {others, WdpConfModel2JSONTools.toJsonArrayObject("Widgets", WdpConfModel2JSONTools.toMultiJsonElement(widgetTabs))};
			return WdpConfModel2JSONTools.toJsonArrayObject("Appearance", WdpConfModel2JSONTools.toMultiJsonElement(content));
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Appearance", "");
	}
	
	private String buildSettingsJSON(Website webSite){
		Settings settings = webSite.getSettings();
		if (settings != null){
			String general = "";
			GeneralSettings generalSettings = settings.getGeneral();
			if (generalSettings != null){
				String keys [] = {	"WebsiteTitle", "WebsiteTagline", "WebsiteAdress", 
									"AdminMail", "UserDefaultRole", "TimeZone", 
									"DateFormat", "TimeFormat", 
									"WeekStartOn", "WordPressAdress", 
									"IsPublic"
				};
				String values [] = {generalSettings.getWebsiteTitle(), generalSettings.getWebsiteTagline(), generalSettings.getWebsiteAdress(),
									generalSettings.getAdminMail(), generalSettings.getUserDefaultRole().getLiteral(), 
									String.valueOf(Integer.valueOf(generalSettings.getTimeZone())),
									generalSettings.getGsDateFormat().getLiteral(), generalSettings.getGsTimeFormat().getLiteral(),
									generalSettings.getWeekStartsOn().getLiteral(), generalSettings.getWordPressAdress()==null?"":
																											generalSettings.getWordPressAdress()
																													.getPathUrl(),
									String.valueOf(generalSettings.isIsPublic())
				};
				List<List<String>> kVSetgen= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				general = WdpConfModel2JSONTools.toJsonObjectList(kVSetgen.get(0), kVSetgen.get(1));
			}	
			
			String writing = "";
			WritingSettings writingSettings = settings.getWriting();
			if (writingSettings != null){
				String keys [] = {	"MailServer", "Port", "LoginName", "Password", "DefaultPostCategory", "IsConvertingEmoticons",
									"IsCorrectingInvalidXHTML", "DefaultMailCategory"};
				String values [] = {writingSettings.getMailServer(), 
									String.valueOf(Integer.valueOf(writingSettings.getPort())), writingSettings.getLoginName(),
									writingSettings.getPassword(), writingSettings.getDefaultPostCategory()==null?""
																				:writingSettings.getDefaultPostCategory().getName(),
									String.valueOf(writingSettings.isIsConvertingEmoticons()),
									String.valueOf(writingSettings.isIsCorrectingInvalidXHTML()), String.valueOf(writingSettings.getDefaultMailCategory())
				};
				List<List<String>> kVSetwrit= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				writing = WdpConfModel2JSONTools.toJsonObjectList(kVSetwrit.get(0), kVSetwrit.get(1));
			}	
			
			String reading = "";
			ReadingSettings readingSettings = settings.getReading();
			if (readingSettings != null){
				String keys [] = {	"MaxNumberPostsForBlogPages", "NumberRecentItemForFeeds", "StaticFrontPage", "StaticPostPage",
									"IsDisplayingLastPostInFront", "IsIndexed", "IsShowingFullTextForFeed"
				};
				String values [] = {String.valueOf(Integer.valueOf(readingSettings.getMaxNumberPostsForBlogPages())), 
									String.valueOf(Integer.valueOf(readingSettings.getNumberRecentItemForFeeds())), 
									readingSettings.getStaticFrontPage()==null?"":readingSettings.getStaticFrontPage().getName(),
									readingSettings.getStaticPostPage()==null?"":readingSettings.getStaticPostPage().getName(),
									String.valueOf(readingSettings.isIsDisplayingLastPostInFront()), 
									String.valueOf(readingSettings.isIsIndexed()), String.valueOf(readingSettings.isIsShowingFullTextForFeed())
				};
				List<List<String>> kVSetwrit= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				reading = WdpConfModel2JSONTools.toJsonObjectList(kVSetwrit.get(0), kVSetwrit.get(1));
			}	
			
			String discussion = "";
			DiscussionSettings discussionSet = settings.getDiscussion();
			if (discussionSet != null){
				String keys [] = {	"NumberArticleDaysForAutoCloseComments", "NestedCommentsLevel", "NumberCommentsPerPageForBreakedComments",
									"NumberOfLinksInCommentForModeration", "ModeratedWord", "ForbiddenWords", "MaxAvatarRating",
									"UserDefaultAvatar", "IsNotifyingLinkedBlogs", "IsAllowingLinkNotificationsFromBlogs",
									"IsAllowingPublicComments", "IsAskingNameAndMailCommentAuthor", "IsAllowingAnonymousComments",
									"IsBreakingCommentsIntoPages", "IsDisplayingLastPageForBreakedComments",
									"IsDisplayingOlderCommentForEachPage", "IsMailingAdminForEachComments",
									"IsHeldingCommentForModeration", "IsAskingAdminApprovement", 
									"IsAskingPreviousAdminApprovement", "IsShowingAvatar"
				};
				String values [] = {String.valueOf(Integer.valueOf(discussionSet.getNumberArticleDaysForAutoCloseComments())),
									String.valueOf(Integer.valueOf(discussionSet.getNestedCommentsLevel())),
									String.valueOf(Integer.valueOf(discussionSet.getNumberCommentsPerPageForBreakedComments())),
									String.valueOf(Integer.valueOf(discussionSet.getNumberOfLinksInCommentForModeration())),
									discussionSet.getModeratedWords(), discussionSet.getForbiddenWords(), 
									discussionSet.getMaxAvatarRating().getLiteral(),discussionSet.getUserDefaultAvatar().getLiteral(),
									String.valueOf(discussionSet.isIsNotifyingLinkedBlogs()),
									String.valueOf(discussionSet.isIsAllowingLinkNotificationsFromBlogs()), 
									String.valueOf(discussionSet.isIsAllowingPublicComments()),
									String.valueOf(discussionSet.isIsAskingNameAndMailCommentAuthor()),
									String.valueOf(discussionSet.isIsAllowingAnonymousComments()),
									String.valueOf(discussionSet.isIsBreakingCommentsIntoPages()),
									String.valueOf(discussionSet.isIsdisplayingLastPageForBreakedComments()),
									String.valueOf(discussionSet.isIsDisplayingOlderCommentForEachPage()),
									String.valueOf(discussionSet.isIsMailingAdminForEachComments()),
									String.valueOf(discussionSet.isIsHeldingCommentForModeration()),
									String.valueOf(discussionSet.isIsAskingAdminApprovement()),
									String.valueOf(discussionSet.isIsAskingPreviousAdminApprovement()),
									String.valueOf(discussionSet.isIsShowingAvatar())
				};
				List<List<String>> kVSetdisc= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				discussion = WdpConfModel2JSONTools.toJsonObjectList(kVSetdisc.get(0), kVSetdisc.get(1));
			}	
			
			String media = "";
			MediaSettings mediaSettings = settings.getMedia();
			if (mediaSettings != null){
				String keys [] = {	"ThumbnailWidth", "ThumbnailHeight", "MediumWidth", "MediumHeight",
									"LargeWidth", "LargeHeight", "IsCroppingThumbnailToExactDims",
									"IsOrganizeUploadsIntoFolders"
				};
				String values [] = {String.valueOf(Integer.valueOf(mediaSettings.getThumbnailWidth())),
									String.valueOf(Integer.valueOf(mediaSettings.getThumbnailHeight())),
									String.valueOf(Integer.valueOf(mediaSettings.getMediumWidth())),
									String.valueOf(Integer.valueOf(mediaSettings.getMediumHeight())),
									String.valueOf(Integer.valueOf(mediaSettings.getLargeWidth())),
									String.valueOf(Integer.valueOf(mediaSettings.getLargeHeight())),
									String.valueOf(mediaSettings.isIsCroppingThumbnailToExactDims()),
									String.valueOf(mediaSettings.isIsOrganizeUploadsIntoFolders())
				};
				List<List<String>> kVSetmedia= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				media = WdpConfModel2JSONTools.toJsonObjectList(kVSetmedia.get(0), kVSetmedia.get(1));
			}	
			
			String permalink = "";
			PermalinksSettings permalinksSettings = settings.getPermalinks();
			if (permalinksSettings != null){
				String keys [] = {"UrlForm", "UrlCategoryBase", "UrlTagBase"};
				String values [] = {permalinksSettings.getPermaUrlForm().getLiteral(), permalinksSettings.getUrlCategoryBase(),
									permalinksSettings.getUrlTagBase()
				};
				List<List<String>> kVSetpermLink= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				permalink = WdpConfModel2JSONTools.toJsonObjectList(kVSetpermLink.get(0), kVSetpermLink.get(1));
			}	
			String[] content = {
								WdpConfModel2JSONTools.toJsonArrayObject("GeneralSettings",general),
								WdpConfModel2JSONTools.toJsonArrayObject("WritingSettings",writing),
								WdpConfModel2JSONTools.toJsonArrayObject("ReadingSettings",reading),
								WdpConfModel2JSONTools.toJsonArrayObject("DiscussionSettings",discussion),
								WdpConfModel2JSONTools.toJsonArrayObject("MediaSettings",media),
								WdpConfModel2JSONTools.toJsonArrayObject("PermaLinkSettings",permalink)
			};
			return WdpConfModel2JSONTools.toJsonArrayObject("Settings", WdpConfModel2JSONTools.toMultiJsonElement(content));
		}
		return  WdpConfModel2JSONTools.toJsonArrayObject("Settings","");
	}
			
	private String buildCategoryJSON(Website webSite){
		
		EList<Category> categoriesList = webSite.getCategories();
		if (categoriesList != null){
			String categories = "";
			for (Category category : categoriesList){
				String keys [] = {"IdName", "Name", "Description", "Slug"};
				String values [] = {category.getName(), category.getCategoryName(),
									category.getDescription(), category.getSlug()
				};
				List<List<String>> kVCat= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				categories += WdpConfModel2JSONTools.toJsonArrayObject("Category", WdpConfModel2JSONTools.toJsonObjectList(kVCat.get(0), kVCat.get(1)));
				if (StringUtils.isNotBlank(categories) & WdpConfModel2JSONTools.isNotLastValue(category, categoriesList.toArray())){
					categories += ",";
				}
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("Categories", categories);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Categories", "");
	}
	
	private String buildTagJSON(Website webSite){
		
		EList<Tag> tagsList = webSite.getTags();	
		if (tagsList != null){
			String tags = "";
			for (Tag tag : tagsList){
				String keys [] = {"IdName", "Name", "Description"};
				String values [] = {tag.getName(), tag.getTagName(),
									tag.getDescription()
				};
				List<List<String>> kVTag= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				tags += WdpConfModel2JSONTools.toJsonArrayObject("Tag", WdpConfModel2JSONTools.toJsonObjectList(kVTag.get(0), kVTag.get(1)));
				if (StringUtils.isNotBlank(tags) & WdpConfModel2JSONTools.isNotLastValue(tag, tagsList.toArray())){
					tags += ",";
				}
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("Tags", tags);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Tags", "empty");
	}
	
	private String buildMediaJSON(Website webSite){
		
		EList<Media> mEList = webSite.getMediaLibrary();
		if (mEList != null){
			String medias = "";
			for (Media media : mEList){
				
				System.out.println("media.getUploadedTo() : " + media.getUploadedTo());
				
				String keys [] = {"IdName", "Url", "Date", "Author", media.getUploadedTo()==null?"":"UploadedTo"};
				
				String values [] = {media.getName(), media.getUrl()==null?"":media.getUrl().getPathUrl(),
									media.getDate(), webSite.getAdminUser().getUserName(),
									media.getUploadedTo()==null?"":media.getUploadedTo().getName()
				};
				List<List<String>> keysAndValues = WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				medias += WdpConfModel2JSONTools.toJsonArrayObject("Media", WdpConfModel2JSONTools
																				.toJsonObjectList(keysAndValues.get(0),
																									keysAndValues.get(1)));
								
				if (StringUtils.isNotBlank(medias) & WdpConfModel2JSONTools.isNotLastValue(media, mEList.toArray())){
					medias += ",";
				}
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("MediaLibrary", medias);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("MediaLibrary", "");
	}
	
	private String buildFunctionnalitiesJSON(Website webSite){
		
		EList<Functionality> functionalities = webSite.getFunctionalities();	
		if (functionalities != null){
			String functionnalityStr = "";
			for (Functionality functionnality : functionalities){
				String keys [] = {"IdName", "FunctionalityType", "SocialNetworks"};
				String values [] = {functionnality.getName(), functionnality.getFunctionalityType().getLiteral(), functionnality.getSocialNetworks()
				};
							
				Plugin plugin = functionnality.getDefaultPlugin();
				String pluginStr = "";
				if (plugin != null){
					String plugKeys [] = {"Name", "Url"};
					String plugValues [] = {plugin.getPluginName(), plugin.getUrl()==null?"":plugin.getUrl().getPathUrl()};
					List<List<String>> kVPlug= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(plugKeys, plugValues);
					pluginStr = WdpConfModel2JSONTools.toJsonArrayObject("Plugin", WdpConfModel2JSONTools.toJsonObjectList(kVPlug.get(0), kVPlug.get(1)));
				}
				
				List<List<String>> kVFunc= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				functionnalityStr += WdpConfModel2JSONTools.toJsonArrayObject("Functionnality", WdpConfModel2JSONTools
																									.toJsonObjectList(kVFunc.get(0), kVFunc.get(1))
																									+ (pluginStr==""?"":"," + pluginStr));
	
				if (StringUtils.isNotBlank(functionnalityStr) & WdpConfModel2JSONTools.isNotLastValue(functionnality, functionalities.toArray())){
					functionnalityStr += ",";
				}
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("Functionnalities", functionnalityStr);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Functionnalities", "");
	}
		
	private String buildComments(Website webSite){
		EList<Comment> commentsList = webSite.getComments();
		if (commentsList != null){
			String comments = "";
			for(Comment comment : commentsList){												
				String keys [] = {"IdName", "Content", "AuthorComment", "CommentPostPage"};
				String values [] = {comment.getName(), comment.getContent(), comment.getAuthorName(),
									(comment.getCommentPostPage() == null ? "":comment.getCommentPostPage().getName())
				};
				List<List<String>> kVComm= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				comments += WdpConfModel2JSONTools.toJsonArrayObject("Comment", WdpConfModel2JSONTools
																							.toJsonObjectList(kVComm.get(0), kVComm.get(1)));
				if (StringUtils.isNotBlank(comments) & WdpConfModel2JSONTools.isNotLastValue(comment, commentsList.toArray())){
					comments += ",";
				}
			}
			
			return WdpConfModel2JSONTools.toJsonArrayObject("Comments", comments);
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Comments", "");
	}
	
	private String buildDeletion(Website webSite){
		
		Deletion deletion = webSite.getDeletion();
		if (deletion != null){
			EList<String> pageTitles = deletion.getPagesByTitle();		
			String pages = "";
			for(String page : pageTitles){	
				String keys [] = {"PagesByTitle"};
				String values [] = {page};
				List<List<String>> kVPage= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				pages += WdpConfModel2JSONTools.toJsonArrayObject("Page", WdpConfModel2JSONTools.toJsonObjectList(kVPage.get(0), kVPage.get(1)));
				if (StringUtils.isNotBlank(pages) & WdpConfModel2JSONTools.isNotLastValue(page, pageTitles.toArray())){
					pages += ",";
				}
			}
			pages = WdpConfModel2JSONTools.toJsonArrayObject("PagesByTitle",pages);
			
			EList<String> userLogins = deletion.getUsersByLogin();
			String users = "";
			for(String user : userLogins){												
				String keys [] = {"UsersByLogin"};
				String values [] = {user};
				List<List<String>> kVUser= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				users += WdpConfModel2JSONTools.toJsonArrayObject("User", WdpConfModel2JSONTools.toJsonObjectList(kVUser.get(0), kVUser.get(1)));
				if (StringUtils.isNotBlank(users) & WdpConfModel2JSONTools.isNotLastValue(user, userLogins.toArray())){
					users += ",";
				}
			}
			users = WdpConfModel2JSONTools.toJsonArrayObject("UsersByLogin",users);
			
			EList<String> mediaTitles = deletion.getMediasByTitle();
			String medias = "";
			for(String media : mediaTitles){												
				String keys [] = {"MediasByTitle"};
				String values [] = {media};
				List<List<String>> kVMedia= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				medias += WdpConfModel2JSONTools.toJsonArrayObject("Media", WdpConfModel2JSONTools.toJsonObjectList(kVMedia.get(0), kVMedia.get(1)));
				if (StringUtils.isNotBlank(medias) & WdpConfModel2JSONTools.isNotLastValue(media, mediaTitles.toArray())){
					medias += ",";
				}
			}
			medias = WdpConfModel2JSONTools.toJsonArrayObject("MediasByTitle",medias);
			
//			EList<String> pluginFilesName = deletion.getPluginsByFileName();
//			String plugins = "";
//			for(String plugin : pluginFilesName){												
//				String keys [] = {"PluginsByFileName"};
//				String values [] = {plugin};
//				List<List<String>> kVPlug= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
//				plugins += WdpConfModel2JSONTools.toJsonArrayObject("Plugin", WdpConfModel2JSONTools.toJsonObjectList(kVPlug.get(0), kVPlug.get(1)));
//
//				if (StringUtils.isNotBlank(plugins) & WdpConfModel2JSONTools.isNotLastValue(plugin, pluginFilesName.toArray())){
//					plugins += ",";
//				}
//			}
//			plugins = WdpConfModel2JSONTools.toJsonArrayObject("PluginsByFileName",plugins);
			
			EList<themes> themesNames = deletion.getThemesByName();
			String themes = "";
			for(themes theme : themesNames){												
				String keys [] = {"ThemeType"};
				String values [] = {theme.getLiteral()};
				List<List<String>> kVFunc= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				themes += WdpConfModel2JSONTools.toJsonArrayObject("Theme", WdpConfModel2JSONTools.toJsonObjectList(kVFunc.get(0), kVFunc.get(1)));
				
				if (StringUtils.isNotBlank(themes) & WdpConfModel2JSONTools.isNotLastValue(theme, themesNames.toArray())){
					themes += ",";
				}
			}
			themes = WdpConfModel2JSONTools.toJsonArrayObject("ThemeTypes",themes);
			
			EList<String> catNames = deletion.getCategoriesByName();
			String categories = "";
			for(String category : catNames){												
				String keys [] = {"CategoriesByName"};
				String values [] = {category};				
				List<List<String>> kVCat= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				categories += WdpConfModel2JSONTools.toJsonArrayObject("Category", WdpConfModel2JSONTools.toJsonObjectList(kVCat.get(0), kVCat.get(1)));
				if (StringUtils.isNotBlank(categories) & WdpConfModel2JSONTools.isNotLastValue(category, catNames.toArray())){
					categories += ",";
				}
			}
			categories = WdpConfModel2JSONTools.toJsonArrayObject("CategoriesByName",categories);
			
			EList<String> tagNames = deletion.getTagsByName();
			String tags = "";
			for(String tag : tagNames){												
				String keys [] = {"TagsByName"};
				String values [] = {tag};
				List<List<String>> kVTag= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				tags += WdpConfModel2JSONTools.toJsonArrayObject("Tag", WdpConfModel2JSONTools.toJsonObjectList(kVTag.get(0), kVTag.get(1)));
				
				if (StringUtils.isNotBlank(tags) &  WdpConfModel2JSONTools.isNotLastValue(tag, tagNames.toArray())){
					tags += ",";
				}
			}
			tags = WdpConfModel2JSONTools.toJsonArrayObject("TagsByName",tags);
			
			EList<String> menuNames = deletion.getMenusByName();
			String menus = "";
			for(String menu : menuNames){												
				String keys [] = {"MenusByName"};
				String values [] = {menu};
				List<List<String>> kVMenu= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				menus += WdpConfModel2JSONTools.toJsonArrayObject("Menu", WdpConfModel2JSONTools.toJsonObjectList(kVMenu.get(0), kVMenu.get(1)));
				
				if (StringUtils.isNotBlank(menus) &  WdpConfModel2JSONTools.isNotLastValue(menu, menuNames.toArray())){
					menus += ",";
				}
			}
			menus = WdpConfModel2JSONTools.toJsonArrayObject("MenusByName",menus);
			
			EList<functionalities> functionNames = deletion.getFunctionalitiesByName();
			String functions = "";
			for(functionalities function : functionNames){												
				String keys [] = {"FunctionalityType"};
				String values [] = {function.getLiteral()};
				List<List<String>> kVFunc= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				functions += WdpConfModel2JSONTools.toJsonArrayObject("Functionnality", 
																					WdpConfModel2JSONTools.toJsonObjectList(kVFunc.get(0), kVFunc.get(1)));
				
				if (StringUtils.isNotBlank(functions) & WdpConfModel2JSONTools.isNotLastValue(function, functionNames.toArray())){
					functions += ",";
				}
			}
			functions = WdpConfModel2JSONTools.toJsonArrayObject("FunctionalityTypes",functions);
			
			EList<PostDateAuthor> commentParamsList = deletion.getCommentsByPostDateAuthor();
			String commentParams = "";
			for(PostDateAuthor commentParam : commentParamsList){												
				String keys [] = {"PostTitle", "CommentDate", "CommentAuthorName"};
				String values [] = {commentParam.getPostTitle(), commentParam.getCommentDate(), commentParam.getCommentAuthorName()};
				List<List<String>> kVComm= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
				commentParams += WdpConfModel2JSONTools.toJsonArrayObject("Comment", WdpConfModel2JSONTools.toJsonObjectList(kVComm.get(0), kVComm.get(1)));
			
				if (StringUtils.isNotBlank(commentParams) & WdpConfModel2JSONTools.isNotLastValue(commentParam, commentParamsList.toArray())){
					commentParams += ",";
				}
			}
			commentParams = WdpConfModel2JSONTools.toJsonArrayObject("Comments",commentParams);
			
			String[] content = {pages, users, medias, functions, themes, categories, tags, menus, commentParams};
			return WdpConfModel2JSONTools.toJsonArrayObject("Deletions", WdpConfModel2JSONTools.toMultiJsonElement(content));
		}
		return WdpConfModel2JSONTools.toJsonArrayObject("Deletions", "");
	}
	
	private String getCommonAttributes(PostPage postOrPage){
		PostPage_Impl postPage_Impl = postOrPage.getCommonAttributes();
				
		String keys [] = {	"Title", "Status", "Content",
							"Author", "FeaturedImage"
		};
		String values [] = {postPage_Impl.getTitle(), postPage_Impl.getStatus().getLiteral(), postPage_Impl.getContent(),
							(postPage_Impl.getAuthor()==null?"":postPage_Impl.getAuthor().getName()),
							(postPage_Impl.getFeaturedImage()==null?"":(postPage_Impl.getFeaturedImage().getUrl()==null?""
																			:postPage_Impl.getFeaturedImage().getUrl().getPathUrl()))
		};
		List<List<String>> kVCommonAtt= WdpConfModel2JSONTools.getNotEmptyValuesAndKeys(keys, values);
		
		return WdpConfModel2JSONTools.toJsonObjectList(kVCommonAtt.get(0), kVCommonAtt.get(1));
	}
	
	private void executePHP(String pathWebsiteUrl, String postValues, String phpFile){
		
		try{		
			
			String adressWordPress = WdpConfModel2JSONTools.removeQuote(pathWebsiteUrl);			
			String url = adressWordPress + "wordPressInsert/website.php?";			
			HttpPost httpPost = new HttpPost(url);
			
			System.out.println(WdpConfModel2JSONTools.removeNull(postValues));
			
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
		    nameValuePairs.add(new BasicNameValuePair("jsonValues", WdpConfModel2JSONTools.removeNull(postValues)));
		    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));					
			
			CloseableHttpClient httpClient = new DefaultHttpClient();
			HttpResponse httpResponse = httpClient.execute(httpPost);
			
			String response = EntityUtils.toString(httpResponse.getEntity());
			System.out.println(response);
			
			httpClient.close();			
			httpPost.releaseConnection();
		
		} catch (Exception e) {
			e.printStackTrace();
		}           
	}
}
