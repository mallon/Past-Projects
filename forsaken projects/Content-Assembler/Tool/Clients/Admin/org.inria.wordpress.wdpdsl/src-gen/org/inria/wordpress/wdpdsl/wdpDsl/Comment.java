/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getContent <em>Content</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getCommentPostPage <em>Comment Post Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getComment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getComment_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' attribute.
	 * @see #setAuthorName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getComment_AuthorName()
	 * @model
	 * @generated
	 */
	String getAuthorName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getAuthorName <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name</em>' attribute.
	 * @see #getAuthorName()
	 * @generated
	 */
	void setAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Comment Post Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Post Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Post Page</em>' reference.
	 * @see #setCommentPostPage(PostPage)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getComment_CommentPostPage()
	 * @model
	 * @generated
	 */
	PostPage getCommentPostPage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Comment#getCommentPostPage <em>Comment Post Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Post Page</em>' reference.
	 * @see #getCommentPostPage()
	 * @generated
	 */
	void setCommentPostPage(PostPage value);

} // Comment
