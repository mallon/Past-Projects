/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getType <em>Type</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getWidgetArchives <em>Widget Archives</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getCustomMenus <em>Custom Menus</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getMetas <em>Metas</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getPages <em>Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getRecentComments <em>Recent Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getRecentPosts <em>Recent Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getFeeds <em>Feeds</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getSearchs <em>Searchs</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getTagClouds <em>Tag Clouds</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getTexts <em>Texts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.widgetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.widgetType
	 * @see #setType(widgetType)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Type()
	 * @model
	 * @generated
	 */
	widgetType getType();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Widget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.widgetType
	 * @see #getType()
	 * @generated
	 */
	void setType(widgetType value);

	/**
	 * Returns the value of the '<em><b>Widget Archives</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Archive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Archives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Archives</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_WidgetArchives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Archive> getWidgetArchives();

	/**
	 * Returns the value of the '<em><b>Calendars</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Calendar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendars</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Calendars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Calendar> getCalendars();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetCategorie> getCategories();

	/**
	 * Returns the value of the '<em><b>Custom Menus</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Menus</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_CustomMenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetMenu> getCustomMenus();

	/**
	 * Returns the value of the '<em><b>Metas</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Meta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metas</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Metas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Meta> getMetas();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetPage> getPages();

	/**
	 * Returns the value of the '<em><b>Recent Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recent Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recent Comments</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_RecentComments()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetComment> getRecentComments();

	/**
	 * Returns the value of the '<em><b>Recent Posts</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recent Posts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recent Posts</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_RecentPosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetPost> getRecentPosts();

	/**
	 * Returns the value of the '<em><b>Feeds</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feeds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feeds</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Feeds()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetFeed> getFeeds();

	/**
	 * Returns the value of the '<em><b>Searchs</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Search}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searchs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchs</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Searchs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Search> getSearchs();

	/**
	 * Returns the value of the '<em><b>Tag Clouds</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Clouds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Clouds</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_TagClouds()
	 * @model containment="true"
	 * @generated
	 */
	EList<TagCloud> getTagClouds();

	/**
	 * Returns the value of the '<em><b>Texts</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texts</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidget_Texts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getTexts();

} // Widget
