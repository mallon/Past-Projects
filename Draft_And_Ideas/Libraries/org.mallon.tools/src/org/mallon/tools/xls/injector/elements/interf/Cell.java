/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.interf;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getC_row <em>Crow</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getFormula <em>Formula</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getHRef <em>HRef</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getMergeAcross <em>Merge Across</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getMergeDown <em>Merge Down</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.Cell#getC_data <em>Cdata</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends TableElement {
	/**
	 * Returns the value of the '<em><b>Crow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Row#getR_cells <em>Rcells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crow</em>' container reference.
	 * @see #setC_row(Row)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_C_row()
	 * @see fr.obeo.smartea.injector.xls.Row#getR_cells
	 * @model opposite="r_cells" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Row getC_row();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getC_row <em>Crow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crow</em>' container reference.
	 * @see #getC_row()
	 * @generated
	 */
	void setC_row(Row value);

	/**
	 * Returns the value of the '<em><b>Array Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Range</em>' attribute.
	 * @see #setArrayRange(String)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_ArrayRange()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getArrayRange();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getArrayRange <em>Array Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Range</em>' attribute.
	 * @see #getArrayRange()
	 * @generated
	 */
	void setArrayRange(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_Formula()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>HRef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HRef</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRef</em>' attribute.
	 * @see #setHRef(String)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_HRef()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getHRef();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getHRef <em>HRef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRef</em>' attribute.
	 * @see #getHRef()
	 * @generated
	 */
	void setHRef(String value);

	/**
	 * Returns the value of the '<em><b>Merge Across</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Across</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Across</em>' attribute.
	 * @see #setMergeAcross(double)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_MergeAcross()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	double getMergeAcross();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getMergeAcross <em>Merge Across</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Across</em>' attribute.
	 * @see #getMergeAcross()
	 * @generated
	 */
	void setMergeAcross(double value);

	/**
	 * Returns the value of the '<em><b>Merge Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Down</em>' attribute.
	 * @see #setMergeDown(double)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_MergeDown()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	double getMergeDown();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getMergeDown <em>Merge Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Down</em>' attribute.
	 * @see #getMergeDown()
	 * @generated
	 */
	void setMergeDown(double value);

	/**
	 * Returns the value of the '<em><b>Cdata</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.smartea.injector.xls.Data#getD_cell <em>Dcell</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdata</em>' containment reference.
	 * @see #setC_data(Data)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getCell_C_data()
	 * @see fr.obeo.smartea.injector.xls.Data#getD_cell
	 * @model opposite="d_cell" containment="true" ordered="false"
	 * @generated
	 */
	Data getC_data();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.Cell#getC_data <em>Cdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdata</em>' containment reference.
	 * @see #getC_data()
	 * @generated
	 */
	void setC_data(Data value);

} // Cell
