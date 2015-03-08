/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Date Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getPostTitle <em>Post Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentAuthorName <em>Comment Author Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentDate <em>Comment Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostDateAuthor()
 * @model
 * @generated
 */
public interface PostDateAuthor extends EObject {
	/**
	 * Returns the value of the '<em><b>Post Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Title</em>' attribute.
	 * @see #setPostTitle(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostDateAuthor_PostTitle()
	 * @model
	 * @generated
	 */
	String getPostTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getPostTitle <em>Post Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Title</em>' attribute.
	 * @see #getPostTitle()
	 * @generated
	 */
	void setPostTitle(String value);

	/**
	 * Returns the value of the '<em><b>Comment Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Author Name</em>' attribute.
	 * @see #setCommentAuthorName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostDateAuthor_CommentAuthorName()
	 * @model
	 * @generated
	 */
	String getCommentAuthorName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentAuthorName <em>Comment Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Author Name</em>' attribute.
	 * @see #getCommentAuthorName()
	 * @generated
	 */
	void setCommentAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Comment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Date</em>' attribute.
	 * @see #setCommentDate(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostDateAuthor_CommentDate()
	 * @model
	 * @generated
	 */
	String getCommentDate();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor#getCommentDate <em>Comment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Date</em>' attribute.
	 * @see #getCommentDate()
	 * @generated
	 */
	void setCommentDate(String value);

} // PostDateAuthor
