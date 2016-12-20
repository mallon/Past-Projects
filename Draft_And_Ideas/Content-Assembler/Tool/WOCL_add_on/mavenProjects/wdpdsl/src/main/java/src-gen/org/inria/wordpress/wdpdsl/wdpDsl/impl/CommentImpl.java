/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Comment;
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.CommentImpl#getCommentPostPage <em>Comment Post Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected String authorName = AUTHOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentPostPage() <em>Comment Post Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentPostPage()
	 * @generated
	 * @ordered
	 */
	protected PostPage commentPostPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.COMMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.COMMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorName(String newAuthorName) {
		String oldAuthorName = authorName;
		authorName = newAuthorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.COMMENT__AUTHOR_NAME, oldAuthorName, authorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPage getCommentPostPage() {
		if (commentPostPage != null && commentPostPage.eIsProxy()) {
			InternalEObject oldCommentPostPage = (InternalEObject)commentPostPage;
			commentPostPage = (PostPage)eResolveProxy(oldCommentPostPage);
			if (commentPostPage != oldCommentPostPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.COMMENT__COMMENT_POST_PAGE, oldCommentPostPage, commentPostPage));
			}
		}
		return commentPostPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPage basicGetCommentPostPage() {
		return commentPostPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentPostPage(PostPage newCommentPostPage) {
		PostPage oldCommentPostPage = commentPostPage;
		commentPostPage = newCommentPostPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.COMMENT__COMMENT_POST_PAGE, oldCommentPostPage, commentPostPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.COMMENT__NAME:
				return getName();
			case WdpDslPackage.COMMENT__CONTENT:
				return getContent();
			case WdpDslPackage.COMMENT__AUTHOR_NAME:
				return getAuthorName();
			case WdpDslPackage.COMMENT__COMMENT_POST_PAGE:
				if (resolve) return getCommentPostPage();
				return basicGetCommentPostPage();
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
			case WdpDslPackage.COMMENT__NAME:
				setName((String)newValue);
				return;
			case WdpDslPackage.COMMENT__CONTENT:
				setContent((String)newValue);
				return;
			case WdpDslPackage.COMMENT__AUTHOR_NAME:
				setAuthorName((String)newValue);
				return;
			case WdpDslPackage.COMMENT__COMMENT_POST_PAGE:
				setCommentPostPage((PostPage)newValue);
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
			case WdpDslPackage.COMMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WdpDslPackage.COMMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case WdpDslPackage.COMMENT__AUTHOR_NAME:
				setAuthorName(AUTHOR_NAME_EDEFAULT);
				return;
			case WdpDslPackage.COMMENT__COMMENT_POST_PAGE:
				setCommentPostPage((PostPage)null);
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
			case WdpDslPackage.COMMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WdpDslPackage.COMMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case WdpDslPackage.COMMENT__AUTHOR_NAME:
				return AUTHOR_NAME_EDEFAULT == null ? authorName != null : !AUTHOR_NAME_EDEFAULT.equals(authorName);
			case WdpDslPackage.COMMENT__COMMENT_POST_PAGE:
				return commentPostPage != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", content: ");
		result.append(content);
		result.append(", authorName: ");
		result.append(authorName);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
