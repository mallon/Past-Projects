/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceMenus <em>Appearance Menus</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceHeader <em>Appearance Header</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getAppearance()
 * @model
 * @generated
 */
public interface Appearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getAppearance_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Appearance Menus</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Menus</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getAppearance_AppearanceMenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getAppearanceMenus();

	/**
	 * Returns the value of the '<em><b>Appearance Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Header</em>' containment reference.
	 * @see #setAppearanceHeader(Header)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getAppearance_AppearanceHeader()
	 * @model containment="true"
	 * @generated
	 */
	Header getAppearanceHeader();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Appearance#getAppearanceHeader <em>Appearance Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Header</em>' containment reference.
	 * @see #getAppearanceHeader()
	 * @generated
	 */
	void setAppearanceHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Theme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getAppearance_Theme()
	 * @model containment="true"
	 * @generated
	 */
	EList<Theme> getTheme();

} // Appearance
