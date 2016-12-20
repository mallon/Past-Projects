/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetCategorie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Categorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl#getNumberOfDisplayedPosts <em>Number Of Displayed Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl#isIsDisplayingSubCat <em>Is Displaying Sub Cat</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCategorieImpl#isIsDropDownList <em>Is Drop Down List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetCategorieImpl extends MinimalEObjectImpl.Container implements WidgetCategorie {
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
	 * The default value of the '{@link #getNumberOfDisplayedPosts() <em>Number Of Displayed Posts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisplayedPosts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DISPLAYED_POSTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfDisplayedPosts() <em>Number Of Displayed Posts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisplayedPosts()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDisplayedPosts = NUMBER_OF_DISPLAYED_POSTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisplayingSubCat() <em>Is Displaying Sub Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingSubCat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_SUB_CAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingSubCat() <em>Is Displaying Sub Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingSubCat()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingSubCat = IS_DISPLAYING_SUB_CAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDropDownList() <em>Is Drop Down List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDropDownList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DROP_DOWN_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDropDownList() <em>Is Drop Down List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDropDownList()
	 * @generated
	 * @ordered
	 */
	protected boolean isDropDownList = IS_DROP_DOWN_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetCategorieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WIDGET_CATEGORIE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_CATEGORIE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDisplayedPosts() {
		return numberOfDisplayedPosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDisplayedPosts(int newNumberOfDisplayedPosts) {
		int oldNumberOfDisplayedPosts = numberOfDisplayedPosts;
		numberOfDisplayedPosts = newNumberOfDisplayedPosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS, oldNumberOfDisplayedPosts, numberOfDisplayedPosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingSubCat() {
		return isDisplayingSubCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingSubCat(boolean newIsDisplayingSubCat) {
		boolean oldIsDisplayingSubCat = isDisplayingSubCat;
		isDisplayingSubCat = newIsDisplayingSubCat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT, oldIsDisplayingSubCat, isDisplayingSubCat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDropDownList() {
		return isDropDownList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDropDownList(boolean newIsDropDownList) {
		boolean oldIsDropDownList = isDropDownList;
		isDropDownList = newIsDropDownList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_CATEGORIE__IS_DROP_DOWN_LIST, oldIsDropDownList, isDropDownList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.WIDGET_CATEGORIE__TITLE:
				return getTitle();
			case WdpDslPackage.WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS:
				return getNumberOfDisplayedPosts();
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT:
				return isIsDisplayingSubCat();
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DROP_DOWN_LIST:
				return isIsDropDownList();
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
			case WdpDslPackage.WIDGET_CATEGORIE__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS:
				setNumberOfDisplayedPosts((Integer)newValue);
				return;
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT:
				setIsDisplayingSubCat((Boolean)newValue);
				return;
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DROP_DOWN_LIST:
				setIsDropDownList((Boolean)newValue);
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
			case WdpDslPackage.WIDGET_CATEGORIE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS:
				setNumberOfDisplayedPosts(NUMBER_OF_DISPLAYED_POSTS_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT:
				setIsDisplayingSubCat(IS_DISPLAYING_SUB_CAT_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DROP_DOWN_LIST:
				setIsDropDownList(IS_DROP_DOWN_LIST_EDEFAULT);
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
			case WdpDslPackage.WIDGET_CATEGORIE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.WIDGET_CATEGORIE__NUMBER_OF_DISPLAYED_POSTS:
				return numberOfDisplayedPosts != NUMBER_OF_DISPLAYED_POSTS_EDEFAULT;
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DISPLAYING_SUB_CAT:
				return isDisplayingSubCat != IS_DISPLAYING_SUB_CAT_EDEFAULT;
			case WdpDslPackage.WIDGET_CATEGORIE__IS_DROP_DOWN_LIST:
				return isDropDownList != IS_DROP_DOWN_LIST_EDEFAULT;
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
		result.append(", numberOfDisplayedPosts: ");
		result.append(numberOfDisplayedPosts);
		result.append(", isDisplayingSubCat: ");
		result.append(isDisplayingSubCat);
		result.append(", isDropDownList: ");
		result.append(isDropDownList);
		result.append(')');
		return result.toString();
	}

} //WidgetCategorieImpl
