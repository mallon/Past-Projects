/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Header;
import org.inria.wordpress.wdpdsl.wdpDsl.Url;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl#isRandomImage <em>Random Image</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl#getUploadImage <em>Upload Image</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.HeaderImpl#isIsShowingHeaderText <em>Is Showing Header Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header {
	/**
	 * The default value of the '{@link #isRandomImage() <em>Random Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomImage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RANDOM_IMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRandomImage() <em>Random Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomImage()
	 * @generated
	 * @ordered
	 */
	protected boolean randomImage = RANDOM_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUploadImage() <em>Upload Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadImage()
	 * @generated
	 * @ordered
	 */
	protected Url uploadImage;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsShowingHeaderText() <em>Is Showing Header Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingHeaderText()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHOWING_HEADER_TEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShowingHeaderText() <em>Is Showing Header Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingHeaderText()
	 * @generated
	 * @ordered
	 */
	protected boolean isShowingHeaderText = IS_SHOWING_HEADER_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRandomImage() {
		return randomImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomImage(boolean newRandomImage) {
		boolean oldRandomImage = randomImage;
		randomImage = newRandomImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.HEADER__RANDOM_IMAGE, oldRandomImage, randomImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getUploadImage() {
		return uploadImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUploadImage(Url newUploadImage, NotificationChain msgs) {
		Url oldUploadImage = uploadImage;
		uploadImage = newUploadImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.HEADER__UPLOAD_IMAGE, oldUploadImage, newUploadImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploadImage(Url newUploadImage) {
		if (newUploadImage != uploadImage) {
			NotificationChain msgs = null;
			if (uploadImage != null)
				msgs = ((InternalEObject)uploadImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.HEADER__UPLOAD_IMAGE, null, msgs);
			if (newUploadImage != null)
				msgs = ((InternalEObject)newUploadImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.HEADER__UPLOAD_IMAGE, null, msgs);
			msgs = basicSetUploadImage(newUploadImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.HEADER__UPLOAD_IMAGE, newUploadImage, newUploadImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.HEADER__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShowingHeaderText() {
		return isShowingHeaderText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShowingHeaderText(boolean newIsShowingHeaderText) {
		boolean oldIsShowingHeaderText = isShowingHeaderText;
		isShowingHeaderText = newIsShowingHeaderText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.HEADER__IS_SHOWING_HEADER_TEXT, oldIsShowingHeaderText, isShowingHeaderText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.HEADER__UPLOAD_IMAGE:
				return basicSetUploadImage(null, msgs);
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
			case WdpDslPackage.HEADER__RANDOM_IMAGE:
				return isRandomImage();
			case WdpDslPackage.HEADER__UPLOAD_IMAGE:
				return getUploadImage();
			case WdpDslPackage.HEADER__TEXT_COLOR:
				return getTextColor();
			case WdpDslPackage.HEADER__IS_SHOWING_HEADER_TEXT:
				return isIsShowingHeaderText();
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
			case WdpDslPackage.HEADER__RANDOM_IMAGE:
				setRandomImage((Boolean)newValue);
				return;
			case WdpDslPackage.HEADER__UPLOAD_IMAGE:
				setUploadImage((Url)newValue);
				return;
			case WdpDslPackage.HEADER__TEXT_COLOR:
				setTextColor((String)newValue);
				return;
			case WdpDslPackage.HEADER__IS_SHOWING_HEADER_TEXT:
				setIsShowingHeaderText((Boolean)newValue);
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
			case WdpDslPackage.HEADER__RANDOM_IMAGE:
				setRandomImage(RANDOM_IMAGE_EDEFAULT);
				return;
			case WdpDslPackage.HEADER__UPLOAD_IMAGE:
				setUploadImage((Url)null);
				return;
			case WdpDslPackage.HEADER__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case WdpDslPackage.HEADER__IS_SHOWING_HEADER_TEXT:
				setIsShowingHeaderText(IS_SHOWING_HEADER_TEXT_EDEFAULT);
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
			case WdpDslPackage.HEADER__RANDOM_IMAGE:
				return randomImage != RANDOM_IMAGE_EDEFAULT;
			case WdpDslPackage.HEADER__UPLOAD_IMAGE:
				return uploadImage != null;
			case WdpDslPackage.HEADER__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
			case WdpDslPackage.HEADER__IS_SHOWING_HEADER_TEXT:
				return isShowingHeaderText != IS_SHOWING_HEADER_TEXT_EDEFAULT;
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
		result.append(" (randomImage: ");
		result.append(randomImage);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", isShowingHeaderText: ");
		result.append(isShowingHeaderText);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
