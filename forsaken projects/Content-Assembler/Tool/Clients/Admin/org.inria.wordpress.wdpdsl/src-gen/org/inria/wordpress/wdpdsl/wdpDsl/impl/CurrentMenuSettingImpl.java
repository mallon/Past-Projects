/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Menu Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CurrentMenuSettingImpl#isIsAddingNewTopLevelPages <em>Is Adding New Top Level Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CurrentMenuSettingImpl#isIsNavigationMenuLocated <em>Is Navigation Menu Located</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentMenuSettingImpl extends MinimalEObjectImpl.Container implements CurrentMenuSetting {
	/**
	 * The default value of the '{@link #isIsAddingNewTopLevelPages() <em>Is Adding New Top Level Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAddingNewTopLevelPages()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ADDING_NEW_TOP_LEVEL_PAGES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAddingNewTopLevelPages() <em>Is Adding New Top Level Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAddingNewTopLevelPages()
	 * @generated
	 * @ordered
	 */
	protected boolean isAddingNewTopLevelPages = IS_ADDING_NEW_TOP_LEVEL_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNavigationMenuLocated() <em>Is Navigation Menu Located</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigationMenuLocated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAVIGATION_MENU_LOCATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNavigationMenuLocated() <em>Is Navigation Menu Located</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigationMenuLocated()
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigationMenuLocated = IS_NAVIGATION_MENU_LOCATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentMenuSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.CURRENT_MENU_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAddingNewTopLevelPages() {
		return isAddingNewTopLevelPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAddingNewTopLevelPages(boolean newIsAddingNewTopLevelPages) {
		boolean oldIsAddingNewTopLevelPages = isAddingNewTopLevelPages;
		isAddingNewTopLevelPages = newIsAddingNewTopLevelPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES, oldIsAddingNewTopLevelPages, isAddingNewTopLevelPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNavigationMenuLocated() {
		return isNavigationMenuLocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigationMenuLocated(boolean newIsNavigationMenuLocated) {
		boolean oldIsNavigationMenuLocated = isNavigationMenuLocated;
		isNavigationMenuLocated = newIsNavigationMenuLocated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED, oldIsNavigationMenuLocated, isNavigationMenuLocated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES:
				return isIsAddingNewTopLevelPages();
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED:
				return isIsNavigationMenuLocated();
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
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES:
				setIsAddingNewTopLevelPages((Boolean)newValue);
				return;
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED:
				setIsNavigationMenuLocated((Boolean)newValue);
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
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES:
				setIsAddingNewTopLevelPages(IS_ADDING_NEW_TOP_LEVEL_PAGES_EDEFAULT);
				return;
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED:
				setIsNavigationMenuLocated(IS_NAVIGATION_MENU_LOCATED_EDEFAULT);
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
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_ADDING_NEW_TOP_LEVEL_PAGES:
				return isAddingNewTopLevelPages != IS_ADDING_NEW_TOP_LEVEL_PAGES_EDEFAULT;
			case WdpDslPackage.CURRENT_MENU_SETTING__IS_NAVIGATION_MENU_LOCATED:
				return isNavigationMenuLocated != IS_NAVIGATION_MENU_LOCATED_EDEFAULT;
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
		result.append(" (isAddingNewTopLevelPages: ");
		result.append(isAddingNewTopLevelPages);
		result.append(", isNavigationMenuLocated: ");
		result.append(isNavigationMenuLocated);
		result.append(')');
		return result.toString();
	}

} //CurrentMenuSettingImpl
