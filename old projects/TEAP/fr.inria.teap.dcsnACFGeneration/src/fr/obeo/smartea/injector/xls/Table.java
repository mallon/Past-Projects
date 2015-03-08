/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Table#getT_worksheet <em>Tworksheet</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Table#getT_cols <em>Tcols</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Table#getT_rows <em>Trows</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Tworksheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_table <em>Ws table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tworksheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tworksheet</em>' container reference.
	 * @see #setT_worksheet(Worksheet)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getTable_T_worksheet()
	 * @see fr.obeo.smartea.injector.xls.Worksheet#getWs_table
	 * @model opposite="ws_table" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Worksheet getT_worksheet();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Table#getT_worksheet <em>Tworksheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tworksheet</em>' container reference.
	 * @see #getT_worksheet()
	 * @generated
	 */
	void setT_worksheet(Worksheet value);

	/**
	 * Returns the value of the '<em><b>Tcols</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.smartea.injector.xls.Column}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Column#getC_table <em>Ctable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcols</em>' containment reference list.
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getTable_T_cols()
	 * @see fr.obeo.smartea.injector.xls.Column#getC_table
	 * @model opposite="c_table" containment="true"
	 * @generated
	 */
	EList<Column> getT_cols();

	/**
	 * Returns the value of the '<em><b>Trows</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.smartea.injector.xls.Row}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Row#getR_table <em>Rtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trows</em>' containment reference list.
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getTable_T_rows()
	 * @see fr.obeo.smartea.injector.xls.Row#getR_table
	 * @model opposite="r_table" containment="true"
	 * @generated
	 */
	EList<Row> getT_rows();

} // Table
