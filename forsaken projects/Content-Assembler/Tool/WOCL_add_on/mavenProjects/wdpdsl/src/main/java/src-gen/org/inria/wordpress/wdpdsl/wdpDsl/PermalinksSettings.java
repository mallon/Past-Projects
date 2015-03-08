/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permalinks Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getPermaUrlForm <em>Perma Url Form</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlCategoryBase <em>Url Category Base</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlTagBase <em>Url Tag Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPermalinksSettings()
 * @model
 * @generated
 */
public interface PermalinksSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Perma Url Form</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.urlForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perma Url Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perma Url Form</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.urlForm
	 * @see #setPermaUrlForm(urlForm)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPermalinksSettings_PermaUrlForm()
	 * @model
	 * @generated
	 */
	urlForm getPermaUrlForm();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getPermaUrlForm <em>Perma Url Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perma Url Form</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.urlForm
	 * @see #getPermaUrlForm()
	 * @generated
	 */
	void setPermaUrlForm(urlForm value);

	/**
	 * Returns the value of the '<em><b>Url Category Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Category Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Category Base</em>' attribute.
	 * @see #setUrlCategoryBase(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPermalinksSettings_UrlCategoryBase()
	 * @model
	 * @generated
	 */
	String getUrlCategoryBase();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlCategoryBase <em>Url Category Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Category Base</em>' attribute.
	 * @see #getUrlCategoryBase()
	 * @generated
	 */
	void setUrlCategoryBase(String value);

	/**
	 * Returns the value of the '<em><b>Url Tag Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Tag Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Tag Base</em>' attribute.
	 * @see #setUrlTagBase(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPermalinksSettings_UrlTagBase()
	 * @model
	 * @generated
	 */
	String getUrlTagBase();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings#getUrlTagBase <em>Url Tag Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Tag Base</em>' attribute.
	 * @see #getUrlTagBase()
	 * @generated
	 */
	void setUrlTagBase(String value);

} // PermalinksSettings
