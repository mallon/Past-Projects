/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl#getNumberOfDisplayedPosts <em>Number Of Displayed Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPostImpl#isIsDisplayingPostDate <em>Is Displaying Post Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetPostImpl extends MinimalEObjectImpl.Container implements WidgetPost {
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
	 * The default value of the '{@link #isIsDisplayingPostDate() <em>Is Displaying Post Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingPostDate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_POST_DATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingPostDate() <em>Is Displaying Post Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingPostDate()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingPostDate = IS_DISPLAYING_POST_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetPostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WIDGET_POST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_POST__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS, oldNumberOfDisplayedPosts, numberOfDisplayedPosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingPostDate() {
		return isDisplayingPostDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingPostDate(boolean newIsDisplayingPostDate) {
		boolean oldIsDisplayingPostDate = isDisplayingPostDate;
		isDisplayingPostDate = newIsDisplayingPostDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_POST__IS_DISPLAYING_POST_DATE, oldIsDisplayingPostDate, isDisplayingPostDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.WIDGET_POST__TITLE:
				return getTitle();
			case WdpDslPackage.WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS:
				return getNumberOfDisplayedPosts();
			case WdpDslPackage.WIDGET_POST__IS_DISPLAYING_POST_DATE:
				return isIsDisplayingPostDate();
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
			case WdpDslPackage.WIDGET_POST__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS:
				setNumberOfDisplayedPosts((Integer)newValue);
				return;
			case WdpDslPackage.WIDGET_POST__IS_DISPLAYING_POST_DATE:
				setIsDisplayingPostDate((Boolean)newValue);
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
			case WdpDslPackage.WIDGET_POST__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS:
				setNumberOfDisplayedPosts(NUMBER_OF_DISPLAYED_POSTS_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_POST__IS_DISPLAYING_POST_DATE:
				setIsDisplayingPostDate(IS_DISPLAYING_POST_DATE_EDEFAULT);
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
			case WdpDslPackage.WIDGET_POST__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.WIDGET_POST__NUMBER_OF_DISPLAYED_POSTS:
				return numberOfDisplayedPosts != NUMBER_OF_DISPLAYED_POSTS_EDEFAULT;
			case WdpDslPackage.WIDGET_POST__IS_DISPLAYING_POST_DATE:
				return isDisplayingPostDate != IS_DISPLAYING_POST_DATE_EDEFAULT;
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
		result.append(", isDisplayingPostDate: ");
		result.append(isDisplayingPostDate);
		result.append(')');
		return result.toString();
	}

} //WidgetPostImpl
