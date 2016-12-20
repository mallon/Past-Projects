/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mallon.tools.xls.injector.elements.interf.Column;
import org.mallon.tools.xls.injector.elements.interf.Row;
import org.mallon.tools.xls.injector.elements.interf.Table;
import org.mallon.tools.xls.injector.elements.interf.Worksheet;
import org.mallon.tools.xls.injector.elements.interf.XlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.TableImpl#getT_worksheet <em>Tworksheet</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.TableImpl#getT_cols <em>Tcols</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.TableImpl#getT_rows <em>Trows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The cached value of the '{@link #getT_cols() <em>Tcols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_cols()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> t_cols;

	/**
	 * The cached value of the '{@link #getT_rows() <em>Trows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_rows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> t_rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worksheet getT_worksheet() {
		if (eContainerFeatureID() != XlsPackage.TABLE__TWORKSHEET) return null;
		return (Worksheet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT_worksheet(Worksheet newT_worksheet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newT_worksheet, XlsPackage.TABLE__TWORKSHEET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_worksheet(Worksheet newT_worksheet) {
		if (newT_worksheet != eInternalContainer() || (eContainerFeatureID() != XlsPackage.TABLE__TWORKSHEET && newT_worksheet != null)) {
			if (EcoreUtil.isAncestor(this, newT_worksheet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newT_worksheet != null)
				msgs = ((InternalEObject)newT_worksheet).eInverseAdd(this, XlsPackage.WORKSHEET__WS_TABLE, Worksheet.class, msgs);
			msgs = basicSetT_worksheet(newT_worksheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.TABLE__TWORKSHEET, newT_worksheet, newT_worksheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getT_cols() {
		if (t_cols == null) {
			t_cols = new EObjectContainmentWithInverseEList<Column>(Column.class, this, XlsPackage.TABLE__TCOLS, XlsPackage.COLUMN__CTABLE);
		}
		return t_cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getT_rows() {
		if (t_rows == null) {
			t_rows = new EObjectContainmentWithInverseEList<Row>(Row.class, this, XlsPackage.TABLE__TROWS, XlsPackage.ROW__RTABLE);
		}
		return t_rows;
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
			case XlsPackage.TABLE__TWORKSHEET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetT_worksheet((Worksheet)otherEnd, msgs);
			case XlsPackage.TABLE__TCOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getT_cols()).basicAdd(otherEnd, msgs);
			case XlsPackage.TABLE__TROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getT_rows()).basicAdd(otherEnd, msgs);
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
			case XlsPackage.TABLE__TWORKSHEET:
				return basicSetT_worksheet(null, msgs);
			case XlsPackage.TABLE__TCOLS:
				return ((InternalEList<?>)getT_cols()).basicRemove(otherEnd, msgs);
			case XlsPackage.TABLE__TROWS:
				return ((InternalEList<?>)getT_rows()).basicRemove(otherEnd, msgs);
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
			case XlsPackage.TABLE__TWORKSHEET:
				return eInternalContainer().eInverseRemove(this, XlsPackage.WORKSHEET__WS_TABLE, Worksheet.class, msgs);
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
			case XlsPackage.TABLE__TWORKSHEET:
				return getT_worksheet();
			case XlsPackage.TABLE__TCOLS:
				return getT_cols();
			case XlsPackage.TABLE__TROWS:
				return getT_rows();
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
			case XlsPackage.TABLE__TWORKSHEET:
				setT_worksheet((Worksheet)newValue);
				return;
			case XlsPackage.TABLE__TCOLS:
				getT_cols().clear();
				getT_cols().addAll((Collection<? extends Column>)newValue);
				return;
			case XlsPackage.TABLE__TROWS:
				getT_rows().clear();
				getT_rows().addAll((Collection<? extends Row>)newValue);
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
			case XlsPackage.TABLE__TWORKSHEET:
				setT_worksheet((Worksheet)null);
				return;
			case XlsPackage.TABLE__TCOLS:
				getT_cols().clear();
				return;
			case XlsPackage.TABLE__TROWS:
				getT_rows().clear();
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
			case XlsPackage.TABLE__TWORKSHEET:
				return getT_worksheet() != null;
			case XlsPackage.TABLE__TCOLS:
				return t_cols != null && !t_cols.isEmpty();
			case XlsPackage.TABLE__TROWS:
				return t_rows != null && !t_rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
