/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getTags <em>Tags</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends PostPage {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPost_Categories()
	 * @model
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPost_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.postFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.postFormat
	 * @see #setFormat(postFormat)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPost_Format()
	 * @model
	 * @generated
	 */
	postFormat getFormat();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Post#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.postFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(postFormat value);

} // Post
