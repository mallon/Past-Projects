/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worksheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_workbook <em>Ws workbook</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_table <em>Ws table</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Worksheet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getWorksheet()
 * @model
 * @generated
 */
public interface Worksheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Ws workbook</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Workbook#getWb_worksheets <em>Wb worksheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws workbook</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws workbook</em>' container reference.
	 * @see #setWs_workbook(Workbook)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getWorksheet_Ws_workbook()
	 * @see fr.obeo.smartea.injector.xls.Workbook#getWb_worksheets
	 * @model opposite="wb_worksheets" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Workbook getWs_workbook();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_workbook <em>Ws workbook</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws workbook</em>' container reference.
	 * @see #getWs_workbook()
	 * @generated
	 */
	void setWs_workbook(Workbook value);

	/**
	 * Returns the value of the '<em><b>Ws table</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Table#getT_worksheet <em>Tworksheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws table</em>' containment reference.
	 * @see #setWs_table(Table)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getWorksheet_Ws_table()
	 * @see fr.obeo.smartea.injector.xls.Table#getT_worksheet
	 * @model opposite="t_worksheet" containment="true" ordered="false"
	 * @generated
	 */
	Table getWs_table();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_table <em>Ws table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws table</em>' containment reference.
	 * @see #getWs_table()
	 * @generated
	 */
	void setWs_table(Table value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getWorksheet_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Worksheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Worksheet
