/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Image;
import org.inria.wordpress.wdpdsl.wdpDsl.Url;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.ImageImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends MinimalEObjectImpl.Container implements Image {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltText() <em>Alt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltText()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltText()
	 * @generated
	 * @ordered
	 */
	protected String altText = ALT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.IMAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.IMAGE__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltText() {
		return altText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltText(String newAltText) {
		String oldAltText = altText;
		altText = newAltText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.IMAGE__ALT_TEXT, oldAltText, altText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.IMAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.IMAGE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.IMAGE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.IMAGE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.IMAGE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.IMAGE__URL:
				return basicSetUrl(null, msgs);
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
			case WdpDslPackage.IMAGE__TITLE:
				return getTitle();
			case WdpDslPackage.IMAGE__CAPTION:
				return getCaption();
			case WdpDslPackage.IMAGE__ALT_TEXT:
				return getAltText();
			case WdpDslPackage.IMAGE__DESCRIPTION:
				return getDescription();
			case WdpDslPackage.IMAGE__URL:
				return getUrl();
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
			case WdpDslPackage.IMAGE__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.IMAGE__CAPTION:
				setCaption((String)newValue);
				return;
			case WdpDslPackage.IMAGE__ALT_TEXT:
				setAltText((String)newValue);
				return;
			case WdpDslPackage.IMAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WdpDslPackage.IMAGE__URL:
				setUrl((Url)newValue);
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
			case WdpDslPackage.IMAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.IMAGE__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case WdpDslPackage.IMAGE__ALT_TEXT:
				setAltText(ALT_TEXT_EDEFAULT);
				return;
			case WdpDslPackage.IMAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WdpDslPackage.IMAGE__URL:
				setUrl((Url)null);
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
			case WdpDslPackage.IMAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.IMAGE__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case WdpDslPackage.IMAGE__ALT_TEXT:
				return ALT_TEXT_EDEFAULT == null ? altText != null : !ALT_TEXT_EDEFAULT.equals(altText);
			case WdpDslPackage.IMAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WdpDslPackage.IMAGE__URL:
				return url != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", caption: ");
		result.append(caption);
		result.append(", altText: ");
		result.append(altText);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
