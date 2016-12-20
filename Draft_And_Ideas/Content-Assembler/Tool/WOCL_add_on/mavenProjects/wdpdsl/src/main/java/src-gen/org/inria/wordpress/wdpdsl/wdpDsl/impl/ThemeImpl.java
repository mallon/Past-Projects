/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Plugin;
import org.inria.wordpress.wdpdsl.wdpDsl.Theme;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.themes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl#getThemeType <em>Theme Type</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ThemeImpl#getDefaultPlugin <em>Default Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThemeImpl extends MinimalEObjectImpl.Container implements Theme {
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
	 * The default value of the '{@link #getThemeType() <em>Theme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemeType()
	 * @generated
	 * @ordered
	 */
	protected static final themes THEME_TYPE_EDEFAULT = themes.RESPONSIVE;

	/**
	 * The cached value of the '{@link #getThemeType() <em>Theme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemeType()
	 * @generated
	 * @ordered
	 */
	protected themes themeType = THEME_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultPlugin() <em>Default Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPlugin()
	 * @generated
	 * @ordered
	 */
	protected Plugin defaultPlugin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.THEME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.THEME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public themes getThemeType() {
		return themeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThemeType(themes newThemeType) {
		themes oldThemeType = themeType;
		themeType = newThemeType == null ? THEME_TYPE_EDEFAULT : newThemeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.THEME__THEME_TYPE, oldThemeType, themeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin getDefaultPlugin() {
		return defaultPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultPlugin(Plugin newDefaultPlugin, NotificationChain msgs) {
		Plugin oldDefaultPlugin = defaultPlugin;
		defaultPlugin = newDefaultPlugin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.THEME__DEFAULT_PLUGIN, oldDefaultPlugin, newDefaultPlugin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPlugin(Plugin newDefaultPlugin) {
		if (newDefaultPlugin != defaultPlugin) {
			NotificationChain msgs = null;
			if (defaultPlugin != null)
				msgs = ((InternalEObject)defaultPlugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.THEME__DEFAULT_PLUGIN, null, msgs);
			if (newDefaultPlugin != null)
				msgs = ((InternalEObject)newDefaultPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.THEME__DEFAULT_PLUGIN, null, msgs);
			msgs = basicSetDefaultPlugin(newDefaultPlugin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.THEME__DEFAULT_PLUGIN, newDefaultPlugin, newDefaultPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.THEME__DEFAULT_PLUGIN:
				return basicSetDefaultPlugin(null, msgs);
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
			case WdpDslPackage.THEME__NAME:
				return getName();
			case WdpDslPackage.THEME__THEME_TYPE:
				return getThemeType();
			case WdpDslPackage.THEME__DEFAULT_PLUGIN:
				return getDefaultPlugin();
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
			case WdpDslPackage.THEME__NAME:
				setName((String)newValue);
				return;
			case WdpDslPackage.THEME__THEME_TYPE:
				setThemeType((themes)newValue);
				return;
			case WdpDslPackage.THEME__DEFAULT_PLUGIN:
				setDefaultPlugin((Plugin)newValue);
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
			case WdpDslPackage.THEME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WdpDslPackage.THEME__THEME_TYPE:
				setThemeType(THEME_TYPE_EDEFAULT);
				return;
			case WdpDslPackage.THEME__DEFAULT_PLUGIN:
				setDefaultPlugin((Plugin)null);
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
			case WdpDslPackage.THEME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WdpDslPackage.THEME__THEME_TYPE:
				return themeType != THEME_TYPE_EDEFAULT;
			case WdpDslPackage.THEME__DEFAULT_PLUGIN:
				return defaultPlugin != null;
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
		result.append(", themeType: ");
		result.append(themeType);
		result.append(')');
		return result.toString();
	}

} //ThemeImpl
