/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getAdminUser <em>Admin User</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getUsers <em>Users</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getPosts <em>Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getPages <em>Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getMediaLibrary <em>Media Library</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getComments <em>Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getTags <em>Tags</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getDeletion <em>Deletion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite()
 * @model
 * @generated
 */
public interface Website extends EObject {
	/**
	 * Returns the value of the '<em><b>Admin User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin User</em>' reference.
	 * @see #setAdminUser(User)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_AdminUser()
	 * @model
	 * @generated
	 */
	User getAdminUser();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getAdminUser <em>Admin User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin User</em>' reference.
	 * @see #getAdminUser()
	 * @generated
	 */
	void setAdminUser(User value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Post}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Posts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(Appearance)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Appearance()
	 * @model containment="true"
	 * @generated
	 */
	Appearance getAppearance();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(Appearance value);

	/**
	 * Returns the value of the '<em><b>Media Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Media}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Library</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_MediaLibrary()
	 * @model containment="true"
	 * @generated
	 */
	EList<Media> getMediaLibrary();

	/**
	 * Returns the value of the '<em><b>Functionalities</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionalities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalities</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Functionalities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Functionality> getFunctionalities();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(Settings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Settings()
	 * @model containment="true"
	 * @generated
	 */
	Settings getSettings();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(Settings value);

	/**
	 * Returns the value of the '<em><b>Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion</em>' containment reference.
	 * @see #setDeletion(Deletion)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWebsite_Deletion()
	 * @model containment="true"
	 * @generated
	 */
	Deletion getDeletion();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Website#getDeletion <em>Deletion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion</em>' containment reference.
	 * @see #getDeletion()
	 * @generated
	 */
	void setDeletion(Deletion value);

} // Website
