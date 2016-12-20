/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Column#getC_table <em>Ctable</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Column#isAutoFitWidth <em>Auto Fit Width</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Column#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends ColOrRowElement {
	/**
	 * Returns the value of the '<em><b>Ctable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Table#getT_cols <em>Tcols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctable</em>' container reference.
	 * @see #setC_table(Table)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColumn_C_table()
	 * @see fr.obeo.smartea.injector.xls.Table#getT_cols
	 * @model opposite="t_cols" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Table getC_table();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Column#getC_table <em>Ctable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctable</em>' container reference.
	 * @see #getC_table()
	 * @generated
	 */
	void setC_table(Table value);

	/**
	 * Returns the value of the '<em><b>Auto Fit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Fit Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Fit Width</em>' attribute.
	 * @see #setAutoFitWidth(boolean)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColumn_AutoFitWidth()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isAutoFitWidth();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Column#isAutoFitWidth <em>Auto Fit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Fit Width</em>' attribute.
	 * @see #isAutoFitWidth()
	 * @generated
	 */
	void setAutoFitWidth(boolean value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColumn_Width()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Column#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

} // Column
