/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Url;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetFeed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Feed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl#isIsDisplayingItemContent <em>Is Displaying Item Content</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl#isIsDisplayingItemAuthor <em>Is Displaying Item Author</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl#isIsDisplayingItemDate <em>Is Displaying Item Date</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetFeedImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetFeedImpl extends MinimalEObjectImpl.Container implements WidgetFeed {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisplayingItemContent() <em>Is Displaying Item Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingItemContent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_ITEM_CONTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingItemContent() <em>Is Displaying Item Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingItemContent()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingItemContent = IS_DISPLAYING_ITEM_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisplayingItemAuthor() <em>Is Displaying Item Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingItemAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_ITEM_AUTHOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingItemAuthor() <em>Is Displaying Item Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingItemAuthor()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingItemAuthor = IS_DISPLAYING_ITEM_AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisplayingItemDate() <em>Is Displaying Item Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingItemDate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_ITEM_DATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingItemDate() <em>Is Displaying Item Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingItemDate()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingItemDate = IS_DISPLAYING_ITEM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected int numberOfItems = NUMBER_OF_ITEMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetFeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WIDGET_FEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingItemContent() {
		return isDisplayingItemContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingItemContent(boolean newIsDisplayingItemContent) {
		boolean oldIsDisplayingItemContent = isDisplayingItemContent;
		isDisplayingItemContent = newIsDisplayingItemContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT, oldIsDisplayingItemContent, isDisplayingItemContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingItemAuthor() {
		return isDisplayingItemAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingItemAuthor(boolean newIsDisplayingItemAuthor) {
		boolean oldIsDisplayingItemAuthor = isDisplayingItemAuthor;
		isDisplayingItemAuthor = newIsDisplayingItemAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR, oldIsDisplayingItemAuthor, isDisplayingItemAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingItemDate() {
		return isDisplayingItemDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingItemDate(boolean newIsDisplayingItemDate) {
		boolean oldIsDisplayingItemDate = isDisplayingItemDate;
		isDisplayingItemDate = newIsDisplayingItemDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_DATE, oldIsDisplayingItemDate, isDisplayingItemDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfItems(int newNumberOfItems) {
		int oldNumberOfItems = numberOfItems;
		numberOfItems = newNumberOfItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__NUMBER_OF_ITEMS, oldNumberOfItems, numberOfItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WIDGET_FEED__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WIDGET_FEED__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_FEED__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.WIDGET_FEED__URL:
				return basicSetUrl(null, msgs);
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
			case WdpDslPackage.WIDGET_FEED__TITLE:
				return getTitle();
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT:
				return isIsDisplayingItemContent();
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR:
				return isIsDisplayingItemAuthor();
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_DATE:
				return isIsDisplayingItemDate();
			case WdpDslPackage.WIDGET_FEED__NUMBER_OF_ITEMS:
				return getNumberOfItems();
			case WdpDslPackage.WIDGET_FEED__URL:
				return getUrl();
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
			case WdpDslPackage.WIDGET_FEED__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT:
				setIsDisplayingItemContent((Boolean)newValue);
				return;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR:
				setIsDisplayingItemAuthor((Boolean)newValue);
				return;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_DATE:
				setIsDisplayingItemDate((Boolean)newValue);
				return;
			case WdpDslPackage.WIDGET_FEED__NUMBER_OF_ITEMS:
				setNumberOfItems((Integer)newValue);
				return;
			case WdpDslPackage.WIDGET_FEED__URL:
				setUrl((Url)newValue);
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
			case WdpDslPackage.WIDGET_FEED__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT:
				setIsDisplayingItemContent(IS_DISPLAYING_ITEM_CONTENT_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR:
				setIsDisplayingItemAuthor(IS_DISPLAYING_ITEM_AUTHOR_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_DATE:
				setIsDisplayingItemDate(IS_DISPLAYING_ITEM_DATE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_FEED__NUMBER_OF_ITEMS:
				setNumberOfItems(NUMBER_OF_ITEMS_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_FEED__URL:
				setUrl((Url)null);
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
			case WdpDslPackage.WIDGET_FEED__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_CONTENT:
				return isDisplayingItemContent != IS_DISPLAYING_ITEM_CONTENT_EDEFAULT;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_AUTHOR:
				return isDisplayingItemAuthor != IS_DISPLAYING_ITEM_AUTHOR_EDEFAULT;
			case WdpDslPackage.WIDGET_FEED__IS_DISPLAYING_ITEM_DATE:
				return isDisplayingItemDate != IS_DISPLAYING_ITEM_DATE_EDEFAULT;
			case WdpDslPackage.WIDGET_FEED__NUMBER_OF_ITEMS:
				return numberOfItems != NUMBER_OF_ITEMS_EDEFAULT;
			case WdpDslPackage.WIDGET_FEED__URL:
				return url != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", isDisplayingItemContent: ");
		result.append(isDisplayingItemContent);
		result.append(", isDisplayingItemAuthor: ");
		result.append(isDisplayingItemAuthor);
		result.append(", isDisplayingItemDate: ");
		result.append(isDisplayingItemDate);
		result.append(", numberOfItems: ");
		result.append(numberOfItems);
		result.append(')');
		return result.toString();
	}

} //WidgetFeedImpl
