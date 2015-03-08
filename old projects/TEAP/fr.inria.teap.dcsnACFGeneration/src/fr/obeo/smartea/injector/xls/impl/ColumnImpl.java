/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import fr.obeo.smartea.injector.xls.Column;
import fr.obeo.smartea.injector.xls.Table;
import fr.obeo.smartea.injector.xls.XlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.ColumnImpl#getC_table <em>Ctable</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.ColumnImpl#isAutoFitWidth <em>Auto Fit Width</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.ColumnImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends ColOrRowElementImpl implements Column {
	/**
	 * The default value of the '{@link #isAutoFitWidth() <em>Auto Fit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoFitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_FIT_WIDTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoFitWidth() <em>Auto Fit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoFitWidth()
	 * @generated
	 * @ordered
	 */
	protected boolean autoFitWidth = AUTO_FIT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getC_table() {
		if (eContainerFeatureID() != XlsPackage.COLUMN__CTABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC_table(Table newC_table, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newC_table, XlsPackage.COLUMN__CTABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_table(Table newC_table) {
		if (newC_table != eInternalContainer() || (eContainerFeatureID() != XlsPackage.COLUMN__CTABLE && newC_table != null)) {
			if (EcoreUtil.isAncestor(this, newC_table))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newC_table != null)
				msgs = ((InternalEObject)newC_table).eInverseAdd(this, XlsPackage.TABLE__TCOLS, Table.class, msgs);
			msgs = basicSetC_table(newC_table, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.COLUMN__CTABLE, newC_table, newC_table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoFitWidth() {
		return autoFitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoFitWidth(boolean newAutoFitWidth) {
		boolean oldAutoFitWidth = autoFitWidth;
		autoFitWidth = newAutoFitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.COLUMN__AUTO_FIT_WIDTH, oldAutoFitWidth, autoFitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.COLUMN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.COLUMN__CTABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetC_table((Table)otherEnd, msgs);
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
			case XlsPackage.COLUMN__CTABLE:
				return basicSetC_table(null, msgs);
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
			case XlsPackage.COLUMN__CTABLE:
				return eInternalContainer().eInverseRemove(this, XlsPackage.TABLE__TCOLS, Table.class, msgs);
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
			case XlsPackage.COLUMN__CTABLE:
				return getC_table();
			case XlsPackage.COLUMN__AUTO_FIT_WIDTH:
				return isAutoFitWidth();
			case XlsPackage.COLUMN__WIDTH:
				return getWidth();
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
			case XlsPackage.COLUMN__CTABLE:
				setC_table((Table)newValue);
				return;
			case XlsPackage.COLUMN__AUTO_FIT_WIDTH:
				setAutoFitWidth((Boolean)newValue);
				return;
			case XlsPackage.COLUMN__WIDTH:
				setWidth((Double)newValue);
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
			case XlsPackage.COLUMN__CTABLE:
				setC_table((Table)null);
				return;
			case XlsPackage.COLUMN__AUTO_FIT_WIDTH:
				setAutoFitWidth(AUTO_FIT_WIDTH_EDEFAULT);
				return;
			case XlsPackage.COLUMN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case XlsPackage.COLUMN__CTABLE:
				return getC_table() != null;
			case XlsPackage.COLUMN__AUTO_FIT_WIDTH:
				return autoFitWidth != AUTO_FIT_WIDTH_EDEFAULT;
			case XlsPackage.COLUMN__WIDTH:
				return width != WIDTH_EDEFAULT;
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
		result.append(" (autoFitWidth: ");
		result.append(autoFitWidth);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
