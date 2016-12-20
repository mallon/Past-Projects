/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.interf;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Type Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.DateTimeTypeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getDateTimeTypeValue()
 * @model
 * @generated
 */
public interface DateTimeTypeValue extends ValueType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DateTimeType)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getDateTimeTypeValue_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DateTimeType getValue();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.DateTimeTypeValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DateTimeType value);

} // DateTimeTypeValue
