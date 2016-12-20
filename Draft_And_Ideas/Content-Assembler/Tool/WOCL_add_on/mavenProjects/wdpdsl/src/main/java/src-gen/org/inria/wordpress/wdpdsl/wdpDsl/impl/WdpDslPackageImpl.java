/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage;
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl;
import org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Search;
import org.inria.wordpress.wdpdsl.wdpDsl.Settings;
import org.inria.wordpress.wdpdsl.wdpDsl.Tag;
import org.inria.wordpress.wdpdsl.wdpDsl.TagCloud;
import org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy;
import org.inria.wordpress.wdpdsl.wdpDsl.Text;
import org.inria.wordpress.wdpdsl.wdpDsl.Theme;
import org.inria.wordpress.wdpdsl.wdpDsl.Url;
import org.inria.wordpress.wdpdsl.wdpDsl.User;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslFactory;
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
import org.inria.wordpress.wdpdsl.wdpDsl.avatarRating;
import org.inria.wordpress.wdpdsl.wdpDsl.dateformat;
import org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar;
import org.inria.wordpress.wdpdsl.wdpDsl.functionalities;
import org.inria.wordpress.wdpdsl.wdpDsl.pageStatus;
import org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter;
import org.inria.wordpress.wdpdsl.wdpDsl.postFormat;
import org.inria.wordpress.wdpdsl.wdpDsl.role;
import org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType;
import org.inria.wordpress.wdpdsl.wdpDsl.themes;
import org.inria.wordpress.wdpdsl.wdpDsl.timeFormat;
import org.inria.wordpress.wdpdsl.wdpDsl.urlForm;
import org.inria.wordpress.wdpdsl.wdpDsl.weeks;
import org.inria.wordpress.wdpdsl.wdpDsl.widgetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WdpDslPackageImpl extends EPackageImpl implements WdpDslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postDateAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postPage_ImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetFeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writingSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permalinksSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetCategorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetPostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentMenuSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum postFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum avatarRatingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateformatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultAvatarEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionalitiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum themesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pagesSorterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pageStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxonomyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum urlFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weeksEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum widgetTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WdpDslPackageImpl() {
		super(eNS_URI, WdpDslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WdpDslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WdpDslPackage init() {
		if (isInited) return (WdpDslPackage)EPackage.Registry.INSTANCE.getEPackage(WdpDslPackage.eNS_URI);

		// Obtain or create and register package
		WdpDslPackageImpl theWdpDslPackage = (WdpDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WdpDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WdpDslPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWdpDslPackage.createPackageContents();

		// Initialize created meta-data
		theWdpDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWdpDslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WdpDslPackage.eNS_URI, theWdpDslPackage);
		return theWdpDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebsite() {
		return websiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_AdminUser() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Users() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Posts() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Pages() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Appearance() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_MediaLibrary() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Functionalities() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Comments() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Categories() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Tags() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Settings() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsite_Deletion() {
		return (EReference)websiteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletion() {
		return deletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_PagesByTitle() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_UsersByLogin() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_MediasByTitle() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_FunctionalitiesByName() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_ThemesByName() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_CategoriesByName() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_TagsByName() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletion_MenusByName() {
		return (EAttribute)deletionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletion_CommentsByPostDateAuthor() {
		return (EReference)deletionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostDateAuthor() {
		return postDateAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostDateAuthor_PostTitle() {
		return (EAttribute)postDateAuthorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostDateAuthor_CommentAuthorName() {
		return (EAttribute)postDateAuthorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostDateAuthor_CommentDate() {
		return (EAttribute)postDateAuthorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserRole() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_NickName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_PublicName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_WebSite() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Biography() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostPage_Impl() {
		return postPage_ImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostPage_Impl_Title() {
		return (EAttribute)postPage_ImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostPage_Impl_Status() {
		return (EAttribute)postPage_ImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostPage_Impl_Content() {
		return (EAttribute)postPage_ImplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostPage_Impl_Author() {
		return (EReference)postPage_ImplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostPage_Impl_FeaturedImage() {
		return (EReference)postPage_ImplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostPage() {
		return postPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostPage_Name() {
		return (EAttribute)postPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostPage_CommonAttributes() {
		return (EReference)postPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPost() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPost_Categories() {
		return (EReference)postEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPost_Tags() {
		return (EReference)postEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPost_Format() {
		return (EAttribute)postEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Parent() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Order() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_PublicationDateGMT() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_PublicationDate() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearance() {
		return appearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearance_Widgets() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearance_AppearanceMenus() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearance_AppearanceHeader() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearance_Theme() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheme() {
		return themeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheme_Name() {
		return (EAttribute)themeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheme_ThemeType() {
		return (EAttribute)themeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheme_DefaultPlugin() {
		return (EReference)themeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionality() {
		return functionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionality_Name() {
		return (EAttribute)functionalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionality_FunctionalityType() {
		return (EAttribute)functionalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionality_SocialNetworks() {
		return (EAttribute)functionalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionality_DefaultPlugin() {
		return (EReference)functionalityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Name() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Content() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_AuthorName() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_CommentPostPage() {
		return (EReference)commentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrl() {
		return urlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrl_PathUrl() {
		return (EAttribute)urlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetFeed() {
		return widgetFeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFeed_Title() {
		return (EAttribute)widgetFeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFeed_IsDisplayingItemContent() {
		return (EAttribute)widgetFeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFeed_IsDisplayingItemAuthor() {
		return (EAttribute)widgetFeedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFeed_IsDisplayingItemDate() {
		return (EAttribute)widgetFeedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFeed_NumberOfItems() {
		return (EAttribute)widgetFeedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetFeed_Url() {
		return (EReference)widgetFeedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_PluginName() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugin_Url() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Name() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Url() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Date() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_UploadedTo() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Title() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Caption() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_AltText() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Description() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Url() {
		return (EReference)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Url() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Text() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_RandomImage() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_UploadImage() {
		return (EReference)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_TextColor() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_IsShowingHeaderText() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxonomy() {
		return taxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Name() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Description() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Slug() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_CategoryName() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_TagName() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettings() {
		return settingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_General() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_Writing() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_Reading() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_Discussion() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_Media() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_Permalinks() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralSettings() {
		return generalSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_WebsiteTitle() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_WebsiteTagline() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_WebsiteAdress() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_AdminMail() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_UserDefaultRole() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_TimeZone() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_GsDateFormat() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_GsTimeFormat() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_WeekStartsOn() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralSettings_WordPressAdress() {
		return (EReference)generalSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSettings_IsPublic() {
		return (EAttribute)generalSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritingSettings() {
		return writingSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritingSettings_MailServer() {
		return (EAttribute)writingSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritingSettings_Port() {
		return (EAttribute)writingSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritingSettings_LoginName() {
		return (EAttribute)writingSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritingSettings_Password() {
		return (EAttribute)writingSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritingSettings_DefaultPostCategory() {
		return (EReference)writingSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritingSettings_DefaultMailCategory() {
		return (EReference)writingSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritingSettings_IsConvertingEmoticons() {
		return (EAttribute)writingSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritingSettings_IsCorrectingInvalidXHTML() {
		return (EAttribute)writingSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingSettings() {
		return readingSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingSettings_MaxNumberPostsForBlogPages() {
		return (EAttribute)readingSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingSettings_NumberRecentItemForFeeds() {
		return (EAttribute)readingSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingSettings_StaticFrontPage() {
		return (EReference)readingSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingSettings_StaticPostPage() {
		return (EReference)readingSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingSettings_IsDisplayingLastPostInFront() {
		return (EAttribute)readingSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingSettings_IsIndexed() {
		return (EAttribute)readingSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingSettings_IsShowingFullTextForFeed() {
		return (EAttribute)readingSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscussionSettings() {
		return discussionSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_NumberArticleDaysForAutoCloseComments() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_NestedCommentsLevel() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_NumberCommentsPerPageForBreakedComments() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_NumberOfLinksInCommentForModeration() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_ModeratedWords() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_ForbiddenWords() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_MaxAvatarRating() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_UserDefaultAvatar() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsNotifyingLinkedBlogs() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsAllowingLinkNotificationsFromBlogs() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsAllowingPublicComments() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsAskingNameAndMailCommentAuthor() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsAllowingAnonymousComments() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsBreakingCommentsIntoPages() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsdisplayingLastPageForBreakedComments() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsDisplayingOlderCommentForEachPage() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsMailingAdminForEachComments() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsHeldingCommentForModeration() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsAskingAdminApprovement() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsAskingPreviousAdminApprovement() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscussionSettings_IsShowingAvatar() {
		return (EAttribute)discussionSettingsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaSettings() {
		return mediaSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_ThumbnailWidth() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_ThumbnailHeight() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_MediumWidth() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_MediumHeight() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_LargeWidth() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_LargeHeight() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_IsCroppingThumbnailToExactDims() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaSettings_IsOrganizeUploadsIntoFolders() {
		return (EAttribute)mediaSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermalinksSettings() {
		return permalinksSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermalinksSettings_PermaUrlForm() {
		return (EAttribute)permalinksSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermalinksSettings_UrlCategoryBase() {
		return (EAttribute)permalinksSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermalinksSettings_UrlTagBase() {
		return (EAttribute)permalinksSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Type() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_WidgetArchives() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Calendars() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Categories() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_CustomMenus() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Metas() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Pages() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_RecentComments() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_RecentPosts() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Feeds() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Searchs() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_TagClouds() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Texts() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Name() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_MenuName() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Pages() {
		return (EReference)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Categories() {
		return (EReference)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Links() {
		return (EReference)menuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_CurrentMenuSetting() {
		return (EReference)menuEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchive() {
		return archiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchive_Title() {
		return (EAttribute)archiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchive_IsDisplayingAsDropDown() {
		return (EAttribute)archiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchive_IsShowingPostsCount() {
		return (EAttribute)archiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Title() {
		return (EAttribute)calendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetCategorie() {
		return widgetCategorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetCategorie_Title() {
		return (EAttribute)widgetCategorieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetCategorie_NumberOfDisplayedPosts() {
		return (EAttribute)widgetCategorieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetCategorie_IsDisplayingSubCat() {
		return (EAttribute)widgetCategorieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetCategorie_IsDropDownList() {
		return (EAttribute)widgetCategorieEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetMenu() {
		return widgetMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetMenu_Title() {
		return (EAttribute)widgetMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetMenu_SelectedMenu() {
		return (EReference)widgetMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Title() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetPage() {
		return widgetPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetPage_Title() {
		return (EAttribute)widgetPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetPage_WidgetPagesSorter() {
		return (EAttribute)widgetPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetPage_IdPageExcluded() {
		return (EReference)widgetPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetComment() {
		return widgetCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetComment_Title() {
		return (EAttribute)widgetCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetComment_NumberOfDisplayedComments() {
		return (EAttribute)widgetCommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetPost() {
		return widgetPostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetPost_Title() {
		return (EAttribute)widgetPostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetPost_NumberOfDisplayedPosts() {
		return (EAttribute)widgetPostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetPost_IsDisplayingPostDate() {
		return (EAttribute)widgetPostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearch() {
		return searchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearch_Name() {
		return (EAttribute)searchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearch_Title() {
		return (EAttribute)searchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagCloud() {
		return tagCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagCloud_Title() {
		return (EAttribute)tagCloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagCloud_Taxonomy() {
		return (EAttribute)tagCloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Title() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Content() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_IsAutoParagraphs() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentMenuSetting() {
		return currentMenuSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentMenuSetting_IsAddingNewTopLevelPages() {
		return (EAttribute)currentMenuSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentMenuSetting_IsNavigationMenuLocated() {
		return (EAttribute)currentMenuSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpostFormat() {
		return postFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getavatarRating() {
		return avatarRatingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdateformat() {
		return dateformatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdefaultAvatar() {
		return defaultAvatarEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getfunctionalities() {
		return functionalitiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getthemes() {
		return themesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpagesSorter() {
		return pagesSorterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpageStatus() {
		return pageStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getrole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettimeFormat() {
		return timeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettaxonomyType() {
		return taxonomyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum geturlForm() {
		return urlFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getweeks() {
		return weeksEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getwidgetType() {
		return widgetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WdpDslFactory getWdpDslFactory() {
		return (WdpDslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		websiteEClass = createEClass(WEBSITE);
		createEReference(websiteEClass, WEBSITE__ADMIN_USER);
		createEReference(websiteEClass, WEBSITE__USERS);
		createEReference(websiteEClass, WEBSITE__POSTS);
		createEReference(websiteEClass, WEBSITE__PAGES);
		createEReference(websiteEClass, WEBSITE__APPEARANCE);
		createEReference(websiteEClass, WEBSITE__MEDIA_LIBRARY);
		createEReference(websiteEClass, WEBSITE__FUNCTIONALITIES);
		createEReference(websiteEClass, WEBSITE__COMMENTS);
		createEReference(websiteEClass, WEBSITE__CATEGORIES);
		createEReference(websiteEClass, WEBSITE__TAGS);
		createEReference(websiteEClass, WEBSITE__SETTINGS);
		createEReference(websiteEClass, WEBSITE__DELETION);

		deletionEClass = createEClass(DELETION);
		createEAttribute(deletionEClass, DELETION__PAGES_BY_TITLE);
		createEAttribute(deletionEClass, DELETION__USERS_BY_LOGIN);
		createEAttribute(deletionEClass, DELETION__MEDIAS_BY_TITLE);
		createEAttribute(deletionEClass, DELETION__FUNCTIONALITIES_BY_NAME);
		createEAttribute(deletionEClass, DELETION__THEMES_BY_NAME);
		createEAttribute(deletionEClass, DELETION__CATEGORIES_BY_NAME);
		createEAttribute(deletionEClass, DELETION__TAGS_BY_NAME);
		createEAttribute(deletionEClass, DELETION__MENUS_BY_NAME);
		createEReference(deletionEClass, DELETION__COMMENTS_BY_POST_DATE_AUTHOR);

		postDateAuthorEClass = createEClass(POST_DATE_AUTHOR);
		createEAttribute(postDateAuthorEClass, POST_DATE_AUTHOR__POST_TITLE);
		createEAttribute(postDateAuthorEClass, POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME);
		createEAttribute(postDateAuthorEClass, POST_DATE_AUTHOR__COMMENT_DATE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__USER_NAME);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__USER_ROLE);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEAttribute(userEClass, USER__NICK_NAME);
		createEAttribute(userEClass, USER__PUBLIC_NAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__WEB_SITE);
		createEAttribute(userEClass, USER__BIOGRAPHY);

		postPage_ImplEClass = createEClass(POST_PAGE_IMPL);
		createEAttribute(postPage_ImplEClass, POST_PAGE_IMPL__TITLE);
		createEAttribute(postPage_ImplEClass, POST_PAGE_IMPL__STATUS);
		createEAttribute(postPage_ImplEClass, POST_PAGE_IMPL__CONTENT);
		createEReference(postPage_ImplEClass, POST_PAGE_IMPL__AUTHOR);
		createEReference(postPage_ImplEClass, POST_PAGE_IMPL__FEATURED_IMAGE);

		postPageEClass = createEClass(POST_PAGE);
		createEAttribute(postPageEClass, POST_PAGE__NAME);
		createEReference(postPageEClass, POST_PAGE__COMMON_ATTRIBUTES);

		postEClass = createEClass(POST);
		createEReference(postEClass, POST__CATEGORIES);
		createEReference(postEClass, POST__TAGS);
		createEAttribute(postEClass, POST__FORMAT);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PARENT);
		createEAttribute(pageEClass, PAGE__ORDER);
		createEAttribute(pageEClass, PAGE__PUBLICATION_DATE_GMT);
		createEAttribute(pageEClass, PAGE__PUBLICATION_DATE);

		appearanceEClass = createEClass(APPEARANCE);
		createEReference(appearanceEClass, APPEARANCE__WIDGETS);
		createEReference(appearanceEClass, APPEARANCE__APPEARANCE_MENUS);
		createEReference(appearanceEClass, APPEARANCE__APPEARANCE_HEADER);
		createEReference(appearanceEClass, APPEARANCE__THEME);

		themeEClass = createEClass(THEME);
		createEAttribute(themeEClass, THEME__NAME);
		createEAttribute(themeEClass, THEME__THEME_TYPE);
		createEReference(themeEClass, THEME__DEFAULT_PLUGIN);

		functionalityEClass = createEClass(FUNCTIONALITY);
		createEAttribute(functionalityEClass, FUNCTIONALITY__NAME);
		createEAttribute(functionalityEClass, FUNCTIONALITY__FUNCTIONALITY_TYPE);
		createEAttribute(functionalityEClass, FUNCTIONALITY__SOCIAL_NETWORKS);
		createEReference(functionalityEClass, FUNCTIONALITY__DEFAULT_PLUGIN);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__NAME);
		createEAttribute(commentEClass, COMMENT__CONTENT);
		createEAttribute(commentEClass, COMMENT__AUTHOR_NAME);
		createEReference(commentEClass, COMMENT__COMMENT_POST_PAGE);

		urlEClass = createEClass(URL);
		createEAttribute(urlEClass, URL__PATH_URL);

		widgetFeedEClass = createEClass(WIDGET_FEED);
		createEAttribute(widgetFeedEClass, WIDGET_FEED__TITLE);
		createEAttribute(widgetFeedEClass, WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT);
		createEAttribute(widgetFeedEClass, WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR);
		createEAttribute(widgetFeedEClass, WIDGET_FEED__IS_DISPLAYING_ITEM_DATE);
		createEAttribute(widgetFeedEClass, WIDGET_FEED__NUMBER_OF_ITEMS);
		createEReference(widgetFeedEClass, WIDGET_FEED__URL);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__PLUGIN_NAME);
		createEReference(pluginEClass, PLUGIN__URL);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__NAME);
		createEReference(mediaEClass, MEDIA__URL);
		createEAttribute(mediaEClass, MEDIA__DATE);
		createEReference(mediaEClass, MEDIA__UPLOADED_TO);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__TITLE);
		createEAttribute(imageEClass, IMAGE__CAPTION);
		createEAttribute(imageEClass, IMAGE__ALT_TEXT);
		createEAttribute(imageEClass, IMAGE__DESCRIPTION);
		createEReference(imageEClass, IMAGE__URL);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__NAME);
		createEReference(linkEClass, LINK__URL);
		createEAttribute(linkEClass, LINK__TEXT);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__RANDOM_IMAGE);
		createEReference(headerEClass, HEADER__UPLOAD_IMAGE);
		createEAttribute(headerEClass, HEADER__TEXT_COLOR);
		createEAttribute(headerEClass, HEADER__IS_SHOWING_HEADER_TEXT);

		taxonomyEClass = createEClass(TAXONOMY);
		createEAttribute(taxonomyEClass, TAXONOMY__NAME);
		createEAttribute(taxonomyEClass, TAXONOMY__DESCRIPTION);
		createEAttribute(taxonomyEClass, TAXONOMY__SLUG);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__CATEGORY_NAME);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__TAG_NAME);

		settingsEClass = createEClass(SETTINGS);
		createEReference(settingsEClass, SETTINGS__GENERAL);
		createEReference(settingsEClass, SETTINGS__WRITING);
		createEReference(settingsEClass, SETTINGS__READING);
		createEReference(settingsEClass, SETTINGS__DISCUSSION);
		createEReference(settingsEClass, SETTINGS__MEDIA);
		createEReference(settingsEClass, SETTINGS__PERMALINKS);

		generalSettingsEClass = createEClass(GENERAL_SETTINGS);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__WEBSITE_TITLE);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__WEBSITE_TAGLINE);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__WEBSITE_ADRESS);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__ADMIN_MAIL);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__USER_DEFAULT_ROLE);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__TIME_ZONE);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__GS_DATE_FORMAT);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__GS_TIME_FORMAT);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__WEEK_STARTS_ON);
		createEReference(generalSettingsEClass, GENERAL_SETTINGS__WORD_PRESS_ADRESS);
		createEAttribute(generalSettingsEClass, GENERAL_SETTINGS__IS_PUBLIC);

		writingSettingsEClass = createEClass(WRITING_SETTINGS);
		createEAttribute(writingSettingsEClass, WRITING_SETTINGS__MAIL_SERVER);
		createEAttribute(writingSettingsEClass, WRITING_SETTINGS__PORT);
		createEAttribute(writingSettingsEClass, WRITING_SETTINGS__LOGIN_NAME);
		createEAttribute(writingSettingsEClass, WRITING_SETTINGS__PASSWORD);
		createEReference(writingSettingsEClass, WRITING_SETTINGS__DEFAULT_POST_CATEGORY);
		createEReference(writingSettingsEClass, WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY);
		createEAttribute(writingSettingsEClass, WRITING_SETTINGS__IS_CONVERTING_EMOTICONS);
		createEAttribute(writingSettingsEClass, WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML);

		readingSettingsEClass = createEClass(READING_SETTINGS);
		createEAttribute(readingSettingsEClass, READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES);
		createEAttribute(readingSettingsEClass, READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS);
		createEReference(readingSettingsEClass, READING_SETTINGS__STATIC_FRONT_PAGE);
		createEReference(readingSettingsEClass, READING_SETTINGS__STATIC_POST_PAGE);
		createEAttribute(readingSettingsEClass, READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT);
		createEAttribute(readingSettingsEClass, READING_SETTINGS__IS_INDEXED);
		createEAttribute(readingSettingsEClass, READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED);

		discussionSettingsEClass = createEClass(DISCUSSION_SETTINGS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__MODERATED_WORDS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__FORBIDDEN_WORDS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__MAX_AVATAR_RATING);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT);
		createEAttribute(discussionSettingsEClass, DISCUSSION_SETTINGS__IS_SHOWING_AVATAR);

		mediaSettingsEClass = createEClass(MEDIA_SETTINGS);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__THUMBNAIL_WIDTH);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__THUMBNAIL_HEIGHT);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__MEDIUM_WIDTH);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__MEDIUM_HEIGHT);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__LARGE_WIDTH);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__LARGE_HEIGHT);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS);
		createEAttribute(mediaSettingsEClass, MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS);

		permalinksSettingsEClass = createEClass(PERMALINKS_SETTINGS);
		createEAttribute(permalinksSettingsEClass, PERMALINKS_SETTINGS__PERMA_URL_FORM);
		createEAttribute(permalinksSettingsEClass, PERMALINKS_SETTINGS__URL_CATEGORY_BASE);
		createEAttribute(permalinksSettingsEClass, PERMALINKS_SETTINGS__URL_TAG_BASE);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__TYPE);
		createEReference(widgetEClass, WIDGET__WIDGET_ARCHIVES);
		createEReference(widgetEClass, WIDGET__CALENDARS);
		createEReference(widgetEClass, WIDGET__CATEGORIES);
		createEReference(widgetEClass, WIDGET__CUSTOM_MENUS);
		createEReference(widgetEClass, WIDGET__METAS);
		createEReference(widgetEClass, WIDGET__PAGES);
		createEReference(widgetEClass, WIDGET__RECENT_COMMENTS);
		createEReference(widgetEClass, WIDGET__RECENT_POSTS);
		createEReference(widgetEClass, WIDGET__FEEDS);
		createEReference(widgetEClass, WIDGET__SEARCHS);
		createEReference(widgetEClass, WIDGET__TAG_CLOUDS);
		createEReference(widgetEClass, WIDGET__TEXTS);

		menuEClass = createEClass(MENU);
		createEAttribute(menuEClass, MENU__NAME);
		createEAttribute(menuEClass, MENU__MENU_NAME);
		createEReference(menuEClass, MENU__PAGES);
		createEReference(menuEClass, MENU__CATEGORIES);
		createEReference(menuEClass, MENU__LINKS);
		createEReference(menuEClass, MENU__CURRENT_MENU_SETTING);

		archiveEClass = createEClass(ARCHIVE);
		createEAttribute(archiveEClass, ARCHIVE__TITLE);
		createEAttribute(archiveEClass, ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN);
		createEAttribute(archiveEClass, ARCHIVE__IS_SHOWING_POSTS_COUNT);

		calendarEClass = createEClass(CALENDAR);
		createEAttribute(calendarEClass, CALENDAR__TITLE);

		widgetCategorieEClass = createEClass(WIDGET_CATEGORIE);
		createEAttribute(widgetCategorieEClass, WIDGET_CATEGORIE__TITLE);
		createEAttribute(widgetCategorieEClass, WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS);
		createEAttribute(widgetCategorieEClass, WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT);
		createEAttribute(widgetCategorieEClass, WIDGET_CATEGORIE__IS_DROP_DOWN_LIST);

		widgetMenuEClass = createEClass(WIDGET_MENU);
		createEAttribute(widgetMenuEClass, WIDGET_MENU__TITLE);
		createEReference(widgetMenuEClass, WIDGET_MENU__SELECTED_MENU);

		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__TITLE);

		widgetPageEClass = createEClass(WIDGET_PAGE);
		createEAttribute(widgetPageEClass, WIDGET_PAGE__TITLE);
		createEAttribute(widgetPageEClass, WIDGET_PAGE__WIDGET_PAGES_SORTER);
		createEReference(widgetPageEClass, WIDGET_PAGE__ID_PAGE_EXCLUDED);

		widgetCommentEClass = createEClass(WIDGET_COMMENT);
		createEAttribute(widgetCommentEClass, WIDGET_COMMENT__TITLE);
		createEAttribute(widgetCommentEClass, WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS);

		widgetPostEClass = createEClass(WIDGET_POST);
		createEAttribute(widgetPostEClass, WIDGET_POST__TITLE);
		createEAttribute(widgetPostEClass, WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS);
		createEAttribute(widgetPostEClass, WIDGET_POST__IS_DISPLAYING_POST_DATE);

		searchEClass = createEClass(SEARCH);
		createEAttribute(searchEClass, SEARCH__NAME);
		createEAttribute(searchEClass, SEARCH__TITLE);

		tagCloudEClass = createEClass(TAG_CLOUD);
		createEAttribute(tagCloudEClass, TAG_CLOUD__TITLE);
		createEAttribute(tagCloudEClass, TAG_CLOUD__TAXONOMY);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TITLE);
		createEAttribute(textEClass, TEXT__CONTENT);
		createEAttribute(textEClass, TEXT__IS_AUTO_PARAGRAPHS);

		currentMenuSettingEClass = createEClass(CURRENT_MENU_SETTING);
		createEAttribute(currentMenuSettingEClass, CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES);
		createEAttribute(currentMenuSettingEClass, CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED);

		// Create enums
		postFormatEEnum = createEEnum(POST_FORMAT);
		avatarRatingEEnum = createEEnum(AVATAR_RATING);
		dateformatEEnum = createEEnum(DATEFORMAT);
		defaultAvatarEEnum = createEEnum(DEFAULT_AVATAR);
		functionalitiesEEnum = createEEnum(FUNCTIONALITIES);
		themesEEnum = createEEnum(THEMES);
		pagesSorterEEnum = createEEnum(PAGES_SORTER);
		pageStatusEEnum = createEEnum(PAGE_STATUS);
		roleEEnum = createEEnum(ROLE);
		timeFormatEEnum = createEEnum(TIME_FORMAT);
		taxonomyTypeEEnum = createEEnum(TAXONOMY_TYPE);
		urlFormEEnum = createEEnum(URL_FORM);
		weeksEEnum = createEEnum(WEEKS);
		widgetTypeEEnum = createEEnum(WIDGET_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		postEClass.getESuperTypes().add(this.getPostPage());
		pageEClass.getESuperTypes().add(this.getPostPage());
		categoryEClass.getESuperTypes().add(this.getTaxonomy());
		tagEClass.getESuperTypes().add(this.getTaxonomy());

		// Initialize classes and features; add operations and parameters
		initEClass(websiteEClass, Website.class, "Website", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebsite_AdminUser(), this.getUser(), null, "adminUser", null, 0, 1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Users(), this.getUser(), null, "users", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Posts(), this.getPost(), null, "posts", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Pages(), this.getPage(), null, "pages", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Appearance(), this.getAppearance(), null, "appearance", null, 0, 1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_MediaLibrary(), this.getMedia(), null, "mediaLibrary", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Functionalities(), this.getFunctionality(), null, "functionalities", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Comments(), this.getComment(), null, "comments", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Categories(), this.getCategory(), null, "categories", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Tags(), this.getTag(), null, "tags", null, 0, -1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Settings(), this.getSettings(), null, "settings", null, 0, 1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsite_Deletion(), this.getDeletion(), null, "deletion", null, 0, 1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletionEClass, Deletion.class, "Deletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeletion_PagesByTitle(), ecorePackage.getEString(), "pagesByTitle", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_UsersByLogin(), ecorePackage.getEString(), "usersByLogin", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_MediasByTitle(), ecorePackage.getEString(), "mediasByTitle", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_FunctionalitiesByName(), this.getfunctionalities(), "functionalitiesByName", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_ThemesByName(), this.getthemes(), "themesByName", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_CategoriesByName(), ecorePackage.getEString(), "categoriesByName", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_TagsByName(), ecorePackage.getEString(), "tagsByName", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletion_MenusByName(), ecorePackage.getEString(), "menusByName", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeletion_CommentsByPostDateAuthor(), this.getPostDateAuthor(), null, "commentsByPostDateAuthor", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postDateAuthorEClass, PostDateAuthor.class, "PostDateAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostDateAuthor_PostTitle(), ecorePackage.getEString(), "postTitle", null, 0, 1, PostDateAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostDateAuthor_CommentAuthorName(), ecorePackage.getEString(), "commentAuthorName", null, 0, 1, PostDateAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostDateAuthor_CommentDate(), ecorePackage.getEString(), "commentDate", null, 0, 1, PostDateAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserRole(), this.getrole(), "userRole", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_NickName(), ecorePackage.getEString(), "nickName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_PublicName(), ecorePackage.getEString(), "publicName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_WebSite(), ecorePackage.getEString(), "webSite", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Biography(), ecorePackage.getEString(), "biography", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postPage_ImplEClass, PostPage_Impl.class, "PostPage_Impl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostPage_Impl_Title(), ecorePackage.getEString(), "title", null, 0, 1, PostPage_Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostPage_Impl_Status(), this.getpageStatus(), "status", null, 0, 1, PostPage_Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostPage_Impl_Content(), ecorePackage.getEString(), "content", null, 0, 1, PostPage_Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostPage_Impl_Author(), this.getUser(), null, "author", null, 0, 1, PostPage_Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostPage_Impl_FeaturedImage(), this.getImage(), null, "featuredImage", null, 0, 1, PostPage_Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postPageEClass, PostPage.class, "PostPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, PostPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostPage_CommonAttributes(), this.getPostPage_Impl(), null, "commonAttributes", null, 0, 1, PostPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postEClass, Post.class, "Post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPost_Categories(), this.getCategory(), null, "categories", null, 0, -1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_Tags(), this.getTag(), null, "tags", null, 0, -1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPost_Format(), this.getpostFormat(), "format", null, 0, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Parent(), this.getPage(), null, "parent", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_PublicationDateGMT(), ecorePackage.getEString(), "publicationDateGMT", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_PublicationDate(), ecorePackage.getEString(), "publicationDate", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceEClass, Appearance.class, "Appearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppearance_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_AppearanceMenus(), this.getMenu(), null, "appearanceMenus", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_AppearanceHeader(), this.getHeader(), null, "appearanceHeader", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_Theme(), this.getTheme(), null, "theme", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(themeEClass, Theme.class, "Theme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheme_ThemeType(), this.getthemes(), "themeType", null, 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheme_DefaultPlugin(), this.getPlugin(), null, "defaultPlugin", null, 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalityEClass, Functionality.class, "Functionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionality_Name(), ecorePackage.getEString(), "name", null, 0, 1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionality_FunctionalityType(), this.getfunctionalities(), "functionalityType", null, 0, 1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionality_SocialNetworks(), ecorePackage.getEString(), "socialNetworks", null, 0, 1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionality_DefaultPlugin(), this.getPlugin(), null, "defaultPlugin", null, 0, 1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Content(), ecorePackage.getEString(), "content", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_AuthorName(), ecorePackage.getEString(), "authorName", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_CommentPostPage(), this.getPostPage(), null, "commentPostPage", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlEClass, Url.class, "Url", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrl_PathUrl(), ecorePackage.getEString(), "pathUrl", null, 0, 1, Url.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetFeedEClass, WidgetFeed.class, "WidgetFeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetFeed_Title(), ecorePackage.getEString(), "title", null, 0, 1, WidgetFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetFeed_IsDisplayingItemContent(), ecorePackage.getEBoolean(), "isDisplayingItemContent", null, 0, 1, WidgetFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetFeed_IsDisplayingItemAuthor(), ecorePackage.getEBoolean(), "isDisplayingItemAuthor", null, 0, 1, WidgetFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetFeed_IsDisplayingItemDate(), ecorePackage.getEBoolean(), "isDisplayingItemDate", null, 0, 1, WidgetFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetFeed_NumberOfItems(), ecorePackage.getEInt(), "numberOfItems", null, 0, 1, WidgetFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetFeed_Url(), this.getUrl(), null, "url", null, 0, 1, WidgetFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_PluginName(), ecorePackage.getEString(), "pluginName", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_Url(), this.getUrl(), null, "url", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_Name(), ecorePackage.getEString(), "name", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_Url(), this.getUrl(), null, "url", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Date(), ecorePackage.getEString(), "date", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_UploadedTo(), this.getPostPage(), null, "uploadedTo", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_AltText(), ecorePackage.getEString(), "altText", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Description(), ecorePackage.getEString(), "description", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Url(), this.getUrl(), null, "url", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Url(), this.getUrl(), null, "url", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Text(), ecorePackage.getEString(), "text", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_RandomImage(), ecorePackage.getEBoolean(), "randomImage", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeader_UploadImage(), this.getUrl(), null, "uploadImage", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_TextColor(), ecorePackage.getEString(), "textColor", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_IsShowingHeaderText(), ecorePackage.getEBoolean(), "isShowingHeaderText", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxonomyEClass, Taxonomy.class, "Taxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxonomy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Description(), ecorePackage.getEString(), "description", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Slug(), ecorePackage.getEString(), "slug", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_CategoryName(), ecorePackage.getEString(), "categoryName", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_TagName(), ecorePackage.getEString(), "tagName", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingsEClass, Settings.class, "Settings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettings_General(), this.getGeneralSettings(), null, "general", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettings_Writing(), this.getWritingSettings(), null, "writing", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettings_Reading(), this.getReadingSettings(), null, "reading", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettings_Discussion(), this.getDiscussionSettings(), null, "discussion", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettings_Media(), this.getMediaSettings(), null, "media", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettings_Permalinks(), this.getPermalinksSettings(), null, "permalinks", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalSettingsEClass, GeneralSettings.class, "GeneralSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralSettings_WebsiteTitle(), ecorePackage.getEString(), "websiteTitle", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_WebsiteTagline(), ecorePackage.getEString(), "websiteTagline", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_WebsiteAdress(), ecorePackage.getEString(), "websiteAdress", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_AdminMail(), ecorePackage.getEString(), "adminMail", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_UserDefaultRole(), this.getrole(), "userDefaultRole", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_TimeZone(), ecorePackage.getEInt(), "timeZone", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_GsDateFormat(), this.getdateformat(), "gsDateFormat", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_GsTimeFormat(), this.gettimeFormat(), "gsTimeFormat", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_WeekStartsOn(), this.getweeks(), "weekStartsOn", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralSettings_WordPressAdress(), this.getUrl(), null, "wordPressAdress", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSettings_IsPublic(), ecorePackage.getEBoolean(), "isPublic", null, 0, 1, GeneralSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writingSettingsEClass, WritingSettings.class, "WritingSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWritingSettings_MailServer(), ecorePackage.getEString(), "mailServer", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWritingSettings_Port(), ecorePackage.getEInt(), "port", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWritingSettings_LoginName(), ecorePackage.getEString(), "loginName", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWritingSettings_Password(), ecorePackage.getEString(), "password", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWritingSettings_DefaultPostCategory(), this.getCategory(), null, "defaultPostCategory", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWritingSettings_DefaultMailCategory(), this.getCategory(), null, "defaultMailCategory", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWritingSettings_IsConvertingEmoticons(), ecorePackage.getEBoolean(), "isConvertingEmoticons", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWritingSettings_IsCorrectingInvalidXHTML(), ecorePackage.getEBoolean(), "isCorrectingInvalidXHTML", null, 0, 1, WritingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readingSettingsEClass, ReadingSettings.class, "ReadingSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadingSettings_MaxNumberPostsForBlogPages(), ecorePackage.getEInt(), "maxNumberPostsForBlogPages", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadingSettings_NumberRecentItemForFeeds(), ecorePackage.getEInt(), "numberRecentItemForFeeds", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadingSettings_StaticFrontPage(), this.getPage(), null, "staticFrontPage", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadingSettings_StaticPostPage(), this.getPage(), null, "staticPostPage", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadingSettings_IsDisplayingLastPostInFront(), ecorePackage.getEBoolean(), "isDisplayingLastPostInFront", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadingSettings_IsIndexed(), ecorePackage.getEBoolean(), "isIndexed", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadingSettings_IsShowingFullTextForFeed(), ecorePackage.getEBoolean(), "isShowingFullTextForFeed", null, 0, 1, ReadingSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discussionSettingsEClass, DiscussionSettings.class, "DiscussionSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscussionSettings_NumberArticleDaysForAutoCloseComments(), ecorePackage.getEInt(), "numberArticleDaysForAutoCloseComments", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_NestedCommentsLevel(), ecorePackage.getEInt(), "nestedCommentsLevel", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_NumberCommentsPerPageForBreakedComments(), ecorePackage.getEInt(), "numberCommentsPerPageForBreakedComments", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_NumberOfLinksInCommentForModeration(), ecorePackage.getEInt(), "numberOfLinksInCommentForModeration", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_ModeratedWords(), ecorePackage.getEString(), "moderatedWords", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_ForbiddenWords(), ecorePackage.getEString(), "forbiddenWords", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_MaxAvatarRating(), this.getavatarRating(), "maxAvatarRating", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_UserDefaultAvatar(), this.getdefaultAvatar(), "userDefaultAvatar", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsNotifyingLinkedBlogs(), ecorePackage.getEBoolean(), "isNotifyingLinkedBlogs", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsAllowingLinkNotificationsFromBlogs(), ecorePackage.getEBoolean(), "isAllowingLinkNotificationsFromBlogs", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsAllowingPublicComments(), ecorePackage.getEBoolean(), "isAllowingPublicComments", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsAskingNameAndMailCommentAuthor(), ecorePackage.getEBoolean(), "isAskingNameAndMailCommentAuthor", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsAllowingAnonymousComments(), ecorePackage.getEBoolean(), "isAllowingAnonymousComments", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsBreakingCommentsIntoPages(), ecorePackage.getEBoolean(), "isBreakingCommentsIntoPages", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsdisplayingLastPageForBreakedComments(), ecorePackage.getEBoolean(), "isdisplayingLastPageForBreakedComments", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsDisplayingOlderCommentForEachPage(), ecorePackage.getEBoolean(), "isDisplayingOlderCommentForEachPage", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsMailingAdminForEachComments(), ecorePackage.getEBoolean(), "isMailingAdminForEachComments", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsHeldingCommentForModeration(), ecorePackage.getEBoolean(), "isHeldingCommentForModeration", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsAskingAdminApprovement(), ecorePackage.getEBoolean(), "isAskingAdminApprovement", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsAskingPreviousAdminApprovement(), ecorePackage.getEBoolean(), "isAskingPreviousAdminApprovement", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscussionSettings_IsShowingAvatar(), ecorePackage.getEBoolean(), "isShowingAvatar", null, 0, 1, DiscussionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaSettingsEClass, MediaSettings.class, "MediaSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaSettings_ThumbnailWidth(), ecorePackage.getEInt(), "thumbnailWidth", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_ThumbnailHeight(), ecorePackage.getEInt(), "thumbnailHeight", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_MediumWidth(), ecorePackage.getEInt(), "mediumWidth", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_MediumHeight(), ecorePackage.getEInt(), "mediumHeight", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_LargeWidth(), ecorePackage.getEInt(), "largeWidth", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_LargeHeight(), ecorePackage.getEInt(), "largeHeight", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_IsCroppingThumbnailToExactDims(), ecorePackage.getEBoolean(), "isCroppingThumbnailToExactDims", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaSettings_IsOrganizeUploadsIntoFolders(), ecorePackage.getEBoolean(), "isOrganizeUploadsIntoFolders", null, 0, 1, MediaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permalinksSettingsEClass, PermalinksSettings.class, "PermalinksSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermalinksSettings_PermaUrlForm(), this.geturlForm(), "permaUrlForm", null, 0, 1, PermalinksSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermalinksSettings_UrlCategoryBase(), ecorePackage.getEString(), "urlCategoryBase", null, 0, 1, PermalinksSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermalinksSettings_UrlTagBase(), ecorePackage.getEString(), "urlTagBase", null, 0, 1, PermalinksSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Type(), this.getwidgetType(), "type", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_WidgetArchives(), this.getArchive(), null, "widgetArchives", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Calendars(), this.getCalendar(), null, "calendars", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Categories(), this.getWidgetCategorie(), null, "categories", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_CustomMenus(), this.getWidgetMenu(), null, "customMenus", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Metas(), this.getMeta(), null, "metas", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Pages(), this.getWidgetPage(), null, "pages", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_RecentComments(), this.getWidgetComment(), null, "recentComments", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_RecentPosts(), this.getWidgetPost(), null, "recentPosts", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Feeds(), this.getWidgetFeed(), null, "feeds", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Searchs(), this.getSearch(), null, "searchs", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_TagClouds(), this.getTagCloud(), null, "tagClouds", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Texts(), this.getText(), null, "texts", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_MenuName(), ecorePackage.getEString(), "menuName", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Pages(), this.getPage(), null, "pages", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Categories(), this.getCategory(), null, "categories", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Links(), this.getLink(), null, "links", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_CurrentMenuSetting(), this.getCurrentMenuSetting(), null, "currentMenuSetting", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchive_Title(), ecorePackage.getEString(), "title", null, 0, 1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchive_IsDisplayingAsDropDown(), ecorePackage.getEBoolean(), "isDisplayingAsDropDown", null, 0, 1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchive_IsShowingPostsCount(), ecorePackage.getEBoolean(), "isShowingPostsCount", null, 0, 1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendar_Title(), ecorePackage.getEString(), "title", null, 0, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetCategorieEClass, WidgetCategorie.class, "WidgetCategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetCategorie_Title(), ecorePackage.getEString(), "title", null, 0, 1, WidgetCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetCategorie_NumberOfDisplayedPosts(), ecorePackage.getEInt(), "numberOfDisplayedPosts", null, 0, 1, WidgetCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetCategorie_IsDisplayingSubCat(), ecorePackage.getEBoolean(), "isDisplayingSubCat", null, 0, 1, WidgetCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetCategorie_IsDropDownList(), ecorePackage.getEBoolean(), "isDropDownList", null, 0, 1, WidgetCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetMenuEClass, WidgetMenu.class, "WidgetMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetMenu_Title(), ecorePackage.getEString(), "title", null, 0, 1, WidgetMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetMenu_SelectedMenu(), this.getMenu(), null, "selectedMenu", null, 0, 1, WidgetMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Title(), ecorePackage.getEString(), "title", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetPageEClass, WidgetPage.class, "WidgetPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, WidgetPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetPage_WidgetPagesSorter(), this.getpagesSorter(), "widgetPagesSorter", null, 0, 1, WidgetPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetPage_IdPageExcluded(), this.getPage(), null, "idPageExcluded", null, 0, 1, WidgetPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetCommentEClass, WidgetComment.class, "WidgetComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetComment_Title(), ecorePackage.getEString(), "title", null, 0, 1, WidgetComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetComment_NumberOfDisplayedComments(), ecorePackage.getEInt(), "numberOfDisplayedComments", null, 0, 1, WidgetComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetPostEClass, WidgetPost.class, "WidgetPost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetPost_Title(), ecorePackage.getEString(), "title", null, 0, 1, WidgetPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetPost_NumberOfDisplayedPosts(), ecorePackage.getEInt(), "numberOfDisplayedPosts", null, 0, 1, WidgetPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetPost_IsDisplayingPostDate(), ecorePackage.getEBoolean(), "isDisplayingPostDate", null, 0, 1, WidgetPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearch_Name(), ecorePackage.getEString(), "name", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearch_Title(), ecorePackage.getEString(), "title", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagCloudEClass, TagCloud.class, "TagCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagCloud_Title(), ecorePackage.getEString(), "title", null, 0, 1, TagCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagCloud_Taxonomy(), this.gettaxonomyType(), "taxonomy", null, 0, 1, TagCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Title(), ecorePackage.getEString(), "title", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Content(), ecorePackage.getEString(), "content", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_IsAutoParagraphs(), ecorePackage.getEBoolean(), "isAutoParagraphs", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentMenuSettingEClass, CurrentMenuSetting.class, "CurrentMenuSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentMenuSetting_IsAddingNewTopLevelPages(), ecorePackage.getEBoolean(), "isAddingNewTopLevelPages", null, 0, 1, CurrentMenuSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentMenuSetting_IsNavigationMenuLocated(), ecorePackage.getEBoolean(), "isNavigationMenuLocated", null, 0, 1, CurrentMenuSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(postFormatEEnum, postFormat.class, "postFormat");
		addEEnumLiteral(postFormatEEnum, postFormat.STANDARD);
		addEEnumLiteral(postFormatEEnum, postFormat.ASIDE);
		addEEnumLiteral(postFormatEEnum, postFormat.AUDIO);
		addEEnumLiteral(postFormatEEnum, postFormat.CHAT);
		addEEnumLiteral(postFormatEEnum, postFormat.GALLERY);
		addEEnumLiteral(postFormatEEnum, postFormat.IMAGE);
		addEEnumLiteral(postFormatEEnum, postFormat.LINK);
		addEEnumLiteral(postFormatEEnum, postFormat.QUOTE);
		addEEnumLiteral(postFormatEEnum, postFormat.STATUS);
		addEEnumLiteral(postFormatEEnum, postFormat.VIDEO);

		initEEnum(avatarRatingEEnum, avatarRating.class, "avatarRating");
		addEEnumLiteral(avatarRatingEEnum, avatarRating.G);
		addEEnumLiteral(avatarRatingEEnum, avatarRating.PG);
		addEEnumLiteral(avatarRatingEEnum, avatarRating.R);
		addEEnumLiteral(avatarRatingEEnum, avatarRating.X);

		initEEnum(dateformatEEnum, dateformat.class, "dateformat");
		addEEnumLiteral(dateformatEEnum, dateformat.JN_Y);
		addEEnumLiteral(dateformatEEnum, dateformat.FJ_Y);
		addEEnumLiteral(dateformatEEnum, dateformat.YNJ);
		addEEnumLiteral(dateformatEEnum, dateformat.NJ_Y);
		addEEnumLiteral(dateformatEEnum, dateformat.CUSTOM);

		initEEnum(defaultAvatarEEnum, defaultAvatar.class, "defaultAvatar");
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.MYSTERY_MAN);
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.BLANK);
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.GRAVATAR_LOGO);
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.IDENTICON);
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.WAVATAR);
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.MONSTER_ID);
		addEEnumLiteral(defaultAvatarEEnum, defaultAvatar.RETRO);

		initEEnum(functionalitiesEEnum, functionalities.class, "functionalities");
		addEEnumLiteral(functionalitiesEEnum, functionalities.ECOMMERCE);
		addEEnumLiteral(functionalitiesEEnum, functionalities.FORMS);
		addEEnumLiteral(functionalitiesEEnum, functionalities.HAM_SPAM);
		addEEnumLiteral(functionalitiesEEnum, functionalities.INDEXING);
		addEEnumLiteral(functionalitiesEEnum, functionalities.MULTI_LANGUAGE);
		addEEnumLiteral(functionalitiesEEnum, functionalities.PICTURES);
		addEEnumLiteral(functionalitiesEEnum, functionalities.SEO);
		addEEnumLiteral(functionalitiesEEnum, functionalities.SOCIAL_NETWORK);

		initEEnum(themesEEnum, themes.class, "themes");
		addEEnumLiteral(themesEEnum, themes.RESPONSIVE);
		addEEnumLiteral(themesEEnum, themes.SEO);
		addEEnumLiteral(themesEEnum, themes.HEADER_PARALLAX_EFFECT);
		addEEnumLiteral(themesEEnum, themes.BUSINESS);
		addEEnumLiteral(themesEEnum, themes.MAGAZINE);
		addEEnumLiteral(themesEEnum, themes.GALLERIES);

		initEEnum(pagesSorterEEnum, pagesSorter.class, "pagesSorter");
		addEEnumLiteral(pagesSorterEEnum, pagesSorter.PAGE_TITLE);
		addEEnumLiteral(pagesSorterEEnum, pagesSorter.PAGE_ORDER);
		addEEnumLiteral(pagesSorterEEnum, pagesSorter.PAGE_ID);

		initEEnum(pageStatusEEnum, pageStatus.class, "pageStatus");
		addEEnumLiteral(pageStatusEEnum, pageStatus.PUBLISHED);
		addEEnumLiteral(pageStatusEEnum, pageStatus.PENDINGREVIEW);
		addEEnumLiteral(pageStatusEEnum, pageStatus.DRAFT);
		addEEnumLiteral(pageStatusEEnum, pageStatus.AUTO_DRAFT);
		addEEnumLiteral(pageStatusEEnum, pageStatus.TRASH);
		addEEnumLiteral(pageStatusEEnum, pageStatus.PRIVATE);
		addEEnumLiteral(pageStatusEEnum, pageStatus.NEW);
		addEEnumLiteral(pageStatusEEnum, pageStatus.INHERIT);
		addEEnumLiteral(pageStatusEEnum, pageStatus.FUTURE);

		initEEnum(roleEEnum, role.class, "role");
		addEEnumLiteral(roleEEnum, role.AUTHOR);
		addEEnumLiteral(roleEEnum, role.ADMINISTRATOR);
		addEEnumLiteral(roleEEnum, role.SUSCRIBER);
		addEEnumLiteral(roleEEnum, role.EDITOR);
		addEEnumLiteral(roleEEnum, role.CONTRIBUTOR);

		initEEnum(timeFormatEEnum, timeFormat.class, "timeFormat");
		addEEnumLiteral(timeFormatEEnum, timeFormat.GIALOWER);
		addEEnumLiteral(timeFormatEEnum, timeFormat.GIAUPPER);
		addEEnumLiteral(timeFormatEEnum, timeFormat.GG);
		addEEnumLiteral(timeFormatEEnum, timeFormat.CUSTOM);

		initEEnum(taxonomyTypeEEnum, taxonomyType.class, "taxonomyType");
		addEEnumLiteral(taxonomyTypeEEnum, taxonomyType.CATEGORIES);
		addEEnumLiteral(taxonomyTypeEEnum, taxonomyType.TAGS);

		initEEnum(urlFormEEnum, urlForm.class, "urlForm");
		addEEnumLiteral(urlFormEEnum, urlForm.DEFAULT);
		addEEnumLiteral(urlFormEEnum, urlForm.DAY_AND_NAME);
		addEEnumLiteral(urlFormEEnum, urlForm.MONTH_AND_NAME);
		addEEnumLiteral(urlFormEEnum, urlForm.NUMERIC);
		addEEnumLiteral(urlFormEEnum, urlForm.POST_NAME);
		addEEnumLiteral(urlFormEEnum, urlForm.CUSTOM_STRUCTURE);

		initEEnum(weeksEEnum, weeks.class, "weeks");
		addEEnumLiteral(weeksEEnum, weeks.MONDAY);
		addEEnumLiteral(weeksEEnum, weeks.TUESDAY);
		addEEnumLiteral(weeksEEnum, weeks.WEDNESDAY);
		addEEnumLiteral(weeksEEnum, weeks.THIRSDAY);
		addEEnumLiteral(weeksEEnum, weeks.FRIDAY);
		addEEnumLiteral(weeksEEnum, weeks.SATURDAY);
		addEEnumLiteral(weeksEEnum, weeks.SUNDAY);

		initEEnum(widgetTypeEEnum, widgetType.class, "widgetType");
		addEEnumLiteral(widgetTypeEEnum, widgetType.MAIN_AREA);
		addEEnumLiteral(widgetTypeEEnum, widgetType.SECONDARY_AREA);

		// Create resource
		createResource(eNS_URI);
	}

} //WdpDslPackageImpl
