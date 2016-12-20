/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.inria.wordpress.wdpdsl.wdpDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage
 * @generated
 */
public class WdpDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WdpDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WdpDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WdpDslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WdpDslSwitch<Adapter> modelSwitch =
		new WdpDslSwitch<Adapter>() {
			@Override
			public Adapter caseWebsite(Website object) {
				return createWebsiteAdapter();
			}
			@Override
			public Adapter caseDeletion(Deletion object) {
				return createDeletionAdapter();
			}
			@Override
			public Adapter casePostDateAuthor(PostDateAuthor object) {
				return createPostDateAuthorAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter casePostPage_Impl(PostPage_Impl object) {
				return createPostPage_ImplAdapter();
			}
			@Override
			public Adapter casePostPage(PostPage object) {
				return createPostPageAdapter();
			}
			@Override
			public Adapter casePost(Post object) {
				return createPostAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseAppearance(Appearance object) {
				return createAppearanceAdapter();
			}
			@Override
			public Adapter caseTheme(Theme object) {
				return createThemeAdapter();
			}
			@Override
			public Adapter caseFunctionality(Functionality object) {
				return createFunctionalityAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseUrl(Url object) {
				return createUrlAdapter();
			}
			@Override
			public Adapter caseWidgetFeed(WidgetFeed object) {
				return createWidgetFeedAdapter();
			}
			@Override
			public Adapter casePlugin(Plugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseTaxonomy(Taxonomy object) {
				return createTaxonomyAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseSettings(Settings object) {
				return createSettingsAdapter();
			}
			@Override
			public Adapter caseGeneralSettings(GeneralSettings object) {
				return createGeneralSettingsAdapter();
			}
			@Override
			public Adapter caseWritingSettings(WritingSettings object) {
				return createWritingSettingsAdapter();
			}
			@Override
			public Adapter caseReadingSettings(ReadingSettings object) {
				return createReadingSettingsAdapter();
			}
			@Override
			public Adapter caseDiscussionSettings(DiscussionSettings object) {
				return createDiscussionSettingsAdapter();
			}
			@Override
			public Adapter caseMediaSettings(MediaSettings object) {
				return createMediaSettingsAdapter();
			}
			@Override
			public Adapter casePermalinksSettings(PermalinksSettings object) {
				return createPermalinksSettingsAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseArchive(Archive object) {
				return createArchiveAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseWidgetCategorie(WidgetCategorie object) {
				return createWidgetCategorieAdapter();
			}
			@Override
			public Adapter caseWidgetMenu(WidgetMenu object) {
				return createWidgetMenuAdapter();
			}
			@Override
			public Adapter caseMeta(Meta object) {
				return createMetaAdapter();
			}
			@Override
			public Adapter caseWidgetPage(WidgetPage object) {
				return createWidgetPageAdapter();
			}
			@Override
			public Adapter caseWidgetComment(WidgetComment object) {
				return createWidgetCommentAdapter();
			}
			@Override
			public Adapter caseWidgetPost(WidgetPost object) {
				return createWidgetPostAdapter();
			}
			@Override
			public Adapter caseSearch(Search object) {
				return createSearchAdapter();
			}
			@Override
			public Adapter caseTagCloud(TagCloud object) {
				return createTagCloudAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseCurrentMenuSetting(CurrentMenuSetting object) {
				return createCurrentMenuSettingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Website
	 * @generated
	 */
	public Adapter createWebsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion <em>Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Deletion
	 * @generated
	 */
	public Adapter createDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor <em>Post Date Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor
	 * @generated
	 */
	public Adapter createPostDateAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl <em>Post Page Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl
	 * @generated
	 */
	public Adapter createPostPage_ImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage <em>Post Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PostPage
	 * @generated
	 */
	public Adapter createPostPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Post
	 * @generated
	 */
	public Adapter createPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Appearance
	 * @generated
	 */
	public Adapter createAppearanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Theme
	 * @generated
	 */
	public Adapter createThemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Functionality
	 * @generated
	 */
	public Adapter createFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed <em>Widget Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed
	 * @generated
	 */
	public Adapter createWidgetFeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy
	 * @generated
	 */
	public Adapter createTaxonomyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Settings
	 * @generated
	 */
	public Adapter createSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings <em>General Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings
	 * @generated
	 */
	public Adapter createGeneralSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings <em>Writing Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings
	 * @generated
	 */
	public Adapter createWritingSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings <em>Reading Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings
	 * @generated
	 */
	public Adapter createReadingSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings <em>Discussion Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings
	 * @generated
	 */
	public Adapter createDiscussionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings <em>Media Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings
	 * @generated
	 */
	public Adapter createMediaSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings <em>Permalinks Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings
	 * @generated
	 */
	public Adapter createPermalinksSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Archive
	 * @generated
	 */
	public Adapter createArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie <em>Widget Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie
	 * @generated
	 */
	public Adapter createWidgetCategorieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu <em>Widget Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu
	 * @generated
	 */
	public Adapter createWidgetMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage <em>Widget Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage
	 * @generated
	 */
	public Adapter createWidgetPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment <em>Widget Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment
	 * @generated
	 */
	public Adapter createWidgetCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost <em>Widget Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost
	 * @generated
	 */
	public Adapter createWidgetPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Search
	 * @generated
	 */
	public Adapter createSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud <em>Tag Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.TagCloud
	 * @generated
	 */
	public Adapter createTagCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting <em>Current Menu Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting
	 * @generated
	 */
	public Adapter createCurrentMenuSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WdpDslAdapterFactory
