/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getParent <em>Parent</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getOrder <em>Order</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDateGMT <em>Publication Date GMT</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDate <em>Publication Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends PostPage {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Page)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPage_Parent()
	 * @model
	 * @generated
	 */
	Page getParent();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Page value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPage_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Publication Date GMT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date GMT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date GMT</em>' attribute.
	 * @see #setPublicationDateGMT(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPage_PublicationDateGMT()
	 * @model
	 * @generated
	 */
	String getPublicationDateGMT();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDateGMT <em>Publication Date GMT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date GMT</em>' attribute.
	 * @see #getPublicationDateGMT()
	 * @generated
	 */
	void setPublicationDateGMT(String value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' attribute.
	 * @see #setPublicationDate(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getPage_PublicationDate()
	 * @model
	 * @generated
	 */
	String getPublicationDate();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Page#getPublicationDate <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' attribute.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(String value);

} // Page
