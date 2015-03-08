/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writing Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getMailServer <em>Mail Server</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPort <em>Port</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getLoginName <em>Login Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPassword <em>Password</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultPostCategory <em>Default Post Category</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultMailCategory <em>Default Mail Category</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsConvertingEmoticons <em>Is Converting Emoticons</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsCorrectingInvalidXHTML <em>Is Correcting Invalid XHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings()
 * @model
 * @generated
 */
public interface WritingSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Mail Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail Server</em>' attribute.
	 * @see #setMailServer(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_MailServer()
	 * @model
	 * @generated
	 */
	String getMailServer();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getMailServer <em>Mail Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Server</em>' attribute.
	 * @see #getMailServer()
	 * @generated
	 */
	void setMailServer(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Login Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Name</em>' attribute.
	 * @see #setLoginName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_LoginName()
	 * @model
	 * @generated
	 */
	String getLoginName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getLoginName <em>Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Name</em>' attribute.
	 * @see #getLoginName()
	 * @generated
	 */
	void setLoginName(String value);

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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Default Post Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Post Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Post Category</em>' reference.
	 * @see #setDefaultPostCategory(Category)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_DefaultPostCategory()
	 * @model
	 * @generated
	 */
	Category getDefaultPostCategory();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultPostCategory <em>Default Post Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Post Category</em>' reference.
	 * @see #getDefaultPostCategory()
	 * @generated
	 */
	void setDefaultPostCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Default Mail Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Mail Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mail Category</em>' reference.
	 * @see #setDefaultMailCategory(Category)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_DefaultMailCategory()
	 * @model
	 * @generated
	 */
	Category getDefaultMailCategory();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#getDefaultMailCategory <em>Default Mail Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Mail Category</em>' reference.
	 * @see #getDefaultMailCategory()
	 * @generated
	 */
	void setDefaultMailCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Is Converting Emoticons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Converting Emoticons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Converting Emoticons</em>' attribute.
	 * @see #setIsConvertingEmoticons(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_IsConvertingEmoticons()
	 * @model
	 * @generated
	 */
	boolean isIsConvertingEmoticons();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsConvertingEmoticons <em>Is Converting Emoticons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Converting Emoticons</em>' attribute.
	 * @see #isIsConvertingEmoticons()
	 * @generated
	 */
	void setIsConvertingEmoticons(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Correcting Invalid XHTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Correcting Invalid XHTML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Correcting Invalid XHTML</em>' attribute.
	 * @see #setIsCorrectingInvalidXHTML(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getWritingSettings_IsCorrectingInvalidXHTML()
	 * @model
	 * @generated
	 */
	boolean isIsCorrectingInvalidXHTML();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings#isIsCorrectingInvalidXHTML <em>Is Correcting Invalid XHTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Correcting Invalid XHTML</em>' attribute.
	 * @see #isIsCorrectingInvalidXHTML()
	 * @generated
	 */
	void setIsCorrectingInvalidXHTML(boolean value);

} // WritingSettings
