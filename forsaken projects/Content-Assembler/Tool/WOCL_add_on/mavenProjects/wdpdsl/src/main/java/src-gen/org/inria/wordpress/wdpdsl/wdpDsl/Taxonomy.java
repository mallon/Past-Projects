/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getSlug <em>Slug</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTaxonomy()
 * @model
 * @generated
 */
public interface Taxonomy extends EObject {
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
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTaxonomy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTaxonomy_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slug</em>' attribute.
	 * @see #setSlug(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getTaxonomy_Slug()
	 * @model
	 * @generated
	 */
	String getSlug();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Taxonomy#getSlug <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slug</em>' attribute.
	 * @see #getSlug()
	 * @generated
	 */
	void setSlug(String value);

} // Taxonomy
