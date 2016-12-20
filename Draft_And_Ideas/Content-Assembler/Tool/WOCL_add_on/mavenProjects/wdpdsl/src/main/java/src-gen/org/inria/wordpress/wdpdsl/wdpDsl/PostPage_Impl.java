/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Page Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getContent <em>Content</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getFeaturedImage <em>Featured Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Impl()
 * @model
 * @generated
 */
public interface PostPage_Impl extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Impl_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.pageStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pageStatus
	 * @see #setStatus(pageStatus)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Impl_Status()
	 * @model
	 * @generated
	 */
	pageStatus getStatus();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.pageStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(pageStatus value);

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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Impl_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Impl_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Featured Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featured Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featured Image</em>' containment reference.
	 * @see #setFeaturedImage(Image)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPostPage_Impl_FeaturedImage()
	 * @model containment="true"
	 * @generated
	 */
	Image getFeaturedImage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl#getFeaturedImage <em>Featured Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featured Image</em>' containment reference.
	 * @see #getFeaturedImage()
	 * @generated
	 */
	void setFeaturedImage(Image value);

} // PostPage_Impl
