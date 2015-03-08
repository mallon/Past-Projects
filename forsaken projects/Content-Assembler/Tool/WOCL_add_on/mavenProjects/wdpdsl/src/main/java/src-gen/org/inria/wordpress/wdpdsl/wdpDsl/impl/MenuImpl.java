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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.inria.wordpress.wdpdsl.wdpDsl.Category;
import org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting;
import org.inria.wordpress.wdpdsl.wdpDsl.Link;
import org.inria.wordpress.wdpdsl.wdpDsl.Menu;
import org.inria.wordpress.wdpdsl.wdpDsl.Page;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl#getMenuName <em>Menu Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MenuImpl#getCurrentMenuSetting <em>Current Menu Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMenuName() <em>Menu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuName()
	 * @generated
	 * @ordered
	 */
	protected static final String MENU_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMenuName() <em>Menu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuName()
	 * @generated
	 * @ordered
	 */
	protected String menuName = MENU_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getCurrentMenuSetting() <em>Current Menu Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMenuSetting()
	 * @generated
	 * @ordered
	 */
	protected CurrentMenuSetting currentMenuSetting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MENU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuName(String newMenuName) {
		String oldMenuName = menuName;
		menuName = newMenuName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MENU__MENU_NAME, oldMenuName, menuName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectResolvingEList<Page>(Page.class, this, WdpDslPackage.MENU__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<Category>(Category.class, this, WdpDslPackage.MENU__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, WdpDslPackage.MENU__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMenuSetting getCurrentMenuSetting() {
		return currentMenuSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentMenuSetting(CurrentMenuSetting newCurrentMenuSetting, NotificationChain msgs) {
		CurrentMenuSetting oldCurrentMenuSetting = currentMenuSetting;
		currentMenuSetting = newCurrentMenuSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.MENU__CURRENT_MENU_SETTING, oldCurrentMenuSetting, newCurrentMenuSetting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMenuSetting(CurrentMenuSetting newCurrentMenuSetting) {
		if (newCurrentMenuSetting != currentMenuSetting) {
			NotificationChain msgs = null;
			if (currentMenuSetting != null)
				msgs = ((InternalEObject)currentMenuSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.MENU__CURRENT_MENU_SETTING, null, msgs);
			if (newCurrentMenuSetting != null)
				msgs = ((InternalEObject)newCurrentMenuSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.MENU__CURRENT_MENU_SETTING, null, msgs);
			msgs = basicSetCurrentMenuSetting(newCurrentMenuSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MENU__CURRENT_MENU_SETTING, newCurrentMenuSetting, newCurrentMenuSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.MENU__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.MENU__CURRENT_MENU_SETTING:
				return basicSetCurrentMenuSetting(null, msgs);
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
			case WdpDslPackage.MENU__NAME:
				return getName();
			case WdpDslPackage.MENU__MENU_NAME:
				return getMenuName();
			case WdpDslPackage.MENU__PAGES:
				return getPages();
			case WdpDslPackage.MENU__CATEGORIES:
				return getCategories();
			case WdpDslPackage.MENU__LINKS:
				return getLinks();
			case WdpDslPackage.MENU__CURRENT_MENU_SETTING:
				return getCurrentMenuSetting();
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
			case WdpDslPackage.MENU__NAME:
				setName((String)newValue);
				return;
			case WdpDslPackage.MENU__MENU_NAME:
				setMenuName((String)newValue);
				return;
			case WdpDslPackage.MENU__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WdpDslPackage.MENU__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case WdpDslPackage.MENU__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case WdpDslPackage.MENU__CURRENT_MENU_SETTING:
				setCurrentMenuSetting((CurrentMenuSetting)newValue);
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
			case WdpDslPackage.MENU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WdpDslPackage.MENU__MENU_NAME:
				setMenuName(MENU_NAME_EDEFAULT);
				return;
			case WdpDslPackage.MENU__PAGES:
				getPages().clear();
				return;
			case WdpDslPackage.MENU__CATEGORIES:
				getCategories().clear();
				return;
			case WdpDslPackage.MENU__LINKS:
				getLinks().clear();
				return;
			case WdpDslPackage.MENU__CURRENT_MENU_SETTING:
				setCurrentMenuSetting((CurrentMenuSetting)null);
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
			case WdpDslPackage.MENU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WdpDslPackage.MENU__MENU_NAME:
				return MENU_NAME_EDEFAULT == null ? menuName != null : !MENU_NAME_EDEFAULT.equals(menuName);
			case WdpDslPackage.MENU__PAGES:
				return pages != null && !pages.isEmpty();
			case WdpDslPackage.MENU__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case WdpDslPackage.MENU__LINKS:
				return links != null && !links.isEmpty();
			case WdpDslPackage.MENU__CURRENT_MENU_SETTING:
				return currentMenuSetting != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", menuName: ");
		result.append(menuName);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
