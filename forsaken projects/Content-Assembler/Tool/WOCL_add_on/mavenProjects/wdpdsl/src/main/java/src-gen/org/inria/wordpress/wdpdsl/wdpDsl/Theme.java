/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getThemeType <em>Theme Type</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getDefaultPlugin <em>Default Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTheme()
 * @model
 * @generated
 */
public interface Theme extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Theme Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.themes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme Type</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.themes
	 * @see #setThemeType(themes)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTheme_ThemeType()
	 * @model
	 * @generated
	 */
	themes getThemeType();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getThemeType <em>Theme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme Type</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.themes
	 * @see #getThemeType()
	 * @generated
	 */
	void setThemeType(themes value);

	/**
	 * Returns the value of the '<em><b>Default Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Plugin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Plugin</em>' containment reference.
	 * @see #setDefaultPlugin(Plugin)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTheme_DefaultPlugin()
	 * @model containment="true"
	 * @generated
	 */
	Plugin getDefaultPlugin();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Theme#getDefaultPlugin <em>Default Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Plugin</em>' containment reference.
	 * @see #getDefaultPlugin()
	 * @generated
	 */
	void setDefaultPlugin(Plugin value);

} // Theme
