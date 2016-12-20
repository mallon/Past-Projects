/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getNumberOfDisplayedPosts <em>Number Of Displayed Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#isIsDisplayingPostDate <em>Is Displaying Post Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPost()
 * @model
 * @generated
 */
public interface WidgetPost extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPost_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Displayed Posts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Displayed Posts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Displayed Posts</em>' attribute.
	 * @see #setNumberOfDisplayedPosts(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPost_NumberOfDisplayedPosts()
	 * @model
	 * @generated
	 */
	int getNumberOfDisplayedPosts();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#getNumberOfDisplayedPosts <em>Number Of Displayed Posts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Displayed Posts</em>' attribute.
	 * @see #getNumberOfDisplayedPosts()
	 * @generated
	 */
	void setNumberOfDisplayedPosts(int value);

	/**
	 * Returns the value of the '<em><b>Is Displaying Post Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Displaying Post Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Displaying Post Date</em>' attribute.
	 * @see #setIsDisplayingPostDate(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWidgetPost_IsDisplayingPostDate()
	 * @model
	 * @generated
	 */
	boolean isIsDisplayingPostDate();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WidgetPost#isIsDisplayingPostDate <em>Is Displaying Post Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Displaying Post Date</em>' attribute.
	 * @see #isIsDisplayingPostDate()
	 * @generated
	 */
	void setIsDisplayingPostDate(boolean value);

} // WidgetPost
