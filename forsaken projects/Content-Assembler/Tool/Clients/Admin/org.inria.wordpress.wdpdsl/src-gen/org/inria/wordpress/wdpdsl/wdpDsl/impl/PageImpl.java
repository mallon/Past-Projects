/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Page;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl#getPublicationDateGMT <em>Publication Date GMT</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PageImpl#getPublicationDate <em>Publication Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends PostPageImpl implements Page {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Page parent;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicationDateGMT() <em>Publication Date GMT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDateGMT()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_DATE_GMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationDateGMT() <em>Publication Date GMT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDateGMT()
	 * @generated
	 * @ordered
	 */
	protected String publicationDateGMT = PUBLICATION_DATE_GMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected String publicationDate = PUBLICATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Page)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.PAGE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Page newParent) {
		Page oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PAGE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PAGE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicationDateGMT() {
		return publicationDateGMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDateGMT(String newPublicationDateGMT) {
		String oldPublicationDateGMT = publicationDateGMT;
		publicationDateGMT = newPublicationDateGMT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PAGE__PUBLICATION_DATE_GMT, oldPublicationDateGMT, publicationDateGMT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(String newPublicationDate) {
		String oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PAGE__PUBLICATION_DATE, oldPublicationDate, publicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.PAGE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case WdpDslPackage.PAGE__ORDER:
				return getOrder();
			case WdpDslPackage.PAGE__PUBLICATION_DATE_GMT:
				return getPublicationDateGMT();
			case WdpDslPackage.PAGE__PUBLICATION_DATE:
				return getPublicationDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WdpDslPackage.PAGE__PARENT:
				setParent((Page)newValue);
				return;
			case WdpDslPackage.PAGE__ORDER:
				setOrder((Integer)newValue);
				return;
			case WdpDslPackage.PAGE__PUBLICATION_DATE_GMT:
				setPublicationDateGMT((String)newValue);
				return;
			case WdpDslPackage.PAGE__PUBLICATION_DATE:
				setPublicationDate((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WdpDslPackage.PAGE__PARENT:
				setParent((Page)null);
				return;
			case WdpDslPackage.PAGE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case WdpDslPackage.PAGE__PUBLICATION_DATE_GMT:
				setPublicationDateGMT(PUBLICATION_DATE_GMT_EDEFAULT);
				return;
			case WdpDslPackage.PAGE__PUBLICATION_DATE:
				setPublicationDate(PUBLICATION_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WdpDslPackage.PAGE__PARENT:
				return parent != null;
			case WdpDslPackage.PAGE__ORDER:
				return order != ORDER_EDEFAULT;
			case WdpDslPackage.PAGE__PUBLICATION_DATE_GMT:
				return PUBLICATION_DATE_GMT_EDEFAULT == null ? publicationDateGMT != null : !PUBLICATION_DATE_GMT_EDEFAULT.equals(publicationDateGMT);
			case WdpDslPackage.PAGE__PUBLICATION_DATE:
				return PUBLICATION_DATE_EDEFAULT == null ? publicationDate != null : !PUBLICATION_DATE_EDEFAULT.equals(publicationDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (order: ");
		result.append(order);
		result.append(", publicationDateGMT: ");
		result.append(publicationDateGMT);
		result.append(", publicationDate: ");
		result.append(publicationDate);
		result.append(')');
		return result.toString();
	}

} //PageImpl
