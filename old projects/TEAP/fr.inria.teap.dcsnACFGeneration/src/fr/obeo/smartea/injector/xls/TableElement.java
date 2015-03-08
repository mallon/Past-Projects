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
 * A representation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.smartea.injector.xls.TableElement#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.smartea.injector.xls.XlsPackage#getTableElement()
 * @model abstract="true"
 * @generated
 */
public interface TableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#getTableElement_Index()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link fr.obeo.smartea.injector.xls.TableElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // TableElement
