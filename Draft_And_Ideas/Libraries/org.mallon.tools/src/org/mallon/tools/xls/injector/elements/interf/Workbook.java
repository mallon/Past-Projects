/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.interf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Workbook#getWb_worksheets <em>Wb worksheets</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getWorkbook()
 * @model
 * @generated
 */
public interface Workbook extends EObject {
	/**
	 * Returns the value of the '<em><b>Wb worksheets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.smartea.injector.xls.Worksheet}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_workbook <em>Ws workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wb worksheets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wb worksheets</em>' containment reference list.
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getWorkbook_Wb_worksheets()
	 * @see fr.obeo.smartea.injector.xls.Worksheet#getWs_workbook
	 * @model opposite="ws_workbook" containment="true"
	 * @generated
	 */
	EList<Worksheet> getWb_worksheets();

} // Workbook
