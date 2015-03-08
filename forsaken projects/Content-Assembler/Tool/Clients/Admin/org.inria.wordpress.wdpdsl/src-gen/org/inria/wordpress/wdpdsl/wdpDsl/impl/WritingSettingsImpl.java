/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Category;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Writing Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#getMailServer <em>Mail Server</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#getLoginName <em>Login Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#getDefaultPostCategory <em>Default Post Category</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#getDefaultMailCategory <em>Default Mail Category</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#isIsConvertingEmoticons <em>Is Converting Emoticons</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WritingSettingsImpl#isIsCorrectingInvalidXHTML <em>Is Correcting Invalid XHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WritingSettingsImpl extends MinimalEObjectImpl.Container implements WritingSettings {
	/**
	 * The default value of the '{@link #getMailServer() <em>Mail Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailServer()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailServer() <em>Mail Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailServer()
	 * @generated
	 * @ordered
	 */
	protected String mailServer = MAIL_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginName() <em>Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginName() <em>Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginName()
	 * @generated
	 * @ordered
	 */
	protected String loginName = LOGIN_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getDefaultPostCategory() <em>Default Post Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPostCategory()
	 * @generated
	 * @ordered
	 */
	protected Category defaultPostCategory;

	/**
	 * The cached value of the '{@link #getDefaultMailCategory() <em>Default Mail Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMailCategory()
	 * @generated
	 * @ordered
	 */
	protected Category defaultMailCategory;

	/**
	 * The default value of the '{@link #isIsConvertingEmoticons() <em>Is Converting Emoticons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConvertingEmoticons()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONVERTING_EMOTICONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConvertingEmoticons() <em>Is Converting Emoticons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConvertingEmoticons()
	 * @generated
	 * @ordered
	 */
	protected boolean isConvertingEmoticons = IS_CONVERTING_EMOTICONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCorrectingInvalidXHTML() <em>Is Correcting Invalid XHTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCorrectingInvalidXHTML()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CORRECTING_INVALID_XHTML_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCorrectingInvalidXHTML() <em>Is Correcting Invalid XHTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCorrectingInvalidXHTML()
	 * @generated
	 * @ordered
	 */
	protected boolean isCorrectingInvalidXHTML = IS_CORRECTING_INVALID_XHTML_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WritingSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WRITING_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMailServer() {
		return mailServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailServer(String newMailServer) {
		String oldMailServer = mailServer;
		mailServer = newMailServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__MAIL_SERVER, oldMailServer, mailServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginName(String newLoginName) {
		String oldLoginName = loginName;
		loginName = newLoginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__LOGIN_NAME, oldLoginName, loginName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getDefaultPostCategory() {
		if (defaultPostCategory != null && defaultPostCategory.eIsProxy()) {
			InternalEObject oldDefaultPostCategory = (InternalEObject)defaultPostCategory;
			defaultPostCategory = (Category)eResolveProxy(oldDefaultPostCategory);
			if (defaultPostCategory != oldDefaultPostCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.WRITING_SETTINGS__DEFAULT_POST_CATEGORY, oldDefaultPostCategory, defaultPostCategory));
			}
		}
		return defaultPostCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetDefaultPostCategory() {
		return defaultPostCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPostCategory(Category newDefaultPostCategory) {
		Category oldDefaultPostCategory = defaultPostCategory;
		defaultPostCategory = newDefaultPostCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__DEFAULT_POST_CATEGORY, oldDefaultPostCategory, defaultPostCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getDefaultMailCategory() {
		if (defaultMailCategory != null && defaultMailCategory.eIsProxy()) {
			InternalEObject oldDefaultMailCategory = (InternalEObject)defaultMailCategory;
			defaultMailCategory = (Category)eResolveProxy(oldDefaultMailCategory);
			if (defaultMailCategory != oldDefaultMailCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY, oldDefaultMailCategory, defaultMailCategory));
			}
		}
		return defaultMailCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetDefaultMailCategory() {
		return defaultMailCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMailCategory(Category newDefaultMailCategory) {
		Category oldDefaultMailCategory = defaultMailCategory;
		defaultMailCategory = newDefaultMailCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY, oldDefaultMailCategory, defaultMailCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConvertingEmoticons() {
		return isConvertingEmoticons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConvertingEmoticons(boolean newIsConvertingEmoticons) {
		boolean oldIsConvertingEmoticons = isConvertingEmoticons;
		isConvertingEmoticons = newIsConvertingEmoticons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__IS_CONVERTING_EMOTICONS, oldIsConvertingEmoticons, isConvertingEmoticons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCorrectingInvalidXHTML() {
		return isCorrectingInvalidXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCorrectingInvalidXHTML(boolean newIsCorrectingInvalidXHTML) {
		boolean oldIsCorrectingInvalidXHTML = isCorrectingInvalidXHTML;
		isCorrectingInvalidXHTML = newIsCorrectingInvalidXHTML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML, oldIsCorrectingInvalidXHTML, isCorrectingInvalidXHTML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.WRITING_SETTINGS__MAIL_SERVER:
				return getMailServer();
			case WdpDslPackage.WRITING_SETTINGS__PORT:
				return getPort();
			case WdpDslPackage.WRITING_SETTINGS__LOGIN_NAME:
				return getLoginName();
			case WdpDslPackage.WRITING_SETTINGS__PASSWORD:
				return getPassword();
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_POST_CATEGORY:
				if (resolve) return getDefaultPostCategory();
				return basicGetDefaultPostCategory();
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY:
				if (resolve) return getDefaultMailCategory();
				return basicGetDefaultMailCategory();
			case WdpDslPackage.WRITING_SETTINGS__IS_CONVERTING_EMOTICONS:
				return isIsConvertingEmoticons();
			case WdpDslPackage.WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML:
				return isIsCorrectingInvalidXHTML();
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
			case WdpDslPackage.WRITING_SETTINGS__MAIL_SERVER:
				setMailServer((String)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__PORT:
				setPort((Integer)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__LOGIN_NAME:
				setLoginName((String)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__PASSWORD:
				setPassword((String)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_POST_CATEGORY:
				setDefaultPostCategory((Category)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY:
				setDefaultMailCategory((Category)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__IS_CONVERTING_EMOTICONS:
				setIsConvertingEmoticons((Boolean)newValue);
				return;
			case WdpDslPackage.WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML:
				setIsCorrectingInvalidXHTML((Boolean)newValue);
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
			case WdpDslPackage.WRITING_SETTINGS__MAIL_SERVER:
				setMailServer(MAIL_SERVER_EDEFAULT);
				return;
			case WdpDslPackage.WRITING_SETTINGS__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case WdpDslPackage.WRITING_SETTINGS__LOGIN_NAME:
				setLoginName(LOGIN_NAME_EDEFAULT);
				return;
			case WdpDslPackage.WRITING_SETTINGS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_POST_CATEGORY:
				setDefaultPostCategory((Category)null);
				return;
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY:
				setDefaultMailCategory((Category)null);
				return;
			case WdpDslPackage.WRITING_SETTINGS__IS_CONVERTING_EMOTICONS:
				setIsConvertingEmoticons(IS_CONVERTING_EMOTICONS_EDEFAULT);
				return;
			case WdpDslPackage.WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML:
				setIsCorrectingInvalidXHTML(IS_CORRECTING_INVALID_XHTML_EDEFAULT);
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
			case WdpDslPackage.WRITING_SETTINGS__MAIL_SERVER:
				return MAIL_SERVER_EDEFAULT == null ? mailServer != null : !MAIL_SERVER_EDEFAULT.equals(mailServer);
			case WdpDslPackage.WRITING_SETTINGS__PORT:
				return port != PORT_EDEFAULT;
			case WdpDslPackage.WRITING_SETTINGS__LOGIN_NAME:
				return LOGIN_NAME_EDEFAULT == null ? loginName != null : !LOGIN_NAME_EDEFAULT.equals(loginName);
			case WdpDslPackage.WRITING_SETTINGS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_POST_CATEGORY:
				return defaultPostCategory != null;
			case WdpDslPackage.WRITING_SETTINGS__DEFAULT_MAIL_CATEGORY:
				return defaultMailCategory != null;
			case WdpDslPackage.WRITING_SETTINGS__IS_CONVERTING_EMOTICONS:
				return isConvertingEmoticons != IS_CONVERTING_EMOTICONS_EDEFAULT;
			case WdpDslPackage.WRITING_SETTINGS__IS_CORRECTING_INVALID_XHTML:
				return isCorrectingInvalidXHTML != IS_CORRECTING_INVALID_XHTML_EDEFAULT;
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
		result.append(" (mailServer: ");
		result.append(mailServer);
		result.append(", port: ");
		result.append(port);
		result.append(", loginName: ");
		result.append(loginName);
		result.append(", password: ");
		result.append(password);
		result.append(", isConvertingEmoticons: ");
		result.append(isConvertingEmoticons);
		result.append(", isCorrectingInvalidXHTML: ");
		result.append(isCorrectingInvalidXHTML);
		result.append(')');
		return result.toString();
	}

} //WritingSettingsImpl
