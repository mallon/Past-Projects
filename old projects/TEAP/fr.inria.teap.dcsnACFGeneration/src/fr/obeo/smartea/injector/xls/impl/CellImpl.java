/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import fr.obeo.smartea.injector.xls.Cell;
import fr.obeo.smartea.injector.xls.Data;
import fr.obeo.smartea.injector.xls.Row;
import fr.obeo.smartea.injector.xls.XlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getC_row <em>Crow</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getHRef <em>HRef</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getMergeAcross <em>Merge Across</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getMergeDown <em>Merge Down</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.impl.CellImpl#getC_data <em>Cdata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellImpl extends TableElementImpl implements Cell {
	/**
	 * The default value of the '{@link #getArrayRange() <em>Array Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayRange()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrayRange() <em>Array Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayRange()
	 * @generated
	 * @ordered
	 */
	protected String arrayRange = ARRAY_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHRef() <em>HRef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRef()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHRef() <em>HRef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRef()
	 * @generated
	 * @ordered
	 */
	protected String hRef = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMergeAcross() <em>Merge Across</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeAcross()
	 * @generated
	 * @ordered
	 */
	protected static final double MERGE_ACROSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMergeAcross() <em>Merge Across</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeAcross()
	 * @generated
	 * @ordered
	 */
	protected double mergeAcross = MERGE_ACROSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMergeDown() <em>Merge Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeDown()
	 * @generated
	 * @ordered
	 */
	protected static final double MERGE_DOWN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMergeDown() <em>Merge Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeDown()
	 * @generated
	 * @ordered
	 */
	protected double mergeDown = MERGE_DOWN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getC_data() <em>Cdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_data()
	 * @generated
	 * @ordered
	 */
	protected Data c_data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlsPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row getC_row() {
		if (eContainerFeatureID() != XlsPackage.CELL__CROW) return null;
		return (Row)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC_row(Row newC_row, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newC_row, XlsPackage.CELL__CROW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_row(Row newC_row) {
		if (newC_row != eInternalContainer() || (eContainerFeatureID() != XlsPackage.CELL__CROW && newC_row != null)) {
			if (EcoreUtil.isAncestor(this, newC_row))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newC_row != null)
				msgs = ((InternalEObject)newC_row).eInverseAdd(this, XlsPackage.ROW__RCELLS, Row.class, msgs);
			msgs = basicSetC_row(newC_row, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__CROW, newC_row, newC_row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayRange() {
		return arrayRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayRange(String newArrayRange) {
		String oldArrayRange = arrayRange;
		arrayRange = newArrayRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__ARRAY_RANGE, oldArrayRange, arrayRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHRef() {
		return hRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHRef(String newHRef) {
		String oldHRef = hRef;
		hRef = newHRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__HREF, oldHRef, hRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMergeAcross() {
		return mergeAcross;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeAcross(double newMergeAcross) {
		double oldMergeAcross = mergeAcross;
		mergeAcross = newMergeAcross;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__MERGE_ACROSS, oldMergeAcross, mergeAcross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMergeDown() {
		return mergeDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeDown(double newMergeDown) {
		double oldMergeDown = mergeDown;
		mergeDown = newMergeDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__MERGE_DOWN, oldMergeDown, mergeDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getC_data() {
		return c_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC_data(Data newC_data, NotificationChain msgs) {
		Data oldC_data = c_data;
		c_data = newC_data;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__CDATA, oldC_data, newC_data);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_data(Data newC_data) {
		if (newC_data != c_data) {
			NotificationChain msgs = null;
			if (c_data != null)
				msgs = ((InternalEObject)c_data).eInverseRemove(this, XlsPackage.DATA__DCELL, Data.class, msgs);
			if (newC_data != null)
				msgs = ((InternalEObject)newC_data).eInverseAdd(this, XlsPackage.DATA__DCELL, Data.class, msgs);
			msgs = basicSetC_data(newC_data, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlsPackage.CELL__CDATA, newC_data, newC_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlsPackage.CELL__CROW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetC_row((Row)otherEnd, msgs);
			case XlsPackage.CELL__CDATA:
				if (c_data != null)
					msgs = ((InternalEObject)c_data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XlsPackage.CELL__CDATA, null, msgs);
				return basicSetC_data((Data)otherEnd, msgs);
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
			case XlsPackage.CELL__CROW:
				return basicSetC_row(null, msgs);
			case XlsPackage.CELL__CDATA:
				return basicSetC_data(null, msgs);
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
			case XlsPackage.CELL__CROW:
				return eInternalContainer().eInverseRemove(this, XlsPackage.ROW__RCELLS, Row.class, msgs);
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
			case XlsPackage.CELL__CROW:
				return getC_row();
			case XlsPackage.CELL__ARRAY_RANGE:
				return getArrayRange();
			case XlsPackage.CELL__FORMULA:
				return getFormula();
			case XlsPackage.CELL__HREF:
				return getHRef();
			case XlsPackage.CELL__MERGE_ACROSS:
				return getMergeAcross();
			case XlsPackage.CELL__MERGE_DOWN:
				return getMergeDown();
			case XlsPackage.CELL__CDATA:
				return getC_data();
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
			case XlsPackage.CELL__CROW:
				setC_row((Row)newValue);
				return;
			case XlsPackage.CELL__ARRAY_RANGE:
				setArrayRange((String)newValue);
				return;
			case XlsPackage.CELL__FORMULA:
				setFormula((String)newValue);
				return;
			case XlsPackage.CELL__HREF:
				setHRef((String)newValue);
				return;
			case XlsPackage.CELL__MERGE_ACROSS:
				setMergeAcross((Double)newValue);
				return;
			case XlsPackage.CELL__MERGE_DOWN:
				setMergeDown((Double)newValue);
				return;
			case XlsPackage.CELL__CDATA:
				setC_data((Data)newValue);
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
			case XlsPackage.CELL__CROW:
				setC_row((Row)null);
				return;
			case XlsPackage.CELL__ARRAY_RANGE:
				setArrayRange(ARRAY_RANGE_EDEFAULT);
				return;
			case XlsPackage.CELL__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case XlsPackage.CELL__HREF:
				setHRef(HREF_EDEFAULT);
				return;
			case XlsPackage.CELL__MERGE_ACROSS:
				setMergeAcross(MERGE_ACROSS_EDEFAULT);
				return;
			case XlsPackage.CELL__MERGE_DOWN:
				setMergeDown(MERGE_DOWN_EDEFAULT);
				return;
			case XlsPackage.CELL__CDATA:
				setC_data((Data)null);
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
			case XlsPackage.CELL__CROW:
				return getC_row() != null;
			case XlsPackage.CELL__ARRAY_RANGE:
				return ARRAY_RANGE_EDEFAULT == null ? arrayRange != null : !ARRAY_RANGE_EDEFAULT.equals(arrayRange);
			case XlsPackage.CELL__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case XlsPackage.CELL__HREF:
				return HREF_EDEFAULT == null ? hRef != null : !HREF_EDEFAULT.equals(hRef);
			case XlsPackage.CELL__MERGE_ACROSS:
				return mergeAcross != MERGE_ACROSS_EDEFAULT;
			case XlsPackage.CELL__MERGE_DOWN:
				return mergeDown != MERGE_DOWN_EDEFAULT;
			case XlsPackage.CELL__CDATA:
				return c_data != null;
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
		result.append(" (arrayRange: ");
		result.append(arrayRange);
		result.append(", formula: ");
		result.append(formula);
		result.append(", hRef: ");
		result.append(hRef);
		result.append(", mergeAcross: ");
		result.append(mergeAcross);
		result.append(", mergeDown: ");
		result.append(mergeDown);
		result.append(')');
		return result.toString();
	}

} //CellImpl
