/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Url#getPathUrl <em>Path Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUrl()
 * @model
 * @generated
 */
public interface Url extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Url</em>' attribute.
	 * @see #setPathUrl(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getUrl_PathUrl()
	 * @model
	 * @generated
	 */
	String getPathUrl();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Url#getPathUrl <em>Path Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Url</em>' attribute.
	 * @see #getPathUrl()
	 * @generated
	 */
	void setPathUrl(String value);

} // Url
