/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import fr.obeo.smartea.injector.xls.Workbook;
import fr.obeo.smartea.injector.xls.Worksheet;
import fr.obeo.smartea.injector.xls.XlsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workbook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.WorkbookImpl#getWb_worksheets <em>Wb worksheets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkbookImpl extends EObjectImpl implements Workbook {
	/**
	 * The cached value of the '{@link #getWb_worksheets() <em>Wb worksheets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWb_worksheets()
	 * @generated
	 * @ordered
	 */
	protected EList<Worksheet> wb_worksheets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkbookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.WORKBOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Worksheet> getWb_worksheets() {
		if (wb_worksheets == null) {
			wb_worksheets = new EObjectContainmentWithInverseEList<Worksheet>(Worksheet.class, this, XlsPackage.WORKBOOK__WB_WORKSHEETS, XlsPackage.WORKSHEET__WS_WORKBOOK);
		}
		return wb_worksheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.WORKBOOK__WB_WORKSHEETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWb_worksheets()).basicAdd(otherEnd, msgs);
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
			case XlsPackage.WORKBOOK__WB_WORKSHEETS:
				return ((InternalEList<?>)getWb_worksheets()).basicRemove(otherEnd, msgs);
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
			case XlsPackage.WORKBOOK__WB_WORKSHEETS:
				return getWb_worksheets();
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
			case XlsPackage.WORKBOOK__WB_WORKSHEETS:
				getWb_worksheets().clear();
				getWb_worksheets().addAll((Collection<? extends Worksheet>)newValue);
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
			case XlsPackage.WORKBOOK__WB_WORKSHEETS:
				getWb_worksheets().clear();
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
			case XlsPackage.WORKBOOK__WB_WORKSHEETS:
				return wb_worksheets != null && !wb_worksheets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkbookImpl
