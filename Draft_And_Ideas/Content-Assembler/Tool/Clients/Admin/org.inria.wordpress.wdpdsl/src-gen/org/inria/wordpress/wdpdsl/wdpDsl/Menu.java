/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getMenuName <em>Menu Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getPages <em>Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getLinks <em>Links</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCurrentMenuSetting <em>Current Menu Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Menu Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Name</em>' attribute.
	 * @see #setMenuName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu_MenuName()
	 * @model
	 * @generated
	 */
	String getMenuName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getMenuName <em>Menu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Name</em>' attribute.
	 * @see #getMenuName()
	 * @generated
	 */
	void setMenuName(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu_Pages()
	 * @model
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu_Categories()
	 * @model
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.inria.wordpress.wdpdsl.wdpDsl.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Current Menu Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Menu Setting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Menu Setting</em>' containment reference.
	 * @see #setCurrentMenuSetting(CurrentMenuSetting)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getMenu_CurrentMenuSetting()
	 * @model containment="true"
	 * @generated
	 */
	CurrentMenuSetting getCurrentMenuSetting();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Menu#getCurrentMenuSetting <em>Current Menu Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Menu Setting</em>' containment reference.
	 * @see #getCurrentMenuSetting()
	 * @generated
	 */
	void setCurrentMenuSetting(CurrentMenuSetting value);

} // Menu
