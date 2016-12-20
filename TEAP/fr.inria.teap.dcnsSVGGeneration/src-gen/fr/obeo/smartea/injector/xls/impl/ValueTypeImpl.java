/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import fr.obeo.smartea.injector.xls.Data;
import fr.obeo.smartea.injector.xls.ValueType;
import fr.obeo.smartea.injector.xls.XlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.ValueTypeImpl#getVt_data <em>Vt data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueTypeImpl extends EObjectImpl implements ValueType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getVt_data() {
		if (eContainerFeatureID() != XlsPackage.VALUE_TYPE__VT_DATA) return null;
		return (Data)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVt_data(Data newVt_data, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVt_data, XlsPackage.VALUE_TYPE__VT_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVt_data(Data newVt_data) {
		if (newVt_data != eInternalContainer() || (eContainerFeatureID() != XlsPackage.VALUE_TYPE__VT_DATA && newVt_data != null)) {
			if (EcoreUtil.isAncestor(this, newVt_data))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVt_data != null)
				msgs = ((InternalEObject)newVt_data).eInverseAdd(this, XlsPackage.DATA__VALUE, Data.class, msgs);
			msgs = basicSetVt_data(newVt_data, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.VALUE_TYPE__VT_DATA, newVt_data, newVt_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.VALUE_TYPE__VT_DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVt_data((Data)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.VALUE_TYPE__VT_DATA:
				return basicSetVt_data(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XlsPackage.VALUE_TYPE__VT_DATA:
				return eInternalContainer().eInverseRemove(this, XlsPackage.DATA__VALUE, Data.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XlsPackage.VALUE_TYPE__VT_DATA:
				return getVt_data();
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
			case XlsPackage.VALUE_TYPE__VT_DATA:
				setVt_data((Data)newValue);
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
			case XlsPackage.VALUE_TYPE__VT_DATA:
				setVt_data((Data)null);
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
			case XlsPackage.VALUE_TYPE__VT_DATA:
				return getVt_data() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueTypeImpl
