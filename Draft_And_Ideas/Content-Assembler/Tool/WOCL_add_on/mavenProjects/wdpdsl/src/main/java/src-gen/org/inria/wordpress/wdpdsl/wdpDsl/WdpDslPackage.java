/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslFactory
 * @model kind="package"
 * @generated
 */
public interface WdpDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wdpDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.org/wordpress/wdpdsl/WdpDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wdpDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WdpDslPackage eINSTANCE = org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Admin User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__ADMIN_USER = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__USERS = 1;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__POSTS = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__PAGES = 3;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__APPEARANCE = 4;

	/**
	 * The feature id for the '<em><b>Media Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__MEDIA_LIBRARY = 5;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__FUNCTIONALITIES = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__COMMENTS = 7;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__CATEGORIES = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__TAGS = 9;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__SETTINGS = 10;

	/**
	 * The feature id for the '<em><b>Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__DELETION = 11;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl <em>Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getDeletion()
	 * @generated
	 */
	int DELETION = 1;

	/**
	 * The feature id for the '<em><b>Pages By Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__PAGES_BY_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Users By Login</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__USERS_BY_LOGIN = 1;

	/**
	 * The feature id for the '<em><b>Medias By Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__MEDIAS_BY_TITLE = 2;

	/**
	 * The feature id for the '<em><b>Functionalities By Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__FUNCTIONALITIES_BY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Themes By Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__THEMES_BY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Categories By Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__CATEGORIES_BY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Tags By Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__TAGS_BY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Menus By Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__MENUS_BY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Comments By Post Date Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION__COMMENTS_BY_POST_DATE_AUTHOR = 8;

	/**
	 * The number of structural features of the '<em>Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl <em>Post Date Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPostDateAuthor()
	 * @generated
	 */
	int POST_DATE_AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Post Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_DATE_AUTHOR__POST_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Comment Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Comment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_DATE_AUTHOR__COMMENT_DATE = 2;

	/**
	 * The number of structural features of the '<em>Post Date Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_DATE_AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>User Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ROLE = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NICK_NAME = 6;

	/**
	 * The feature id for the '<em><b>Public Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PUBLIC_NAME = 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 8;

	/**
	 * The feature id for the '<em><b>Web Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WEB_SITE = 9;

	/**
	 * The feature id for the '<em><b>Biography</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIOGRAPHY = 10;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl <em>Post Page Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPostPage_Impl()
	 * @generated
	 */
	int POST_PAGE_IMPL = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_IMPL__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_IMPL__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_IMPL__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_IMPL__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Featured Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_IMPL__FEATURED_IMAGE = 4;

	/**
	 * The number of structural features of the '<em>Post Page Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_IMPL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPageImpl <em>Post Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPageImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPostPage()
	 * @generated
	 */
	int POST_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Common Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE__COMMON_ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Post Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPost()
	 * @generated
	 */
	int POST = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__NAME = POST_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Common Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__COMMON_ATTRIBUTES = POST_PAGE__COMMON_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CATEGORIES = POST_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TAGS = POST_PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__FORMAT = POST_PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = POST_PAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = POST_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Common Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__COMMON_ATTRIBUTES = POST_PAGE__COMMON_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARENT = POST_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ORDER = POST_PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publication Date GMT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PUBLICATION_DATE_GMT = POST_PAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PUBLICATION_DATE = POST_PAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = POST_PAGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl <em>Appearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 8;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__WIDGETS = 0;

	/**
	 * The feature id for the '<em><b>Appearance Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__APPEARANCE_MENUS = 1;

	/**
	 * The feature id for the '<em><b>Appearance Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__APPEARANCE_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__THEME = 3;

	/**
	 * The number of structural features of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl <em>Theme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Theme Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__THEME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__DEFAULT_PLUGIN = 2;

	/**
	 * The number of structural features of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Functionality Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__FUNCTIONALITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Social Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__SOCIAL_NETWORKS = 2;

	/**
	 * The feature id for the '<em><b>Default Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DEFAULT_PLUGIN = 3;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Comment Post Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT_POST_PAGE = 3;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.UrlImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 12;

	/**
	 * The feature id for the '<em><b>Path Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__PATH_URL = 0;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl <em>Widget Feed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetFeed()
	 * @generated
	 */
	int WIDGET_FEED = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Is Displaying Item Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Is Displaying Item Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Is Displaying Item Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED__IS_DISPLAYING_ITEM_DATE = 3;

	/**
	 * The feature id for the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED__NUMBER_OF_ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED__URL = 5;

	/**
	 * The number of structural features of the '<em>Widget Feed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEED_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PluginImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 14;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PLUGIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__URL = 1;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__URL = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DATE = 2;

	/**
	 * The feature id for the '<em><b>Uploaded To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__UPLOADED_TO = 3;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CAPTION = 1;

	/**
	 * The feature id for the '<em><b>Alt Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = 4;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.LinkImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 18;

	/**
	 * The feature id for the '<em><b>Random Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__RANDOM_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Upload Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__UPLOAD_IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TEXT_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Is Showing Header Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__IS_SHOWING_HEADER_TEXT = 3;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TaxonomyImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__SLUG = 2;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CategoryImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = TAXONOMY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = TAXONOMY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SLUG = TAXONOMY__SLUG;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_NAME = TAXONOMY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = TAXONOMY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TagImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = TAXONOMY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = TAXONOMY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__SLUG = TAXONOMY__SLUG;

	/**
	 * The feature id for the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAG_NAME = TAXONOMY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = TAXONOMY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 22;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Writing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__WRITING = 1;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__READING = 2;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__DISCUSSION = 3;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__MEDIA = 4;

	/**
	 * The feature id for the '<em><b>Permalinks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__PERMALINKS = 5;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl <em>General Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getGeneralSettings()
	 * @generated
	 */
	int GENERAL_SETTINGS = 23;

	/**
	 * The feature id for the '<em><b>Website Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__WEBSITE_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Website Tagline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__WEBSITE_TAGLINE = 1;

	/**
	 * The feature id for the '<em><b>Website Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__WEBSITE_ADRESS = 2;

	/**
	 * The feature id for the '<em><b>Admin Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__ADMIN_MAIL = 3;

	/**
	 * The feature id for the '<em><b>User Default Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__USER_DEFAULT_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__TIME_ZONE = 5;

	/**
	 * The feature id for the '<em><b>Gs Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__GS_DATE_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Gs Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__GS_TIME_FORMAT = 7;

	/**
	 * The feature id for the '<em><b>Week Starts On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__WEEK_STARTS_ON = 8;

	/**
	 * The feature id for the '<em><b>Word Press Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__WORD_PRESS_ADRESS = 9;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS__IS_PUBLIC = 10;

	/**
	 * The number of structural features of the '<em>General Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SETTINGS_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl <em>Writing Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWritingSettings()
	 * @generated
	 */
	int WRITING_SETTINGS = 24;

	/**
	 * The feature id for the '<em><b>Mail Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__MAIL_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__PORT = 1;

	/**
	 * The feature id for the '<em><b>Login Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__LOGIN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Default Post Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__DEFAULT_POST_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Default Mail Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Is Converting Emoticons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__IS_CONVERTING_EMOTICONS = 6;

	/**
	 * The feature id for the '<em><b>Is Correcting Invalid XHTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML = 7;

	/**
	 * The number of structural features of the '<em>Writing Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITING_SETTINGS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl <em>Reading Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getReadingSettings()
	 * @generated
	 */
	int READING_SETTINGS = 25;

	/**
	 * The feature id for the '<em><b>Max Number Posts For Blog Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES = 0;

	/**
	 * The feature id for the '<em><b>Number Recent Item For Feeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS = 1;

	/**
	 * The feature id for the '<em><b>Static Front Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__STATIC_FRONT_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Static Post Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__STATIC_POST_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Is Displaying Last Post In Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT = 4;

	/**
	 * The feature id for the '<em><b>Is Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__IS_INDEXED = 5;

	/**
	 * The feature id for the '<em><b>Is Showing Full Text For Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED = 6;

	/**
	 * The number of structural features of the '<em>Reading Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SETTINGS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl <em>Discussion Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getDiscussionSettings()
	 * @generated
	 */
	int DISCUSSION_SETTINGS = 26;

	/**
	 * The feature id for the '<em><b>Number Article Days For Auto Close Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Nested Comments Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Number Comments Per Page For Breaked Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS = 2;

	/**
	 * The feature id for the '<em><b>Number Of Links In Comment For Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION = 3;

	/**
	 * The feature id for the '<em><b>Moderated Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__MODERATED_WORDS = 4;

	/**
	 * The feature id for the '<em><b>Forbidden Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__FORBIDDEN_WORDS = 5;

	/**
	 * The feature id for the '<em><b>Max Avatar Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__MAX_AVATAR_RATING = 6;

	/**
	 * The feature id for the '<em><b>User Default Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR = 7;

	/**
	 * The feature id for the '<em><b>Is Notifying Linked Blogs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS = 8;

	/**
	 * The feature id for the '<em><b>Is Allowing Link Notifications From Blogs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS = 9;

	/**
	 * The feature id for the '<em><b>Is Allowing Public Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS = 10;

	/**
	 * The feature id for the '<em><b>Is Asking Name And Mail Comment Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR = 11;

	/**
	 * The feature id for the '<em><b>Is Allowing Anonymous Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS = 12;

	/**
	 * The feature id for the '<em><b>Is Breaking Comments Into Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES = 13;

	/**
	 * The feature id for the '<em><b>Isdisplaying Last Page For Breaked Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS = 14;

	/**
	 * The feature id for the '<em><b>Is Displaying Older Comment For Each Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Is Mailing Admin For Each Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS = 16;

	/**
	 * The feature id for the '<em><b>Is Helding Comment For Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION = 17;

	/**
	 * The feature id for the '<em><b>Is Asking Admin Approvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT = 18;

	/**
	 * The feature id for the '<em><b>Is Asking Previous Admin Approvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT = 19;

	/**
	 * The feature id for the '<em><b>Is Showing Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS__IS_SHOWING_AVATAR = 20;

	/**
	 * The number of structural features of the '<em>Discussion Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_SETTINGS_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl <em>Media Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMediaSettings()
	 * @generated
	 */
	int MEDIA_SETTINGS = 27;

	/**
	 * The feature id for the '<em><b>Thumbnail Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__THUMBNAIL_WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Thumbnail Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__THUMBNAIL_HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Medium Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__MEDIUM_WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Medium Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__MEDIUM_HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Large Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__LARGE_WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Large Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__LARGE_HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Is Cropping Thumbnail To Exact Dims</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS = 6;

	/**
	 * The feature id for the '<em><b>Is Organize Uploads Into Folders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS = 7;

	/**
	 * The number of structural features of the '<em>Media Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SETTINGS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl <em>Permalinks Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPermalinksSettings()
	 * @generated
	 */
	int PERMALINKS_SETTINGS = 28;

	/**
	 * The feature id for the '<em><b>Perma Url Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMALINKS_SETTINGS__PERMA_URL_FORM = 0;

	/**
	 * The feature id for the '<em><b>Url Category Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMALINKS_SETTINGS__URL_CATEGORY_BASE = 1;

	/**
	 * The feature id for the '<em><b>Url Tag Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMALINKS_SETTINGS__URL_TAG_BASE = 2;

	/**
	 * The number of structural features of the '<em>Permalinks Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMALINKS_SETTINGS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 29;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Widget Archives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET_ARCHIVES = 1;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CALENDARS = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CATEGORIES = 3;

	/**
	 * The feature id for the '<em><b>Custom Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CUSTOM_MENUS = 4;

	/**
	 * The feature id for the '<em><b>Metas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__METAS = 5;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__PAGES = 6;

	/**
	 * The feature id for the '<em><b>Recent Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__RECENT_COMMENTS = 7;

	/**
	 * The feature id for the '<em><b>Recent Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__RECENT_POSTS = 8;

	/**
	 * The feature id for the '<em><b>Feeds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FEEDS = 9;

	/**
	 * The feature id for the '<em><b>Searchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SEARCHS = 10;

	/**
	 * The feature id for the '<em><b>Tag Clouds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TAG_CLOUDS = 11;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TEXTS = 12;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Menu Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MENU_NAME = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PAGES = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CATEGORIES = 3;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LINKS = 4;

	/**
	 * The feature id for the '<em><b>Current Menu Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CURRENT_MENU_SETTING = 5;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 31;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Is Displaying As Drop Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN = 1;

	/**
	 * The feature id for the '<em><b>Is Showing Posts Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__IS_SHOWING_POSTS_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CalendarImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 32;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl <em>Widget Categorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetCategorie()
	 * @generated
	 */
	int WIDGET_CATEGORIE = 33;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CATEGORIE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Displayed Posts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS = 1;

	/**
	 * The feature id for the '<em><b>Is Displaying Sub Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT = 2;

	/**
	 * The feature id for the '<em><b>Is Drop Down List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CATEGORIE__IS_DROP_DOWN_LIST = 3;

	/**
	 * The number of structural features of the '<em>Widget Categorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CATEGORIE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetMenuImpl <em>Widget Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetMenuImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetMenu()
	 * @generated
	 */
	int WIDGET_MENU = 34;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Selected Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__SELECTED_MENU = 1;

	/**
	 * The number of structural features of the '<em>Widget Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MetaImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMeta()
	 * @generated
	 */
	int META = 35;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl <em>Widget Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetPage()
	 * @generated
	 */
	int WIDGET_PAGE = 36;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Widget Pages Sorter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PAGE__WIDGET_PAGES_SORTER = 1;

	/**
	 * The feature id for the '<em><b>Id Page Excluded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PAGE__ID_PAGE_EXCLUDED = 2;

	/**
	 * The number of structural features of the '<em>Widget Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCommentImpl <em>Widget Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCommentImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetComment()
	 * @generated
	 */
	int WIDGET_COMMENT = 37;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Displayed Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS = 1;

	/**
	 * The number of structural features of the '<em>Widget Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl <em>Widget Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetPost()
	 * @generated
	 */
	int WIDGET_POST = 38;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_POST__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Displayed Posts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS = 1;

	/**
	 * The feature id for the '<em><b>Is Displaying Post Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_POST__IS_DISPLAYING_POST_DATE = 2;

	/**
	 * The number of structural features of the '<em>Widget Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_POST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.SearchImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TagCloudImpl <em>Tag Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TagCloudImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTagCloud()
	 * @generated
	 */
	int TAG_CLOUD = 40;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLOUD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLOUD__TAXONOMY = 1;

	/**
	 * The number of structural features of the '<em>Tag Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLOUD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TextImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 41;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Is Auto Paragraphs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__IS_AUTO_PARAGRAPHS = 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CurrentMenuSettingImpl <em>Current Menu Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CurrentMenuSettingImpl
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getCurrentMenuSetting()
	 * @generated
	 */
	int CURRENT_MENU_SETTING = 42;

	/**
	 * The feature id for the '<em><b>Is Adding New Top Level Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES = 0;

	/**
	 * The feature id for the '<em><b>Is Navigation Menu Located</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED = 1;

	/**
	 * The number of structural features of the '<em>Current Menu Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_MENU_SETTING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.postFormat <em>post Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.postFormat
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getpostFormat()
	 * @generated
	 */
	int POST_FORMAT = 43;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.avatarRating <em>avatar Rating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.avatarRating
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getavatarRating()
	 * @generated
	 */
	int AVATAR_RATING = 44;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.dateformat <em>dateformat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.dateformat
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getdateformat()
	 * @generated
	 */
	int DATEFORMAT = 45;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar <em>default Avatar</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getdefaultAvatar()
	 * @generated
	 */
	int DEFAULT_AVATAR = 46;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.functionalities <em>functionalities</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.functionalities
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getfunctionalities()
	 * @generated
	 */
	int FUNCTIONALITIES = 47;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.themes <em>themes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.themes
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getthemes()
	 * @generated
	 */
	int THEMES = 48;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter <em>pages Sorter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getpagesSorter()
	 * @generated
	 */
	int PAGES_SORTER = 49;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.pageStatus <em>page Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pageStatus
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getpageStatus()
	 * @generated
	 */
	int PAGE_STATUS = 50;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.role <em>role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.role
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getrole()
	 * @generated
	 */
	int ROLE = 51;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.timeFormat <em>time Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.timeFormat
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#gettimeFormat()
	 * @generated
	 */
	int TIME_FORMAT = 52;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType <em>taxonomy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#gettaxonomyType()
	 * @generated
	 */
	int TAXONOMY_TYPE = 53;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.urlForm <em>url Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.urlForm
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#geturlForm()
	 * @generated
	 */
	int URL_FORM = 54;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.weeks <em>weeks</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.weeks
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getweeks()
	 * @generated
	 */
	int WEEKS = 55;

	/**
	 * The meta object id for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.widgetType <em>widget Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.widgetType
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getwidgetType()
	 * @generated
	 */
	int WIDGET_TYPE = 56;


	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getAdminUser <em>Admin User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Admin User</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getAdminUser()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_AdminUser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getUsers()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getPosts()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Posts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getPages()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getAppearance()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Appearance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getMediaLibrary <em>Media Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Media Library</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getMediaLibrary()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_MediaLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalities</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getFunctionalities()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Functionalities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getComments()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getCategories()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getTags()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getSettings()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getDeletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletion</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website#getDeletion()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Deletion();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion
	 * @generated
	 */
	EClass getDeletion();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getPagesByTitle <em>Pages By Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pages By Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getPagesByTitle()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_PagesByTitle();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getUsersByLogin <em>Users By Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Users By Login</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getUsersByLogin()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_UsersByLogin();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getMediasByTitle <em>Medias By Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Medias By Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getMediasByTitle()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_MediasByTitle();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getFunctionalitiesByName <em>Functionalities By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Functionalities By Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getFunctionalitiesByName()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_FunctionalitiesByName();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getThemesByName <em>Themes By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Themes By Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getThemesByName()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_ThemesByName();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getCategoriesByName <em>Categories By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Categories By Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getCategoriesByName()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_CategoriesByName();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getTagsByName <em>Tags By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags By Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getTagsByName()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_TagsByName();

	/**
	 * Returns the meta object for the attribute list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getMenusByName <em>Menus By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Menus By Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getMenusByName()
	 * @see #getDeletion()
	 * @generated
	 */
	EAttribute getDeletion_MenusByName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getCommentsByPostDateAuthor <em>Comments By Post Date Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments By Post Date Author</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getCommentsByPostDateAuthor()
	 * @see #getDeletion()
	 * @generated
	 */
	EReference getDeletion_CommentsByPostDateAuthor();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor <em>Post Date Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Date Author</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor
	 * @generated
	 */
	EClass getPostDateAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getPostTitle <em>Post Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getPostTitle()
	 * @see #getPostDateAuthor()
	 * @generated
	 */
	EAttribute getPostDateAuthor_PostTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentAuthorName <em>Comment Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Author Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentAuthorName()
	 * @see #getPostDateAuthor()
	 * @generated
	 */
	EAttribute getPostDateAuthor_CommentAuthorName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentDate <em>Comment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Date</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentDate()
	 * @see #getPostDateAuthor()
	 * @generated
	 */
	EAttribute getPostDateAuthor_CommentDate();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getUserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Role</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getUserRole()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserRole();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getNickName <em>Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getNickName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_NickName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getPublicName <em>Public Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getPublicName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PublicName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getWebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Site</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getWebSite()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_WebSite();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getBiography <em>Biography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biography</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User#getBiography()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Biography();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl <em>Post Page Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Page Impl</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl
	 * @generated
	 */
	EClass getPostPage_Impl();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getTitle()
	 * @see #getPostPage_Impl()
	 * @generated
	 */
	EAttribute getPostPage_Impl_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getStatus()
	 * @see #getPostPage_Impl()
	 * @generated
	 */
	EAttribute getPostPage_Impl_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getContent()
	 * @see #getPostPage_Impl()
	 * @generated
	 */
	EAttribute getPostPage_Impl_Content();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getAuthor()
	 * @see #getPostPage_Impl()
	 * @generated
	 */
	EReference getPostPage_Impl_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getFeaturedImage <em>Featured Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Featured Image</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getFeaturedImage()
	 * @see #getPostPage_Impl()
	 * @generated
	 */
	EReference getPostPage_Impl_FeaturedImage();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage <em>Post Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage
	 * @generated
	 */
	EClass getPostPage();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getName()
	 * @see #getPostPage()
	 * @generated
	 */
	EAttribute getPostPage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getCommonAttributes <em>Common Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common Attributes</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getCommonAttributes()
	 * @see #getPostPage()
	 * @generated
	 */
	EReference getPostPage_CommonAttributes();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Post#getCategories()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Categories();

	/**
	 * Returns the meta object for the reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Post#getTags()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Tags();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Post#getFormat()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Format();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Page#getParent()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Page#getOrder()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDateGMT <em>Publication Date GMT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Date GMT</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDateGMT()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_PublicationDateGMT();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Date</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDate()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_PublicationDate();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Appearance
	 * @generated
	 */
	EClass getAppearance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getWidgets()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Widgets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceMenus <em>Appearance Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appearance Menus</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceMenus()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_AppearanceMenus();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceHeader <em>Appearance Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance Header</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceHeader()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_AppearanceHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theme</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getTheme()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Theme();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Theme
	 * @generated
	 */
	EClass getTheme();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Theme#getName()
	 * @see #getTheme()
	 * @generated
	 */
	EAttribute getTheme_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getThemeType <em>Theme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme Type</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Theme#getThemeType()
	 * @see #getTheme()
	 * @generated
	 */
	EAttribute getTheme_ThemeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getDefaultPlugin <em>Default Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Plugin</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Theme#getDefaultPlugin()
	 * @see #getTheme()
	 * @generated
	 */
	EReference getTheme_DefaultPlugin();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getName()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getFunctionalityType <em>Functionality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functionality Type</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getFunctionalityType()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_FunctionalityType();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getSocialNetworks <em>Social Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Networks</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getSocialNetworks()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_SocialNetworks();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getDefaultPlugin <em>Default Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Plugin</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getDefaultPlugin()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_DefaultPlugin();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Comment#getName()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Comment#getAuthorName()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_AuthorName();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getCommentPostPage <em>Comment Post Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comment Post Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Comment#getCommentPostPage()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CommentPostPage();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Url#getPathUrl <em>Path Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Url#getPathUrl()
	 * @see #getUrl()
	 * @generated
	 */
	EAttribute getUrl_PathUrl();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed <em>Widget Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Feed</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed
	 * @generated
	 */
	EClass getWidgetFeed();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#getTitle()
	 * @see #getWidgetFeed()
	 * @generated
	 */
	EAttribute getWidgetFeed_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#isIsDisplayingItemContent <em>Is Displaying Item Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Item Content</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#isIsDisplayingItemContent()
	 * @see #getWidgetFeed()
	 * @generated
	 */
	EAttribute getWidgetFeed_IsDisplayingItemContent();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#isIsDisplayingItemAuthor <em>Is Displaying Item Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Item Author</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#isIsDisplayingItemAuthor()
	 * @see #getWidgetFeed()
	 * @generated
	 */
	EAttribute getWidgetFeed_IsDisplayingItemAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#isIsDisplayingItemDate <em>Is Displaying Item Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Item Date</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#isIsDisplayingItemDate()
	 * @see #getWidgetFeed()
	 * @generated
	 */
	EAttribute getWidgetFeed_IsDisplayingItemDate();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#getNumberOfItems <em>Number Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Items</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#getNumberOfItems()
	 * @see #getWidgetFeed()
	 * @generated
	 */
	EAttribute getWidgetFeed_NumberOfItems();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed#getUrl()
	 * @see #getWidgetFeed()
	 * @generated
	 */
	EReference getWidgetFeed_Url();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Plugin#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Plugin#getPluginName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_PluginName();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Plugin#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Plugin#getUrl()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Url();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Media#getName()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Media#getUrl()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Media#getDate()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Date();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getUploadedTo <em>Uploaded To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uploaded To</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Media#getUploadedTo()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_UploadedTo();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image#getTitle()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image#getCaption()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Caption();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getAltText <em>Alt Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Text</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image#getAltText()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_AltText();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image#getDescription()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Url();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Link#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Link#getUrl()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#isRandomImage <em>Random Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Image</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Header#isRandomImage()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_RandomImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#getUploadImage <em>Upload Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upload Image</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Header#getUploadImage()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_UploadImage();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Header#getTextColor()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#isIsShowingHeaderText <em>Is Showing Header Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Showing Header Text</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Header#isIsShowingHeaderText()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_IsShowingHeaderText();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getName()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getDescription()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getSlug()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Slug();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Category#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Category#getCategoryName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryName();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Tag#getTagName <em>Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Tag#getTagName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_TagName();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings#getGeneral()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_General();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getWriting <em>Writing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Writing</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings#getWriting()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Writing();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings#getReading()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Reading();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getDiscussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discussion</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings#getDiscussion()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Discussion();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Media</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings#getMedia()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Media();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getPermalinks <em>Permalinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permalinks</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings#getPermalinks()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Permalinks();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings <em>General Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings
	 * @generated
	 */
	EClass getGeneralSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWebsiteTitle <em>Website Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWebsiteTitle()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_WebsiteTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWebsiteTagline <em>Website Tagline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website Tagline</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWebsiteTagline()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_WebsiteTagline();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWebsiteAdress <em>Website Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website Adress</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWebsiteAdress()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_WebsiteAdress();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getAdminMail <em>Admin Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Mail</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getAdminMail()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_AdminMail();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getUserDefaultRole <em>User Default Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Default Role</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getUserDefaultRole()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_UserDefaultRole();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getTimeZone()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_TimeZone();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getGsDateFormat <em>Gs Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gs Date Format</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getGsDateFormat()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_GsDateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getGsTimeFormat <em>Gs Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gs Time Format</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getGsTimeFormat()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_GsTimeFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWeekStartsOn <em>Week Starts On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Starts On</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWeekStartsOn()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_WeekStartsOn();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWordPressAdress <em>Word Press Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Word Press Adress</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#getWordPressAdress()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EReference getGeneralSettings_WordPressAdress();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings#isIsPublic()
	 * @see #getGeneralSettings()
	 * @generated
	 */
	EAttribute getGeneralSettings_IsPublic();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings <em>Writing Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writing Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings
	 * @generated
	 */
	EClass getWritingSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getMailServer <em>Mail Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail Server</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getMailServer()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EAttribute getWritingSettings_MailServer();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPort()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EAttribute getWritingSettings_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getLoginName <em>Login Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getLoginName()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EAttribute getWritingSettings_LoginName();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPassword()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EAttribute getWritingSettings_Password();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultPostCategory <em>Default Post Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Post Category</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultPostCategory()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EReference getWritingSettings_DefaultPostCategory();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultMailCategory <em>Default Mail Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Mail Category</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultMailCategory()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EReference getWritingSettings_DefaultMailCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsConvertingEmoticons <em>Is Converting Emoticons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Converting Emoticons</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsConvertingEmoticons()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EAttribute getWritingSettings_IsConvertingEmoticons();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsCorrectingInvalidXHTML <em>Is Correcting Invalid XHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Correcting Invalid XHTML</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsCorrectingInvalidXHTML()
	 * @see #getWritingSettings()
	 * @generated
	 */
	EAttribute getWritingSettings_IsCorrectingInvalidXHTML();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings <em>Reading Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings
	 * @generated
	 */
	EClass getReadingSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getMaxNumberPostsForBlogPages <em>Max Number Posts For Blog Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Posts For Blog Pages</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getMaxNumberPostsForBlogPages()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EAttribute getReadingSettings_MaxNumberPostsForBlogPages();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getNumberRecentItemForFeeds <em>Number Recent Item For Feeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Recent Item For Feeds</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getNumberRecentItemForFeeds()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EAttribute getReadingSettings_NumberRecentItemForFeeds();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticFrontPage <em>Static Front Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Front Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticFrontPage()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EReference getReadingSettings_StaticFrontPage();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticPostPage <em>Static Post Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Post Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticPostPage()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EReference getReadingSettings_StaticPostPage();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsDisplayingLastPostInFront <em>Is Displaying Last Post In Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Last Post In Front</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsDisplayingLastPostInFront()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EAttribute getReadingSettings_IsDisplayingLastPostInFront();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsIndexed <em>Is Indexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Indexed</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsIndexed()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EAttribute getReadingSettings_IsIndexed();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsShowingFullTextForFeed <em>Is Showing Full Text For Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Showing Full Text For Feed</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsShowingFullTextForFeed()
	 * @see #getReadingSettings()
	 * @generated
	 */
	EAttribute getReadingSettings_IsShowingFullTextForFeed();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings <em>Discussion Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings
	 * @generated
	 */
	EClass getDiscussionSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberArticleDaysForAutoCloseComments <em>Number Article Days For Auto Close Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Article Days For Auto Close Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberArticleDaysForAutoCloseComments()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_NumberArticleDaysForAutoCloseComments();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNestedCommentsLevel <em>Nested Comments Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nested Comments Level</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNestedCommentsLevel()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_NestedCommentsLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberCommentsPerPageForBreakedComments <em>Number Comments Per Page For Breaked Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Comments Per Page For Breaked Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberCommentsPerPageForBreakedComments()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_NumberCommentsPerPageForBreakedComments();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberOfLinksInCommentForModeration <em>Number Of Links In Comment For Moderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Links In Comment For Moderation</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberOfLinksInCommentForModeration()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_NumberOfLinksInCommentForModeration();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getModeratedWords <em>Moderated Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moderated Words</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getModeratedWords()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_ModeratedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getForbiddenWords <em>Forbidden Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forbidden Words</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getForbiddenWords()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_ForbiddenWords();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getMaxAvatarRating <em>Max Avatar Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Avatar Rating</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getMaxAvatarRating()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_MaxAvatarRating();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getUserDefaultAvatar <em>User Default Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Default Avatar</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getUserDefaultAvatar()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_UserDefaultAvatar();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsNotifyingLinkedBlogs <em>Is Notifying Linked Blogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Notifying Linked Blogs</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsNotifyingLinkedBlogs()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsNotifyingLinkedBlogs();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingLinkNotificationsFromBlogs <em>Is Allowing Link Notifications From Blogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Allowing Link Notifications From Blogs</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingLinkNotificationsFromBlogs()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsAllowingLinkNotificationsFromBlogs();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingPublicComments <em>Is Allowing Public Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Allowing Public Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingPublicComments()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsAllowingPublicComments();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingNameAndMailCommentAuthor <em>Is Asking Name And Mail Comment Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asking Name And Mail Comment Author</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingNameAndMailCommentAuthor()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsAskingNameAndMailCommentAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingAnonymousComments <em>Is Allowing Anonymous Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Allowing Anonymous Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingAnonymousComments()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsAllowingAnonymousComments();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsBreakingCommentsIntoPages <em>Is Breaking Comments Into Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Breaking Comments Into Pages</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsBreakingCommentsIntoPages()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsBreakingCommentsIntoPages();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsdisplayingLastPageForBreakedComments <em>Isdisplaying Last Page For Breaked Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isdisplaying Last Page For Breaked Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsdisplayingLastPageForBreakedComments()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsdisplayingLastPageForBreakedComments();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsDisplayingOlderCommentForEachPage <em>Is Displaying Older Comment For Each Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Older Comment For Each Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsDisplayingOlderCommentForEachPage()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsDisplayingOlderCommentForEachPage();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsMailingAdminForEachComments <em>Is Mailing Admin For Each Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mailing Admin For Each Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsMailingAdminForEachComments()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsMailingAdminForEachComments();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsHeldingCommentForModeration <em>Is Helding Comment For Moderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Helding Comment For Moderation</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsHeldingCommentForModeration()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsHeldingCommentForModeration();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingAdminApprovement <em>Is Asking Admin Approvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asking Admin Approvement</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingAdminApprovement()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsAskingAdminApprovement();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingPreviousAdminApprovement <em>Is Asking Previous Admin Approvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asking Previous Admin Approvement</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingPreviousAdminApprovement()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsAskingPreviousAdminApprovement();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsShowingAvatar <em>Is Showing Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Showing Avatar</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsShowingAvatar()
	 * @see #getDiscussionSettings()
	 * @generated
	 */
	EAttribute getDiscussionSettings_IsShowingAvatar();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings <em>Media Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings
	 * @generated
	 */
	EClass getMediaSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getThumbnailWidth <em>Thumbnail Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail Width</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getThumbnailWidth()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_ThumbnailWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getThumbnailHeight <em>Thumbnail Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail Height</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getThumbnailHeight()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_ThumbnailHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getMediumWidth <em>Medium Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Width</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getMediumWidth()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_MediumWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getMediumHeight <em>Medium Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Height</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getMediumHeight()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_MediumHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getLargeWidth <em>Large Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Width</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getLargeWidth()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_LargeWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getLargeHeight <em>Large Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Height</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#getLargeHeight()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_LargeHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#isIsCroppingThumbnailToExactDims <em>Is Cropping Thumbnail To Exact Dims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cropping Thumbnail To Exact Dims</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#isIsCroppingThumbnailToExactDims()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_IsCroppingThumbnailToExactDims();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#isIsOrganizeUploadsIntoFolders <em>Is Organize Uploads Into Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Organize Uploads Into Folders</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings#isIsOrganizeUploadsIntoFolders()
	 * @see #getMediaSettings()
	 * @generated
	 */
	EAttribute getMediaSettings_IsOrganizeUploadsIntoFolders();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings <em>Permalinks Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permalinks Settings</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings
	 * @generated
	 */
	EClass getPermalinksSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getPermaUrlForm <em>Perma Url Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perma Url Form</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getPermaUrlForm()
	 * @see #getPermalinksSettings()
	 * @generated
	 */
	EAttribute getPermalinksSettings_PermaUrlForm();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlCategoryBase <em>Url Category Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Category Base</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlCategoryBase()
	 * @see #getPermalinksSettings()
	 * @generated
	 */
	EAttribute getPermalinksSettings_UrlCategoryBase();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlTagBase <em>Url Tag Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Tag Base</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlTagBase()
	 * @see #getPermalinksSettings()
	 * @generated
	 */
	EAttribute getPermalinksSettings_UrlTagBase();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getType()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getWidgetArchives <em>Widget Archives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widget Archives</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getWidgetArchives()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_WidgetArchives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendars</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCalendars()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Calendars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCategories()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCustomMenus <em>Custom Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Menus</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCustomMenus()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_CustomMenus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getMetas <em>Metas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metas</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getMetas()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Metas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getPages()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getRecentComments <em>Recent Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recent Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getRecentComments()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_RecentComments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getRecentPosts <em>Recent Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recent Posts</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getRecentPosts()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_RecentPosts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getFeeds <em>Feeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feeds</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getFeeds()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Feeds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getSearchs <em>Searchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searchs</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getSearchs()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Searchs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getTagClouds <em>Tag Clouds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag Clouds</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getTagClouds()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_TagClouds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget#getTexts()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Texts();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu#getName()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getMenuName <em>Menu Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu#getMenuName()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_MenuName();

	/**
	 * Returns the meta object for the reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pages</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu#getPages()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Pages();

	/**
	 * Returns the meta object for the reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCategories()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu#getLinks()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCurrentMenuSetting <em>Current Menu Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Menu Setting</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCurrentMenuSetting()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_CurrentMenuSetting();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Archive#getTitle()
	 * @see #getArchive()
	 * @generated
	 */
	EAttribute getArchive_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsDisplayingAsDropDown <em>Is Displaying As Drop Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying As Drop Down</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsDisplayingAsDropDown()
	 * @see #getArchive()
	 * @generated
	 */
	EAttribute getArchive_IsDisplayingAsDropDown();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsShowingPostsCount <em>Is Showing Posts Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Showing Posts Count</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsShowingPostsCount()
	 * @see #getArchive()
	 * @generated
	 */
	EAttribute getArchive_IsShowingPostsCount();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Calendar#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Calendar#getTitle()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Title();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie <em>Widget Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Categorie</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie
	 * @generated
	 */
	EClass getWidgetCategorie();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#getTitle()
	 * @see #getWidgetCategorie()
	 * @generated
	 */
	EAttribute getWidgetCategorie_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#getNumberOfDisplayedPosts <em>Number Of Displayed Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Displayed Posts</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#getNumberOfDisplayedPosts()
	 * @see #getWidgetCategorie()
	 * @generated
	 */
	EAttribute getWidgetCategorie_NumberOfDisplayedPosts();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#isIsDisplayingSubCat <em>Is Displaying Sub Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Sub Cat</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#isIsDisplayingSubCat()
	 * @see #getWidgetCategorie()
	 * @generated
	 */
	EAttribute getWidgetCategorie_IsDisplayingSubCat();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#isIsDropDownList <em>Is Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Drop Down List</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie#isIsDropDownList()
	 * @see #getWidgetCategorie()
	 * @generated
	 */
	EAttribute getWidgetCategorie_IsDropDownList();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu <em>Widget Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Menu</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu
	 * @generated
	 */
	EClass getWidgetMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu#getTitle()
	 * @see #getWidgetMenu()
	 * @generated
	 */
	EAttribute getWidgetMenu_Title();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu#getSelectedMenu <em>Selected Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Menu</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu#getSelectedMenu()
	 * @see #getWidgetMenu()
	 * @generated
	 */
	EReference getWidgetMenu_SelectedMenu();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Meta#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Meta#getTitle()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Title();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage <em>Widget Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Page</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage
	 * @generated
	 */
	EClass getWidgetPage();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getTitle()
	 * @see #getWidgetPage()
	 * @generated
	 */
	EAttribute getWidgetPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getWidgetPagesSorter <em>Widget Pages Sorter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Pages Sorter</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getWidgetPagesSorter()
	 * @see #getWidgetPage()
	 * @generated
	 */
	EAttribute getWidgetPage_WidgetPagesSorter();

	/**
	 * Returns the meta object for the reference '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getIdPageExcluded <em>Id Page Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Page Excluded</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getIdPageExcluded()
	 * @see #getWidgetPage()
	 * @generated
	 */
	EReference getWidgetPage_IdPageExcluded();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment <em>Widget Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Comment</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment
	 * @generated
	 */
	EClass getWidgetComment();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getTitle()
	 * @see #getWidgetComment()
	 * @generated
	 */
	EAttribute getWidgetComment_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getNumberOfDisplayedComments <em>Number Of Displayed Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Displayed Comments</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getNumberOfDisplayedComments()
	 * @see #getWidgetComment()
	 * @generated
	 */
	EAttribute getWidgetComment_NumberOfDisplayedComments();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost <em>Widget Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Post</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost
	 * @generated
	 */
	EClass getWidgetPost();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getTitle()
	 * @see #getWidgetPost()
	 * @generated
	 */
	EAttribute getWidgetPost_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getNumberOfDisplayedPosts <em>Number Of Displayed Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Displayed Posts</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getNumberOfDisplayedPosts()
	 * @see #getWidgetPost()
	 * @generated
	 */
	EAttribute getWidgetPost_NumberOfDisplayedPosts();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#isIsDisplayingPostDate <em>Is Displaying Post Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displaying Post Date</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#isIsDisplayingPostDate()
	 * @see #getWidgetPost()
	 * @generated
	 */
	EAttribute getWidgetPost_IsDisplayingPostDate();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Search#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Search#getName()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Search#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Search#getTitle()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_Title();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud <em>Tag Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Cloud</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.TagCloud
	 * @generated
	 */
	EClass getTagCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTitle()
	 * @see #getTagCloud()
	 * @generated
	 */
	EAttribute getTagCloud_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxonomy</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTaxonomy()
	 * @see #getTagCloud()
	 * @generated
	 */
	EAttribute getTagCloud_Taxonomy();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Text#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Text#getTitle()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.Text#isIsAutoParagraphs <em>Is Auto Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Paragraphs</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Text#isIsAutoParagraphs()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_IsAutoParagraphs();

	/**
	 * Returns the meta object for class '{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting <em>Current Menu Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Menu Setting</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting
	 * @generated
	 */
	EClass getCurrentMenuSetting();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsAddingNewTopLevelPages <em>Is Adding New Top Level Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Adding New Top Level Pages</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsAddingNewTopLevelPages()
	 * @see #getCurrentMenuSetting()
	 * @generated
	 */
	EAttribute getCurrentMenuSetting_IsAddingNewTopLevelPages();

	/**
	 * Returns the meta object for the attribute '{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsNavigationMenuLocated <em>Is Navigation Menu Located</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigation Menu Located</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsNavigationMenuLocated()
	 * @see #getCurrentMenuSetting()
	 * @generated
	 */
	EAttribute getCurrentMenuSetting_IsNavigationMenuLocated();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.postFormat <em>post Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>post Format</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.postFormat
	 * @generated
	 */
	EEnum getpostFormat();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.avatarRating <em>avatar Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>avatar Rating</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.avatarRating
	 * @generated
	 */
	EEnum getavatarRating();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.dateformat <em>dateformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>dateformat</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.dateformat
	 * @generated
	 */
	EEnum getdateformat();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar <em>default Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>default Avatar</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar
	 * @generated
	 */
	EEnum getdefaultAvatar();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.functionalities <em>functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>functionalities</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.functionalities
	 * @generated
	 */
	EEnum getfunctionalities();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.themes <em>themes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>themes</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.themes
	 * @generated
	 */
	EEnum getthemes();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter <em>pages Sorter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>pages Sorter</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter
	 * @generated
	 */
	EEnum getpagesSorter();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.pageStatus <em>page Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>page Status</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pageStatus
	 * @generated
	 */
	EEnum getpageStatus();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.role <em>role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>role</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.role
	 * @generated
	 */
	EEnum getrole();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.timeFormat <em>time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>time Format</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.timeFormat
	 * @generated
	 */
	EEnum gettimeFormat();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType <em>taxonomy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>taxonomy Type</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType
	 * @generated
	 */
	EEnum gettaxonomyType();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.urlForm <em>url Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>url Form</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.urlForm
	 * @generated
	 */
	EEnum geturlForm();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.weeks <em>weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>weeks</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.weeks
	 * @generated
	 */
	EEnum getweeks();

	/**
	 * Returns the meta object for enum '{@link org.inria.wordpress.wdpdsl.wdpDsl.widgetType <em>widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>widget Type</em>'.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.widgetType
	 * @generated
	 */
	EEnum getwidgetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WdpDslFactory getWdpDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Admin User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__ADMIN_USER = eINSTANCE.getWebsite_AdminUser();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__USERS = eINSTANCE.getWebsite_Users();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__POSTS = eINSTANCE.getWebsite_Posts();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__PAGES = eINSTANCE.getWebsite_Pages();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__APPEARANCE = eINSTANCE.getWebsite_Appearance();

		/**
		 * The meta object literal for the '<em><b>Media Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__MEDIA_LIBRARY = eINSTANCE.getWebsite_MediaLibrary();

		/**
		 * The meta object literal for the '<em><b>Functionalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__FUNCTIONALITIES = eINSTANCE.getWebsite_Functionalities();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__COMMENTS = eINSTANCE.getWebsite_Comments();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__CATEGORIES = eINSTANCE.getWebsite_Categories();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__TAGS = eINSTANCE.getWebsite_Tags();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__SETTINGS = eINSTANCE.getWebsite_Settings();

		/**
		 * The meta object literal for the '<em><b>Deletion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__DELETION = eINSTANCE.getWebsite_Deletion();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl <em>Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getDeletion()
		 * @generated
		 */
		EClass DELETION = eINSTANCE.getDeletion();

		/**
		 * The meta object literal for the '<em><b>Pages By Title</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__PAGES_BY_TITLE = eINSTANCE.getDeletion_PagesByTitle();

		/**
		 * The meta object literal for the '<em><b>Users By Login</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__USERS_BY_LOGIN = eINSTANCE.getDeletion_UsersByLogin();

		/**
		 * The meta object literal for the '<em><b>Medias By Title</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__MEDIAS_BY_TITLE = eINSTANCE.getDeletion_MediasByTitle();

		/**
		 * The meta object literal for the '<em><b>Functionalities By Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__FUNCTIONALITIES_BY_NAME = eINSTANCE.getDeletion_FunctionalitiesByName();

		/**
		 * The meta object literal for the '<em><b>Themes By Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__THEMES_BY_NAME = eINSTANCE.getDeletion_ThemesByName();

		/**
		 * The meta object literal for the '<em><b>Categories By Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__CATEGORIES_BY_NAME = eINSTANCE.getDeletion_CategoriesByName();

		/**
		 * The meta object literal for the '<em><b>Tags By Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__TAGS_BY_NAME = eINSTANCE.getDeletion_TagsByName();

		/**
		 * The meta object literal for the '<em><b>Menus By Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETION__MENUS_BY_NAME = eINSTANCE.getDeletion_MenusByName();

		/**
		 * The meta object literal for the '<em><b>Comments By Post Date Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETION__COMMENTS_BY_POST_DATE_AUTHOR = eINSTANCE.getDeletion_CommentsByPostDateAuthor();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl <em>Post Date Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPostDateAuthor()
		 * @generated
		 */
		EClass POST_DATE_AUTHOR = eINSTANCE.getPostDateAuthor();

		/**
		 * The meta object literal for the '<em><b>Post Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_DATE_AUTHOR__POST_TITLE = eINSTANCE.getPostDateAuthor_PostTitle();

		/**
		 * The meta object literal for the '<em><b>Comment Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME = eINSTANCE.getPostDateAuthor_CommentAuthorName();

		/**
		 * The meta object literal for the '<em><b>Comment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_DATE_AUTHOR__COMMENT_DATE = eINSTANCE.getPostDateAuthor_CommentDate();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>User Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ROLE = eINSTANCE.getUser_UserRole();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Nick Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NICK_NAME = eINSTANCE.getUser_NickName();

		/**
		 * The meta object literal for the '<em><b>Public Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PUBLIC_NAME = eINSTANCE.getUser_PublicName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Web Site</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__WEB_SITE = eINSTANCE.getUser_WebSite();

		/**
		 * The meta object literal for the '<em><b>Biography</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIOGRAPHY = eINSTANCE.getUser_Biography();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl <em>Post Page Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPostPage_Impl()
		 * @generated
		 */
		EClass POST_PAGE_IMPL = eINSTANCE.getPostPage_Impl();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_PAGE_IMPL__TITLE = eINSTANCE.getPostPage_Impl_Title();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_PAGE_IMPL__STATUS = eINSTANCE.getPostPage_Impl_Status();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_PAGE_IMPL__CONTENT = eINSTANCE.getPostPage_Impl_Content();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_PAGE_IMPL__AUTHOR = eINSTANCE.getPostPage_Impl_Author();

		/**
		 * The meta object literal for the '<em><b>Featured Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_PAGE_IMPL__FEATURED_IMAGE = eINSTANCE.getPostPage_Impl_FeaturedImage();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPageImpl <em>Post Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPageImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPostPage()
		 * @generated
		 */
		EClass POST_PAGE = eINSTANCE.getPostPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_PAGE__NAME = eINSTANCE.getPostPage_Name();

		/**
		 * The meta object literal for the '<em><b>Common Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_PAGE__COMMON_ATTRIBUTES = eINSTANCE.getPostPage_CommonAttributes();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PostImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__CATEGORIES = eINSTANCE.getPost_Categories();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__TAGS = eINSTANCE.getPost_Tags();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__FORMAT = eINSTANCE.getPost_Format();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PARENT = eINSTANCE.getPage_Parent();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__ORDER = eINSTANCE.getPage_Order();

		/**
		 * The meta object literal for the '<em><b>Publication Date GMT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PUBLICATION_DATE_GMT = eINSTANCE.getPage_PublicationDateGMT();

		/**
		 * The meta object literal for the '<em><b>Publication Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PUBLICATION_DATE = eINSTANCE.getPage_PublicationDate();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl <em>Appearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getAppearance()
		 * @generated
		 */
		EClass APPEARANCE = eINSTANCE.getAppearance();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__WIDGETS = eINSTANCE.getAppearance_Widgets();

		/**
		 * The meta object literal for the '<em><b>Appearance Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__APPEARANCE_MENUS = eINSTANCE.getAppearance_AppearanceMenus();

		/**
		 * The meta object literal for the '<em><b>Appearance Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__APPEARANCE_HEADER = eINSTANCE.getAppearance_AppearanceHeader();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__THEME = eINSTANCE.getAppearance_Theme();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl <em>Theme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTheme()
		 * @generated
		 */
		EClass THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME__NAME = eINSTANCE.getTheme_Name();

		/**
		 * The meta object literal for the '<em><b>Theme Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME__THEME_TYPE = eINSTANCE.getTheme_ThemeType();

		/**
		 * The meta object literal for the '<em><b>Default Plugin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEME__DEFAULT_PLUGIN = eINSTANCE.getTheme_DefaultPlugin();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__NAME = eINSTANCE.getFunctionality_Name();

		/**
		 * The meta object literal for the '<em><b>Functionality Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__FUNCTIONALITY_TYPE = eINSTANCE.getFunctionality_FunctionalityType();

		/**
		 * The meta object literal for the '<em><b>Social Networks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__SOCIAL_NETWORKS = eINSTANCE.getFunctionality_SocialNetworks();

		/**
		 * The meta object literal for the '<em><b>Default Plugin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__DEFAULT_PLUGIN = eINSTANCE.getFunctionality_DefaultPlugin();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__NAME = eINSTANCE.getComment_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__AUTHOR_NAME = eINSTANCE.getComment_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Comment Post Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__COMMENT_POST_PAGE = eINSTANCE.getComment_CommentPostPage();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.UrlImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em><b>Path Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__PATH_URL = eINSTANCE.getUrl_PathUrl();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl <em>Widget Feed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetFeed()
		 * @generated
		 */
		EClass WIDGET_FEED = eINSTANCE.getWidgetFeed();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FEED__TITLE = eINSTANCE.getWidgetFeed_Title();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Item Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT = eINSTANCE.getWidgetFeed_IsDisplayingItemContent();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Item Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR = eINSTANCE.getWidgetFeed_IsDisplayingItemAuthor();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Item Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FEED__IS_DISPLAYING_ITEM_DATE = eINSTANCE.getWidgetFeed_IsDisplayingItemDate();

		/**
		 * The meta object literal for the '<em><b>Number Of Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FEED__NUMBER_OF_ITEMS = eINSTANCE.getWidgetFeed_NumberOfItems();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_FEED__URL = eINSTANCE.getWidgetFeed_Url();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PluginImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Plugin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__PLUGIN_NAME = eINSTANCE.getPlugin_PluginName();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__URL = eINSTANCE.getPlugin_Url();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__NAME = eINSTANCE.getMedia_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__URL = eINSTANCE.getMedia_Url();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__DATE = eINSTANCE.getMedia_Date();

		/**
		 * The meta object literal for the '<em><b>Uploaded To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__UPLOADED_TO = eINSTANCE.getMedia_UploadedTo();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TITLE = eINSTANCE.getImage_Title();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CAPTION = eINSTANCE.getImage_Caption();

		/**
		 * The meta object literal for the '<em><b>Alt Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT_TEXT = eINSTANCE.getImage_AltText();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__DESCRIPTION = eINSTANCE.getImage_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.LinkImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__URL = eINSTANCE.getLink_Url();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Random Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__RANDOM_IMAGE = eINSTANCE.getHeader_RandomImage();

		/**
		 * The meta object literal for the '<em><b>Upload Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__UPLOAD_IMAGE = eINSTANCE.getHeader_UploadImage();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TEXT_COLOR = eINSTANCE.getHeader_TextColor();

		/**
		 * The meta object literal for the '<em><b>Is Showing Header Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__IS_SHOWING_HEADER_TEXT = eINSTANCE.getHeader_IsShowingHeaderText();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TaxonomyImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__NAME = eINSTANCE.getTaxonomy_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__DESCRIPTION = eINSTANCE.getTaxonomy_Description();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__SLUG = eINSTANCE.getTaxonomy_Slug();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CategoryImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY_NAME = eINSTANCE.getCategory_CategoryName();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TagImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__TAG_NAME = eINSTANCE.getTag_TagName();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getSettings()
		 * @generated
		 */
		EClass SETTINGS = eINSTANCE.getSettings();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__GENERAL = eINSTANCE.getSettings_General();

		/**
		 * The meta object literal for the '<em><b>Writing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__WRITING = eINSTANCE.getSettings_Writing();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__READING = eINSTANCE.getSettings_Reading();

		/**
		 * The meta object literal for the '<em><b>Discussion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__DISCUSSION = eINSTANCE.getSettings_Discussion();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__MEDIA = eINSTANCE.getSettings_Media();

		/**
		 * The meta object literal for the '<em><b>Permalinks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__PERMALINKS = eINSTANCE.getSettings_Permalinks();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl <em>General Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getGeneralSettings()
		 * @generated
		 */
		EClass GENERAL_SETTINGS = eINSTANCE.getGeneralSettings();

		/**
		 * The meta object literal for the '<em><b>Website Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__WEBSITE_TITLE = eINSTANCE.getGeneralSettings_WebsiteTitle();

		/**
		 * The meta object literal for the '<em><b>Website Tagline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__WEBSITE_TAGLINE = eINSTANCE.getGeneralSettings_WebsiteTagline();

		/**
		 * The meta object literal for the '<em><b>Website Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__WEBSITE_ADRESS = eINSTANCE.getGeneralSettings_WebsiteAdress();

		/**
		 * The meta object literal for the '<em><b>Admin Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__ADMIN_MAIL = eINSTANCE.getGeneralSettings_AdminMail();

		/**
		 * The meta object literal for the '<em><b>User Default Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__USER_DEFAULT_ROLE = eINSTANCE.getGeneralSettings_UserDefaultRole();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__TIME_ZONE = eINSTANCE.getGeneralSettings_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Gs Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__GS_DATE_FORMAT = eINSTANCE.getGeneralSettings_GsDateFormat();

		/**
		 * The meta object literal for the '<em><b>Gs Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__GS_TIME_FORMAT = eINSTANCE.getGeneralSettings_GsTimeFormat();

		/**
		 * The meta object literal for the '<em><b>Week Starts On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__WEEK_STARTS_ON = eINSTANCE.getGeneralSettings_WeekStartsOn();

		/**
		 * The meta object literal for the '<em><b>Word Press Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_SETTINGS__WORD_PRESS_ADRESS = eINSTANCE.getGeneralSettings_WordPressAdress();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SETTINGS__IS_PUBLIC = eINSTANCE.getGeneralSettings_IsPublic();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl <em>Writing Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWritingSettings()
		 * @generated
		 */
		EClass WRITING_SETTINGS = eINSTANCE.getWritingSettings();

		/**
		 * The meta object literal for the '<em><b>Mail Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITING_SETTINGS__MAIL_SERVER = eINSTANCE.getWritingSettings_MailServer();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITING_SETTINGS__PORT = eINSTANCE.getWritingSettings_Port();

		/**
		 * The meta object literal for the '<em><b>Login Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITING_SETTINGS__LOGIN_NAME = eINSTANCE.getWritingSettings_LoginName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITING_SETTINGS__PASSWORD = eINSTANCE.getWritingSettings_Password();

		/**
		 * The meta object literal for the '<em><b>Default Post Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITING_SETTINGS__DEFAULT_POST_CATEGORY = eINSTANCE.getWritingSettings_DefaultPostCategory();

		/**
		 * The meta object literal for the '<em><b>Default Mail Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY = eINSTANCE.getWritingSettings_DefaultMailCategory();

		/**
		 * The meta object literal for the '<em><b>Is Converting Emoticons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITING_SETTINGS__IS_CONVERTING_EMOTICONS = eINSTANCE.getWritingSettings_IsConvertingEmoticons();

		/**
		 * The meta object literal for the '<em><b>Is Correcting Invalid XHTML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML = eINSTANCE.getWritingSettings_IsCorrectingInvalidXHTML();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl <em>Reading Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getReadingSettings()
		 * @generated
		 */
		EClass READING_SETTINGS = eINSTANCE.getReadingSettings();

		/**
		 * The meta object literal for the '<em><b>Max Number Posts For Blog Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES = eINSTANCE.getReadingSettings_MaxNumberPostsForBlogPages();

		/**
		 * The meta object literal for the '<em><b>Number Recent Item For Feeds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS = eINSTANCE.getReadingSettings_NumberRecentItemForFeeds();

		/**
		 * The meta object literal for the '<em><b>Static Front Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_SETTINGS__STATIC_FRONT_PAGE = eINSTANCE.getReadingSettings_StaticFrontPage();

		/**
		 * The meta object literal for the '<em><b>Static Post Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_SETTINGS__STATIC_POST_PAGE = eINSTANCE.getReadingSettings_StaticPostPage();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Last Post In Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT = eINSTANCE.getReadingSettings_IsDisplayingLastPostInFront();

		/**
		 * The meta object literal for the '<em><b>Is Indexed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_SETTINGS__IS_INDEXED = eINSTANCE.getReadingSettings_IsIndexed();

		/**
		 * The meta object literal for the '<em><b>Is Showing Full Text For Feed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED = eINSTANCE.getReadingSettings_IsShowingFullTextForFeed();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl <em>Discussion Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getDiscussionSettings()
		 * @generated
		 */
		EClass DISCUSSION_SETTINGS = eINSTANCE.getDiscussionSettings();

		/**
		 * The meta object literal for the '<em><b>Number Article Days For Auto Close Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS = eINSTANCE.getDiscussionSettings_NumberArticleDaysForAutoCloseComments();

		/**
		 * The meta object literal for the '<em><b>Nested Comments Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL = eINSTANCE.getDiscussionSettings_NestedCommentsLevel();

		/**
		 * The meta object literal for the '<em><b>Number Comments Per Page For Breaked Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS = eINSTANCE.getDiscussionSettings_NumberCommentsPerPageForBreakedComments();

		/**
		 * The meta object literal for the '<em><b>Number Of Links In Comment For Moderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION = eINSTANCE.getDiscussionSettings_NumberOfLinksInCommentForModeration();

		/**
		 * The meta object literal for the '<em><b>Moderated Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__MODERATED_WORDS = eINSTANCE.getDiscussionSettings_ModeratedWords();

		/**
		 * The meta object literal for the '<em><b>Forbidden Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__FORBIDDEN_WORDS = eINSTANCE.getDiscussionSettings_ForbiddenWords();

		/**
		 * The meta object literal for the '<em><b>Max Avatar Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__MAX_AVATAR_RATING = eINSTANCE.getDiscussionSettings_MaxAvatarRating();

		/**
		 * The meta object literal for the '<em><b>User Default Avatar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR = eINSTANCE.getDiscussionSettings_UserDefaultAvatar();

		/**
		 * The meta object literal for the '<em><b>Is Notifying Linked Blogs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS = eINSTANCE.getDiscussionSettings_IsNotifyingLinkedBlogs();

		/**
		 * The meta object literal for the '<em><b>Is Allowing Link Notifications From Blogs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS = eINSTANCE.getDiscussionSettings_IsAllowingLinkNotificationsFromBlogs();

		/**
		 * The meta object literal for the '<em><b>Is Allowing Public Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS = eINSTANCE.getDiscussionSettings_IsAllowingPublicComments();

		/**
		 * The meta object literal for the '<em><b>Is Asking Name And Mail Comment Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR = eINSTANCE.getDiscussionSettings_IsAskingNameAndMailCommentAuthor();

		/**
		 * The meta object literal for the '<em><b>Is Allowing Anonymous Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS = eINSTANCE.getDiscussionSettings_IsAllowingAnonymousComments();

		/**
		 * The meta object literal for the '<em><b>Is Breaking Comments Into Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES = eINSTANCE.getDiscussionSettings_IsBreakingCommentsIntoPages();

		/**
		 * The meta object literal for the '<em><b>Isdisplaying Last Page For Breaked Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS = eINSTANCE.getDiscussionSettings_IsdisplayingLastPageForBreakedComments();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Older Comment For Each Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE = eINSTANCE.getDiscussionSettings_IsDisplayingOlderCommentForEachPage();

		/**
		 * The meta object literal for the '<em><b>Is Mailing Admin For Each Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS = eINSTANCE.getDiscussionSettings_IsMailingAdminForEachComments();

		/**
		 * The meta object literal for the '<em><b>Is Helding Comment For Moderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION = eINSTANCE.getDiscussionSettings_IsHeldingCommentForModeration();

		/**
		 * The meta object literal for the '<em><b>Is Asking Admin Approvement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT = eINSTANCE.getDiscussionSettings_IsAskingAdminApprovement();

		/**
		 * The meta object literal for the '<em><b>Is Asking Previous Admin Approvement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT = eINSTANCE.getDiscussionSettings_IsAskingPreviousAdminApprovement();

		/**
		 * The meta object literal for the '<em><b>Is Showing Avatar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCUSSION_SETTINGS__IS_SHOWING_AVATAR = eINSTANCE.getDiscussionSettings_IsShowingAvatar();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl <em>Media Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMediaSettings()
		 * @generated
		 */
		EClass MEDIA_SETTINGS = eINSTANCE.getMediaSettings();

		/**
		 * The meta object literal for the '<em><b>Thumbnail Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__THUMBNAIL_WIDTH = eINSTANCE.getMediaSettings_ThumbnailWidth();

		/**
		 * The meta object literal for the '<em><b>Thumbnail Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__THUMBNAIL_HEIGHT = eINSTANCE.getMediaSettings_ThumbnailHeight();

		/**
		 * The meta object literal for the '<em><b>Medium Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__MEDIUM_WIDTH = eINSTANCE.getMediaSettings_MediumWidth();

		/**
		 * The meta object literal for the '<em><b>Medium Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__MEDIUM_HEIGHT = eINSTANCE.getMediaSettings_MediumHeight();

		/**
		 * The meta object literal for the '<em><b>Large Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__LARGE_WIDTH = eINSTANCE.getMediaSettings_LargeWidth();

		/**
		 * The meta object literal for the '<em><b>Large Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__LARGE_HEIGHT = eINSTANCE.getMediaSettings_LargeHeight();

		/**
		 * The meta object literal for the '<em><b>Is Cropping Thumbnail To Exact Dims</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS = eINSTANCE.getMediaSettings_IsCroppingThumbnailToExactDims();

		/**
		 * The meta object literal for the '<em><b>Is Organize Uploads Into Folders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS = eINSTANCE.getMediaSettings_IsOrganizeUploadsIntoFolders();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl <em>Permalinks Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getPermalinksSettings()
		 * @generated
		 */
		EClass PERMALINKS_SETTINGS = eINSTANCE.getPermalinksSettings();

		/**
		 * The meta object literal for the '<em><b>Perma Url Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMALINKS_SETTINGS__PERMA_URL_FORM = eINSTANCE.getPermalinksSettings_PermaUrlForm();

		/**
		 * The meta object literal for the '<em><b>Url Category Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMALINKS_SETTINGS__URL_CATEGORY_BASE = eINSTANCE.getPermalinksSettings_UrlCategoryBase();

		/**
		 * The meta object literal for the '<em><b>Url Tag Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMALINKS_SETTINGS__URL_TAG_BASE = eINSTANCE.getPermalinksSettings_UrlTagBase();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TYPE = eINSTANCE.getWidget_Type();

		/**
		 * The meta object literal for the '<em><b>Widget Archives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__WIDGET_ARCHIVES = eINSTANCE.getWidget_WidgetArchives();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__CALENDARS = eINSTANCE.getWidget_Calendars();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__CATEGORIES = eINSTANCE.getWidget_Categories();

		/**
		 * The meta object literal for the '<em><b>Custom Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__CUSTOM_MENUS = eINSTANCE.getWidget_CustomMenus();

		/**
		 * The meta object literal for the '<em><b>Metas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__METAS = eINSTANCE.getWidget_Metas();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__PAGES = eINSTANCE.getWidget_Pages();

		/**
		 * The meta object literal for the '<em><b>Recent Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__RECENT_COMMENTS = eINSTANCE.getWidget_RecentComments();

		/**
		 * The meta object literal for the '<em><b>Recent Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__RECENT_POSTS = eINSTANCE.getWidget_RecentPosts();

		/**
		 * The meta object literal for the '<em><b>Feeds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__FEEDS = eINSTANCE.getWidget_Feeds();

		/**
		 * The meta object literal for the '<em><b>Searchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__SEARCHS = eINSTANCE.getWidget_Searchs();

		/**
		 * The meta object literal for the '<em><b>Tag Clouds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__TAG_CLOUDS = eINSTANCE.getWidget_TagClouds();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__TEXTS = eINSTANCE.getWidget_Texts();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__NAME = eINSTANCE.getMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Menu Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__MENU_NAME = eINSTANCE.getMenu_MenuName();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PAGES = eINSTANCE.getMenu_Pages();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__CATEGORIES = eINSTANCE.getMenu_Categories();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__LINKS = eINSTANCE.getMenu_Links();

		/**
		 * The meta object literal for the '<em><b>Current Menu Setting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__CURRENT_MENU_SETTING = eINSTANCE.getMenu_CurrentMenuSetting();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl <em>Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE__TITLE = eINSTANCE.getArchive_Title();

		/**
		 * The meta object literal for the '<em><b>Is Displaying As Drop Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN = eINSTANCE.getArchive_IsDisplayingAsDropDown();

		/**
		 * The meta object literal for the '<em><b>Is Showing Posts Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE__IS_SHOWING_POSTS_COUNT = eINSTANCE.getArchive_IsShowingPostsCount();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CalendarImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__TITLE = eINSTANCE.getCalendar_Title();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl <em>Widget Categorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetCategorie()
		 * @generated
		 */
		EClass WIDGET_CATEGORIE = eINSTANCE.getWidgetCategorie();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_CATEGORIE__TITLE = eINSTANCE.getWidgetCategorie_Title();

		/**
		 * The meta object literal for the '<em><b>Number Of Displayed Posts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS = eINSTANCE.getWidgetCategorie_NumberOfDisplayedPosts();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Sub Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT = eINSTANCE.getWidgetCategorie_IsDisplayingSubCat();

		/**
		 * The meta object literal for the '<em><b>Is Drop Down List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_CATEGORIE__IS_DROP_DOWN_LIST = eINSTANCE.getWidgetCategorie_IsDropDownList();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetMenuImpl <em>Widget Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetMenuImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetMenu()
		 * @generated
		 */
		EClass WIDGET_MENU = eINSTANCE.getWidgetMenu();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_MENU__TITLE = eINSTANCE.getWidgetMenu_Title();

		/**
		 * The meta object literal for the '<em><b>Selected Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_MENU__SELECTED_MENU = eINSTANCE.getWidgetMenu_SelectedMenu();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.MetaImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__TITLE = eINSTANCE.getMeta_Title();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl <em>Widget Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetPage()
		 * @generated
		 */
		EClass WIDGET_PAGE = eINSTANCE.getWidgetPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_PAGE__TITLE = eINSTANCE.getWidgetPage_Title();

		/**
		 * The meta object literal for the '<em><b>Widget Pages Sorter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_PAGE__WIDGET_PAGES_SORTER = eINSTANCE.getWidgetPage_WidgetPagesSorter();

		/**
		 * The meta object literal for the '<em><b>Id Page Excluded</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_PAGE__ID_PAGE_EXCLUDED = eINSTANCE.getWidgetPage_IdPageExcluded();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCommentImpl <em>Widget Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCommentImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetComment()
		 * @generated
		 */
		EClass WIDGET_COMMENT = eINSTANCE.getWidgetComment();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COMMENT__TITLE = eINSTANCE.getWidgetComment_Title();

		/**
		 * The meta object literal for the '<em><b>Number Of Displayed Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS = eINSTANCE.getWidgetComment_NumberOfDisplayedComments();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl <em>Widget Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getWidgetPost()
		 * @generated
		 */
		EClass WIDGET_POST = eINSTANCE.getWidgetPost();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_POST__TITLE = eINSTANCE.getWidgetPost_Title();

		/**
		 * The meta object literal for the '<em><b>Number Of Displayed Posts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS = eINSTANCE.getWidgetPost_NumberOfDisplayedPosts();

		/**
		 * The meta object literal for the '<em><b>Is Displaying Post Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_POST__IS_DISPLAYING_POST_DATE = eINSTANCE.getWidgetPost_IsDisplayingPostDate();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.SearchImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__NAME = eINSTANCE.getSearch_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__TITLE = eINSTANCE.getSearch_Title();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TagCloudImpl <em>Tag Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TagCloudImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getTagCloud()
		 * @generated
		 */
		EClass TAG_CLOUD = eINSTANCE.getTagCloud();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_CLOUD__TITLE = eINSTANCE.getTagCloud_Title();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_CLOUD__TAXONOMY = eINSTANCE.getTagCloud_Taxonomy();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.TextImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TITLE = eINSTANCE.getText_Title();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '<em><b>Is Auto Paragraphs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__IS_AUTO_PARAGRAPHS = eINSTANCE.getText_IsAutoParagraphs();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CurrentMenuSettingImpl <em>Current Menu Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.CurrentMenuSettingImpl
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getCurrentMenuSetting()
		 * @generated
		 */
		EClass CURRENT_MENU_SETTING = eINSTANCE.getCurrentMenuSetting();

		/**
		 * The meta object literal for the '<em><b>Is Adding New Top Level Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES = eINSTANCE.getCurrentMenuSetting_IsAddingNewTopLevelPages();

		/**
		 * The meta object literal for the '<em><b>Is Navigation Menu Located</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED = eINSTANCE.getCurrentMenuSetting_IsNavigationMenuLocated();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.postFormat <em>post Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.postFormat
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getpostFormat()
		 * @generated
		 */
		EEnum POST_FORMAT = eINSTANCE.getpostFormat();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.avatarRating <em>avatar Rating</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.avatarRating
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getavatarRating()
		 * @generated
		 */
		EEnum AVATAR_RATING = eINSTANCE.getavatarRating();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.dateformat <em>dateformat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.dateformat
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getdateformat()
		 * @generated
		 */
		EEnum DATEFORMAT = eINSTANCE.getdateformat();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar <em>default Avatar</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getdefaultAvatar()
		 * @generated
		 */
		EEnum DEFAULT_AVATAR = eINSTANCE.getdefaultAvatar();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.functionalities <em>functionalities</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.functionalities
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getfunctionalities()
		 * @generated
		 */
		EEnum FUNCTIONALITIES = eINSTANCE.getfunctionalities();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.themes <em>themes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.themes
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getthemes()
		 * @generated
		 */
		EEnum THEMES = eINSTANCE.getthemes();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter <em>pages Sorter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getpagesSorter()
		 * @generated
		 */
		EEnum PAGES_SORTER = eINSTANCE.getpagesSorter();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.pageStatus <em>page Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.pageStatus
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getpageStatus()
		 * @generated
		 */
		EEnum PAGE_STATUS = eINSTANCE.getpageStatus();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.role <em>role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.role
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getrole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getrole();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.timeFormat <em>time Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.timeFormat
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#gettimeFormat()
		 * @generated
		 */
		EEnum TIME_FORMAT = eINSTANCE.gettimeFormat();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType <em>taxonomy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#gettaxonomyType()
		 * @generated
		 */
		EEnum TAXONOMY_TYPE = eINSTANCE.gettaxonomyType();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.urlForm <em>url Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.urlForm
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#geturlForm()
		 * @generated
		 */
		EEnum URL_FORM = eINSTANCE.geturlForm();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.weeks <em>weeks</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.weeks
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getweeks()
		 * @generated
		 */
		EEnum WEEKS = eINSTANCE.getweeks();

		/**
		 * The meta object literal for the '{@link org.inria.wordpress.wdpdsl.wdpDsl.widgetType <em>widget Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.widgetType
		 * @see org.inria.wordpress.wdpdsl.wdpDsl.impl.WdpDslPackageImpl#getwidgetType()
		 * @generated
		 */
		EEnum WIDGET_TYPE = eINSTANCE.getwidgetType();

	}

} //WdpDslPackage
