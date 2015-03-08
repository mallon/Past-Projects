/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.PostPage;
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPageImpl#getCommonAttributes <em>Common Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostPageImpl extends MinimalEObjectImpl.Container implements PostPage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommonAttributes() <em>Common Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonAttributes()
	 * @generated
	 * @ordered
	 */
	protected PostPage_Impl commonAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.POST_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPage_Impl getCommonAttributes() {
		return commonAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonAttributes(PostPage_Impl newCommonAttributes, NotificationChain msgs) {
		PostPage_Impl oldCommonAttributes = commonAttributes;
		commonAttributes = newCommonAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES, oldCommonAttributes, newCommonAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonAttributes(PostPage_Impl newCommonAttributes) {
		if (newCommonAttributes != commonAttributes) {
			NotificationChain msgs = null;
			if (commonAttributes != null)
				msgs = ((InternalEObject)commonAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES, null, msgs);
			if (newCommonAttributes != null)
				msgs = ((InternalEObject)newCommonAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES, null, msgs);
			msgs = basicSetCommonAttributes(newCommonAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES, newCommonAttributes, newCommonAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES:
				return basicSetCommonAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.POST_PAGE__NAME:
				return getName();
			case WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES:
				return getCommonAttributes();
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
			case WdpDslPackage.POST_PAGE__NAME:
				setName((String)newValue);
				return;
			case WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES:
				setCommonAttributes((PostPage_Impl)newValue);
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
			case WdpDslPackage.POST_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES:
				setCommonAttributes((PostPage_Impl)null);
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
			case WdpDslPackage.POST_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WdpDslPackage.POST_PAGE__COMMON_ATTRIBUTES:
				return commonAttributes != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PostPageImpl
