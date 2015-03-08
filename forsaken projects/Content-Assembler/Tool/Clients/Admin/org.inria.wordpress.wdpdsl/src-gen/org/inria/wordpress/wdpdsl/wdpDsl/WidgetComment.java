/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getNumberOfDisplayedComments <em>Number Of Displayed Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetComment()
 * @model
 * @generated
 */
public interface WidgetComment extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetComment_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Displayed Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Displayed Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Displayed Comments</em>' attribute.
	 * @see #setNumberOfDisplayedComments(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetComment_NumberOfDisplayedComments()
	 * @model
	 * @generated
	 */
	int getNumberOfDisplayedComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment#getNumberOfDisplayedComments <em>Number Of Displayed Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Displayed Comments</em>' attribute.
	 * @see #getNumberOfDisplayedComments()
	 * @generated
	 */
	void setNumberOfDisplayedComments(int value);

} // WidgetComment
