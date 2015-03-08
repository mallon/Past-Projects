/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getCommonAttributes <em>Common Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage()
 * @model
 * @generated
 */
public interface PostPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Common Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Attributes</em>' containment reference.
	 * @see #setCommonAttributes(PostPage_Impl)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_CommonAttributes()
	 * @model containment="true"
	 * @generated
	 */
	PostPage_Impl getCommonAttributes();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage#getCommonAttributes <em>Common Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Attributes</em>' containment reference.
	 * @see #getCommonAttributes()
	 * @generated
	 */
	void setCommonAttributes(PostPage_Impl value);

} // PostPage
