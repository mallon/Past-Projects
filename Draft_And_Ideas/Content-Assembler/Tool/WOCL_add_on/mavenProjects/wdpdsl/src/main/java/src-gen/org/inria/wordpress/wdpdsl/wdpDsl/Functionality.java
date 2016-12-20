/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getFunctionalityType <em>Functionality Type</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getSocialNetworks <em>Social Networks</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getDefaultPlugin <em>Default Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getFunctionality_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functionality Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.functionalities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionality Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality Type</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.functionalities
	 * @see #setFunctionalityType(functionalities)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getFunctionality_FunctionalityType()
	 * @model
	 * @generated
	 */
	functionalities getFunctionalityType();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getFunctionalityType <em>Functionality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionality Type</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.functionalities
	 * @see #getFunctionalityType()
	 * @generated
	 */
	void setFunctionalityType(functionalities value);

	/**
	 * Returns the value of the '<em><b>Social Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Networks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Networks</em>' attribute.
	 * @see #setSocialNetworks(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getFunctionality_SocialNetworks()
	 * @model
	 * @generated
	 */
	String getSocialNetworks();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getSocialNetworks <em>Social Networks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Networks</em>' attribute.
	 * @see #getSocialNetworks()
	 * @generated
	 */
	void setSocialNetworks(String value);

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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getFunctionality_DefaultPlugin()
	 * @model containment="true"
	 * @generated
	 */
	Plugin getDefaultPlugin();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Functionality#getDefaultPlugin <em>Default Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Plugin</em>' containment reference.
	 * @see #getDefaultPlugin()
	 * @generated
	 */
	void setDefaultPlugin(Plugin value);

} // Functionality
