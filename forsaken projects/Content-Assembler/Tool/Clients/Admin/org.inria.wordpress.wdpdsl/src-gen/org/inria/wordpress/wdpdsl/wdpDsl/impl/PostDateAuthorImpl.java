/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Date Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl#getPostTitle <em>Post Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl#getCommentAuthorName <em>Comment Author Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostDateAuthorImpl#getCommentDate <em>Comment Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostDateAuthorImpl extends MinimalEObjectImpl.Container implements PostDateAuthor {
	/**
	 * The default value of the '{@link #getPostTitle() <em>Post Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostTitle() <em>Post Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostTitle()
	 * @generated
	 * @ordered
	 */
	protected String postTitle = POST_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentAuthorName() <em>Comment Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentAuthorName() <em>Comment Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentAuthorName()
	 * @generated
	 * @ordered
	 */
	protected String commentAuthorName = COMMENT_AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentDate() <em>Comment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentDate()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentDate() <em>Comment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentDate()
	 * @generated
	 * @ordered
	 */
	protected String commentDate = COMMENT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostDateAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.POST_DATE_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostTitle() {
		return postTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostTitle(String newPostTitle) {
		String oldPostTitle = postTitle;
		postTitle = newPostTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_DATE_AUTHOR__POST_TITLE, oldPostTitle, postTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentAuthorName() {
		return commentAuthorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentAuthorName(String newCommentAuthorName) {
		String oldCommentAuthorName = commentAuthorName;
		commentAuthorName = newCommentAuthorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME, oldCommentAuthorName, commentAuthorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentDate() {
		return commentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentDate(String newCommentDate) {
		String oldCommentDate = commentDate;
		commentDate = newCommentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_DATE_AUTHOR__COMMENT_DATE, oldCommentDate, commentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.POST_DATE_AUTHOR__POST_TITLE:
				return getPostTitle();
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME:
				return getCommentAuthorName();
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_DATE:
				return getCommentDate();
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
			case WdpDslPackage.POST_DATE_AUTHOR__POST_TITLE:
				setPostTitle((String)newValue);
				return;
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME:
				setCommentAuthorName((String)newValue);
				return;
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_DATE:
				setCommentDate((String)newValue);
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
			case WdpDslPackage.POST_DATE_AUTHOR__POST_TITLE:
				setPostTitle(POST_TITLE_EDEFAULT);
				return;
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME:
				setCommentAuthorName(COMMENT_AUTHOR_NAME_EDEFAULT);
				return;
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_DATE:
				setCommentDate(COMMENT_DATE_EDEFAULT);
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
			case WdpDslPackage.POST_DATE_AUTHOR__POST_TITLE:
				return POST_TITLE_EDEFAULT == null ? postTitle != null : !POST_TITLE_EDEFAULT.equals(postTitle);
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_AUTHOR_NAME:
				return COMMENT_AUTHOR_NAME_EDEFAULT == null ? commentAuthorName != null : !COMMENT_AUTHOR_NAME_EDEFAULT.equals(commentAuthorName);
			case WdpDslPackage.POST_DATE_AUTHOR__COMMENT_DATE:
				return COMMENT_DATE_EDEFAULT == null ? commentDate != null : !COMMENT_DATE_EDEFAULT.equals(commentDate);
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
		result.append(" (postTitle: ");
		result.append(postTitle);
		result.append(", commentAuthorName: ");
		result.append(commentAuthorName);
		result.append(", commentDate: ");
		result.append(commentDate);
		result.append(')');
		return result.toString();
	}

} //PostDateAuthorImpl
