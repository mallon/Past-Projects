/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getUserRole <em>User Role</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getNickName <em>Nick Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getPublicName <em>Public Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getEmail <em>Email</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getWebSite <em>Web Site</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getBiography <em>Biography</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>User Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Role</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.role
	 * @see #setUserRole(role)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_UserRole()
	 * @model
	 * @generated
	 */
	role getUserRole();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getUserRole <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Role</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.role
	 * @see #getUserRole()
	 * @generated
	 */
	void setUserRole(role value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nick Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nick Name</em>' attribute.
	 * @see #setNickName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_NickName()
	 * @model
	 * @generated
	 */
	String getNickName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getNickName <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nick Name</em>' attribute.
	 * @see #getNickName()
	 * @generated
	 */
	void setNickName(String value);

	/**
	 * Returns the value of the '<em><b>Public Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Name</em>' attribute.
	 * @see #setPublicName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_PublicName()
	 * @model
	 * @generated
	 */
	String getPublicName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getPublicName <em>Public Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Name</em>' attribute.
	 * @see #getPublicName()
	 * @generated
	 */
	void setPublicName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' attribute.
	 * @see #setWebSite(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_WebSite()
	 * @model
	 * @generated
	 */
	String getWebSite();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getWebSite <em>Web Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' attribute.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(String value);

	/**
	 * Returns the value of the '<em><b>Biography</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biography</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biography</em>' attribute.
	 * @see #setBiography(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUser_Biography()
	 * @model
	 * @generated
	 */
	String getBiography();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.User#getBiography <em>Biography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biography</em>' attribute.
	 * @see #getBiography()
	 * @generated
	 */
	void setBiography(String value);

} // User
