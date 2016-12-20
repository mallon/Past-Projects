/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import fr.obeo.smartea.injector.xls.Table;
import fr.obeo.smartea.injector.xls.Workbook;
import fr.obeo.smartea.injector.xls.Worksheet;
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
 * An implementation of the model object '<em><b>Worksheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.WorksheetImpl#getWs_workbook <em>Ws workbook</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.WorksheetImpl#getWs_table <em>Ws table</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.WorksheetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorksheetImpl extends EObjectImpl implements Worksheet {
	/**
	 * The cached value of the '{@link #getWs_table() <em>Ws table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWs_table()
	 * @generated
	 * @ordered
	 */
	protected Table ws_table;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorksheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.WORKSHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workbook getWs_workbook() {
		if (eContainerFeatureID() != XlsPackage.WORKSHEET__WS_WORKBOOK) return null;
		return (Workbook)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWs_workbook(Workbook newWs_workbook, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWs_workbook, XlsPackage.WORKSHEET__WS_WORKBOOK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWs_workbook(Workbook newWs_workbook) {
		if (newWs_workbook != eInternalContainer() || (eContainerFeatureID() != XlsPackage.WORKSHEET__WS_WORKBOOK && newWs_workbook != null)) {
			if (EcoreUtil.isAncestor(this, newWs_workbook))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWs_workbook != null)
				msgs = ((InternalEObject)newWs_workbook).eInverseAdd(this, XlsPackage.WORKBOOK__WB_WORKSHEETS, Workbook.class, msgs);
			msgs = basicSetWs_workbook(newWs_workbook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.WORKSHEET__WS_WORKBOOK, newWs_workbook, newWs_workbook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getWs_table() {
		return ws_table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWs_table(Table newWs_table, NotificationChain msgs) {
		Table oldWs_table = ws_table;
		ws_table = newWs_table;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XlsPackage.WORKSHEET__WS_TABLE, oldWs_table, newWs_table);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWs_table(Table newWs_table) {
		if (newWs_table != ws_table) {
			NotificationChain msgs = null;
			if (ws_table != null)
				msgs = ((InternalEObject)ws_table).eInverseRemove(this, XlsPackage.TABLE__TWORKSHEET, Table.class, msgs);
			if (newWs_table != null)
				msgs = ((InternalEObject)newWs_table).eInverseAdd(this, XlsPackage.TABLE__TWORKSHEET, Table.class, msgs);
			msgs = basicSetWs_table(newWs_table, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.WORKSHEET__WS_TABLE, newWs_table, newWs_table));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.WORKSHEET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWs_workbook((Workbook)otherEnd, msgs);
			case XlsPackage.WORKSHEET__WS_TABLE:
				if (ws_table != null)
					msgs = ((InternalEObject)ws_table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XlsPackage.WORKSHEET__WS_TABLE, null, msgs);
				return basicSetWs_table((Table)otherEnd, msgs);
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
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				return basicSetWs_workbook(null, msgs);
			case XlsPackage.WORKSHEET__WS_TABLE:
				return basicSetWs_table(null, msgs);
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
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				return eInternalContainer().eInverseRemove(this, XlsPackage.WORKBOOK__WB_WORKSHEETS, Workbook.class, msgs);
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
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				return getWs_workbook();
			case XlsPackage.WORKSHEET__WS_TABLE:
				return getWs_table();
			case XlsPackage.WORKSHEET__NAME:
				return getName();
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
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				setWs_workbook((Workbook)newValue);
				return;
			case XlsPackage.WORKSHEET__WS_TABLE:
				setWs_table((Table)newValue);
				return;
			case XlsPackage.WORKSHEET__NAME:
				setName((String)newValue);
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
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				setWs_workbook((Workbook)null);
				return;
			case XlsPackage.WORKSHEET__WS_TABLE:
				setWs_table((Table)null);
				return;
			case XlsPackage.WORKSHEET__NAME:
				setName(NAME_EDEFAULT);
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
			case XlsPackage.WORKSHEET__WS_WORKBOOK:
				return getWs_workbook() != null;
			case XlsPackage.WORKSHEET__WS_TABLE:
				return ws_table != null;
			case XlsPackage.WORKSHEET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //WorksheetImpl
