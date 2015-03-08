/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import fr.obeo.smartea.injector.xls.Cell;
import fr.obeo.smartea.injector.xls.Row;
import fr.obeo.smartea.injector.xls.Table;
import fr.obeo.smartea.injector.xls.XlsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.RowImpl#getR_table <em>Rtable</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.RowImpl#getR_cells <em>Rcells</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.RowImpl#isAutoFitHeight <em>Auto Fit Height</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.RowImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RowImpl extends ColOrRowElementImpl implements Row {
	/**
	 * The cached value of the '{@link #getR_cells() <em>Rcells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR_cells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> r_cells;

	/**
	 * The default value of the '{@link #isAutoFitHeight() <em>Auto Fit Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoFitHeight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_FIT_HEIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoFitHeight() <em>Auto Fit Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoFitHeight()
	 * @generated
	 * @ordered
	 */
	protected boolean autoFitHeight = AUTO_FIT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getR_table() {
		if (eContainerFeatureID() != XlsPackage.ROW__RTABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR_table(Table newR_table, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newR_table, XlsPackage.ROW__RTABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR_table(Table newR_table) {
		if (newR_table != eInternalContainer() || (eContainerFeatureID() != XlsPackage.ROW__RTABLE && newR_table != null)) {
			if (EcoreUtil.isAncestor(this, newR_table))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newR_table != null)
				msgs = ((InternalEObject)newR_table).eInverseAdd(this, XlsPackage.TABLE__TROWS, Table.class, msgs);
			msgs = basicSetR_table(newR_table, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.ROW__RTABLE, newR_table, newR_table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getR_cells() {
		if (r_cells == null) {
			r_cells = new EObjectContainmentWithInverseEList<Cell>(Cell.class, this, XlsPackage.ROW__RCELLS, XlsPackage.CELL__CROW);
		}
		return r_cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoFitHeight() {
		return autoFitHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoFitHeight(boolean newAutoFitHeight) {
		boolean oldAutoFitHeight = autoFitHeight;
		autoFitHeight = newAutoFitHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.ROW__AUTO_FIT_HEIGHT, oldAutoFitHeight, autoFitHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.ROW__HEIGHT, oldHeight, height));
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
			case XlsPackage.ROW__RTABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetR_table((Table)otherEnd, msgs);
			case XlsPackage.ROW__RCELLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getR_cells()).basicAdd(otherEnd, msgs);
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
			case XlsPackage.ROW__RTABLE:
				return basicSetR_table(null, msgs);
			case XlsPackage.ROW__RCELLS:
				return ((InternalEList<?>)getR_cells()).basicRemove(otherEnd, msgs);
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
			case XlsPackage.ROW__RTABLE:
				return eInternalContainer().eInverseRemove(this, XlsPackage.TABLE__TROWS, Table.class, msgs);
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
			case XlsPackage.ROW__RTABLE:
				return getR_table();
			case XlsPackage.ROW__RCELLS:
				return getR_cells();
			case XlsPackage.ROW__AUTO_FIT_HEIGHT:
				return isAutoFitHeight();
			case XlsPackage.ROW__HEIGHT:
				return getHeight();
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
			case XlsPackage.ROW__RTABLE:
				setR_table((Table)newValue);
				return;
			case XlsPackage.ROW__RCELLS:
				getR_cells().clear();
				getR_cells().addAll((Collection<? extends Cell>)newValue);
				return;
			case XlsPackage.ROW__AUTO_FIT_HEIGHT:
				setAutoFitHeight((Boolean)newValue);
				return;
			case XlsPackage.ROW__HEIGHT:
				setHeight((Double)newValue);
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
			case XlsPackage.ROW__RTABLE:
				setR_table((Table)null);
				return;
			case XlsPackage.ROW__RCELLS:
				getR_cells().clear();
				return;
			case XlsPackage.ROW__AUTO_FIT_HEIGHT:
				setAutoFitHeight(AUTO_FIT_HEIGHT_EDEFAULT);
				return;
			case XlsPackage.ROW__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case XlsPackage.ROW__RTABLE:
				return getR_table() != null;
			case XlsPackage.ROW__RCELLS:
				return r_cells != null && !r_cells.isEmpty();
			case XlsPackage.ROW__AUTO_FIT_HEIGHT:
				return autoFitHeight != AUTO_FIT_HEIGHT_EDEFAULT;
			case XlsPackage.ROW__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
		result.append(" (autoFitHeight: ");
		result.append(autoFitHeight);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //RowImpl
