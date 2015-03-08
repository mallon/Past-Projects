package org.inria.wordpress.wdpdsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.inria.wordpress.wdpdsl.services.WdpDslGrammarAccess;
import org.inria.wordpress.wdpdsl.wdpDsl.Appearance;
import org.inria.wordpress.wdpdsl.wdpDsl.Archive;
import org.inria.wordpress.wdpdsl.wdpDsl.Calendar;
import org.inria.wordpress.wdpdsl.wdpDsl.Category;
import org.inria.wordpress.wdpdsl.wdpDsl.Comment;
import org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting;
import org.inria.wordpress.wdpdsl.wdpDsl.Deletion;
import org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Functionality;
import org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Header;
import org.inria.wordpress.wdpdsl.wdpDsl.Image;
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
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl;
import org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Search;
import org.inria.wordpress.wdpdsl.wdpDsl.Settings;
import org.inria.wordpress.wdpdsl.wdpDsl.Tag;
import org.inria.wordpress.wdpdsl.wdpDsl.TagCloud;
import org.inria.wordpress.wdpdsl.wdpDsl.Text;
import org.inria.wordpress.wdpdsl.wdpDsl.Theme;
import org.inria.wordpress.wdpdsl.wdpDsl.Url;
import org.inria.wordpress.wdpdsl.wdpDsl.User;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.Website;
import org.inria.wordpress.wdpdsl.wdpDsl.Widget;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost;
import org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings;

@SuppressWarnings("all")
public class WdpDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WdpDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == WdpDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case WdpDslPackage.APPEARANCE:
				if(context == grammarAccess.getAppearanceRule()) {
					sequence_Appearance(context, (Appearance) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.ARCHIVE:
				if(context == grammarAccess.getArchiveRule()) {
					sequence_Archive(context, (Archive) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.CALENDAR:
				if(context == grammarAccess.getCalendarRule()) {
					sequence_Calendar(context, (Calendar) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.CATEGORY:
				if(context == grammarAccess.getCategoryRule() ||
				   context == grammarAccess.getTaxonomyRule()) {
					sequence_Category(context, (Category) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.COMMENT:
				if(context == grammarAccess.getCommentRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.CURRENT_MENU_SETTING:
				if(context == grammarAccess.getCurrentMenuSettingRule()) {
					sequence_CurrentMenuSetting(context, (CurrentMenuSetting) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.DELETION:
				if(context == grammarAccess.getDeletionRule()) {
					sequence_Deletion(context, (Deletion) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.DISCUSSION_SETTINGS:
				if(context == grammarAccess.getDiscussionSettingsRule()) {
					sequence_DiscussionSettings(context, (DiscussionSettings) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.FUNCTIONALITY:
				if(context == grammarAccess.getFunctionalityRule()) {
					sequence_Functionality(context, (Functionality) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.GENERAL_SETTINGS:
				if(context == grammarAccess.getGeneralSettingsRule()) {
					sequence_GeneralSettings(context, (GeneralSettings) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.IMAGE:
				if(context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.LINK:
				if(context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.MEDIA:
				if(context == grammarAccess.getMediaRule()) {
					sequence_Media(context, (Media) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.MEDIA_SETTINGS:
				if(context == grammarAccess.getMediaSettingsRule()) {
					sequence_MediaSettings(context, (MediaSettings) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.MENU:
				if(context == grammarAccess.getMenuRule()) {
					sequence_Menu(context, (Menu) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.META:
				if(context == grammarAccess.getMetaRule()) {
					sequence_Meta(context, (Meta) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.PAGE:
				if(context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getPostPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.PERMALINKS_SETTINGS:
				if(context == grammarAccess.getPermalinksSettingsRule()) {
					sequence_PermalinksSettings(context, (PermalinksSettings) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.PLUGIN:
				if(context == grammarAccess.getPluginRule()) {
					sequence_Plugin(context, (Plugin) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.POST:
				if(context == grammarAccess.getPostRule() ||
				   context == grammarAccess.getPostPageRule()) {
					sequence_Post(context, (Post) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.POST_DATE_AUTHOR:
				if(context == grammarAccess.getPostDateAuthorRule()) {
					sequence_PostDateAuthor(context, (PostDateAuthor) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.POST_PAGE_IMPL:
				if(context == grammarAccess.getPostPage_ImplRule()) {
					sequence_PostPage_Impl(context, (PostPage_Impl) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.READING_SETTINGS:
				if(context == grammarAccess.getReadingSettingsRule()) {
					sequence_ReadingSettings(context, (ReadingSettings) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.SEARCH:
				if(context == grammarAccess.getSearchRule()) {
					sequence_Search(context, (Search) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.SETTINGS:
				if(context == grammarAccess.getSettingsRule()) {
					sequence_Settings(context, (Settings) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.TAG:
				if(context == grammarAccess.getTagRule() ||
				   context == grammarAccess.getTaxonomyRule()) {
					sequence_Tag(context, (Tag) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.TAG_CLOUD:
				if(context == grammarAccess.getTagCloudRule()) {
					sequence_TagCloud(context, (TagCloud) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.TEXT:
				if(context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.THEME:
				if(context == grammarAccess.getThemeRule()) {
					sequence_Theme(context, (Theme) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.URL:
				if(context == grammarAccess.getUrlRule()) {
					sequence_Url(context, (Url) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.USER:
				if(context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WEBSITE:
				if(context == grammarAccess.getWebsiteRule()) {
					sequence_Website(context, (Website) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET:
				if(context == grammarAccess.getWidgetRule()) {
					sequence_Widget(context, (Widget) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET_CATEGORIE:
				if(context == grammarAccess.getWidgetCategorieRule()) {
					sequence_WidgetCategorie(context, (WidgetCategorie) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET_COMMENT:
				if(context == grammarAccess.getWidgetCommentRule()) {
					sequence_WidgetComment(context, (WidgetComment) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET_FEED:
				if(context == grammarAccess.getWidgetFeedRule()) {
					sequence_WidgetFeed(context, (WidgetFeed) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET_MENU:
				if(context == grammarAccess.getWidgetMenuRule()) {
					sequence_WidgetMenu(context, (WidgetMenu) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET_PAGE:
				if(context == grammarAccess.getWidgetPageRule()) {
					sequence_WidgetPage(context, (WidgetPage) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WIDGET_POST:
				if(context == grammarAccess.getWidgetPostRule()) {
					sequence_WidgetPost(context, (WidgetPost) semanticObject); 
					return; 
				}
				else break;
			case WdpDslPackage.WRITING_SETTINGS:
				if(context == grammarAccess.getWritingSettingsRule()) {
					sequence_WritingSettings(context, (WritingSettings) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((widgets+=Widget widgets+=Widget*)? (appearanceMenus+=Menu appearanceMenus+=Menu*)? appearanceHeader=Header? (theme+=Theme theme+=Theme*)?)
	 */
	protected void sequence_Appearance(EObject context, Appearance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? isDisplayingAsDropDown=EBoolean? isShowingPostsCount=EBoolean?)
	 */
	protected void sequence_Archive(EObject context, Archive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString?)
	 */
	protected void sequence_Calendar(EObject context, Calendar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ categoryName=EString? description=EString? slug=EString?)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ content=EString? authorName=EString? commentPostPage=[PostPage|ID]*)
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isAddingNewTopLevelPages=EBoolean? isNavigationMenuLocated=EBoolean?)
	 */
	protected void sequence_CurrentMenuSetting(EObject context, CurrentMenuSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (postsByTitle+=EString postsByTitle+=EString*)? 
	 *         (pagesByTitle+=EString pagesByTitle+=EString*)? 
	 *         (usersByLogin+=EString usersByLogin+=EString*)? 
	 *         (mediasByTitle+=EString mediasByTitle+=EString*)? 
	 *         (functionalitiesByName+=functionalities functionalitiesByName+=functionalities*)? 
	 *         (themesByName+=themes themesByName+=themes*)? 
	 *         (categoriesByName+=EString categoriesByName+=EString*)? 
	 *         (tagsByName+=EString tagsByName+=EString*)? 
	 *         (menusByName+=EString menusByName+=EString*)? 
	 *         (commentsByPostDateAuthor+=PostDateAuthor commentsByPostDateAuthor+=PostDateAuthor*)?
	 *     )
	 */
	protected void sequence_Deletion(EObject context, Deletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         numberArticleDaysForAutoCloseComments=EInt? 
	 *         nestedCommentsLevel=EInt? 
	 *         numberCommentsPerPageForBreakedComments=EInt? 
	 *         numberOfLinksInCommentForModeration=EInt? 
	 *         moderatedWords=EString? 
	 *         forbiddenWords=EString? 
	 *         maxAvatarRating=avatarRating? 
	 *         userDefaultAvatar=defaultAvatar? 
	 *         isNotifyingLinkedBlogs=EBoolean? 
	 *         isAllowingLinkNotificationsFromBlogs=EBoolean? 
	 *         isAllowingPublicComments=EBoolean? 
	 *         isAskingNameAndMailCommentAuthor=EBoolean? 
	 *         isAllowingAnonymousComments=EBoolean? 
	 *         isBreakingCommentsIntoPages=EBoolean? 
	 *         isdisplayingLastPageForBreakedComments=EBoolean? 
	 *         isDisplayingOlderCommentForEachPage=EBoolean? 
	 *         isMailingAdminForEachComments=EBoolean? 
	 *         isHeldingCommentForModeration=EBoolean? 
	 *         isAskingAdminApprovement=EBoolean? 
	 *         isAskingPreviousAdminApprovement=EBoolean? 
	 *         isShowingAvatar=EBoolean?
	 *     )
	 */
	protected void sequence_DiscussionSettings(EObject context, DiscussionSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ functionalityType=functionalities? socialNetworks=EString? defaultPlugin=Plugin?)
	 */
	protected void sequence_Functionality(EObject context, Functionality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         websiteTitle=EString? 
	 *         websiteTagline=EString? 
	 *         websiteAdress=EString? 
	 *         adminMail=MAIL? 
	 *         userDefaultRole=role? 
	 *         timeZone=INT? 
	 *         gsDateFormat=dateformat? 
	 *         gsTimeFormat=timeFormat? 
	 *         weekStartsOn=weeks? 
	 *         wordPressAdress=Url+ 
	 *         isPublic=EBoolean?
	 *     )
	 */
	protected void sequence_GeneralSettings(EObject context, GeneralSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (randomImage=EBoolean? uploadImage=Url? textColor=HEXA? isShowingHeaderText=EBoolean?)
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? caption=EString? altText=EString? description=EString? url=Url?)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ url=Url text=EString?)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         thumbnailWidth=EInt? 
	 *         thumbnailHeight=EInt? 
	 *         mediumWidth=EInt? 
	 *         mediumHeight=EInt? 
	 *         largeWidth=EInt? 
	 *         largeHeight=EInt? 
	 *         isCroppingThumbnailToExactDims=EBoolean? 
	 *         isOrganizeUploadsIntoFolders=EBoolean?
	 *     )
	 */
	protected void sequence_MediaSettings(EObject context, MediaSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ url=Url? date=Date? uploadedTo=[PostPage|ID]*)
	 */
	protected void sequence_Media(EObject context, Media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID+ 
	 *         menuName=EString? 
	 *         (pages+=[Page|ID] pages+=[Page|ID]*)? 
	 *         (categories+=[Category|ID] categories+=[Category|ID]*)? 
	 *         (links+=Link links+=Link*)? 
	 *         currentMenuSetting=CurrentMenuSetting?
	 *     )
	 */
	protected void sequence_Menu(EObject context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString?)
	 */
	protected void sequence_Meta(EObject context, Meta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID+ 
	 *         parent=[Page|ID]? 
	 *         order=EInt? 
	 *         publicationDateGMT=Date? 
	 *         publicationDate=Date? 
	 *         commonAttributes=PostPage_Impl
	 *     )
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (permaUrlForm=urlForm? urlCategoryBase=EString? urlTagBase=EString?)
	 */
	protected void sequence_PermalinksSettings(EObject context, PermalinksSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pluginName=EString? url=Url?)
	 */
	protected void sequence_Plugin(EObject context, Plugin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (postTitle=EString+ commentAuthorName=EString+ commentDate=Date+)
	 */
	protected void sequence_PostDateAuthor(EObject context, PostDateAuthor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? status=pageStatus? content=EString? author=[User|ID]? featuredImage=Image?)
	 */
	protected void sequence_PostPage_Impl(EObject context, PostPage_Impl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID+ 
	 *         (categories+=[Category|ID] categories+=[Category|ID]*)? 
	 *         (tags+=[Tag|ID] tags+=[Tag|ID]*)? 
	 *         format=postFormat? 
	 *         commonAttributes=PostPage_Impl
	 *     )
	 */
	protected void sequence_Post(EObject context, Post semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         maxNumberPostsForBlogPages=EInt? 
	 *         numberRecentItemForFeeds=EInt? 
	 *         staticFrontPage=[Page|ID]? 
	 *         staticPostPage=[Page|ID]? 
	 *         isDisplayingLastPostInFront=EBoolean? 
	 *         isIndexed=EBoolean? 
	 *         isShowingFullTextForFeed=EBoolean?
	 *     )
	 */
	protected void sequence_ReadingSettings(EObject context, ReadingSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ title=EString?)
	 */
	protected void sequence_Search(EObject context, Search semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         general=GeneralSettings+ 
	 *         writing=WritingSettings? 
	 *         reading=ReadingSettings? 
	 *         discussion=DiscussionSettings? 
	 *         media=MediaSettings? 
	 *         permalinks=PermalinksSettings?
	 *     )
	 */
	protected void sequence_Settings(EObject context, Settings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? taxonomy=taxonomyType?)
	 */
	protected void sequence_TagCloud(EObject context, TagCloud semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ tagName=EString? description=EString? slug=EString?)
	 */
	protected void sequence_Tag(EObject context, Tag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? content=EString? isAutoParagraphs=EBoolean?)
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID+ themeType=themes? defaultPlugin=Plugin?)
	 */
	protected void sequence_Theme(EObject context, Theme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pathUrl=EString?)
	 */
	protected void sequence_Url(EObject context, Url semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID+ 
	 *         userName=EString+ 
	 *         password=EString+ 
	 *         userRole=role+ 
	 *         firstName=EString? 
	 *         lastName=EString? 
	 *         nickName=EString? 
	 *         publicName=EString? 
	 *         email=EString? 
	 *         webSite=EString? 
	 *         biography=EString?
	 *     )
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         adminUser=[User|ID]+ 
	 *         (users+=User users+=User*)? 
	 *         (posts+=Post posts+=Post*)? 
	 *         (pages+=Page pages+=Page*)? 
	 *         appearance=Appearance? 
	 *         (mediaLibrary+=Media mediaLibrary+=Media*)? 
	 *         (functionalities+=Functionality functionalities+=Functionality*)? 
	 *         (comments+=Comment comments+=Comment*)? 
	 *         (categories+=Category categories+=Category*)? 
	 *         (tags+=Tag tags+=Tag*)? 
	 *         settings=Settings+ 
	 *         deletion=Deletion?
	 *     )
	 */
	protected void sequence_Website(EObject context, Website semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? numberOfDisplayedPosts=EInt? isDisplayingSubCat=EBoolean? isDropDownList=EBoolean?)
	 */
	protected void sequence_WidgetCategorie(EObject context, WidgetCategorie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? numberOfDisplayedComments=EInt?)
	 */
	protected void sequence_WidgetComment(EObject context, WidgetComment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         isDisplayingItemContent=EBoolean? 
	 *         isDisplayingItemAuthor=EBoolean? 
	 *         isDisplayingItemDate=EBoolean? 
	 *         numberOfItems=INT? 
	 *         url=Url?
	 *     )
	 */
	protected void sequence_WidgetFeed(EObject context, WidgetFeed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? selectedMenu=[Menu|ID]?)
	 */
	protected void sequence_WidgetMenu(EObject context, WidgetMenu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? widgetPagesSorter=pagesSorter? idPageExcluded=[Page|ID]?)
	 */
	protected void sequence_WidgetPage(EObject context, WidgetPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? numberOfDisplayedPosts=EInt? isDisplayingPostDate=EBoolean?)
	 */
	protected void sequence_WidgetPost(EObject context, WidgetPost semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=widgetType? 
	 *         (widgetArchives+=Archive widgetArchives+=Archive*)? 
	 *         (calendars+=Calendar calendars+=Calendar*)? 
	 *         (categories+=WidgetCategorie categories+=WidgetCategorie*)? 
	 *         (customMenus+=WidgetMenu customMenus+=WidgetMenu*)? 
	 *         (metas+=Meta metas+=Meta*)? 
	 *         (pages+=WidgetPage pages+=WidgetPage*)? 
	 *         (recentComments+=WidgetComment recentComments+=WidgetComment*)? 
	 *         (recentPosts+=WidgetPost recentPosts+=WidgetPost*)? 
	 *         (feeds+=WidgetFeed feeds+=WidgetFeed*)? 
	 *         (searchs+=Search searchs+=Search*)? 
	 *         (tagClouds+=TagCloud tagClouds+=TagCloud*)? 
	 *         (texts+=Text texts+=Text*)?
	 *     )
	 */
	protected void sequence_Widget(EObject context, Widget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         mailServer=MAIL? 
	 *         port=EInt? 
	 *         loginName=EString? 
	 *         password=EString? 
	 *         defaultPostCategory=[Category|ID]? 
	 *         defaultMailCategory=[Category|ID]? 
	 *         isConvertingEmoticons=EBoolean? 
	 *         isCorrectingInvalidXHTML=EBoolean?
	 *     )
	 */
	protected void sequence_WritingSettings(EObject context, WritingSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
