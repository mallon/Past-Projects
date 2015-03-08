/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Page;
import org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#getMaxNumberPostsForBlogPages <em>Max Number Posts For Blog Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#getNumberRecentItemForFeeds <em>Number Recent Item For Feeds</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#getStaticFrontPage <em>Static Front Page</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#getStaticPostPage <em>Static Post Page</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#isIsDisplayingLastPostInFront <em>Is Displaying Last Post In Front</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#isIsIndexed <em>Is Indexed</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ReadingSettingsImpl#isIsShowingFullTextForFeed <em>Is Showing Full Text For Feed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadingSettingsImpl extends MinimalEObjectImpl.Container implements ReadingSettings {
	/**
	 * The default value of the '{@link #getMaxNumberPostsForBlogPages() <em>Max Number Posts For Blog Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberPostsForBlogPages()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_POSTS_FOR_BLOG_PAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumberPostsForBlogPages() <em>Max Number Posts For Blog Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberPostsForBlogPages()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberPostsForBlogPages = MAX_NUMBER_POSTS_FOR_BLOG_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberRecentItemForFeeds() <em>Number Recent Item For Feeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRecentItemForFeeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_RECENT_ITEM_FOR_FEEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberRecentItemForFeeds() <em>Number Recent Item For Feeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRecentItemForFeeds()
	 * @generated
	 * @ordered
	 */
	protected int numberRecentItemForFeeds = NUMBER_RECENT_ITEM_FOR_FEEDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaticFrontPage() <em>Static Front Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticFrontPage()
	 * @generated
	 * @ordered
	 */
	protected Page staticFrontPage;

	/**
	 * The cached value of the '{@link #getStaticPostPage() <em>Static Post Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticPostPage()
	 * @generated
	 * @ordered
	 */
	protected Page staticPostPage;

	/**
	 * The default value of the '{@link #isIsDisplayingLastPostInFront() <em>Is Displaying Last Post In Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingLastPostInFront()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_LAST_POST_IN_FRONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingLastPostInFront() <em>Is Displaying Last Post In Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingLastPostInFront()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingLastPostInFront = IS_DISPLAYING_LAST_POST_IN_FRONT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsIndexed() <em>Is Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndexed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDEXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIndexed() <em>Is Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndexed()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndexed = IS_INDEXED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsShowingFullTextForFeed() <em>Is Showing Full Text For Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingFullTextForFeed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHOWING_FULL_TEXT_FOR_FEED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShowingFullTextForFeed() <em>Is Showing Full Text For Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingFullTextForFeed()
	 * @generated
	 * @ordered
	 */
	protected boolean isShowingFullTextForFeed = IS_SHOWING_FULL_TEXT_FOR_FEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.READING_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberPostsForBlogPages() {
		return maxNumberPostsForBlogPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberPostsForBlogPages(int newMaxNumberPostsForBlogPages) {
		int oldMaxNumberPostsForBlogPages = maxNumberPostsForBlogPages;
		maxNumberPostsForBlogPages = newMaxNumberPostsForBlogPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES, oldMaxNumberPostsForBlogPages, maxNumberPostsForBlogPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberRecentItemForFeeds() {
		return numberRecentItemForFeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRecentItemForFeeds(int newNumberRecentItemForFeeds) {
		int oldNumberRecentItemForFeeds = numberRecentItemForFeeds;
		numberRecentItemForFeeds = newNumberRecentItemForFeeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS, oldNumberRecentItemForFeeds, numberRecentItemForFeeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getStaticFrontPage() {
		if (staticFrontPage != null && staticFrontPage.eIsProxy()) {
			InternalEObject oldStaticFrontPage = (InternalEObject)staticFrontPage;
			staticFrontPage = (Page)eResolveProxy(oldStaticFrontPage);
			if (staticFrontPage != oldStaticFrontPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.READING_SETTINGS__STATIC_FRONT_PAGE, oldStaticFrontPage, staticFrontPage));
			}
		}
		return staticFrontPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetStaticFrontPage() {
		return staticFrontPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticFrontPage(Page newStaticFrontPage) {
		Page oldStaticFrontPage = staticFrontPage;
		staticFrontPage = newStaticFrontPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__STATIC_FRONT_PAGE, oldStaticFrontPage, staticFrontPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getStaticPostPage() {
		if (staticPostPage != null && staticPostPage.eIsProxy()) {
			InternalEObject oldStaticPostPage = (InternalEObject)staticPostPage;
			staticPostPage = (Page)eResolveProxy(oldStaticPostPage);
			if (staticPostPage != oldStaticPostPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.READING_SETTINGS__STATIC_POST_PAGE, oldStaticPostPage, staticPostPage));
			}
		}
		return staticPostPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetStaticPostPage() {
		return staticPostPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticPostPage(Page newStaticPostPage) {
		Page oldStaticPostPage = staticPostPage;
		staticPostPage = newStaticPostPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__STATIC_POST_PAGE, oldStaticPostPage, staticPostPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingLastPostInFront() {
		return isDisplayingLastPostInFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingLastPostInFront(boolean newIsDisplayingLastPostInFront) {
		boolean oldIsDisplayingLastPostInFront = isDisplayingLastPostInFront;
		isDisplayingLastPostInFront = newIsDisplayingLastPostInFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT, oldIsDisplayingLastPostInFront, isDisplayingLastPostInFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndexed() {
		return isIndexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndexed(boolean newIsIndexed) {
		boolean oldIsIndexed = isIndexed;
		isIndexed = newIsIndexed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__IS_INDEXED, oldIsIndexed, isIndexed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShowingFullTextForFeed() {
		return isShowingFullTextForFeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShowingFullTextForFeed(boolean newIsShowingFullTextForFeed) {
		boolean oldIsShowingFullTextForFeed = isShowingFullTextForFeed;
		isShowingFullTextForFeed = newIsShowingFullTextForFeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED, oldIsShowingFullTextForFeed, isShowingFullTextForFeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES:
				return getMaxNumberPostsForBlogPages();
			case WdpDslPackage.READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS:
				return getNumberRecentItemForFeeds();
			case WdpDslPackage.READING_SETTINGS__STATIC_FRONT_PAGE:
				if (resolve) return getStaticFrontPage();
				return basicGetStaticFrontPage();
			case WdpDslPackage.READING_SETTINGS__STATIC_POST_PAGE:
				if (resolve) return getStaticPostPage();
				return basicGetStaticPostPage();
			case WdpDslPackage.READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT:
				return isIsDisplayingLastPostInFront();
			case WdpDslPackage.READING_SETTINGS__IS_INDEXED:
				return isIsIndexed();
			case WdpDslPackage.READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED:
				return isIsShowingFullTextForFeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WdpDslPackage.READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES:
				setMaxNumberPostsForBlogPages((Integer)newValue);
				return;
			case WdpDslPackage.READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS:
				setNumberRecentItemForFeeds((Integer)newValue);
				return;
			case WdpDslPackage.READING_SETTINGS__STATIC_FRONT_PAGE:
				setStaticFrontPage((Page)newValue);
				return;
			case WdpDslPackage.READING_SETTINGS__STATIC_POST_PAGE:
				setStaticPostPage((Page)newValue);
				return;
			case WdpDslPackage.READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT:
				setIsDisplayingLastPostInFront((Boolean)newValue);
				return;
			case WdpDslPackage.READING_SETTINGS__IS_INDEXED:
				setIsIndexed((Boolean)newValue);
				return;
			case WdpDslPackage.READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED:
				setIsShowingFullTextForFeed((Boolean)newValue);
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
			case WdpDslPackage.READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES:
				setMaxNumberPostsForBlogPages(MAX_NUMBER_POSTS_FOR_BLOG_PAGES_EDEFAULT);
				return;
			case WdpDslPackage.READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS:
				setNumberRecentItemForFeeds(NUMBER_RECENT_ITEM_FOR_FEEDS_EDEFAULT);
				return;
			case WdpDslPackage.READING_SETTINGS__STATIC_FRONT_PAGE:
				setStaticFrontPage((Page)null);
				return;
			case WdpDslPackage.READING_SETTINGS__STATIC_POST_PAGE:
				setStaticPostPage((Page)null);
				return;
			case WdpDslPackage.READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT:
				setIsDisplayingLastPostInFront(IS_DISPLAYING_LAST_POST_IN_FRONT_EDEFAULT);
				return;
			case WdpDslPackage.READING_SETTINGS__IS_INDEXED:
				setIsIndexed(IS_INDEXED_EDEFAULT);
				return;
			case WdpDslPackage.READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED:
				setIsShowingFullTextForFeed(IS_SHOWING_FULL_TEXT_FOR_FEED_EDEFAULT);
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
			case WdpDslPackage.READING_SETTINGS__MAX_NUMBER_POSTS_FOR_BLOG_PAGES:
				return maxNumberPostsForBlogPages != MAX_NUMBER_POSTS_FOR_BLOG_PAGES_EDEFAULT;
			case WdpDslPackage.READING_SETTINGS__NUMBER_RECENT_ITEM_FOR_FEEDS:
				return numberRecentItemForFeeds != NUMBER_RECENT_ITEM_FOR_FEEDS_EDEFAULT;
			case WdpDslPackage.READING_SETTINGS__STATIC_FRONT_PAGE:
				return staticFrontPage != null;
			case WdpDslPackage.READING_SETTINGS__STATIC_POST_PAGE:
				return staticPostPage != null;
			case WdpDslPackage.READING_SETTINGS__IS_DISPLAYING_LAST_POST_IN_FRONT:
				return isDisplayingLastPostInFront != IS_DISPLAYING_LAST_POST_IN_FRONT_EDEFAULT;
			case WdpDslPackage.READING_SETTINGS__IS_INDEXED:
				return isIndexed != IS_INDEXED_EDEFAULT;
			case WdpDslPackage.READING_SETTINGS__IS_SHOWING_FULL_TEXT_FOR_FEED:
				return isShowingFullTextForFeed != IS_SHOWING_FULL_TEXT_FOR_FEED_EDEFAULT;
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
		result.append(" (maxNumberPostsForBlogPages: ");
		result.append(maxNumberPostsForBlogPages);
		result.append(", numberRecentItemForFeeds: ");
		result.append(numberRecentItemForFeeds);
		result.append(", isDisplayingLastPostInFront: ");
		result.append(isDisplayingLastPostInFront);
		result.append(", isIndexed: ");
		result.append(isIndexed);
		result.append(", isShowingFullTextForFeed: ");
		result.append(isShowingFullTextForFeed);
		result.append(')');
		return result.toString();
	}

} //ReadingSettingsImpl
