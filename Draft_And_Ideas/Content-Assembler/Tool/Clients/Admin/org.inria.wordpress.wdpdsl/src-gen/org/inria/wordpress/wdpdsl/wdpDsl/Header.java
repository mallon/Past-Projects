/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#isRandomImage <em>Random Image</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#getUploadImage <em>Upload Image</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#isIsShowingHeaderText <em>Is Showing Header Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Random Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Image</em>' attribute.
	 * @see #setRandomImage(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getHeader_RandomImage()
	 * @model
	 * @generated
	 */
	boolean isRandomImage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#isRandomImage <em>Random Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Image</em>' attribute.
	 * @see #isRandomImage()
	 * @generated
	 */
	void setRandomImage(boolean value);

	/**
	 * Returns the value of the '<em><b>Upload Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upload Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Image</em>' containment reference.
	 * @see #setUploadImage(Url)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getHeader_UploadImage()
	 * @model containment="true"
	 * @generated
	 */
	Url getUploadImage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#getUploadImage <em>Upload Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload Image</em>' containment reference.
	 * @see #getUploadImage()
	 * @generated
	 */
	void setUploadImage(Url value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getHeader_TextColor()
	 * @model
	 * @generated
	 */
	String getTextColor();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Is Showing Header Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Showing Header Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Showing Header Text</em>' attribute.
	 * @see #setIsShowingHeaderText(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getHeader_IsShowingHeaderText()
	 * @model
	 * @generated
	 */
	boolean isIsShowingHeaderText();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Header#isIsShowingHeaderText <em>Is Showing Header Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Showing Header Text</em>' attribute.
	 * @see #isIsShowingHeaderText()
	 * @generated
	 */
	void setIsShowingHeaderText(boolean value);

} // Header
