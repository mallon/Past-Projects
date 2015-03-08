/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getDescription <em>Description</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getImage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getImage_Caption()
	 * @model
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Alt Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Text</em>' attribute.
	 * @see #setAltText(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getImage_AltText()
	 * @model
	 * @generated
	 */
	String getAltText();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getAltText <em>Alt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Text</em>' attribute.
	 * @see #getAltText()
	 * @generated
	 */
	void setAltText(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getImage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getImage_Url()
	 * @model containment="true"
	 * @generated
	 */
	Url getUrl();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Image#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Url value);

} // Image
