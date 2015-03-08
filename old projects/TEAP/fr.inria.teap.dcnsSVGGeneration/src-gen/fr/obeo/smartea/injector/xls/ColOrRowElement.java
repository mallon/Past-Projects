/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Col Or Row Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.ColOrRowElement#isHidden <em>Hidden</em>}</li>
 *   <li>{@link fr.obeo.smartea.injector.xls.ColOrRowElement#getSpan <em>Span</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColOrRowElement()
 * @model abstract="true"
 * @generated
 */
public interface ColOrRowElement extends TableElement {
	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColOrRowElement_Hidden()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.ColOrRowElement#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(int)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getColOrRowElement_Span()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getSpan();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.ColOrRowElement#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(int value);

} // ColOrRowElement
