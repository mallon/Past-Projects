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
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.ValueType#getVt_data <em>Vt data</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getValueType()
 * @model abstract="true"
 * @generated
 */
public interface ValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vt data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vt data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vt data</em>' container reference.
	 * @see #setVt_data(Data)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getValueType_Vt_data()
	 * @see fr.obeo.smartea.injector.xls.Data#getValue
	 * @model opposite="value" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Data getVt_data();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.ValueType#getVt_data <em>Vt data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vt data</em>' container reference.
	 * @see #getVt_data()
	 * @generated
	 */
	void setVt_data(Data value);

} // ValueType
