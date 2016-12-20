/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Archive;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl#isIsDisplayingAsDropDown <em>Is Displaying As Drop Down</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ArchiveImpl#isIsShowingPostsCount <em>Is Showing Posts Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchiveImpl extends MinimalEObjectImpl.Container implements Archive {
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
	 * The default value of the '{@link #isIsDisplayingAsDropDown() <em>Is Displaying As Drop Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingAsDropDown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_AS_DROP_DOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingAsDropDown() <em>Is Displaying As Drop Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingAsDropDown()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingAsDropDown = IS_DISPLAYING_AS_DROP_DOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsShowingPostsCount() <em>Is Showing Posts Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingPostsCount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHOWING_POSTS_COUNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShowingPostsCount() <em>Is Showing Posts Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingPostsCount()
	 * @generated
	 * @ordered
	 */
	protected boolean isShowingPostsCount = IS_SHOWING_POSTS_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.ARCHIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.ARCHIVE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingAsDropDown() {
		return isDisplayingAsDropDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingAsDropDown(boolean newIsDisplayingAsDropDown) {
		boolean oldIsDisplayingAsDropDown = isDisplayingAsDropDown;
		isDisplayingAsDropDown = newIsDisplayingAsDropDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN, oldIsDisplayingAsDropDown, isDisplayingAsDropDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShowingPostsCount() {
		return isShowingPostsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShowingPostsCount(boolean newIsShowingPostsCount) {
		boolean oldIsShowingPostsCount = isShowingPostsCount;
		isShowingPostsCount = newIsShowingPostsCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.ARCHIVE__IS_SHOWING_POSTS_COUNT, oldIsShowingPostsCount, isShowingPostsCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.ARCHIVE__TITLE:
				return getTitle();
			case WdpDslPackage.ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN:
				return isIsDisplayingAsDropDown();
			case WdpDslPackage.ARCHIVE__IS_SHOWING_POSTS_COUNT:
				return isIsShowingPostsCount();
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
			case WdpDslPackage.ARCHIVE__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN:
				setIsDisplayingAsDropDown((Boolean)newValue);
				return;
			case WdpDslPackage.ARCHIVE__IS_SHOWING_POSTS_COUNT:
				setIsShowingPostsCount((Boolean)newValue);
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
			case WdpDslPackage.ARCHIVE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN:
				setIsDisplayingAsDropDown(IS_DISPLAYING_AS_DROP_DOWN_EDEFAULT);
				return;
			case WdpDslPackage.ARCHIVE__IS_SHOWING_POSTS_COUNT:
				setIsShowingPostsCount(IS_SHOWING_POSTS_COUNT_EDEFAULT);
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
			case WdpDslPackage.ARCHIVE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.ARCHIVE__IS_DISPLAYING_AS_DROP_DOWN:
				return isDisplayingAsDropDown != IS_DISPLAYING_AS_DROP_DOWN_EDEFAULT;
			case WdpDslPackage.ARCHIVE__IS_SHOWING_POSTS_COUNT:
				return isShowingPostsCount != IS_SHOWING_POSTS_COUNT_EDEFAULT;
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
		result.append(", isDisplayingAsDropDown: ");
		result.append(isDisplayingAsDropDown);
		result.append(", isShowingPostsCount: ");
		result.append(isShowingPostsCount);
		result.append(')');
		return result.toString();
	}

} //ArchiveImpl
