/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.MediaSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.PermalinksSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Settings;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WritingSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl#getWriting <em>Writing</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl#getReading <em>Reading</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl#getDiscussion <em>Discussion</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.SettingsImpl#getPermalinks <em>Permalinks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettingsImpl extends MinimalEObjectImpl.Container implements Settings {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected GeneralSettings general;

	/**
	 * The cached value of the '{@link #getWriting() <em>Writing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriting()
	 * @generated
	 * @ordered
	 */
	protected WritingSettings writing;

	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected ReadingSettings reading;

	/**
	 * The cached value of the '{@link #getDiscussion() <em>Discussion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussion()
	 * @generated
	 * @ordered
	 */
	protected DiscussionSettings discussion;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected MediaSettings media;

	/**
	 * The cached value of the '{@link #getPermalinks() <em>Permalinks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermalinks()
	 * @generated
	 * @ordered
	 */
	protected PermalinksSettings permalinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralSettings getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(GeneralSettings newGeneral, NotificationChain msgs) {
		GeneralSettings oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(GeneralSettings newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritingSettings getWriting() {
		return writing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriting(WritingSettings newWriting, NotificationChain msgs) {
		WritingSettings oldWriting = writing;
		writing = newWriting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__WRITING, oldWriting, newWriting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriting(WritingSettings newWriting) {
		if (newWriting != writing) {
			NotificationChain msgs = null;
			if (writing != null)
				msgs = ((InternalEObject)writing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__WRITING, null, msgs);
			if (newWriting != null)
				msgs = ((InternalEObject)newWriting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__WRITING, null, msgs);
			msgs = basicSetWriting(newWriting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__WRITING, newWriting, newWriting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingSettings getReading() {
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReading(ReadingSettings newReading, NotificationChain msgs) {
		ReadingSettings oldReading = reading;
		reading = newReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__READING, oldReading, newReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReading(ReadingSettings newReading) {
		if (newReading != reading) {
			NotificationChain msgs = null;
			if (reading != null)
				msgs = ((InternalEObject)reading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__READING, null, msgs);
			if (newReading != null)
				msgs = ((InternalEObject)newReading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__READING, null, msgs);
			msgs = basicSetReading(newReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__READING, newReading, newReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionSettings getDiscussion() {
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscussion(DiscussionSettings newDiscussion, NotificationChain msgs) {
		DiscussionSettings oldDiscussion = discussion;
		discussion = newDiscussion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__DISCUSSION, oldDiscussion, newDiscussion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscussion(DiscussionSettings newDiscussion) {
		if (newDiscussion != discussion) {
			NotificationChain msgs = null;
			if (discussion != null)
				msgs = ((InternalEObject)discussion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__DISCUSSION, null, msgs);
			if (newDiscussion != null)
				msgs = ((InternalEObject)newDiscussion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__DISCUSSION, null, msgs);
			msgs = basicSetDiscussion(newDiscussion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__DISCUSSION, newDiscussion, newDiscussion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaSettings getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(MediaSettings newMedia, NotificationChain msgs) {
		MediaSettings oldMedia = media;
		media = newMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__MEDIA, oldMedia, newMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(MediaSettings newMedia) {
		if (newMedia != media) {
			NotificationChain msgs = null;
			if (media != null)
				msgs = ((InternalEObject)media).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__MEDIA, null, msgs);
			if (newMedia != null)
				msgs = ((InternalEObject)newMedia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__MEDIA, null, msgs);
			msgs = basicSetMedia(newMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__MEDIA, newMedia, newMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermalinksSettings getPermalinks() {
		return permalinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermalinks(PermalinksSettings newPermalinks, NotificationChain msgs) {
		PermalinksSettings oldPermalinks = permalinks;
		permalinks = newPermalinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__PERMALINKS, oldPermalinks, newPermalinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermalinks(PermalinksSettings newPermalinks) {
		if (newPermalinks != permalinks) {
			NotificationChain msgs = null;
			if (permalinks != null)
				msgs = ((InternalEObject)permalinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__PERMALINKS, null, msgs);
			if (newPermalinks != null)
				msgs = ((InternalEObject)newPermalinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.SETTINGS__PERMALINKS, null, msgs);
			msgs = basicSetPermalinks(newPermalinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.SETTINGS__PERMALINKS, newPermalinks, newPermalinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.SETTINGS__GENERAL:
				return basicSetGeneral(null, msgs);
			case WdpDslPackage.SETTINGS__WRITING:
				return basicSetWriting(null, msgs);
			case WdpDslPackage.SETTINGS__READING:
				return basicSetReading(null, msgs);
			case WdpDslPackage.SETTINGS__DISCUSSION:
				return basicSetDiscussion(null, msgs);
			case WdpDslPackage.SETTINGS__MEDIA:
				return basicSetMedia(null, msgs);
			case WdpDslPackage.SETTINGS__PERMALINKS:
				return basicSetPermalinks(null, msgs);
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
			case WdpDslPackage.SETTINGS__GENERAL:
				return getGeneral();
			case WdpDslPackage.SETTINGS__WRITING:
				return getWriting();
			case WdpDslPackage.SETTINGS__READING:
				return getReading();
			case WdpDslPackage.SETTINGS__DISCUSSION:
				return getDiscussion();
			case WdpDslPackage.SETTINGS__MEDIA:
				return getMedia();
			case WdpDslPackage.SETTINGS__PERMALINKS:
				return getPermalinks();
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
			case WdpDslPackage.SETTINGS__GENERAL:
				setGeneral((GeneralSettings)newValue);
				return;
			case WdpDslPackage.SETTINGS__WRITING:
				setWriting((WritingSettings)newValue);
				return;
			case WdpDslPackage.SETTINGS__READING:
				setReading((ReadingSettings)newValue);
				return;
			case WdpDslPackage.SETTINGS__DISCUSSION:
				setDiscussion((DiscussionSettings)newValue);
				return;
			case WdpDslPackage.SETTINGS__MEDIA:
				setMedia((MediaSettings)newValue);
				return;
			case WdpDslPackage.SETTINGS__PERMALINKS:
				setPermalinks((PermalinksSettings)newValue);
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
			case WdpDslPackage.SETTINGS__GENERAL:
				setGeneral((GeneralSettings)null);
				return;
			case WdpDslPackage.SETTINGS__WRITING:
				setWriting((WritingSettings)null);
				return;
			case WdpDslPackage.SETTINGS__READING:
				setReading((ReadingSettings)null);
				return;
			case WdpDslPackage.SETTINGS__DISCUSSION:
				setDiscussion((DiscussionSettings)null);
				return;
			case WdpDslPackage.SETTINGS__MEDIA:
				setMedia((MediaSettings)null);
				return;
			case WdpDslPackage.SETTINGS__PERMALINKS:
				setPermalinks((PermalinksSettings)null);
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
			case WdpDslPackage.SETTINGS__GENERAL:
				return general != null;
			case WdpDslPackage.SETTINGS__WRITING:
				return writing != null;
			case WdpDslPackage.SETTINGS__READING:
				return reading != null;
			case WdpDslPackage.SETTINGS__DISCUSSION:
				return discussion != null;
			case WdpDslPackage.SETTINGS__MEDIA:
				return media != null;
			case WdpDslPackage.SETTINGS__PERMALINKS:
				return permalinks != null;
		}
		return super.eIsSet(featureID);
	}

} //SettingsImpl
