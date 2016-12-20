/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.interf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Row#getR_table <em>Rtable</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Row#getR_cells <em>Rcells</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Row#isAutoFitHeight <em>Auto Fit Height</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Row#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends ColOrRowElement {
	/**
	 * Returns the value of the '<em><b>Rtable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Table#getT_rows <em>Trows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtable</em>' container reference.
	 * @see #setR_table(Table)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getRow_R_table()
	 * @see fr.obeo.smartea.injector.xls.Table#getT_rows
	 * @model opposite="t_rows" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Table getR_table();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Row#getR_table <em>Rtable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtable</em>' container reference.
	 * @see #getR_table()
	 * @generated
	 */
	void setR_table(Table value);

	/**
	 * Returns the value of the '<em><b>Rcells</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.smartea.injector.xls.Cell}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Cell#getC_row <em>Crow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcells</em>' containment reference list.
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getRow_R_cells()
	 * @see fr.obeo.smartea.injector.xls.Cell#getC_row
	 * @model opposite="c_row" containment="true"
	 * @generated
	 */
	EList<Cell> getR_cells();

	/**
	 * Returns the value of the '<em><b>Auto Fit Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Fit Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Fit Height</em>' attribute.
	 * @see #setAutoFitHeight(boolean)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getRow_AutoFitHeight()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isAutoFitHeight();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Row#isAutoFitHeight <em>Auto Fit Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Fit Height</em>' attribute.
	 * @see #isAutoFitHeight()
	 * @generated
	 */
	void setAutoFitHeight(boolean value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getRow_Height()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Row#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // Row
