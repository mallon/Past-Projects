/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Image;
import org.inria.wordpress.wdpdsl.wdpDsl.PostPage_Impl;
import org.inria.wordpress.wdpdsl.wdpDsl.User;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.pageStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Page Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.PostPage_ImplImpl#getFeaturedImage <em>Featured Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostPage_ImplImpl extends MinimalEObjectImpl.Container implements PostPage_Impl {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final pageStatus STATUS_EDEFAULT = pageStatus.PUBLISHED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected pageStatus status = STATUS_EDEFAULT;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected User author;

	/**
	 * The cached value of the '{@link #getFeaturedImage() <em>Featured Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturedImage()
	 * @generated
	 * @ordered
	 */
	protected Image featuredImage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostPage_ImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.POST_PAGE_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE_IMPL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pageStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(pageStatus newStatus) {
		pageStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE_IMPL__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE_IMPL__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (User)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.POST_PAGE_IMPL__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(User newAuthor) {
		User oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE_IMPL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getFeaturedImage() {
		return featuredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturedImage(Image newFeaturedImage, NotificationChain msgs) {
		Image oldFeaturedImage = featuredImage;
		featuredImage = newFeaturedImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE, oldFeaturedImage, newFeaturedImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturedImage(Image newFeaturedImage) {
		if (newFeaturedImage != featuredImage) {
			NotificationChain msgs = null;
			if (featuredImage != null)
				msgs = ((InternalEObject)featuredImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE, null, msgs);
			if (newFeaturedImage != null)
				msgs = ((InternalEObject)newFeaturedImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE, null, msgs);
			msgs = basicSetFeaturedImage(newFeaturedImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE, newFeaturedImage, newFeaturedImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE:
				return basicSetFeaturedImage(null, msgs);
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
			case WdpDslPackage.POST_PAGE_IMPL__TITLE:
				return getTitle();
			case WdpDslPackage.POST_PAGE_IMPL__STATUS:
				return getStatus();
			case WdpDslPackage.POST_PAGE_IMPL__CONTENT:
				return getContent();
			case WdpDslPackage.POST_PAGE_IMPL__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE:
				return getFeaturedImage();
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
			case WdpDslPackage.POST_PAGE_IMPL__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__STATUS:
				setStatus((pageStatus)newValue);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__CONTENT:
				setContent((String)newValue);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__AUTHOR:
				setAuthor((User)newValue);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE:
				setFeaturedImage((Image)newValue);
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
			case WdpDslPackage.POST_PAGE_IMPL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__AUTHOR:
				setAuthor((User)null);
				return;
			case WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE:
				setFeaturedImage((Image)null);
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
			case WdpDslPackage.POST_PAGE_IMPL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.POST_PAGE_IMPL__STATUS:
				return status != STATUS_EDEFAULT;
			case WdpDslPackage.POST_PAGE_IMPL__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case WdpDslPackage.POST_PAGE_IMPL__AUTHOR:
				return author != null;
			case WdpDslPackage.POST_PAGE_IMPL__FEATURED_IMAGE:
				return featuredImage != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", status: ");
		result.append(status);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //PostPage_ImplImpl
