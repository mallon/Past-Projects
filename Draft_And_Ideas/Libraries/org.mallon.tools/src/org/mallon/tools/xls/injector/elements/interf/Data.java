/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.interf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Data#getD_cell <em>Dcell</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Data#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Dcell</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Cell#getC_data <em>Cdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dcell</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcell</em>' container reference.
	 * @see #setD_cell(Cell)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getData_D_cell()
	 * @see fr.obeo.smartea.injector.xls.Cell#getC_data
	 * @model opposite="c_data" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Cell getD_cell();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Data#getD_cell <em>Dcell</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcell</em>' container reference.
	 * @see #getD_cell()
	 * @generated
	 */
	void setD_cell(Cell value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.ValueType#getVt_data <em>Vt data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getData_Value()
	 * @see fr.obeo.smartea.injector.xls.ValueType#getVt_data
	 * @model opposite="vt_data" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Data#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

} // Data
