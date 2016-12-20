/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getGeneral <em>General</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getWriting <em>Writing</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getReading <em>Reading</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getDiscussion <em>Discussion</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getMedia <em>Media</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getPermalinks <em>Permalinks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings()
 * @model
 * @generated
 */
public interface Settings extends EObject {
	/**
	 * Returns the value of the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' containment reference.
	 * @see #setGeneral(GeneralSettings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings_General()
	 * @model containment="true"
	 * @generated
	 */
	GeneralSettings getGeneral();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getGeneral <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' containment reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(GeneralSettings value);

	/**
	 * Returns the value of the '<em><b>Writing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing</em>' containment reference.
	 * @see #setWriting(WritingSettings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings_Writing()
	 * @model containment="true"
	 * @generated
	 */
	WritingSettings getWriting();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getWriting <em>Writing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writing</em>' containment reference.
	 * @see #getWriting()
	 * @generated
	 */
	void setWriting(WritingSettings value);

	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(ReadingSettings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings_Reading()
	 * @model containment="true"
	 * @generated
	 */
	ReadingSettings getReading();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(ReadingSettings value);

	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discussion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' containment reference.
	 * @see #setDiscussion(DiscussionSettings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings_Discussion()
	 * @model containment="true"
	 * @generated
	 */
	DiscussionSettings getDiscussion();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getDiscussion <em>Discussion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion</em>' containment reference.
	 * @see #getDiscussion()
	 * @generated
	 */
	void setDiscussion(DiscussionSettings value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(MediaSettings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings_Media()
	 * @model containment="true"
	 * @generated
	 */
	MediaSettings getMedia();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(MediaSettings value);

	/**
	 * Returns the value of the '<em><b>Permalinks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permalinks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permalinks</em>' containment reference.
	 * @see #setPermalinks(PermalinksSettings)
	 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getSettings_Permalinks()
	 * @model containment="true"
	 * @generated
	 */
	PermalinksSettings getPermalinks();

	/**
	 * Sets the value of the '{@link org.inria.wordpress.wdpdsl.wdpDsl.Settings#getPermalinks <em>Permalinks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permalinks</em>' containment reference.
	 * @see #getPermalinks()
	 * @generated
	 */
	void setPermalinks(PermalinksSettings value);

} // Settings
