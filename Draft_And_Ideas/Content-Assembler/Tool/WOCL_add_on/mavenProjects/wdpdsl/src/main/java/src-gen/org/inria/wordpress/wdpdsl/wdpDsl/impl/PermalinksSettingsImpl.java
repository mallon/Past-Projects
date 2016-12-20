/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.urlForm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permalinks Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl#getPermaUrlForm <em>Perma Url Form</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl#getUrlCategoryBase <em>Url Category Base</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PermalinksSettingsImpl#getUrlTagBase <em>Url Tag Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermalinksSettingsImpl extends MinimalEObjectImpl.Container implements PermalinksSettings {
	/**
	 * The default value of the '{@link #getPermaUrlForm() <em>Perma Url Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermaUrlForm()
	 * @generated
	 * @ordered
	 */
	protected static final urlForm PERMA_URL_FORM_EDEFAULT = urlForm.DEFAULT;

	/**
	 * The cached value of the '{@link #getPermaUrlForm() <em>Perma Url Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermaUrlForm()
	 * @generated
	 * @ordered
	 */
	protected urlForm permaUrlForm = PERMA_URL_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlCategoryBase() <em>Url Category Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlCategoryBase()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_CATEGORY_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlCategoryBase() <em>Url Category Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlCategoryBase()
	 * @generated
	 * @ordered
	 */
	protected String urlCategoryBase = URL_CATEGORY_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlTagBase() <em>Url Tag Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlTagBase()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_TAG_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlTagBase() <em>Url Tag Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlTagBase()
	 * @generated
	 * @ordered
	 */
	protected String urlTagBase = URL_TAG_BASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermalinksSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.PERMALINKS_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public urlForm getPermaUrlForm() {
		return permaUrlForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermaUrlForm(urlForm newPermaUrlForm) {
		urlForm oldPermaUrlForm = permaUrlForm;
		permaUrlForm = newPermaUrlForm == null ? PERMA_URL_FORM_EDEFAULT : newPermaUrlForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PERMALINKS_SETTINGS__PERMA_URL_FORM, oldPermaUrlForm, permaUrlForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlCategoryBase() {
		return urlCategoryBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlCategoryBase(String newUrlCategoryBase) {
		String oldUrlCategoryBase = urlCategoryBase;
		urlCategoryBase = newUrlCategoryBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PERMALINKS_SETTINGS__URL_CATEGORY_BASE, oldUrlCategoryBase, urlCategoryBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlTagBase() {
		return urlTagBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlTagBase(String newUrlTagBase) {
		String oldUrlTagBase = urlTagBase;
		urlTagBase = newUrlTagBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.PERMALINKS_SETTINGS__URL_TAG_BASE, oldUrlTagBase, urlTagBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.PERMALINKS_SETTINGS__PERMA_URL_FORM:
				return getPermaUrlForm();
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_CATEGORY_BASE:
				return getUrlCategoryBase();
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_TAG_BASE:
				return getUrlTagBase();
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
			case WdpDslPackage.PERMALINKS_SETTINGS__PERMA_URL_FORM:
				setPermaUrlForm((urlForm)newValue);
				return;
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_CATEGORY_BASE:
				setUrlCategoryBase((String)newValue);
				return;
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_TAG_BASE:
				setUrlTagBase((String)newValue);
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
			case WdpDslPackage.PERMALINKS_SETTINGS__PERMA_URL_FORM:
				setPermaUrlForm(PERMA_URL_FORM_EDEFAULT);
				return;
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_CATEGORY_BASE:
				setUrlCategoryBase(URL_CATEGORY_BASE_EDEFAULT);
				return;
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_TAG_BASE:
				setUrlTagBase(URL_TAG_BASE_EDEFAULT);
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
			case WdpDslPackage.PERMALINKS_SETTINGS__PERMA_URL_FORM:
				return permaUrlForm != PERMA_URL_FORM_EDEFAULT;
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_CATEGORY_BASE:
				return URL_CATEGORY_BASE_EDEFAULT == null ? urlCategoryBase != null : !URL_CATEGORY_BASE_EDEFAULT.equals(urlCategoryBase);
			case WdpDslPackage.PERMALINKS_SETTINGS__URL_TAG_BASE:
				return URL_TAG_BASE_EDEFAULT == null ? urlTagBase != null : !URL_TAG_BASE_EDEFAULT.equals(urlTagBase);
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
		result.append(" (permaUrlForm: ");
		result.append(permaUrlForm);
		result.append(", urlCategoryBase: ");
		result.append(urlCategoryBase);
		result.append(", urlTagBase: ");
		result.append(urlTagBase);
		result.append(')');
		return result.toString();
	}

} //PermalinksSettingsImpl
