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

import org.inria.wordpress.wdpdsl.wdpDsl.Appearance;
import org.inria.wordpress.wdpdsl.wdpDsl.Header;
import org.inria.wordpress.wdpdsl.wdpDsl.Menu;
import org.inria.wordpress.wdpdsl.wdpDsl.Theme;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl#getAppearanceMenus <em>Appearance Menus</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl#getAppearanceHeader <em>Appearance Header</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.AppearanceImpl#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppearanceImpl extends MinimalEObjectImpl.Container implements Appearance {
	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * The cached value of the '{@link #getAppearanceMenus() <em>Appearance Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> appearanceMenus;

	/**
	 * The cached value of the '{@link #getAppearanceHeader() <em>Appearance Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceHeader()
	 * @generated
	 * @ordered
	 */
	protected Header appearanceHeader;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected EList<Theme> theme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.APPEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<Widget>(Widget.class, this, WdpDslPackage.APPEARANCE__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getAppearanceMenus() {
		if (appearanceMenus == null) {
			appearanceMenus = new EObjectContainmentEList<Menu>(Menu.class, this, WdpDslPackage.APPEARANCE__APPEARANCE_MENUS);
		}
		return appearanceMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getAppearanceHeader() {
		return appearanceHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearanceHeader(Header newAppearanceHeader, NotificationChain msgs) {
		Header oldAppearanceHeader = appearanceHeader;
		appearanceHeader = newAppearanceHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.APPEARANCE__APPEARANCE_HEADER, oldAppearanceHeader, newAppearanceHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceHeader(Header newAppearanceHeader) {
		if (newAppearanceHeader != appearanceHeader) {
			NotificationChain msgs = null;
			if (appearanceHeader != null)
				msgs = ((InternalEObject)appearanceHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.APPEARANCE__APPEARANCE_HEADER, null, msgs);
			if (newAppearanceHeader != null)
				msgs = ((InternalEObject)newAppearanceHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.APPEARANCE__APPEARANCE_HEADER, null, msgs);
			msgs = basicSetAppearanceHeader(newAppearanceHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.APPEARANCE__APPEARANCE_HEADER, newAppearanceHeader, newAppearanceHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Theme> getTheme() {
		if (theme == null) {
			theme = new EObjectContainmentEList<Theme>(Theme.class, this, WdpDslPackage.APPEARANCE__THEME);
		}
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.APPEARANCE__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.APPEARANCE__APPEARANCE_MENUS:
				return ((InternalEList<?>)getAppearanceMenus()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.APPEARANCE__APPEARANCE_HEADER:
				return basicSetAppearanceHeader(null, msgs);
			case WdpDslPackage.APPEARANCE__THEME:
				return ((InternalEList<?>)getTheme()).basicRemove(otherEnd, msgs);
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
			case WdpDslPackage.APPEARANCE__WIDGETS:
				return getWidgets();
			case WdpDslPackage.APPEARANCE__APPEARANCE_MENUS:
				return getAppearanceMenus();
			case WdpDslPackage.APPEARANCE__APPEARANCE_HEADER:
				return getAppearanceHeader();
			case WdpDslPackage.APPEARANCE__THEME:
				return getTheme();
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
			case WdpDslPackage.APPEARANCE__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case WdpDslPackage.APPEARANCE__APPEARANCE_MENUS:
				getAppearanceMenus().clear();
				getAppearanceMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WdpDslPackage.APPEARANCE__APPEARANCE_HEADER:
				setAppearanceHeader((Header)newValue);
				return;
			case WdpDslPackage.APPEARANCE__THEME:
				getTheme().clear();
				getTheme().addAll((Collection<? extends Theme>)newValue);
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
			case WdpDslPackage.APPEARANCE__WIDGETS:
				getWidgets().clear();
				return;
			case WdpDslPackage.APPEARANCE__APPEARANCE_MENUS:
				getAppearanceMenus().clear();
				return;
			case WdpDslPackage.APPEARANCE__APPEARANCE_HEADER:
				setAppearanceHeader((Header)null);
				return;
			case WdpDslPackage.APPEARANCE__THEME:
				getTheme().clear();
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
			case WdpDslPackage.APPEARANCE__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case WdpDslPackage.APPEARANCE__APPEARANCE_MENUS:
				return appearanceMenus != null && !appearanceMenus.isEmpty();
			case WdpDslPackage.APPEARANCE__APPEARANCE_HEADER:
				return appearanceHeader != null;
			case WdpDslPackage.APPEARANCE__THEME:
				return theme != null && !theme.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppearanceImpl
