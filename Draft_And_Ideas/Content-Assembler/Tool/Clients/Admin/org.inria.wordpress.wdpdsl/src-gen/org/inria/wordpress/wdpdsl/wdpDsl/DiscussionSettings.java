/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discussion Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberArticleDaysForAutoCloseComments <em>Number Article Days For Auto Close Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNestedCommentsLevel <em>Nested Comments Level</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberCommentsPerPageForBreakedComments <em>Number Comments Per Page For Breaked Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberOfLinksInCommentForModeration <em>Number Of Links In Comment For Moderation</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getModeratedWords <em>Moderated Words</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getForbiddenWords <em>Forbidden Words</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getMaxAvatarRating <em>Max Avatar Rating</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getUserDefaultAvatar <em>User Default Avatar</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsNotifyingLinkedBlogs <em>Is Notifying Linked Blogs</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingLinkNotificationsFromBlogs <em>Is Allowing Link Notifications From Blogs</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingPublicComments <em>Is Allowing Public Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingNameAndMailCommentAuthor <em>Is Asking Name And Mail Comment Author</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingAnonymousComments <em>Is Allowing Anonymous Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsBreakingCommentsIntoPages <em>Is Breaking Comments Into Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsdisplayingLastPageForBreakedComments <em>Isdisplaying Last Page For Breaked Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsDisplayingOlderCommentForEachPage <em>Is Displaying Older Comment For Each Page</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsMailingAdminForEachComments <em>Is Mailing Admin For Each Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsHeldingCommentForModeration <em>Is Helding Comment For Moderation</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingAdminApprovement <em>Is Asking Admin Approvement</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingPreviousAdminApprovement <em>Is Asking Previous Admin Approvement</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsShowingAvatar <em>Is Showing Avatar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings()
 * @model
 * @generated
 */
public interface DiscussionSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Article Days For Auto Close Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Article Days For Auto Close Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Article Days For Auto Close Comments</em>' attribute.
	 * @see #setNumberArticleDaysForAutoCloseComments(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_NumberArticleDaysForAutoCloseComments()
	 * @model
	 * @generated
	 */
	int getNumberArticleDaysForAutoCloseComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberArticleDaysForAutoCloseComments <em>Number Article Days For Auto Close Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Article Days For Auto Close Comments</em>' attribute.
	 * @see #getNumberArticleDaysForAutoCloseComments()
	 * @generated
	 */
	void setNumberArticleDaysForAutoCloseComments(int value);

	/**
	 * Returns the value of the '<em><b>Nested Comments Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Comments Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Comments Level</em>' attribute.
	 * @see #setNestedCommentsLevel(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_NestedCommentsLevel()
	 * @model
	 * @generated
	 */
	int getNestedCommentsLevel();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNestedCommentsLevel <em>Nested Comments Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Comments Level</em>' attribute.
	 * @see #getNestedCommentsLevel()
	 * @generated
	 */
	void setNestedCommentsLevel(int value);

	/**
	 * Returns the value of the '<em><b>Number Comments Per Page For Breaked Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Comments Per Page For Breaked Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Comments Per Page For Breaked Comments</em>' attribute.
	 * @see #setNumberCommentsPerPageForBreakedComments(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_NumberCommentsPerPageForBreakedComments()
	 * @model
	 * @generated
	 */
	int getNumberCommentsPerPageForBreakedComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberCommentsPerPageForBreakedComments <em>Number Comments Per Page For Breaked Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Comments Per Page For Breaked Comments</em>' attribute.
	 * @see #getNumberCommentsPerPageForBreakedComments()
	 * @generated
	 */
	void setNumberCommentsPerPageForBreakedComments(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Links In Comment For Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Links In Comment For Moderation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Links In Comment For Moderation</em>' attribute.
	 * @see #setNumberOfLinksInCommentForModeration(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_NumberOfLinksInCommentForModeration()
	 * @model
	 * @generated
	 */
	int getNumberOfLinksInCommentForModeration();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getNumberOfLinksInCommentForModeration <em>Number Of Links In Comment For Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Links In Comment For Moderation</em>' attribute.
	 * @see #getNumberOfLinksInCommentForModeration()
	 * @generated
	 */
	void setNumberOfLinksInCommentForModeration(int value);

	/**
	 * Returns the value of the '<em><b>Moderated Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moderated Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderated Words</em>' attribute.
	 * @see #setModeratedWords(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_ModeratedWords()
	 * @model
	 * @generated
	 */
	String getModeratedWords();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getModeratedWords <em>Moderated Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderated Words</em>' attribute.
	 * @see #getModeratedWords()
	 * @generated
	 */
	void setModeratedWords(String value);

	/**
	 * Returns the value of the '<em><b>Forbidden Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbidden Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbidden Words</em>' attribute.
	 * @see #setForbiddenWords(String)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_ForbiddenWords()
	 * @model
	 * @generated
	 */
	String getForbiddenWords();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getForbiddenWords <em>Forbidden Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forbidden Words</em>' attribute.
	 * @see #getForbiddenWords()
	 * @generated
	 */
	void setForbiddenWords(String value);

	/**
	 * Returns the value of the '<em><b>Max Avatar Rating</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.avatarRating}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Avatar Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Avatar Rating</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.avatarRating
	 * @see #setMaxAvatarRating(avatarRating)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_MaxAvatarRating()
	 * @model
	 * @generated
	 */
	avatarRating getMaxAvatarRating();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getMaxAvatarRating <em>Max Avatar Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Avatar Rating</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.avatarRating
	 * @see #getMaxAvatarRating()
	 * @generated
	 */
	void setMaxAvatarRating(avatarRating value);

	/**
	 * Returns the value of the '<em><b>User Default Avatar</b></em>' attribute.
	 * The literals are from the enumeration {@link org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Default Avatar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Default Avatar</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar
	 * @see #setUserDefaultAvatar(defaultAvatar)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_UserDefaultAvatar()
	 * @model
	 * @generated
	 */
	defaultAvatar getUserDefaultAvatar();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#getUserDefaultAvatar <em>User Default Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Default Avatar</em>' attribute.
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.defaultAvatar
	 * @see #getUserDefaultAvatar()
	 * @generated
	 */
	void setUserDefaultAvatar(defaultAvatar value);

	/**
	 * Returns the value of the '<em><b>Is Notifying Linked Blogs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Notifying Linked Blogs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Notifying Linked Blogs</em>' attribute.
	 * @see #setIsNotifyingLinkedBlogs(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsNotifyingLinkedBlogs()
	 * @model
	 * @generated
	 */
	boolean isIsNotifyingLinkedBlogs();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsNotifyingLinkedBlogs <em>Is Notifying Linked Blogs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Notifying Linked Blogs</em>' attribute.
	 * @see #isIsNotifyingLinkedBlogs()
	 * @generated
	 */
	void setIsNotifyingLinkedBlogs(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Allowing Link Notifications From Blogs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Allowing Link Notifications From Blogs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Allowing Link Notifications From Blogs</em>' attribute.
	 * @see #setIsAllowingLinkNotificationsFromBlogs(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsAllowingLinkNotificationsFromBlogs()
	 * @model
	 * @generated
	 */
	boolean isIsAllowingLinkNotificationsFromBlogs();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingLinkNotificationsFromBlogs <em>Is Allowing Link Notifications From Blogs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Allowing Link Notifications From Blogs</em>' attribute.
	 * @see #isIsAllowingLinkNotificationsFromBlogs()
	 * @generated
	 */
	void setIsAllowingLinkNotificationsFromBlogs(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Allowing Public Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Allowing Public Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Allowing Public Comments</em>' attribute.
	 * @see #setIsAllowingPublicComments(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsAllowingPublicComments()
	 * @model
	 * @generated
	 */
	boolean isIsAllowingPublicComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingPublicComments <em>Is Allowing Public Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Allowing Public Comments</em>' attribute.
	 * @see #isIsAllowingPublicComments()
	 * @generated
	 */
	void setIsAllowingPublicComments(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Asking Name And Mail Comment Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Asking Name And Mail Comment Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Asking Name And Mail Comment Author</em>' attribute.
	 * @see #setIsAskingNameAndMailCommentAuthor(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsAskingNameAndMailCommentAuthor()
	 * @model
	 * @generated
	 */
	boolean isIsAskingNameAndMailCommentAuthor();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingNameAndMailCommentAuthor <em>Is Asking Name And Mail Comment Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Asking Name And Mail Comment Author</em>' attribute.
	 * @see #isIsAskingNameAndMailCommentAuthor()
	 * @generated
	 */
	void setIsAskingNameAndMailCommentAuthor(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Allowing Anonymous Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Allowing Anonymous Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Allowing Anonymous Comments</em>' attribute.
	 * @see #setIsAllowingAnonymousComments(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsAllowingAnonymousComments()
	 * @model
	 * @generated
	 */
	boolean isIsAllowingAnonymousComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAllowingAnonymousComments <em>Is Allowing Anonymous Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Allowing Anonymous Comments</em>' attribute.
	 * @see #isIsAllowingAnonymousComments()
	 * @generated
	 */
	void setIsAllowingAnonymousComments(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Breaking Comments Into Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Breaking Comments Into Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Breaking Comments Into Pages</em>' attribute.
	 * @see #setIsBreakingCommentsIntoPages(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsBreakingCommentsIntoPages()
	 * @model
	 * @generated
	 */
	boolean isIsBreakingCommentsIntoPages();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsBreakingCommentsIntoPages <em>Is Breaking Comments Into Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Breaking Comments Into Pages</em>' attribute.
	 * @see #isIsBreakingCommentsIntoPages()
	 * @generated
	 */
	void setIsBreakingCommentsIntoPages(boolean value);

	/**
	 * Returns the value of the '<em><b>Isdisplaying Last Page For Breaked Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isdisplaying Last Page For Breaked Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isdisplaying Last Page For Breaked Comments</em>' attribute.
	 * @see #setIsdisplayingLastPageForBreakedComments(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsdisplayingLastPageForBreakedComments()
	 * @model
	 * @generated
	 */
	boolean isIsdisplayingLastPageForBreakedComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsdisplayingLastPageForBreakedComments <em>Isdisplaying Last Page For Breaked Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isdisplaying Last Page For Breaked Comments</em>' attribute.
	 * @see #isIsdisplayingLastPageForBreakedComments()
	 * @generated
	 */
	void setIsdisplayingLastPageForBreakedComments(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Displaying Older Comment For Each Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Displaying Older Comment For Each Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Displaying Older Comment For Each Page</em>' attribute.
	 * @see #setIsDisplayingOlderCommentForEachPage(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsDisplayingOlderCommentForEachPage()
	 * @model
	 * @generated
	 */
	boolean isIsDisplayingOlderCommentForEachPage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsDisplayingOlderCommentForEachPage <em>Is Displaying Older Comment For Each Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Displaying Older Comment For Each Page</em>' attribute.
	 * @see #isIsDisplayingOlderCommentForEachPage()
	 * @generated
	 */
	void setIsDisplayingOlderCommentForEachPage(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Mailing Admin For Each Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mailing Admin For Each Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mailing Admin For Each Comments</em>' attribute.
	 * @see #setIsMailingAdminForEachComments(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsMailingAdminForEachComments()
	 * @model
	 * @generated
	 */
	boolean isIsMailingAdminForEachComments();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsMailingAdminForEachComments <em>Is Mailing Admin For Each Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mailing Admin For Each Comments</em>' attribute.
	 * @see #isIsMailingAdminForEachComments()
	 * @generated
	 */
	void setIsMailingAdminForEachComments(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Helding Comment For Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Helding Comment For Moderation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Helding Comment For Moderation</em>' attribute.
	 * @see #setIsHeldingCommentForModeration(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsHeldingCommentForModeration()
	 * @model
	 * @generated
	 */
	boolean isIsHeldingCommentForModeration();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsHeldingCommentForModeration <em>Is Helding Comment For Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Helding Comment For Moderation</em>' attribute.
	 * @see #isIsHeldingCommentForModeration()
	 * @generated
	 */
	void setIsHeldingCommentForModeration(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Asking Admin Approvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Asking Admin Approvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Asking Admin Approvement</em>' attribute.
	 * @see #setIsAskingAdminApprovement(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsAskingAdminApprovement()
	 * @model
	 * @generated
	 */
	boolean isIsAskingAdminApprovement();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingAdminApprovement <em>Is Asking Admin Approvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Asking Admin Approvement</em>' attribute.
	 * @see #isIsAskingAdminApprovement()
	 * @generated
	 */
	void setIsAskingAdminApprovement(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Asking Previous Admin Approvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Asking Previous Admin Approvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Asking Previous Admin Approvement</em>' attribute.
	 * @see #setIsAskingPreviousAdminApprovement(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsAskingPreviousAdminApprovement()
	 * @model
	 * @generated
	 */
	boolean isIsAskingPreviousAdminApprovement();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsAskingPreviousAdminApprovement <em>Is Asking Previous Admin Approvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Asking Previous Admin Approvement</em>' attribute.
	 * @see #isIsAskingPreviousAdminApprovement()
	 * @generated
	 */
	void setIsAskingPreviousAdminApprovement(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Showing Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Showing Avatar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Showing Avatar</em>' attribute.
	 * @see #setIsShowingAvatar(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getDiscussionSettings_IsShowingAvatar()
	 * @model
	 * @generated
	 */
	boolean isIsShowingAvatar();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.DiscussionSettings#isIsShowingAvatar <em>Is Showing Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Showing Avatar</em>' attribute.
	 * @see #isIsShowingAvatar()
	 * @generated
	 */
	void setIsShowingAvatar(boolean value);

} // DiscussionSettings
