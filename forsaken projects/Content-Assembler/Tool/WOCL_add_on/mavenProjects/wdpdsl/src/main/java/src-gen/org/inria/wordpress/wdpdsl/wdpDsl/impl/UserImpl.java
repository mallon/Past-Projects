/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.User;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getUserRole <em>User Role</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getNickName <em>Nick Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getPublicName <em>Public Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getWebSite <em>Web Site</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.UserImpl#getBiography <em>Biography</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserRole() <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRole()
	 * @generated
	 * @ordered
	 */
	protected static final role USER_ROLE_EDEFAULT = role.AUTHOR;

	/**
	 * The cached value of the '{@link #getUserRole() <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRole()
	 * @generated
	 * @ordered
	 */
	protected role userRole = USER_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected static final String NICK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected String nickName = NICK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicName() <em>Public Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicName() <em>Public Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicName()
	 * @generated
	 * @ordered
	 */
	protected String publicName = PUBLIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebSite() <em>Web Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_SITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSite() <em>Web Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSite()
	 * @generated
	 * @ordered
	 */
	protected String webSite = WEB_SITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBiography() <em>Biography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiography()
	 * @generated
	 * @ordered
	 */
	protected static final String BIOGRAPHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBiography() <em>Biography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiography()
	 * @generated
	 * @ordered
	 */
	protected String biography = BIOGRAPHY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public role getUserRole() {
		return userRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRole(role newUserRole) {
		role oldUserRole = userRole;
		userRole = newUserRole == null ? USER_ROLE_EDEFAULT : newUserRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__USER_ROLE, oldUserRole, userRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickName(String newNickName) {
		String oldNickName = nickName;
		nickName = newNickName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__NICK_NAME, oldNickName, nickName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicName() {
		return publicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicName(String newPublicName) {
		String oldPublicName = publicName;
		publicName = newPublicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__PUBLIC_NAME, oldPublicName, publicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebSite() {
		return webSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSite(String newWebSite) {
		String oldWebSite = webSite;
		webSite = newWebSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__WEB_SITE, oldWebSite, webSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBiography() {
		return biography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiography(String newBiography) {
		String oldBiography = biography;
		biography = newBiography;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.USER__BIOGRAPHY, oldBiography, biography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.USER__NAME:
				return getName();
			case WdpDslPackage.USER__USER_NAME:
				return getUserName();
			case WdpDslPackage.USER__PASSWORD:
				return getPassword();
			case WdpDslPackage.USER__USER_ROLE:
				return getUserRole();
			case WdpDslPackage.USER__FIRST_NAME:
				return getFirstName();
			case WdpDslPackage.USER__LAST_NAME:
				return getLastName();
			case WdpDslPackage.USER__NICK_NAME:
				return getNickName();
			case WdpDslPackage.USER__PUBLIC_NAME:
				return getPublicName();
			case WdpDslPackage.USER__EMAIL:
				return getEmail();
			case WdpDslPackage.USER__WEB_SITE:
				return getWebSite();
			case WdpDslPackage.USER__BIOGRAPHY:
				return getBiography();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WdpDslPackage.USER__NAME:
				setName((String)newValue);
				return;
			case WdpDslPackage.USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case WdpDslPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case WdpDslPackage.USER__USER_ROLE:
				setUserRole((role)newValue);
				return;
			case WdpDslPackage.USER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case WdpDslPackage.USER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case WdpDslPackage.USER__NICK_NAME:
				setNickName((String)newValue);
				return;
			case WdpDslPackage.USER__PUBLIC_NAME:
				setPublicName((String)newValue);
				return;
			case WdpDslPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case WdpDslPackage.USER__WEB_SITE:
				setWebSite((String)newValue);
				return;
			case WdpDslPackage.USER__BIOGRAPHY:
				setBiography((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WdpDslPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WdpDslPackage.USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case WdpDslPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case WdpDslPackage.USER__USER_ROLE:
				setUserRole(USER_ROLE_EDEFAULT);
				return;
			case WdpDslPackage.USER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case WdpDslPackage.USER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case WdpDslPackage.USER__NICK_NAME:
				setNickName(NICK_NAME_EDEFAULT);
				return;
			case WdpDslPackage.USER__PUBLIC_NAME:
				setPublicName(PUBLIC_NAME_EDEFAULT);
				return;
			case WdpDslPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case WdpDslPackage.USER__WEB_SITE:
				setWebSite(WEB_SITE_EDEFAULT);
				return;
			case WdpDslPackage.USER__BIOGRAPHY:
				setBiography(BIOGRAPHY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WdpDslPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WdpDslPackage.USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case WdpDslPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case WdpDslPackage.USER__USER_ROLE:
				return userRole != USER_ROLE_EDEFAULT;
			case WdpDslPackage.USER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case WdpDslPackage.USER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case WdpDslPackage.USER__NICK_NAME:
				return NICK_NAME_EDEFAULT == null ? nickName != null : !NICK_NAME_EDEFAULT.equals(nickName);
			case WdpDslPackage.USER__PUBLIC_NAME:
				return PUBLIC_NAME_EDEFAULT == null ? publicName != null : !PUBLIC_NAME_EDEFAULT.equals(publicName);
			case WdpDslPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case WdpDslPackage.USER__WEB_SITE:
				return WEB_SITE_EDEFAULT == null ? webSite != null : !WEB_SITE_EDEFAULT.equals(webSite);
			case WdpDslPackage.USER__BIOGRAPHY:
				return BIOGRAPHY_EDEFAULT == null ? biography != null : !BIOGRAPHY_EDEFAULT.equals(biography);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", userRole: ");
		result.append(userRole);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", nickName: ");
		result.append(nickName);
		result.append(", publicName: ");
		result.append(publicName);
		result.append(", email: ");
		result.append(email);
		result.append(", webSite: ");
		result.append(webSite);
		result.append(", biography: ");
		result.append(biography);
		result.append(')');
		return result.toString();
	}

} //UserImpl
