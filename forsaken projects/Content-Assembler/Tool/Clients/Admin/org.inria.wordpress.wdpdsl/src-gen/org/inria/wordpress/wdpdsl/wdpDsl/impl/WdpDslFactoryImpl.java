/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.inria.wordpress.wdpdsl.wdpDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WdpDslFactoryImpl extends EFactoryImpl implements WdpDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WdpDslFactory init() {
		try {
			WdpDslFactory theWdpDslFactory = (WdpDslFactory)EPackage.Registry.INSTANCE.getEFactory(WdpDslPackage.eNS_URI);
			if (theWdpDslFactory != null) {
				return theWdpDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WdpDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WdpDslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WdpDslPackage.WEBSITE: return createWebsite();
			case WdpDslPackage.DELETION: return createDeletion();
			case WdpDslPackage.POST_DATE_AUTHOR: return createPostDateAuthor();
			case WdpDslPackage.USER: return createUser();
			case WdpDslPackage.POST_PAGE_IMPL: return createPostPage_Impl();
			case WdpDslPackage.POST_PAGE: return createPostPage();
			case WdpDslPackage.POST: return createPost();
			case WdpDslPackage.PAGE: return createPage();
			case WdpDslPackage.APPEARANCE: return createAppearance();
			case WdpDslPackage.THEME: return createTheme();
			case WdpDslPackage.FUNCTIONALITY: return createFunctionality();
			case WdpDslPackage.COMMENT: return createComment();
			case WdpDslPackage.URL: return createUrl();
			case WdpDslPackage.WIDGET_FEED: return createWidgetFeed();
			case WdpDslPackage.PLUGIN: return createPlugin();
			case WdpDslPackage.MEDIA: return createMedia();
			case WdpDslPackage.IMAGE: return createImage();
			case WdpDslPackage.LINK: return createLink();
			case WdpDslPackage.HEADER: return createHeader();
			case WdpDslPackage.TAXONOMY: return createTaxonomy();
			case WdpDslPackage.CATEGORY: return createCategory();
			case WdpDslPackage.TAG: return createTag();
			case WdpDslPackage.SETTINGS: return createSettings();
			case WdpDslPackage.GENERAL_SETTINGS: return createGeneralSettings();
			case WdpDslPackage.WRITING_SETTINGS: return createWritingSettings();
			case WdpDslPackage.READING_SETTINGS: return createReadingSettings();
			case WdpDslPackage.DISCUSSION_SETTINGS: return createDiscussionSettings();
			case WdpDslPackage.MEDIA_SETTINGS: return createMediaSettings();
			case WdpDslPackage.PERMALINKS_SETTINGS: return createPermalinksSettings();
			case WdpDslPackage.WIDGET: return createWidget();
			case WdpDslPackage.MENU: return createMenu();
			case WdpDslPackage.ARCHIVE: return createArchive();
			case WdpDslPackage.CALENDAR: return createCalendar();
			case WdpDslPackage.WIDGET_CATEGORIE: return createWidgetCategorie();
			case WdpDslPackage.WIDGET_MENU: return createWidgetMenu();
			case WdpDslPackage.META: return createMeta();
			case WdpDslPackage.WIDGET_PAGE: return createWidgetPage();
			case WdpDslPackage.WIDGET_COMMENT: return createWidgetComment();
			case WdpDslPackage.WIDGET_POST: return createWidgetPost();
			case WdpDslPackage.SEARCH: return createSearch();
			case WdpDslPackage.TAG_CLOUD: return createTagCloud();
			case WdpDslPackage.TEXT: return createText();
			case WdpDslPackage.CURRENT_MENU_SETTING: return createCurrentMenuSetting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WdpDslPackage.POST_FORMAT:
				return createpostFormatFromString(eDataType, initialValue);
			case WdpDslPackage.AVATAR_RATING:
				return createavatarRatingFromString(eDataType, initialValue);
			case WdpDslPackage.DATEFORMAT:
				return createdateformatFromString(eDataType, initialValue);
			case WdpDslPackage.DEFAULT_AVATAR:
				return createdefaultAvatarFromString(eDataType, initialValue);
			case WdpDslPackage.FUNCTIONALITIES:
				return createfunctionalitiesFromString(eDataType, initialValue);
			case WdpDslPackage.THEMES:
				return createthemesFromString(eDataType, initialValue);
			case WdpDslPackage.PAGES_SORTER:
				return createpagesSorterFromString(eDataType, initialValue);
			case WdpDslPackage.PAGE_STATUS:
				return createpageStatusFromString(eDataType, initialValue);
			case WdpDslPackage.ROLE:
				return createroleFromString(eDataType, initialValue);
			case WdpDslPackage.TIME_FORMAT:
				return createtimeFormatFromString(eDataType, initialValue);
			case WdpDslPackage.TAXONOMY_TYPE:
				return createtaxonomyTypeFromString(eDataType, initialValue);
			case WdpDslPackage.URL_FORM:
				return createurlFormFromString(eDataType, initialValue);
			case WdpDslPackage.WEEKS:
				return createweeksFromString(eDataType, initialValue);
			case WdpDslPackage.WIDGET_TYPE:
				return createwidgetTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WdpDslPackage.POST_FORMAT:
				return convertpostFormatToString(eDataType, instanceValue);
			case WdpDslPackage.AVATAR_RATING:
				return convertavatarRatingToString(eDataType, instanceValue);
			case WdpDslPackage.DATEFORMAT:
				return convertdateformatToString(eDataType, instanceValue);
			case WdpDslPackage.DEFAULT_AVATAR:
				return convertdefaultAvatarToString(eDataType, instanceValue);
			case WdpDslPackage.FUNCTIONALITIES:
				return convertfunctionalitiesToString(eDataType, instanceValue);
			case WdpDslPackage.THEMES:
				return convertthemesToString(eDataType, instanceValue);
			case WdpDslPackage.PAGES_SORTER:
				return convertpagesSorterToString(eDataType, instanceValue);
			case WdpDslPackage.PAGE_STATUS:
				return convertpageStatusToString(eDataType, instanceValue);
			case WdpDslPackage.ROLE:
				return convertroleToString(eDataType, instanceValue);
			case WdpDslPackage.TIME_FORMAT:
				return converttimeFormatToString(eDataType, instanceValue);
			case WdpDslPackage.TAXONOMY_TYPE:
				return converttaxonomyTypeToString(eDataType, instanceValue);
			case WdpDslPackage.URL_FORM:
				return converturlFormToString(eDataType, instanceValue);
			case WdpDslPackage.WEEKS:
				return convertweeksToString(eDataType, instanceValue);
			case WdpDslPackage.WIDGET_TYPE:
				return convertwidgetTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website createWebsite() {
		WebsiteImpl website = new WebsiteImpl();
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deletion createDeletion() {
		DeletionImpl deletion = new DeletionImpl();
		return deletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostDateAuthor createPostDateAuthor() {
		PostDateAuthorImpl postDateAuthor = new PostDateAuthorImpl();
		return postDateAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPage_Impl createPostPage_Impl() {
		PostPage_ImplImpl postPage_Impl = new PostPage_ImplImpl();
		return postPage_Impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPage createPostPage() {
		PostPageImpl postPage = new PostPageImpl();
		return postPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance createAppearance() {
		AppearanceImpl appearance = new AppearanceImpl();
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createTheme() {
		ThemeImpl theme = new ThemeImpl();
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functionality createFunctionality() {
		FunctionalityImpl functionality = new FunctionalityImpl();
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetFeed createWidgetFeed() {
		WidgetFeedImpl widgetFeed = new WidgetFeedImpl();
		return widgetFeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy createTaxonomy() {
		TaxonomyImpl taxonomy = new TaxonomyImpl();
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings createSettings() {
		SettingsImpl settings = new SettingsImpl();
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralSettings createGeneralSettings() {
		GeneralSettingsImpl generalSettings = new GeneralSettingsImpl();
		return generalSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritingSettings createWritingSettings() {
		WritingSettingsImpl writingSettings = new WritingSettingsImpl();
		return writingSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingSettings createReadingSettings() {
		ReadingSettingsImpl readingSettings = new ReadingSettingsImpl();
		return readingSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionSettings createDiscussionSettings() {
		DiscussionSettingsImpl discussionSettings = new DiscussionSettingsImpl();
		return discussionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaSettings createMediaSettings() {
		MediaSettingsImpl mediaSettings = new MediaSettingsImpl();
		return mediaSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermalinksSettings createPermalinksSettings() {
		PermalinksSettingsImpl permalinksSettings = new PermalinksSettingsImpl();
		return permalinksSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetCategorie createWidgetCategorie() {
		WidgetCategorieImpl widgetCategorie = new WidgetCategorieImpl();
		return widgetCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetMenu createWidgetMenu() {
		WidgetMenuImpl widgetMenu = new WidgetMenuImpl();
		return widgetMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetPage createWidgetPage() {
		WidgetPageImpl widgetPage = new WidgetPageImpl();
		return widgetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetComment createWidgetComment() {
		WidgetCommentImpl widgetComment = new WidgetCommentImpl();
		return widgetComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetPost createWidgetPost() {
		WidgetPostImpl widgetPost = new WidgetPostImpl();
		return widgetPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagCloud createTagCloud() {
		TagCloudImpl tagCloud = new TagCloudImpl();
		return tagCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMenuSetting createCurrentMenuSetting() {
		CurrentMenuSettingImpl currentMenuSetting = new CurrentMenuSettingImpl();
		return currentMenuSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postFormat createpostFormatFromString(EDataType eDataType, String initialValue) {
		postFormat result = postFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpostFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public avatarRating createavatarRatingFromString(EDataType eDataType, String initialValue) {
		avatarRating result = avatarRating.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertavatarRatingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dateformat createdateformatFromString(EDataType eDataType, String initialValue) {
		dateformat result = dateformat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdateformatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public defaultAvatar createdefaultAvatarFromString(EDataType eDataType, String initialValue) {
		defaultAvatar result = defaultAvatar.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdefaultAvatarToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public functionalities createfunctionalitiesFromString(EDataType eDataType, String initialValue) {
		functionalities result = functionalities.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertfunctionalitiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public themes createthemesFromString(EDataType eDataType, String initialValue) {
		themes result = themes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertthemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pagesSorter createpagesSorterFromString(EDataType eDataType, String initialValue) {
		pagesSorter result = pagesSorter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpagesSorterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pageStatus createpageStatusFromString(EDataType eDataType, String initialValue) {
		pageStatus result = pageStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpageStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public role createroleFromString(EDataType eDataType, String initialValue) {
		role result = role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertroleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public timeFormat createtimeFormatFromString(EDataType eDataType, String initialValue) {
		timeFormat result = timeFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttimeFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public taxonomyType createtaxonomyTypeFromString(EDataType eDataType, String initialValue) {
		taxonomyType result = taxonomyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttaxonomyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public urlForm createurlFormFromString(EDataType eDataType, String initialValue) {
		urlForm result = urlForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converturlFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public weeks createweeksFromString(EDataType eDataType, String initialValue) {
		weeks result = weeks.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertweeksToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public widgetType createwidgetTypeFromString(EDataType eDataType, String initialValue) {
		widgetType result = widgetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertwidgetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WdpDslPackage getWdpDslPackage() {
		return (WdpDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WdpDslPackage getPackage() {
		return WdpDslPackage.eINSTANCE;
	}

} //WdpDslFactoryImpl
