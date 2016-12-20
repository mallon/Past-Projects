/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mallon.tools.xls.injector.elements.interf.Cell;
import org.mallon.tools.xls.injector.elements.interf.Data;
import org.mallon.tools.xls.injector.elements.interf.ValueType;
import org.mallon.tools.xls.injector.elements.interf.XlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.DataImpl#getD_cell <em>Dcell</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.DataImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends EObjectImpl implements Data {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueType value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell getD_cell() {
		if (eContainerFeatureID() != XlsPackage.DATA__DCELL) return null;
		return (Cell)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetD_cell(Cell newD_cell, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newD_cell, XlsPackage.DATA__DCELL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_cell(Cell newD_cell) {
		if (newD_cell != eInternalContainer() || (eContainerFeatureID() != XlsPackage.DATA__DCELL && newD_cell != null)) {
			if (EcoreUtil.isAncestor(this, newD_cell))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newD_cell != null)
				msgs = ((InternalEObject)newD_cell).eInverseAdd(this, XlsPackage.CELL__CDATA, Cell.class, msgs);
			msgs = basicSetD_cell(newD_cell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.DATA__DCELL, newD_cell, newD_cell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
		ValueType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XlsPackage.DATA__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, XlsPackage.VALUE_TYPE__VT_DATA, ValueType.class, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, XlsPackage.VALUE_TYPE__VT_DATA, ValueType.class, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.DATA__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.DATA__DCELL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetD_cell((Cell)otherEnd, msgs);
			case XlsPackage.DATA__VALUE:
				if (value != null)
					msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XlsPackage.DATA__VALUE, null, msgs);
				return basicSetValue((ValueType)otherEnd, msgs);
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
			case XlsPackage.DATA__DCELL:
				return basicSetD_cell(null, msgs);
			case XlsPackage.DATA__VALUE:
				return basicSetValue(null, msgs);
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
			case XlsPackage.DATA__DCELL:
				return eInternalContainer().eInverseRemove(this, XlsPackage.CELL__CDATA, Cell.class, msgs);
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
			case XlsPackage.DATA__DCELL:
				return getD_cell();
			case XlsPackage.DATA__VALUE:
				return getValue();
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
			case XlsPackage.DATA__DCELL:
				setD_cell((Cell)newValue);
				return;
			case XlsPackage.DATA__VALUE:
				setValue((ValueType)newValue);
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
			case XlsPackage.DATA__DCELL:
				setD_cell((Cell)null);
				return;
			case XlsPackage.DATA__VALUE:
				setValue((ValueType)null);
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
			case XlsPackage.DATA__DCELL:
				return getD_cell() != null;
			case XlsPackage.DATA__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //DataImpl
