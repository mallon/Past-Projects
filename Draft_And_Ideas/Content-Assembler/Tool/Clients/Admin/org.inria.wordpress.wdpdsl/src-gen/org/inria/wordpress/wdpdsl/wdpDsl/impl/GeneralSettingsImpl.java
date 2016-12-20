/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.GeneralSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.Url;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.dateformat;
import org.inria.wordpress.wdpdsl.wdpDsl.role;
import org.inria.wordpress.wdpdsl.wdpDsl.timeFormat;
import org.inria.wordpress.wdpdsl.wdpDsl.weeks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getWebsiteTitle <em>Website Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getWebsiteTagline <em>Website Tagline</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getWebsiteAdress <em>Website Adress</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getAdminMail <em>Admin Mail</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getUserDefaultRole <em>User Default Role</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getGsDateFormat <em>Gs Date Format</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getGsTimeFormat <em>Gs Time Format</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getWeekStartsOn <em>Week Starts On</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#getWordPressAdress <em>Word Press Adress</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.GeneralSettingsImpl#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralSettingsImpl extends MinimalEObjectImpl.Container implements GeneralSettings {
	/**
	 * The default value of the '{@link #getWebsiteTitle() <em>Website Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteTitle() <em>Website Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteTitle()
	 * @generated
	 * @ordered
	 */
	protected String websiteTitle = WEBSITE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteTagline() <em>Website Tagline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteTagline()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_TAGLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteTagline() <em>Website Tagline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteTagline()
	 * @generated
	 * @ordered
	 */
	protected String websiteTagline = WEBSITE_TAGLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteAdress() <em>Website Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteAdress() <em>Website Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteAdress()
	 * @generated
	 * @ordered
	 */
	protected String websiteAdress = WEBSITE_ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminMail() <em>Admin Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminMail()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminMail() <em>Admin Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminMail()
	 * @generated
	 * @ordered
	 */
	protected String adminMail = ADMIN_MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefaultRole() <em>User Default Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefaultRole()
	 * @generated
	 * @ordered
	 */
	protected static final role USER_DEFAULT_ROLE_EDEFAULT = role.AUTHOR;

	/**
	 * The cached value of the '{@link #getUserDefaultRole() <em>User Default Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefaultRole()
	 * @generated
	 * @ordered
	 */
	protected role userDefaultRole = USER_DEFAULT_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_ZONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected int timeZone = TIME_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGsDateFormat() <em>Gs Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGsDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final dateformat GS_DATE_FORMAT_EDEFAULT = dateformat.JN_Y;

	/**
	 * The cached value of the '{@link #getGsDateFormat() <em>Gs Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGsDateFormat()
	 * @generated
	 * @ordered
	 */
	protected dateformat gsDateFormat = GS_DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGsTimeFormat() <em>Gs Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGsTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final timeFormat GS_TIME_FORMAT_EDEFAULT = timeFormat.GIALOWER;

	/**
	 * The cached value of the '{@link #getGsTimeFormat() <em>Gs Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGsTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected timeFormat gsTimeFormat = GS_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekStartsOn() <em>Week Starts On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekStartsOn()
	 * @generated
	 * @ordered
	 */
	protected static final weeks WEEK_STARTS_ON_EDEFAULT = weeks.MONDAY;

	/**
	 * The cached value of the '{@link #getWeekStartsOn() <em>Week Starts On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekStartsOn()
	 * @generated
	 * @ordered
	 */
	protected weeks weekStartsOn = WEEK_STARTS_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWordPressAdress() <em>Word Press Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordPressAdress()
	 * @generated
	 * @ordered
	 */
	protected Url wordPressAdress;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.GENERAL_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsiteTitle() {
		return websiteTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteTitle(String newWebsiteTitle) {
		String oldWebsiteTitle = websiteTitle;
		websiteTitle = newWebsiteTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TITLE, oldWebsiteTitle, websiteTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsiteTagline() {
		return websiteTagline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteTagline(String newWebsiteTagline) {
		String oldWebsiteTagline = websiteTagline;
		websiteTagline = newWebsiteTagline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TAGLINE, oldWebsiteTagline, websiteTagline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsiteAdress() {
		return websiteAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteAdress(String newWebsiteAdress) {
		String oldWebsiteAdress = websiteAdress;
		websiteAdress = newWebsiteAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__WEBSITE_ADRESS, oldWebsiteAdress, websiteAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminMail() {
		return adminMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminMail(String newAdminMail) {
		String oldAdminMail = adminMail;
		adminMail = newAdminMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__ADMIN_MAIL, oldAdminMail, adminMail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public role getUserDefaultRole() {
		return userDefaultRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefaultRole(role newUserDefaultRole) {
		role oldUserDefaultRole = userDefaultRole;
		userDefaultRole = newUserDefaultRole == null ? USER_DEFAULT_ROLE_EDEFAULT : newUserDefaultRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__USER_DEFAULT_ROLE, oldUserDefaultRole, userDefaultRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZone(int newTimeZone) {
		int oldTimeZone = timeZone;
		timeZone = newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dateformat getGsDateFormat() {
		return gsDateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGsDateFormat(dateformat newGsDateFormat) {
		dateformat oldGsDateFormat = gsDateFormat;
		gsDateFormat = newGsDateFormat == null ? GS_DATE_FORMAT_EDEFAULT : newGsDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__GS_DATE_FORMAT, oldGsDateFormat, gsDateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public timeFormat getGsTimeFormat() {
		return gsTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGsTimeFormat(timeFormat newGsTimeFormat) {
		timeFormat oldGsTimeFormat = gsTimeFormat;
		gsTimeFormat = newGsTimeFormat == null ? GS_TIME_FORMAT_EDEFAULT : newGsTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__GS_TIME_FORMAT, oldGsTimeFormat, gsTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public weeks getWeekStartsOn() {
		return weekStartsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekStartsOn(weeks newWeekStartsOn) {
		weeks oldWeekStartsOn = weekStartsOn;
		weekStartsOn = newWeekStartsOn == null ? WEEK_STARTS_ON_EDEFAULT : newWeekStartsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__WEEK_STARTS_ON, oldWeekStartsOn, weekStartsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getWordPressAdress() {
		return wordPressAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordPressAdress(Url newWordPressAdress, NotificationChain msgs) {
		Url oldWordPressAdress = wordPressAdress;
		wordPressAdress = newWordPressAdress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS, oldWordPressAdress, newWordPressAdress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordPressAdress(Url newWordPressAdress) {
		if (newWordPressAdress != wordPressAdress) {
			NotificationChain msgs = null;
			if (wordPressAdress != null)
				msgs = ((InternalEObject)wordPressAdress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS, null, msgs);
			if (newWordPressAdress != null)
				msgs = ((InternalEObject)newWordPressAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS, null, msgs);
			msgs = basicSetWordPressAdress(newWordPressAdress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS, newWordPressAdress, newWordPressAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.GENERAL_SETTINGS__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS:
				return basicSetWordPressAdress(null, msgs);
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
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TITLE:
				return getWebsiteTitle();
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TAGLINE:
				return getWebsiteTagline();
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_ADRESS:
				return getWebsiteAdress();
			case WdpDslPackage.GENERAL_SETTINGS__ADMIN_MAIL:
				return getAdminMail();
			case WdpDslPackage.GENERAL_SETTINGS__USER_DEFAULT_ROLE:
				return getUserDefaultRole();
			case WdpDslPackage.GENERAL_SETTINGS__TIME_ZONE:
				return getTimeZone();
			case WdpDslPackage.GENERAL_SETTINGS__GS_DATE_FORMAT:
				return getGsDateFormat();
			case WdpDslPackage.GENERAL_SETTINGS__GS_TIME_FORMAT:
				return getGsTimeFormat();
			case WdpDslPackage.GENERAL_SETTINGS__WEEK_STARTS_ON:
				return getWeekStartsOn();
			case WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS:
				return getWordPressAdress();
			case WdpDslPackage.GENERAL_SETTINGS__IS_PUBLIC:
				return isIsPublic();
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
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TITLE:
				setWebsiteTitle((String)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TAGLINE:
				setWebsiteTagline((String)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_ADRESS:
				setWebsiteAdress((String)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__ADMIN_MAIL:
				setAdminMail((String)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__USER_DEFAULT_ROLE:
				setUserDefaultRole((role)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__TIME_ZONE:
				setTimeZone((Integer)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__GS_DATE_FORMAT:
				setGsDateFormat((dateformat)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__GS_TIME_FORMAT:
				setGsTimeFormat((timeFormat)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WEEK_STARTS_ON:
				setWeekStartsOn((weeks)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS:
				setWordPressAdress((Url)newValue);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
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
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TITLE:
				setWebsiteTitle(WEBSITE_TITLE_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TAGLINE:
				setWebsiteTagline(WEBSITE_TAGLINE_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_ADRESS:
				setWebsiteAdress(WEBSITE_ADRESS_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__ADMIN_MAIL:
				setAdminMail(ADMIN_MAIL_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__USER_DEFAULT_ROLE:
				setUserDefaultRole(USER_DEFAULT_ROLE_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__GS_DATE_FORMAT:
				setGsDateFormat(GS_DATE_FORMAT_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__GS_TIME_FORMAT:
				setGsTimeFormat(GS_TIME_FORMAT_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WEEK_STARTS_ON:
				setWeekStartsOn(WEEK_STARTS_ON_EDEFAULT);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS:
				setWordPressAdress((Url)null);
				return;
			case WdpDslPackage.GENERAL_SETTINGS__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
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
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TITLE:
				return WEBSITE_TITLE_EDEFAULT == null ? websiteTitle != null : !WEBSITE_TITLE_EDEFAULT.equals(websiteTitle);
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_TAGLINE:
				return WEBSITE_TAGLINE_EDEFAULT == null ? websiteTagline != null : !WEBSITE_TAGLINE_EDEFAULT.equals(websiteTagline);
			case WdpDslPackage.GENERAL_SETTINGS__WEBSITE_ADRESS:
				return WEBSITE_ADRESS_EDEFAULT == null ? websiteAdress != null : !WEBSITE_ADRESS_EDEFAULT.equals(websiteAdress);
			case WdpDslPackage.GENERAL_SETTINGS__ADMIN_MAIL:
				return ADMIN_MAIL_EDEFAULT == null ? adminMail != null : !ADMIN_MAIL_EDEFAULT.equals(adminMail);
			case WdpDslPackage.GENERAL_SETTINGS__USER_DEFAULT_ROLE:
				return userDefaultRole != USER_DEFAULT_ROLE_EDEFAULT;
			case WdpDslPackage.GENERAL_SETTINGS__TIME_ZONE:
				return timeZone != TIME_ZONE_EDEFAULT;
			case WdpDslPackage.GENERAL_SETTINGS__GS_DATE_FORMAT:
				return gsDateFormat != GS_DATE_FORMAT_EDEFAULT;
			case WdpDslPackage.GENERAL_SETTINGS__GS_TIME_FORMAT:
				return gsTimeFormat != GS_TIME_FORMAT_EDEFAULT;
			case WdpDslPackage.GENERAL_SETTINGS__WEEK_STARTS_ON:
				return weekStartsOn != WEEK_STARTS_ON_EDEFAULT;
			case WdpDslPackage.GENERAL_SETTINGS__WORD_PRESS_ADRESS:
				return wordPressAdress != null;
			case WdpDslPackage.GENERAL_SETTINGS__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
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
		result.append(" (websiteTitle: ");
		result.append(websiteTitle);
		result.append(", websiteTagline: ");
		result.append(websiteTagline);
		result.append(", websiteAdress: ");
		result.append(websiteAdress);
		result.append(", adminMail: ");
		result.append(adminMail);
		result.append(", userDefaultRole: ");
		result.append(userDefaultRole);
		result.append(", timeZone: ");
		result.append(timeZone);
		result.append(", gsDateFormat: ");
		result.append(gsDateFormat);
		result.append(", gsTimeFormat: ");
		result.append(gsTimeFormat);
		result.append(", weekStartsOn: ");
		result.append(weekStartsOn);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(')');
		return result.toString();
	}

} //GeneralSettingsImpl
