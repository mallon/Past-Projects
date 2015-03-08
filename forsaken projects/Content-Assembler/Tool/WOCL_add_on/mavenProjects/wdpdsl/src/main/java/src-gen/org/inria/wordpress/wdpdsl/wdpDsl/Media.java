/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getUrl <em>Url</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getDate <em>Date</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getUploadedTo <em>Uploaded To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMedia()
 * @model
 * @generated
 */
public interface Media extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMedia_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Url)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMedia_Url()
	 * @model containment="true"
	 * @generated
	 */
	Url getUrl();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMedia_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Uploaded To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uploaded To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploaded To</em>' reference.
	 * @see #setUploadedTo(PostPage)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMedia_UploadedTo()
	 * @model
	 * @generated
	 */
	PostPage getUploadedTo();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Media#getUploadedTo <em>Uploaded To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploaded To</em>' reference.
	 * @see #getUploadedTo()
	 * @generated
	 */
	void setUploadedTo(PostPage value);

} // Media
