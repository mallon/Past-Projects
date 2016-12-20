/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Functionality;
import org.inria.wordpress.wdpdsl.wdpDsl.Plugin;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.functionalities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl#getFunctionalityType <em>Functionality Type</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl#getSocialNetworks <em>Social Networks</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.FunctionalityImpl#getDefaultPlugin <em>Default Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalityImpl extends MinimalEObjectImpl.Container implements Functionality {
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
	 * The default value of the '{@link #getFunctionalityType() <em>Functionality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalityType()
	 * @generated
	 * @ordered
	 */
	protected static final functionalities FUNCTIONALITY_TYPE_EDEFAULT = functionalities.ECOMMERCE;

	/**
	 * The cached value of the '{@link #getFunctionalityType() <em>Functionality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalityType()
	 * @generated
	 * @ordered
	 */
	protected functionalities functionalityType = FUNCTIONALITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialNetworks() <em>Social Networks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialNetworks()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_NETWORKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialNetworks() <em>Social Networks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialNetworks()
	 * @generated
	 * @ordered
	 */
	protected String socialNetworks = SOCIAL_NETWORKS_EDEFAULT;

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
	protected FunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.FUNCTIONALITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.FUNCTIONALITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public functionalities getFunctionalityType() {
		return functionalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalityType(functionalities newFunctionalityType) {
		functionalities oldFunctionalityType = functionalityType;
		functionalityType = newFunctionalityType == null ? FUNCTIONALITY_TYPE_EDEFAULT : newFunctionalityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.FUNCTIONALITY__FUNCTIONALITY_TYPE, oldFunctionalityType, functionalityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSocialNetworks() {
		return socialNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialNetworks(String newSocialNetworks) {
		String oldSocialNetworks = socialNetworks;
		socialNetworks = newSocialNetworks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.FUNCTIONALITY__SOCIAL_NETWORKS, oldSocialNetworks, socialNetworks));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN, oldDefaultPlugin, newDefaultPlugin);
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
				msgs = ((InternalEObject)defaultPlugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN, null, msgs);
			if (newDefaultPlugin != null)
				msgs = ((InternalEObject)newDefaultPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN, null, msgs);
			msgs = basicSetDefaultPlugin(newDefaultPlugin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN, newDefaultPlugin, newDefaultPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN:
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
			case WdpDslPackage.FUNCTIONALITY__NAME:
				return getName();
			case WdpDslPackage.FUNCTIONALITY__FUNCTIONALITY_TYPE:
				return getFunctionalityType();
			case WdpDslPackage.FUNCTIONALITY__SOCIAL_NETWORKS:
				return getSocialNetworks();
			case WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN:
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
			case WdpDslPackage.FUNCTIONALITY__NAME:
				setName((String)newValue);
				return;
			case WdpDslPackage.FUNCTIONALITY__FUNCTIONALITY_TYPE:
				setFunctionalityType((functionalities)newValue);
				return;
			case WdpDslPackage.FUNCTIONALITY__SOCIAL_NETWORKS:
				setSocialNetworks((String)newValue);
				return;
			case WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN:
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
			case WdpDslPackage.FUNCTIONALITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WdpDslPackage.FUNCTIONALITY__FUNCTIONALITY_TYPE:
				setFunctionalityType(FUNCTIONALITY_TYPE_EDEFAULT);
				return;
			case WdpDslPackage.FUNCTIONALITY__SOCIAL_NETWORKS:
				setSocialNetworks(SOCIAL_NETWORKS_EDEFAULT);
				return;
			case WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN:
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
			case WdpDslPackage.FUNCTIONALITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WdpDslPackage.FUNCTIONALITY__FUNCTIONALITY_TYPE:
				return functionalityType != FUNCTIONALITY_TYPE_EDEFAULT;
			case WdpDslPackage.FUNCTIONALITY__SOCIAL_NETWORKS:
				return SOCIAL_NETWORKS_EDEFAULT == null ? socialNetworks != null : !SOCIAL_NETWORKS_EDEFAULT.equals(socialNetworks);
			case WdpDslPackage.FUNCTIONALITY__DEFAULT_PLUGIN:
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
		result.append(", functionalityType: ");
		result.append(functionalityType);
		result.append(", socialNetworks: ");
		result.append(socialNetworks);
		result.append(')');
		return result.toString();
	}

} //FunctionalityImpl
