/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTaxonomy <em>Taxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTagCloud()
 * @model
 * @generated
 */
public interface TagCloud extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTagCloud_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType
	 * @see #setTaxonomy(taxonomyType)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTagCloud_Taxonomy()
	 * @model
	 * @generated
	 */
	taxonomyType getTaxonomy();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.TagCloud#getTaxonomy <em>Taxonomy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.taxonomyType
	 * @see #getTaxonomy()
	 * @generated
	 */
	void setTaxonomy(taxonomyType value);

} // TagCloud
