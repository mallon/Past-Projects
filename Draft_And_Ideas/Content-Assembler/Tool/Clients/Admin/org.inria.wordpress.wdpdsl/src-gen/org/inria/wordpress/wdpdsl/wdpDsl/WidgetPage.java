/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getWidgetPagesSorter <em>Widget Pages Sorter</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getIdPageExcluded <em>Id Page Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPage()
 * @model
 * @generated
 */
public interface WidgetPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Widget Pages Sorter</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Pages Sorter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Pages Sorter</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter
	 * @see #setWidgetPagesSorter(pagesSorter)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPage_WidgetPagesSorter()
	 * @model
	 * @generated
	 */
	pagesSorter getWidgetPagesSorter();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getWidgetPagesSorter <em>Widget Pages Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget Pages Sorter</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter
	 * @see #getWidgetPagesSorter()
	 * @generated
	 */
	void setWidgetPagesSorter(pagesSorter value);

	/**
	 * Returns the value of the '<em><b>Id Page Excluded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Page Excluded</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Page Excluded</em>' reference.
	 * @see #setIdPageExcluded(Page)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPage_IdPageExcluded()
	 * @model
	 * @generated
	 */
	Page getIdPageExcluded();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage#getIdPageExcluded <em>Id Page Excluded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Page Excluded</em>' reference.
	 * @see #getIdPageExcluded()
	 * @generated
	 */
	void setIdPageExcluded(Page value);

} // WidgetPage
