/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.inria.wordpress.wdpdsl.wdpDsl.Archive;
import org.inria.wordpress.wdpdsl.wdpDsl.Calendar;
import org.inria.wordpress.wdpdsl.wdpDsl.Meta;
import org.inria.wordpress.wdpdsl.wdpDsl.Search;
import org.inria.wordpress.wdpdsl.wdpDsl.TagCloud;
import org.inria.wordpress.wdpdsl.wdpDsl.Text;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.Widget;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetMenu;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost;
import org.inria.wordpress.wdpdsl.wdpDsl.widgetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getWidgetArchives <em>Widget Archives</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getCustomMenus <em>Custom Menus</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getMetas <em>Metas</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getRecentComments <em>Recent Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getRecentPosts <em>Recent Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getFeeds <em>Feeds</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getSearchs <em>Searchs</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getTagClouds <em>Tag Clouds</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetImpl#getTexts <em>Texts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final widgetType TYPE_EDEFAULT = widgetType.MAIN_AREA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected widgetType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgetArchives() <em>Widget Archives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetArchives()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive> widgetArchives;

	/**
	 * The cached value of the '{@link #getCalendars() <em>Calendars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendars()
	 * @generated
	 * @ordered
	 */
	protected EList<Calendar> calendars;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetCategorie> categories;

	/**
	 * The cached value of the '{@link #getCustomMenus() <em>Custom Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetMenu> customMenus;

	/**
	 * The cached value of the '{@link #getMetas() <em>Metas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetas()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> metas;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetPage> pages;

	/**
	 * The cached value of the '{@link #getRecentComments() <em>Recent Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecentComments()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetComment> recentComments;

	/**
	 * The cached value of the '{@link #getRecentPosts() <em>Recent Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecentPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetPost> recentPosts;

	/**
	 * The cached value of the '{@link #getFeeds() <em>Feeds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetFeed> feeds;

	/**
	 * The cached value of the '{@link #getSearchs() <em>Searchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Search> searchs;

	/**
	 * The cached value of the '{@link #getTagClouds() <em>Tag Clouds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagClouds()
	 * @generated
	 * @ordered
	 */
	protected EList<TagCloud> tagClouds;

	/**
	 * The cached value of the '{@link #getTexts() <em>Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> texts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public widgetType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(widgetType newType) {
		widgetType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Archive> getWidgetArchives() {
		if (widgetArchives == null) {
			widgetArchives = new EObjectContainmentEList<Archive>(Archive.class, this, WdpDslPackage.WIDGET__WIDGET_ARCHIVES);
		}
		return widgetArchives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calendar> getCalendars() {
		if (calendars == null) {
			calendars = new EObjectContainmentEList<Calendar>(Calendar.class, this, WdpDslPackage.WIDGET__CALENDARS);
		}
		return calendars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetCategorie> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<WidgetCategorie>(WidgetCategorie.class, this, WdpDslPackage.WIDGET__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetMenu> getCustomMenus() {
		if (customMenus == null) {
			customMenus = new EObjectContainmentEList<WidgetMenu>(WidgetMenu.class, this, WdpDslPackage.WIDGET__CUSTOM_MENUS);
		}
		return customMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMetas() {
		if (metas == null) {
			metas = new EObjectContainmentEList<Meta>(Meta.class, this, WdpDslPackage.WIDGET__METAS);
		}
		return metas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetPage> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<WidgetPage>(WidgetPage.class, this, WdpDslPackage.WIDGET__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetComment> getRecentComments() {
		if (recentComments == null) {
			recentComments = new EObjectContainmentEList<WidgetComment>(WidgetComment.class, this, WdpDslPackage.WIDGET__RECENT_COMMENTS);
		}
		return recentComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetPost> getRecentPosts() {
		if (recentPosts == null) {
			recentPosts = new EObjectContainmentEList<WidgetPost>(WidgetPost.class, this, WdpDslPackage.WIDGET__RECENT_POSTS);
		}
		return recentPosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetFeed> getFeeds() {
		if (feeds == null) {
			feeds = new EObjectContainmentEList<WidgetFeed>(WidgetFeed.class, this, WdpDslPackage.WIDGET__FEEDS);
		}
		return feeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Search> getSearchs() {
		if (searchs == null) {
			searchs = new EObjectContainmentEList<Search>(Search.class, this, WdpDslPackage.WIDGET__SEARCHS);
		}
		return searchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TagCloud> getTagClouds() {
		if (tagClouds == null) {
			tagClouds = new EObjectContainmentEList<TagCloud>(TagCloud.class, this, WdpDslPackage.WIDGET__TAG_CLOUDS);
		}
		return tagClouds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getTexts() {
		if (texts == null) {
			texts = new EObjectContainmentEList<Text>(Text.class, this, WdpDslPackage.WIDGET__TEXTS);
		}
		return texts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.WIDGET__WIDGET_ARCHIVES:
				return ((InternalEList<?>)getWidgetArchives()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__CALENDARS:
				return ((InternalEList<?>)getCalendars()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__CUSTOM_MENUS:
				return ((InternalEList<?>)getCustomMenus()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__METAS:
				return ((InternalEList<?>)getMetas()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__RECENT_COMMENTS:
				return ((InternalEList<?>)getRecentComments()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__RECENT_POSTS:
				return ((InternalEList<?>)getRecentPosts()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__FEEDS:
				return ((InternalEList<?>)getFeeds()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__SEARCHS:
				return ((InternalEList<?>)getSearchs()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__TAG_CLOUDS:
				return ((InternalEList<?>)getTagClouds()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WIDGET__TEXTS:
				return ((InternalEList<?>)getTexts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.WIDGET__TYPE:
				return getType();
			case WdpDslPackage.WIDGET__WIDGET_ARCHIVES:
				return getWidgetArchives();
			case WdpDslPackage.WIDGET__CALENDARS:
				return getCalendars();
			case WdpDslPackage.WIDGET__CATEGORIES:
				return getCategories();
			case WdpDslPackage.WIDGET__CUSTOM_MENUS:
				return getCustomMenus();
			case WdpDslPackage.WIDGET__METAS:
				return getMetas();
			case WdpDslPackage.WIDGET__PAGES:
				return getPages();
			case WdpDslPackage.WIDGET__RECENT_COMMENTS:
				return getRecentComments();
			case WdpDslPackage.WIDGET__RECENT_POSTS:
				return getRecentPosts();
			case WdpDslPackage.WIDGET__FEEDS:
				return getFeeds();
			case WdpDslPackage.WIDGET__SEARCHS:
				return getSearchs();
			case WdpDslPackage.WIDGET__TAG_CLOUDS:
				return getTagClouds();
			case WdpDslPackage.WIDGET__TEXTS:
				return getTexts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WdpDslPackage.WIDGET__TYPE:
				setType((widgetType)newValue);
				return;
			case WdpDslPackage.WIDGET__WIDGET_ARCHIVES:
				getWidgetArchives().clear();
				getWidgetArchives().addAll((Collection<? extends Archive>)newValue);
				return;
			case WdpDslPackage.WIDGET__CALENDARS:
				getCalendars().clear();
				getCalendars().addAll((Collection<? extends Calendar>)newValue);
				return;
			case WdpDslPackage.WIDGET__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends WidgetCategorie>)newValue);
				return;
			case WdpDslPackage.WIDGET__CUSTOM_MENUS:
				getCustomMenus().clear();
				getCustomMenus().addAll((Collection<? extends WidgetMenu>)newValue);
				return;
			case WdpDslPackage.WIDGET__METAS:
				getMetas().clear();
				getMetas().addAll((Collection<? extends Meta>)newValue);
				return;
			case WdpDslPackage.WIDGET__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends WidgetPage>)newValue);
				return;
			case WdpDslPackage.WIDGET__RECENT_COMMENTS:
				getRecentComments().clear();
				getRecentComments().addAll((Collection<? extends WidgetComment>)newValue);
				return;
			case WdpDslPackage.WIDGET__RECENT_POSTS:
				getRecentPosts().clear();
				getRecentPosts().addAll((Collection<? extends WidgetPost>)newValue);
				return;
			case WdpDslPackage.WIDGET__FEEDS:
				getFeeds().clear();
				getFeeds().addAll((Collection<? extends WidgetFeed>)newValue);
				return;
			case WdpDslPackage.WIDGET__SEARCHS:
				getSearchs().clear();
				getSearchs().addAll((Collection<? extends Search>)newValue);
				return;
			case WdpDslPackage.WIDGET__TAG_CLOUDS:
				getTagClouds().clear();
				getTagClouds().addAll((Collection<? extends TagCloud>)newValue);
				return;
			case WdpDslPackage.WIDGET__TEXTS:
				getTexts().clear();
				getTexts().addAll((Collection<? extends Text>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WdpDslPackage.WIDGET__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET__WIDGET_ARCHIVES:
				getWidgetArchives().clear();
				return;
			case WdpDslPackage.WIDGET__CALENDARS:
				getCalendars().clear();
				return;
			case WdpDslPackage.WIDGET__CATEGORIES:
				getCategories().clear();
				return;
			case WdpDslPackage.WIDGET__CUSTOM_MENUS:
				getCustomMenus().clear();
				return;
			case WdpDslPackage.WIDGET__METAS:
				getMetas().clear();
				return;
			case WdpDslPackage.WIDGET__PAGES:
				getPages().clear();
				return;
			case WdpDslPackage.WIDGET__RECENT_COMMENTS:
				getRecentComments().clear();
				return;
			case WdpDslPackage.WIDGET__RECENT_POSTS:
				getRecentPosts().clear();
				return;
			case WdpDslPackage.WIDGET__FEEDS:
				getFeeds().clear();
				return;
			case WdpDslPackage.WIDGET__SEARCHS:
				getSearchs().clear();
				return;
			case WdpDslPackage.WIDGET__TAG_CLOUDS:
				getTagClouds().clear();
				return;
			case WdpDslPackage.WIDGET__TEXTS:
				getTexts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WdpDslPackage.WIDGET__TYPE:
				return type != TYPE_EDEFAULT;
			case WdpDslPackage.WIDGET__WIDGET_ARCHIVES:
				return widgetArchives != null && !widgetArchives.isEmpty();
			case WdpDslPackage.WIDGET__CALENDARS:
				return calendars != null && !calendars.isEmpty();
			case WdpDslPackage.WIDGET__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case WdpDslPackage.WIDGET__CUSTOM_MENUS:
				return customMenus != null && !customMenus.isEmpty();
			case WdpDslPackage.WIDGET__METAS:
				return metas != null && !metas.isEmpty();
			case WdpDslPackage.WIDGET__PAGES:
				return pages != null && !pages.isEmpty();
			case WdpDslPackage.WIDGET__RECENT_COMMENTS:
				return recentComments != null && !recentComments.isEmpty();
			case WdpDslPackage.WIDGET__RECENT_POSTS:
				return recentPosts != null && !recentPosts.isEmpty();
			case WdpDslPackage.WIDGET__FEEDS:
				return feeds != null && !feeds.isEmpty();
			case WdpDslPackage.WIDGET__SEARCHS:
				return searchs != null && !searchs.isEmpty();
			case WdpDslPackage.WIDGET__TAG_CLOUDS:
				return tagClouds != null && !tagClouds.isEmpty();
			case WdpDslPackage.WIDGET__TEXTS:
				return texts != null && !texts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
