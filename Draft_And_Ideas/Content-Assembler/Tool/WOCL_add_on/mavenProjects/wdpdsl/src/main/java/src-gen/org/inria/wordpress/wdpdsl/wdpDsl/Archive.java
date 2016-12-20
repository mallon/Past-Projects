/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsDisplayingAsDropDown <em>Is Displaying As Drop Down</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsShowingPostsCount <em>Is Showing Posts Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getArchive()
 * @model
 * @generated
 */
public interface Archive extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getArchive_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is Displaying As Drop Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Displaying As Drop Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Displaying As Drop Down</em>' attribute.
	 * @see #setIsDisplayingAsDropDown(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getArchive_IsDisplayingAsDropDown()
	 * @model
	 * @generated
	 */
	boolean isIsDisplayingAsDropDown();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsDisplayingAsDropDown <em>Is Displaying As Drop Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Displaying As Drop Down</em>' attribute.
	 * @see #isIsDisplayingAsDropDown()
	 * @generated
	 */
	void setIsDisplayingAsDropDown(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Showing Posts Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Showing Posts Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Showing Posts Count</em>' attribute.
	 * @see #setIsShowingPostsCount(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getArchive_IsShowingPostsCount()
	 * @model
	 * @generated
	 */
	boolean isIsShowingPostsCount();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Archive#isIsShowingPostsCount <em>Is Showing Posts Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Showing Posts Count</em>' attribute.
	 * @see #isIsShowingPostsCount()
	 * @generated
	 */
	void setIsShowingPostsCount(boolean value);

} // Archive
