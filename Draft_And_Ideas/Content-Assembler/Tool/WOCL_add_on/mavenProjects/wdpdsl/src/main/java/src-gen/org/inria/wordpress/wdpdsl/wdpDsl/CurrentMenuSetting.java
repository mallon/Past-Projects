/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Menu Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsAddingNewTopLevelPages <em>Is Adding New Top Level Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsNavigationMenuLocated <em>Is Navigation Menu Located</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getCurrentMenuSetting()
 * @model
 * @generated
 */
public interface CurrentMenuSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Adding New Top Level Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Adding New Top Level Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Adding New Top Level Pages</em>' attribute.
	 * @see #setIsAddingNewTopLevelPages(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getCurrentMenuSetting_IsAddingNewTopLevelPages()
	 * @model
	 * @generated
	 */
	boolean isIsAddingNewTopLevelPages();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsAddingNewTopLevelPages <em>Is Adding New Top Level Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Adding New Top Level Pages</em>' attribute.
	 * @see #isIsAddingNewTopLevelPages()
	 * @generated
	 */
	void setIsAddingNewTopLevelPages(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Navigation Menu Located</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigation Menu Located</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigation Menu Located</em>' attribute.
	 * @see #setIsNavigationMenuLocated(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getCurrentMenuSetting_IsNavigationMenuLocated()
	 * @model
	 * @generated
	 */
	boolean isIsNavigationMenuLocated();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.CurrentMenuSetting#isIsNavigationMenuLocated <em>Is Navigation Menu Located</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigation Menu Located</em>' attribute.
	 * @see #isIsNavigationMenuLocated()
	 * @generated
	 */
	void setIsNavigationMenuLocated(boolean value);

} // CurrentMenuSetting
