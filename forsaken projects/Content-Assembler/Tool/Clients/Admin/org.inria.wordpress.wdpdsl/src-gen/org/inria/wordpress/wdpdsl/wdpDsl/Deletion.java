/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getPostsByTitle <em>Posts By Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getPagesByTitle <em>Pages By Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getUsersByLogin <em>Users By Login</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getMediasByTitle <em>Medias By Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getFunctionalitiesByName <em>Functionalities By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getThemesByName <em>Themes By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getCategoriesByName <em>Categories By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getTagsByName <em>Tags By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getMenusByName <em>Menus By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Deletion#getCommentsByPostDateAuthor <em>Comments By Post Date Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion()
 * @model
 * @generated
 */
public interface Deletion extends EObject {
	/**
	 * Returns the value of the '<em><b>Posts By Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts By Title</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts By Title</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_PostsByTitle()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPostsByTitle();

	/**
	 * Returns the value of the '<em><b>Pages By Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages By Title</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages By Title</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_PagesByTitle()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPagesByTitle();

	/**
	 * Returns the value of the '<em><b>Users By Login</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users By Login</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users By Login</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_UsersByLogin()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUsersByLogin();

	/**
	 * Returns the value of the '<em><b>Medias By Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medias By Title</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medias By Title</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_MediasByTitle()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getMediasByTitle();

	/**
	 * Returns the value of the '<em><b>Functionalities By Name</b></em>' attribute list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.functionalities}.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.functionalities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionalities By Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalities By Name</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.functionalities
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_FunctionalitiesByName()
	 * @model unique="false"
	 * @generated
	 */
	EList<functionalities> getFunctionalitiesByName();

	/**
	 * Returns the value of the '<em><b>Themes By Name</b></em>' attribute list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.themes}.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.themes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Themes By Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themes By Name</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.themes
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_ThemesByName()
	 * @model unique="false"
	 * @generated
	 */
	EList<themes> getThemesByName();

	/**
	 * Returns the value of the '<em><b>Categories By Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories By Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories By Name</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_CategoriesByName()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCategoriesByName();

	/**
	 * Returns the value of the '<em><b>Tags By Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags By Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags By Name</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_TagsByName()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTagsByName();

	/**
	 * Returns the value of the '<em><b>Menus By Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus By Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus By Name</em>' attribute list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_MenusByName()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getMenusByName();

	/**
	 * Returns the value of the '<em><b>Comments By Post Date Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments By Post Date Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments By Post Date Author</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDeletion_CommentsByPostDateAuthor()
	 * @model containment="true"
	 * @generated
	 */
	EList<PostDateAuthor> getCommentsByPostDateAuthor();

} // Deletion
