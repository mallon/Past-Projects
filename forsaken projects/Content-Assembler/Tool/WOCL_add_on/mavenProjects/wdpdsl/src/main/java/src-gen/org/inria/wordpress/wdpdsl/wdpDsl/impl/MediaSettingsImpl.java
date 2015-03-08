/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#getThumbnailWidth <em>Thumbnail Width</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#getThumbnailHeight <em>Thumbnail Height</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#getMediumWidth <em>Medium Width</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#getMediumHeight <em>Medium Height</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#getLargeWidth <em>Large Width</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#getLargeHeight <em>Large Height</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#isIsCroppingThumbnailToExactDims <em>Is Cropping Thumbnail To Exact Dims</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.MediaSettingsImpl#isIsOrganizeUploadsIntoFolders <em>Is Organize Uploads Into Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaSettingsImpl extends MinimalEObjectImpl.Container implements MediaSettings {
	/**
	 * The default value of the '{@link #getThumbnailWidth() <em>Thumbnail Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int THUMBNAIL_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThumbnailWidth() <em>Thumbnail Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailWidth()
	 * @generated
	 * @ordered
	 */
	protected int thumbnailWidth = THUMBNAIL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getThumbnailHeight() <em>Thumbnail Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int THUMBNAIL_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThumbnailHeight() <em>Thumbnail Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailHeight()
	 * @generated
	 * @ordered
	 */
	protected int thumbnailHeight = THUMBNAIL_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumWidth() <em>Medium Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MEDIUM_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMediumWidth() <em>Medium Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumWidth()
	 * @generated
	 * @ordered
	 */
	protected int mediumWidth = MEDIUM_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumHeight() <em>Medium Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MEDIUM_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMediumHeight() <em>Medium Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumHeight()
	 * @generated
	 * @ordered
	 */
	protected int mediumHeight = MEDIUM_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeWidth() <em>Large Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LARGE_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLargeWidth() <em>Large Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeWidth()
	 * @generated
	 * @ordered
	 */
	protected int largeWidth = LARGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeHeight() <em>Large Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int LARGE_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLargeHeight() <em>Large Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeHeight()
	 * @generated
	 * @ordered
	 */
	protected int largeHeight = LARGE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCroppingThumbnailToExactDims() <em>Is Cropping Thumbnail To Exact Dims</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCroppingThumbnailToExactDims()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCroppingThumbnailToExactDims() <em>Is Cropping Thumbnail To Exact Dims</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCroppingThumbnailToExactDims()
	 * @generated
	 * @ordered
	 */
	protected boolean isCroppingThumbnailToExactDims = IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrganizeUploadsIntoFolders() <em>Is Organize Uploads Into Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrganizeUploadsIntoFolders()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORGANIZE_UPLOADS_INTO_FOLDERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrganizeUploadsIntoFolders() <em>Is Organize Uploads Into Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrganizeUploadsIntoFolders()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrganizeUploadsIntoFolders = IS_ORGANIZE_UPLOADS_INTO_FOLDERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.MEDIA_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThumbnailWidth() {
		return thumbnailWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnailWidth(int newThumbnailWidth) {
		int oldThumbnailWidth = thumbnailWidth;
		thumbnailWidth = newThumbnailWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_WIDTH, oldThumbnailWidth, thumbnailWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThumbnailHeight() {
		return thumbnailHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnailHeight(int newThumbnailHeight) {
		int oldThumbnailHeight = thumbnailHeight;
		thumbnailHeight = newThumbnailHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_HEIGHT, oldThumbnailHeight, thumbnailHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMediumWidth() {
		return mediumWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumWidth(int newMediumWidth) {
		int oldMediumWidth = mediumWidth;
		mediumWidth = newMediumWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__MEDIUM_WIDTH, oldMediumWidth, mediumWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMediumHeight() {
		return mediumHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumHeight(int newMediumHeight) {
		int oldMediumHeight = mediumHeight;
		mediumHeight = newMediumHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__MEDIUM_HEIGHT, oldMediumHeight, mediumHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLargeWidth() {
		return largeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeWidth(int newLargeWidth) {
		int oldLargeWidth = largeWidth;
		largeWidth = newLargeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__LARGE_WIDTH, oldLargeWidth, largeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLargeHeight() {
		return largeHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeHeight(int newLargeHeight) {
		int oldLargeHeight = largeHeight;
		largeHeight = newLargeHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__LARGE_HEIGHT, oldLargeHeight, largeHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCroppingThumbnailToExactDims() {
		return isCroppingThumbnailToExactDims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCroppingThumbnailToExactDims(boolean newIsCroppingThumbnailToExactDims) {
		boolean oldIsCroppingThumbnailToExactDims = isCroppingThumbnailToExactDims;
		isCroppingThumbnailToExactDims = newIsCroppingThumbnailToExactDims;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS, oldIsCroppingThumbnailToExactDims, isCroppingThumbnailToExactDims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrganizeUploadsIntoFolders() {
		return isOrganizeUploadsIntoFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrganizeUploadsIntoFolders(boolean newIsOrganizeUploadsIntoFolders) {
		boolean oldIsOrganizeUploadsIntoFolders = isOrganizeUploadsIntoFolders;
		isOrganizeUploadsIntoFolders = newIsOrganizeUploadsIntoFolders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS, oldIsOrganizeUploadsIntoFolders, isOrganizeUploadsIntoFolders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_WIDTH:
				return getThumbnailWidth();
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_HEIGHT:
				return getThumbnailHeight();
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_WIDTH:
				return getMediumWidth();
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_HEIGHT:
				return getMediumHeight();
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_WIDTH:
				return getLargeWidth();
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_HEIGHT:
				return getLargeHeight();
			case WdpDslPackage.MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS:
				return isIsCroppingThumbnailToExactDims();
			case WdpDslPackage.MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS:
				return isIsOrganizeUploadsIntoFolders();
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
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_WIDTH:
				setThumbnailWidth((Integer)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_HEIGHT:
				setThumbnailHeight((Integer)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_WIDTH:
				setMediumWidth((Integer)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_HEIGHT:
				setMediumHeight((Integer)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_WIDTH:
				setLargeWidth((Integer)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_HEIGHT:
				setLargeHeight((Integer)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS:
				setIsCroppingThumbnailToExactDims((Boolean)newValue);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS:
				setIsOrganizeUploadsIntoFolders((Boolean)newValue);
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
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_WIDTH:
				setThumbnailWidth(THUMBNAIL_WIDTH_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_HEIGHT:
				setThumbnailHeight(THUMBNAIL_HEIGHT_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_WIDTH:
				setMediumWidth(MEDIUM_WIDTH_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_HEIGHT:
				setMediumHeight(MEDIUM_HEIGHT_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_WIDTH:
				setLargeWidth(LARGE_WIDTH_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_HEIGHT:
				setLargeHeight(LARGE_HEIGHT_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS:
				setIsCroppingThumbnailToExactDims(IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS_EDEFAULT);
				return;
			case WdpDslPackage.MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS:
				setIsOrganizeUploadsIntoFolders(IS_ORGANIZE_UPLOADS_INTO_FOLDERS_EDEFAULT);
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
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_WIDTH:
				return thumbnailWidth != THUMBNAIL_WIDTH_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__THUMBNAIL_HEIGHT:
				return thumbnailHeight != THUMBNAIL_HEIGHT_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_WIDTH:
				return mediumWidth != MEDIUM_WIDTH_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__MEDIUM_HEIGHT:
				return mediumHeight != MEDIUM_HEIGHT_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_WIDTH:
				return largeWidth != LARGE_WIDTH_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__LARGE_HEIGHT:
				return largeHeight != LARGE_HEIGHT_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS:
				return isCroppingThumbnailToExactDims != IS_CROPPING_THUMBNAIL_TO_EXACT_DIMS_EDEFAULT;
			case WdpDslPackage.MEDIA_SETTINGS__IS_ORGANIZE_UPLOADS_INTO_FOLDERS:
				return isOrganizeUploadsIntoFolders != IS_ORGANIZE_UPLOADS_INTO_FOLDERS_EDEFAULT;
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
		result.append(" (thumbnailWidth: ");
		result.append(thumbnailWidth);
		result.append(", thumbnailHeight: ");
		result.append(thumbnailHeight);
		result.append(", mediumWidth: ");
		result.append(mediumWidth);
		result.append(", mediumHeight: ");
		result.append(mediumHeight);
		result.append(", largeWidth: ");
		result.append(largeWidth);
		result.append(", largeHeight: ");
		result.append(largeHeight);
		result.append(", isCroppingThumbnailToExactDims: ");
		result.append(isCroppingThumbnailToExactDims);
		result.append(", isOrganizeUploadsIntoFolders: ");
		result.append(isOrganizeUploadsIntoFolders);
		result.append(')');
		return result.toString();
	}

} //MediaSettingsImpl
