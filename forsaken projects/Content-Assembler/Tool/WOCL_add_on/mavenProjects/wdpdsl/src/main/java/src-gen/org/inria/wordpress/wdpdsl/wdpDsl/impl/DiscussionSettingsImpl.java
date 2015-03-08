/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.avatarRating;
import org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discussion Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getNumberArticleDaysForAutoCloseComments <em>Number Article Days For Auto Close Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getNestedCommentsLevel <em>Nested Comments Level</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getNumberCommentsPerPageForBreakedComments <em>Number Comments Per Page For Breaked Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getNumberOfLinksInCommentForModeration <em>Number Of Links In Comment For Moderation</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getModeratedWords <em>Moderated Words</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getForbiddenWords <em>Forbidden Words</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getMaxAvatarRating <em>Max Avatar Rating</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#getUserDefaultAvatar <em>User Default Avatar</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsNotifyingLinkedBlogs <em>Is Notifying Linked Blogs</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsAllowingLinkNotificationsFromBlogs <em>Is Allowing Link Notifications From Blogs</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsAllowingPublicComments <em>Is Allowing Public Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsAskingNameAndMailCommentAuthor <em>Is Asking Name And Mail Comment Author</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsAllowingAnonymousComments <em>Is Allowing Anonymous Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsBreakingCommentsIntoPages <em>Is Breaking Comments Into Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsdisplayingLastPageForBreakedComments <em>Isdisplaying Last Page For Breaked Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsDisplayingOlderCommentForEachPage <em>Is Displaying Older Comment For Each Page</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsMailingAdminForEachComments <em>Is Mailing Admin For Each Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsHeldingCommentForModeration <em>Is Helding Comment For Moderation</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsAskingAdminApprovement <em>Is Asking Admin Approvement</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsAskingPreviousAdminApprovement <em>Is Asking Previous Admin Approvement</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DiscussionSettingsImpl#isIsShowingAvatar <em>Is Showing Avatar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscussionSettingsImpl extends MinimalEObjectImpl.Container implements DiscussionSettings {
	/**
	 * The default value of the '{@link #getNumberArticleDaysForAutoCloseComments() <em>Number Article Days For Auto Close Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberArticleDaysForAutoCloseComments()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberArticleDaysForAutoCloseComments() <em>Number Article Days For Auto Close Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberArticleDaysForAutoCloseComments()
	 * @generated
	 * @ordered
	 */
	protected int numberArticleDaysForAutoCloseComments = NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNestedCommentsLevel() <em>Nested Comments Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedCommentsLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int NESTED_COMMENTS_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNestedCommentsLevel() <em>Nested Comments Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedCommentsLevel()
	 * @generated
	 * @ordered
	 */
	protected int nestedCommentsLevel = NESTED_COMMENTS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberCommentsPerPageForBreakedComments() <em>Number Comments Per Page For Breaked Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberCommentsPerPageForBreakedComments()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberCommentsPerPageForBreakedComments() <em>Number Comments Per Page For Breaked Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberCommentsPerPageForBreakedComments()
	 * @generated
	 * @ordered
	 */
	protected int numberCommentsPerPageForBreakedComments = NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfLinksInCommentForModeration() <em>Number Of Links In Comment For Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLinksInCommentForModeration()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfLinksInCommentForModeration() <em>Number Of Links In Comment For Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLinksInCommentForModeration()
	 * @generated
	 * @ordered
	 */
	protected int numberOfLinksInCommentForModeration = NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModeratedWords() <em>Moderated Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeratedWords()
	 * @generated
	 * @ordered
	 */
	protected static final String MODERATED_WORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModeratedWords() <em>Moderated Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeratedWords()
	 * @generated
	 * @ordered
	 */
	protected String moderatedWords = MODERATED_WORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getForbiddenWords() <em>Forbidden Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbiddenWords()
	 * @generated
	 * @ordered
	 */
	protected static final String FORBIDDEN_WORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForbiddenWords() <em>Forbidden Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbiddenWords()
	 * @generated
	 * @ordered
	 */
	protected String forbiddenWords = FORBIDDEN_WORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAvatarRating() <em>Max Avatar Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAvatarRating()
	 * @generated
	 * @ordered
	 */
	protected static final avatarRating MAX_AVATAR_RATING_EDEFAULT = avatarRating.G;

	/**
	 * The cached value of the '{@link #getMaxAvatarRating() <em>Max Avatar Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAvatarRating()
	 * @generated
	 * @ordered
	 */
	protected avatarRating maxAvatarRating = MAX_AVATAR_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefaultAvatar() <em>User Default Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefaultAvatar()
	 * @generated
	 * @ordered
	 */
	protected static final defaultAvatar USER_DEFAULT_AVATAR_EDEFAULT = defaultAvatar.MYSTERY_MAN;

	/**
	 * The cached value of the '{@link #getUserDefaultAvatar() <em>User Default Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefaultAvatar()
	 * @generated
	 * @ordered
	 */
	protected defaultAvatar userDefaultAvatar = USER_DEFAULT_AVATAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNotifyingLinkedBlogs() <em>Is Notifying Linked Blogs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotifyingLinkedBlogs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOTIFYING_LINKED_BLOGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNotifyingLinkedBlogs() <em>Is Notifying Linked Blogs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotifyingLinkedBlogs()
	 * @generated
	 * @ordered
	 */
	protected boolean isNotifyingLinkedBlogs = IS_NOTIFYING_LINKED_BLOGS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAllowingLinkNotificationsFromBlogs() <em>Is Allowing Link Notifications From Blogs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAllowingLinkNotificationsFromBlogs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAllowingLinkNotificationsFromBlogs() <em>Is Allowing Link Notifications From Blogs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAllowingLinkNotificationsFromBlogs()
	 * @generated
	 * @ordered
	 */
	protected boolean isAllowingLinkNotificationsFromBlogs = IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAllowingPublicComments() <em>Is Allowing Public Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAllowingPublicComments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ALLOWING_PUBLIC_COMMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAllowingPublicComments() <em>Is Allowing Public Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAllowingPublicComments()
	 * @generated
	 * @ordered
	 */
	protected boolean isAllowingPublicComments = IS_ALLOWING_PUBLIC_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAskingNameAndMailCommentAuthor() <em>Is Asking Name And Mail Comment Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAskingNameAndMailCommentAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAskingNameAndMailCommentAuthor() <em>Is Asking Name And Mail Comment Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAskingNameAndMailCommentAuthor()
	 * @generated
	 * @ordered
	 */
	protected boolean isAskingNameAndMailCommentAuthor = IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAllowingAnonymousComments() <em>Is Allowing Anonymous Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAllowingAnonymousComments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ALLOWING_ANONYMOUS_COMMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAllowingAnonymousComments() <em>Is Allowing Anonymous Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAllowingAnonymousComments()
	 * @generated
	 * @ordered
	 */
	protected boolean isAllowingAnonymousComments = IS_ALLOWING_ANONYMOUS_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBreakingCommentsIntoPages() <em>Is Breaking Comments Into Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBreakingCommentsIntoPages()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BREAKING_COMMENTS_INTO_PAGES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBreakingCommentsIntoPages() <em>Is Breaking Comments Into Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBreakingCommentsIntoPages()
	 * @generated
	 * @ordered
	 */
	protected boolean isBreakingCommentsIntoPages = IS_BREAKING_COMMENTS_INTO_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsdisplayingLastPageForBreakedComments() <em>Isdisplaying Last Page For Breaked Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsdisplayingLastPageForBreakedComments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsdisplayingLastPageForBreakedComments() <em>Isdisplaying Last Page For Breaked Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsdisplayingLastPageForBreakedComments()
	 * @generated
	 * @ordered
	 */
	protected boolean isdisplayingLastPageForBreakedComments = ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisplayingOlderCommentForEachPage() <em>Is Displaying Older Comment For Each Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingOlderCommentForEachPage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayingOlderCommentForEachPage() <em>Is Displaying Older Comment For Each Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayingOlderCommentForEachPage()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayingOlderCommentForEachPage = IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMailingAdminForEachComments() <em>Is Mailing Admin For Each Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMailingAdminForEachComments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAILING_ADMIN_FOR_EACH_COMMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMailingAdminForEachComments() <em>Is Mailing Admin For Each Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMailingAdminForEachComments()
	 * @generated
	 * @ordered
	 */
	protected boolean isMailingAdminForEachComments = IS_MAILING_ADMIN_FOR_EACH_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHeldingCommentForModeration() <em>Is Helding Comment For Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeldingCommentForModeration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HELDING_COMMENT_FOR_MODERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHeldingCommentForModeration() <em>Is Helding Comment For Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeldingCommentForModeration()
	 * @generated
	 * @ordered
	 */
	protected boolean isHeldingCommentForModeration = IS_HELDING_COMMENT_FOR_MODERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAskingAdminApprovement() <em>Is Asking Admin Approvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAskingAdminApprovement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASKING_ADMIN_APPROVEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAskingAdminApprovement() <em>Is Asking Admin Approvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAskingAdminApprovement()
	 * @generated
	 * @ordered
	 */
	protected boolean isAskingAdminApprovement = IS_ASKING_ADMIN_APPROVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAskingPreviousAdminApprovement() <em>Is Asking Previous Admin Approvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAskingPreviousAdminApprovement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAskingPreviousAdminApprovement() <em>Is Asking Previous Admin Approvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAskingPreviousAdminApprovement()
	 * @generated
	 * @ordered
	 */
	protected boolean isAskingPreviousAdminApprovement = IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsShowingAvatar() <em>Is Showing Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingAvatar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHOWING_AVATAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShowingAvatar() <em>Is Showing Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShowingAvatar()
	 * @generated
	 * @ordered
	 */
	protected boolean isShowingAvatar = IS_SHOWING_AVATAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.DISCUSSION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberArticleDaysForAutoCloseComments() {
		return numberArticleDaysForAutoCloseComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberArticleDaysForAutoCloseComments(int newNumberArticleDaysForAutoCloseComments) {
		int oldNumberArticleDaysForAutoCloseComments = numberArticleDaysForAutoCloseComments;
		numberArticleDaysForAutoCloseComments = newNumberArticleDaysForAutoCloseComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS, oldNumberArticleDaysForAutoCloseComments, numberArticleDaysForAutoCloseComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNestedCommentsLevel() {
		return nestedCommentsLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedCommentsLevel(int newNestedCommentsLevel) {
		int oldNestedCommentsLevel = nestedCommentsLevel;
		nestedCommentsLevel = newNestedCommentsLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL, oldNestedCommentsLevel, nestedCommentsLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberCommentsPerPageForBreakedComments() {
		return numberCommentsPerPageForBreakedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberCommentsPerPageForBreakedComments(int newNumberCommentsPerPageForBreakedComments) {
		int oldNumberCommentsPerPageForBreakedComments = numberCommentsPerPageForBreakedComments;
		numberCommentsPerPageForBreakedComments = newNumberCommentsPerPageForBreakedComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS, oldNumberCommentsPerPageForBreakedComments, numberCommentsPerPageForBreakedComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfLinksInCommentForModeration() {
		return numberOfLinksInCommentForModeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfLinksInCommentForModeration(int newNumberOfLinksInCommentForModeration) {
		int oldNumberOfLinksInCommentForModeration = numberOfLinksInCommentForModeration;
		numberOfLinksInCommentForModeration = newNumberOfLinksInCommentForModeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION, oldNumberOfLinksInCommentForModeration, numberOfLinksInCommentForModeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModeratedWords() {
		return moderatedWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeratedWords(String newModeratedWords) {
		String oldModeratedWords = moderatedWords;
		moderatedWords = newModeratedWords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__MODERATED_WORDS, oldModeratedWords, moderatedWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForbiddenWords() {
		return forbiddenWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForbiddenWords(String newForbiddenWords) {
		String oldForbiddenWords = forbiddenWords;
		forbiddenWords = newForbiddenWords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__FORBIDDEN_WORDS, oldForbiddenWords, forbiddenWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public avatarRating getMaxAvatarRating() {
		return maxAvatarRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAvatarRating(avatarRating newMaxAvatarRating) {
		avatarRating oldMaxAvatarRating = maxAvatarRating;
		maxAvatarRating = newMaxAvatarRating == null ? MAX_AVATAR_RATING_EDEFAULT : newMaxAvatarRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__MAX_AVATAR_RATING, oldMaxAvatarRating, maxAvatarRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public defaultAvatar getUserDefaultAvatar() {
		return userDefaultAvatar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefaultAvatar(defaultAvatar newUserDefaultAvatar) {
		defaultAvatar oldUserDefaultAvatar = userDefaultAvatar;
		userDefaultAvatar = newUserDefaultAvatar == null ? USER_DEFAULT_AVATAR_EDEFAULT : newUserDefaultAvatar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR, oldUserDefaultAvatar, userDefaultAvatar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNotifyingLinkedBlogs() {
		return isNotifyingLinkedBlogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotifyingLinkedBlogs(boolean newIsNotifyingLinkedBlogs) {
		boolean oldIsNotifyingLinkedBlogs = isNotifyingLinkedBlogs;
		isNotifyingLinkedBlogs = newIsNotifyingLinkedBlogs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS, oldIsNotifyingLinkedBlogs, isNotifyingLinkedBlogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAllowingLinkNotificationsFromBlogs() {
		return isAllowingLinkNotificationsFromBlogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAllowingLinkNotificationsFromBlogs(boolean newIsAllowingLinkNotificationsFromBlogs) {
		boolean oldIsAllowingLinkNotificationsFromBlogs = isAllowingLinkNotificationsFromBlogs;
		isAllowingLinkNotificationsFromBlogs = newIsAllowingLinkNotificationsFromBlogs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS, oldIsAllowingLinkNotificationsFromBlogs, isAllowingLinkNotificationsFromBlogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAllowingPublicComments() {
		return isAllowingPublicComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAllowingPublicComments(boolean newIsAllowingPublicComments) {
		boolean oldIsAllowingPublicComments = isAllowingPublicComments;
		isAllowingPublicComments = newIsAllowingPublicComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS, oldIsAllowingPublicComments, isAllowingPublicComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAskingNameAndMailCommentAuthor() {
		return isAskingNameAndMailCommentAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAskingNameAndMailCommentAuthor(boolean newIsAskingNameAndMailCommentAuthor) {
		boolean oldIsAskingNameAndMailCommentAuthor = isAskingNameAndMailCommentAuthor;
		isAskingNameAndMailCommentAuthor = newIsAskingNameAndMailCommentAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR, oldIsAskingNameAndMailCommentAuthor, isAskingNameAndMailCommentAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAllowingAnonymousComments() {
		return isAllowingAnonymousComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAllowingAnonymousComments(boolean newIsAllowingAnonymousComments) {
		boolean oldIsAllowingAnonymousComments = isAllowingAnonymousComments;
		isAllowingAnonymousComments = newIsAllowingAnonymousComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS, oldIsAllowingAnonymousComments, isAllowingAnonymousComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBreakingCommentsIntoPages() {
		return isBreakingCommentsIntoPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBreakingCommentsIntoPages(boolean newIsBreakingCommentsIntoPages) {
		boolean oldIsBreakingCommentsIntoPages = isBreakingCommentsIntoPages;
		isBreakingCommentsIntoPages = newIsBreakingCommentsIntoPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES, oldIsBreakingCommentsIntoPages, isBreakingCommentsIntoPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsdisplayingLastPageForBreakedComments() {
		return isdisplayingLastPageForBreakedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsdisplayingLastPageForBreakedComments(boolean newIsdisplayingLastPageForBreakedComments) {
		boolean oldIsdisplayingLastPageForBreakedComments = isdisplayingLastPageForBreakedComments;
		isdisplayingLastPageForBreakedComments = newIsdisplayingLastPageForBreakedComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS, oldIsdisplayingLastPageForBreakedComments, isdisplayingLastPageForBreakedComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisplayingOlderCommentForEachPage() {
		return isDisplayingOlderCommentForEachPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisplayingOlderCommentForEachPage(boolean newIsDisplayingOlderCommentForEachPage) {
		boolean oldIsDisplayingOlderCommentForEachPage = isDisplayingOlderCommentForEachPage;
		isDisplayingOlderCommentForEachPage = newIsDisplayingOlderCommentForEachPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE, oldIsDisplayingOlderCommentForEachPage, isDisplayingOlderCommentForEachPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMailingAdminForEachComments() {
		return isMailingAdminForEachComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMailingAdminForEachComments(boolean newIsMailingAdminForEachComments) {
		boolean oldIsMailingAdminForEachComments = isMailingAdminForEachComments;
		isMailingAdminForEachComments = newIsMailingAdminForEachComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS, oldIsMailingAdminForEachComments, isMailingAdminForEachComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHeldingCommentForModeration() {
		return isHeldingCommentForModeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeldingCommentForModeration(boolean newIsHeldingCommentForModeration) {
		boolean oldIsHeldingCommentForModeration = isHeldingCommentForModeration;
		isHeldingCommentForModeration = newIsHeldingCommentForModeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION, oldIsHeldingCommentForModeration, isHeldingCommentForModeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAskingAdminApprovement() {
		return isAskingAdminApprovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAskingAdminApprovement(boolean newIsAskingAdminApprovement) {
		boolean oldIsAskingAdminApprovement = isAskingAdminApprovement;
		isAskingAdminApprovement = newIsAskingAdminApprovement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT, oldIsAskingAdminApprovement, isAskingAdminApprovement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAskingPreviousAdminApprovement() {
		return isAskingPreviousAdminApprovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAskingPreviousAdminApprovement(boolean newIsAskingPreviousAdminApprovement) {
		boolean oldIsAskingPreviousAdminApprovement = isAskingPreviousAdminApprovement;
		isAskingPreviousAdminApprovement = newIsAskingPreviousAdminApprovement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT, oldIsAskingPreviousAdminApprovement, isAskingPreviousAdminApprovement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShowingAvatar() {
		return isShowingAvatar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShowingAvatar(boolean newIsShowingAvatar) {
		boolean oldIsShowingAvatar = isShowingAvatar;
		isShowingAvatar = newIsShowingAvatar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.DISCUSSION_SETTINGS__IS_SHOWING_AVATAR, oldIsShowingAvatar, isShowingAvatar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS:
				return getNumberArticleDaysForAutoCloseComments();
			case WdpDslPackage.DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL:
				return getNestedCommentsLevel();
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS:
				return getNumberCommentsPerPageForBreakedComments();
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION:
				return getNumberOfLinksInCommentForModeration();
			case WdpDslPackage.DISCUSSION_SETTINGS__MODERATED_WORDS:
				return getModeratedWords();
			case WdpDslPackage.DISCUSSION_SETTINGS__FORBIDDEN_WORDS:
				return getForbiddenWords();
			case WdpDslPackage.DISCUSSION_SETTINGS__MAX_AVATAR_RATING:
				return getMaxAvatarRating();
			case WdpDslPackage.DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR:
				return getUserDefaultAvatar();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS:
				return isIsNotifyingLinkedBlogs();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS:
				return isIsAllowingLinkNotificationsFromBlogs();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS:
				return isIsAllowingPublicComments();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR:
				return isIsAskingNameAndMailCommentAuthor();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS:
				return isIsAllowingAnonymousComments();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES:
				return isIsBreakingCommentsIntoPages();
			case WdpDslPackage.DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS:
				return isIsdisplayingLastPageForBreakedComments();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE:
				return isIsDisplayingOlderCommentForEachPage();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS:
				return isIsMailingAdminForEachComments();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION:
				return isIsHeldingCommentForModeration();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT:
				return isIsAskingAdminApprovement();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT:
				return isIsAskingPreviousAdminApprovement();
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_SHOWING_AVATAR:
				return isIsShowingAvatar();
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
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS:
				setNumberArticleDaysForAutoCloseComments((Integer)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL:
				setNestedCommentsLevel((Integer)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS:
				setNumberCommentsPerPageForBreakedComments((Integer)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION:
				setNumberOfLinksInCommentForModeration((Integer)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__MODERATED_WORDS:
				setModeratedWords((String)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__FORBIDDEN_WORDS:
				setForbiddenWords((String)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__MAX_AVATAR_RATING:
				setMaxAvatarRating((avatarRating)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR:
				setUserDefaultAvatar((defaultAvatar)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS:
				setIsNotifyingLinkedBlogs((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS:
				setIsAllowingLinkNotificationsFromBlogs((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS:
				setIsAllowingPublicComments((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR:
				setIsAskingNameAndMailCommentAuthor((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS:
				setIsAllowingAnonymousComments((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES:
				setIsBreakingCommentsIntoPages((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS:
				setIsdisplayingLastPageForBreakedComments((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE:
				setIsDisplayingOlderCommentForEachPage((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS:
				setIsMailingAdminForEachComments((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION:
				setIsHeldingCommentForModeration((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT:
				setIsAskingAdminApprovement((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT:
				setIsAskingPreviousAdminApprovement((Boolean)newValue);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_SHOWING_AVATAR:
				setIsShowingAvatar((Boolean)newValue);
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
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS:
				setNumberArticleDaysForAutoCloseComments(NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL:
				setNestedCommentsLevel(NESTED_COMMENTS_LEVEL_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS:
				setNumberCommentsPerPageForBreakedComments(NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION:
				setNumberOfLinksInCommentForModeration(NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__MODERATED_WORDS:
				setModeratedWords(MODERATED_WORDS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__FORBIDDEN_WORDS:
				setForbiddenWords(FORBIDDEN_WORDS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__MAX_AVATAR_RATING:
				setMaxAvatarRating(MAX_AVATAR_RATING_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR:
				setUserDefaultAvatar(USER_DEFAULT_AVATAR_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS:
				setIsNotifyingLinkedBlogs(IS_NOTIFYING_LINKED_BLOGS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS:
				setIsAllowingLinkNotificationsFromBlogs(IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS:
				setIsAllowingPublicComments(IS_ALLOWING_PUBLIC_COMMENTS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR:
				setIsAskingNameAndMailCommentAuthor(IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS:
				setIsAllowingAnonymousComments(IS_ALLOWING_ANONYMOUS_COMMENTS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES:
				setIsBreakingCommentsIntoPages(IS_BREAKING_COMMENTS_INTO_PAGES_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS:
				setIsdisplayingLastPageForBreakedComments(ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE:
				setIsDisplayingOlderCommentForEachPage(IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS:
				setIsMailingAdminForEachComments(IS_MAILING_ADMIN_FOR_EACH_COMMENTS_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION:
				setIsHeldingCommentForModeration(IS_HELDING_COMMENT_FOR_MODERATION_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT:
				setIsAskingAdminApprovement(IS_ASKING_ADMIN_APPROVEMENT_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT:
				setIsAskingPreviousAdminApprovement(IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT_EDEFAULT);
				return;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_SHOWING_AVATAR:
				setIsShowingAvatar(IS_SHOWING_AVATAR_EDEFAULT);
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
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS:
				return numberArticleDaysForAutoCloseComments != NUMBER_ARTICLE_DAYS_FOR_AUTO_CLOSE_COMMENTS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__NESTED_COMMENTS_LEVEL:
				return nestedCommentsLevel != NESTED_COMMENTS_LEVEL_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS:
				return numberCommentsPerPageForBreakedComments != NUMBER_COMMENTS_PER_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION:
				return numberOfLinksInCommentForModeration != NUMBER_OF_LINKS_IN_COMMENT_FOR_MODERATION_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__MODERATED_WORDS:
				return MODERATED_WORDS_EDEFAULT == null ? moderatedWords != null : !MODERATED_WORDS_EDEFAULT.equals(moderatedWords);
			case WdpDslPackage.DISCUSSION_SETTINGS__FORBIDDEN_WORDS:
				return FORBIDDEN_WORDS_EDEFAULT == null ? forbiddenWords != null : !FORBIDDEN_WORDS_EDEFAULT.equals(forbiddenWords);
			case WdpDslPackage.DISCUSSION_SETTINGS__MAX_AVATAR_RATING:
				return maxAvatarRating != MAX_AVATAR_RATING_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__USER_DEFAULT_AVATAR:
				return userDefaultAvatar != USER_DEFAULT_AVATAR_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_NOTIFYING_LINKED_BLOGS:
				return isNotifyingLinkedBlogs != IS_NOTIFYING_LINKED_BLOGS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS:
				return isAllowingLinkNotificationsFromBlogs != IS_ALLOWING_LINK_NOTIFICATIONS_FROM_BLOGS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_PUBLIC_COMMENTS:
				return isAllowingPublicComments != IS_ALLOWING_PUBLIC_COMMENTS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR:
				return isAskingNameAndMailCommentAuthor != IS_ASKING_NAME_AND_MAIL_COMMENT_AUTHOR_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ALLOWING_ANONYMOUS_COMMENTS:
				return isAllowingAnonymousComments != IS_ALLOWING_ANONYMOUS_COMMENTS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_BREAKING_COMMENTS_INTO_PAGES:
				return isBreakingCommentsIntoPages != IS_BREAKING_COMMENTS_INTO_PAGES_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS:
				return isdisplayingLastPageForBreakedComments != ISDISPLAYING_LAST_PAGE_FOR_BREAKED_COMMENTS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE:
				return isDisplayingOlderCommentForEachPage != IS_DISPLAYING_OLDER_COMMENT_FOR_EACH_PAGE_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_MAILING_ADMIN_FOR_EACH_COMMENTS:
				return isMailingAdminForEachComments != IS_MAILING_ADMIN_FOR_EACH_COMMENTS_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_HELDING_COMMENT_FOR_MODERATION:
				return isHeldingCommentForModeration != IS_HELDING_COMMENT_FOR_MODERATION_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_ADMIN_APPROVEMENT:
				return isAskingAdminApprovement != IS_ASKING_ADMIN_APPROVEMENT_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT:
				return isAskingPreviousAdminApprovement != IS_ASKING_PREVIOUS_ADMIN_APPROVEMENT_EDEFAULT;
			case WdpDslPackage.DISCUSSION_SETTINGS__IS_SHOWING_AVATAR:
				return isShowingAvatar != IS_SHOWING_AVATAR_EDEFAULT;
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
		result.append(" (numberArticleDaysForAutoCloseComments: ");
		result.append(numberArticleDaysForAutoCloseComments);
		result.append(", nestedCommentsLevel: ");
		result.append(nestedCommentsLevel);
		result.append(", numberCommentsPerPageForBreakedComments: ");
		result.append(numberCommentsPerPageForBreakedComments);
		result.append(", numberOfLinksInCommentForModeration: ");
		result.append(numberOfLinksInCommentForModeration);
		result.append(", moderatedWords: ");
		result.append(moderatedWords);
		result.append(", forbiddenWords: ");
		result.append(forbiddenWords);
		result.append(", maxAvatarRating: ");
		result.append(maxAvatarRating);
		result.append(", userDefaultAvatar: ");
		result.append(userDefaultAvatar);
		result.append(", isNotifyingLinkedBlogs: ");
		result.append(isNotifyingLinkedBlogs);
		result.append(", isAllowingLinkNotificationsFromBlogs: ");
		result.append(isAllowingLinkNotificationsFromBlogs);
		result.append(", isAllowingPublicComments: ");
		result.append(isAllowingPublicComments);
		result.append(", isAskingNameAndMailCommentAuthor: ");
		result.append(isAskingNameAndMailCommentAuthor);
		result.append(", isAllowingAnonymousComments: ");
		result.append(isAllowingAnonymousComments);
		result.append(", isBreakingCommentsIntoPages: ");
		result.append(isBreakingCommentsIntoPages);
		result.append(", isdisplayingLastPageForBreakedComments: ");
		result.append(isdisplayingLastPageForBreakedComments);
		result.append(", isDisplayingOlderCommentForEachPage: ");
		result.append(isDisplayingOlderCommentForEachPage);
		result.append(", isMailingAdminForEachComments: ");
		result.append(isMailingAdminForEachComments);
		result.append(", isHeldingCommentForModeration: ");
		result.append(isHeldingCommentForModeration);
		result.append(", isAskingAdminApprovement: ");
		result.append(isAskingAdminApprovement);
		result.append(", isAskingPreviousAdminApprovement: ");
		result.append(isAskingPreviousAdminApprovement);
		result.append(", isShowingAvatar: ");
		result.append(isShowingAvatar);
		result.append(')');
		return result.toString();
	}

} //DiscussionSettingsImpl
