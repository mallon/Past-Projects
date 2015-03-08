/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Tag#getTagName <em>Tag Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Taxonomy {
	/**
	 * Returns the value of the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Name</em>' attribute.
	 * @see #setTagName(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTag_TagName()
	 * @model
	 * @generated
	 */
	String getTagName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Tag#getTagName <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Name</em>' attribute.
	 * @see #getTagName()
	 * @generated
	 */
	void setTagName(String value);

} // Tag
