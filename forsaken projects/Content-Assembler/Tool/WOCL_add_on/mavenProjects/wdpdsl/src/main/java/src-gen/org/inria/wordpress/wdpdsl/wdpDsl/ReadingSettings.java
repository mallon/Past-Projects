/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getMaxNumberPostsForBlogPages <em>Max Number Posts For Blog Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getNumberRecentItemForFeeds <em>Number Recent Item For Feeds</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticFrontPage <em>Static Front Page</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticPostPage <em>Static Post Page</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsDisplayingLastPostInFront <em>Is Displaying Last Post In Front</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsIndexed <em>Is Indexed</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsShowingFullTextForFeed <em>Is Showing Full Text For Feed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings()
 * @model
 * @generated
 */
public interface ReadingSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Number Posts For Blog Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Posts For Blog Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Posts For Blog Pages</em>' attribute.
	 * @see #setMaxNumberPostsForBlogPages(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_MaxNumberPostsForBlogPages()
	 * @model
	 * @generated
	 */
	int getMaxNumberPostsForBlogPages();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getMaxNumberPostsForBlogPages <em>Max Number Posts For Blog Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Posts For Blog Pages</em>' attribute.
	 * @see #getMaxNumberPostsForBlogPages()
	 * @generated
	 */
	void setMaxNumberPostsForBlogPages(int value);

	/**
	 * Returns the value of the '<em><b>Number Recent Item For Feeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Recent Item For Feeds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Recent Item For Feeds</em>' attribute.
	 * @see #setNumberRecentItemForFeeds(int)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_NumberRecentItemForFeeds()
	 * @model
	 * @generated
	 */
	int getNumberRecentItemForFeeds();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getNumberRecentItemForFeeds <em>Number Recent Item For Feeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Recent Item For Feeds</em>' attribute.
	 * @see #getNumberRecentItemForFeeds()
	 * @generated
	 */
	void setNumberRecentItemForFeeds(int value);

	/**
	 * Returns the value of the '<em><b>Static Front Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Front Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Front Page</em>' reference.
	 * @see #setStaticFrontPage(Page)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_StaticFrontPage()
	 * @model
	 * @generated
	 */
	Page getStaticFrontPage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticFrontPage <em>Static Front Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Front Page</em>' reference.
	 * @see #getStaticFrontPage()
	 * @generated
	 */
	void setStaticFrontPage(Page value);

	/**
	 * Returns the value of the '<em><b>Static Post Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Post Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Post Page</em>' reference.
	 * @see #setStaticPostPage(Page)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_StaticPostPage()
	 * @model
	 * @generated
	 */
	Page getStaticPostPage();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#getStaticPostPage <em>Static Post Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Post Page</em>' reference.
	 * @see #getStaticPostPage()
	 * @generated
	 */
	void setStaticPostPage(Page value);

	/**
	 * Returns the value of the '<em><b>Is Displaying Last Post In Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Displaying Last Post In Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Displaying Last Post In Front</em>' attribute.
	 * @see #setIsDisplayingLastPostInFront(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_IsDisplayingLastPostInFront()
	 * @model
	 * @generated
	 */
	boolean isIsDisplayingLastPostInFront();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsDisplayingLastPostInFront <em>Is Displaying Last Post In Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Displaying Last Post In Front</em>' attribute.
	 * @see #isIsDisplayingLastPostInFront()
	 * @generated
	 */
	void setIsDisplayingLastPostInFront(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Indexed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Indexed</em>' attribute.
	 * @see #setIsIndexed(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_IsIndexed()
	 * @model
	 * @generated
	 */
	boolean isIsIndexed();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsIndexed <em>Is Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indexed</em>' attribute.
	 * @see #isIsIndexed()
	 * @generated
	 */
	void setIsIndexed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Showing Full Text For Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Showing Full Text For Feed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Showing Full Text For Feed</em>' attribute.
	 * @see #setIsShowingFullTextForFeed(boolean)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getReadingSettings_IsShowingFullTextForFeed()
	 * @model
	 * @generated
	 */
	boolean isIsShowingFullTextForFeed();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.ReadingSettings#isIsShowingFullTextForFeed <em>Is Showing Full Text For Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Showing Full Text For Feed</em>' attribute.
	 * @see #isIsShowingFullTextForFeed()
	 * @generated
	 */
	void setIsShowingFullTextForFeed(boolean value);

} // ReadingSettings
