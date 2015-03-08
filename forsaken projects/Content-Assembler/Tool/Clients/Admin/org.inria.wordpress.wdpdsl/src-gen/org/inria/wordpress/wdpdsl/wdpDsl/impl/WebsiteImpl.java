/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.inria.wordpress.wdpdsl.wdpDsl.Appearance;
import org.inria.wordpress.wdpdsl.wdpDsl.Category;
import org.inria.wordpress.wdpdsl.wdpDsl.Comment;
import org.inria.wordpress.wdpdsl.wdpDsl.Deletion;
import org.inria.wordpress.wdpdsl.wdpDsl.Functionality;
import org.inria.wordpress.wdpdsl.wdpDsl.Media;
import org.inria.wordpress.wdpdsl.wdpDsl.Page;
import org.inria.wordpress.wdpdsl.wdpDsl.Post;
import org.inria.wordpress.wdpdsl.wdpDsl.Settings;
import org.inria.wordpress.wdpdsl.wdpDsl.Tag;
import org.inria.wordpress.wdpdsl.wdpDsl.User;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.Website;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getAdminUser <em>Admin User</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getMediaLibrary <em>Media Library</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WebsiteImpl#getDeletion <em>Deletion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebsiteImpl extends MinimalEObjectImpl.Container implements Website {
	/**
	 * The cached value of the '{@link #getAdminUser() <em>Admin User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected User adminUser;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected Appearance appearance;

	/**
	 * The cached value of the '{@link #getMediaLibrary() <em>Media Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Media> mediaLibrary;

	/**
	 * The cached value of the '{@link #getFunctionalities() <em>Functionalities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalities()
	 * @generated
	 * @ordered
	 */
	protected EList<Functionality> functionalities;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected Settings settings;

	/**
	 * The cached value of the '{@link #getDeletion() <em>Deletion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletion()
	 * @generated
	 * @ordered
	 */
	protected Deletion deletion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WEBSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAdminUser() {
		if (adminUser != null && adminUser.eIsProxy()) {
			InternalEObject oldAdminUser = (InternalEObject)adminUser;
			adminUser = (User)eResolveProxy(oldAdminUser);
			if (adminUser != oldAdminUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.WEBSITE__ADMIN_USER, oldAdminUser, adminUser));
			}
		}
		return adminUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAdminUser() {
		return adminUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminUser(User newAdminUser) {
		User oldAdminUser = adminUser;
		adminUser = newAdminUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__ADMIN_USER, oldAdminUser, adminUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, WdpDslPackage.WEBSITE__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectContainmentEList<Post>(Post.class, this, WdpDslPackage.WEBSITE__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WdpDslPackage.WEBSITE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance getAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		Appearance oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__APPEARANCE, oldAppearance, newAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(Appearance newAppearance) {
		if (newAppearance != appearance) {
			NotificationChain msgs = null;
			if (appearance != null)
				msgs = ((InternalEObject)appearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WEBSITE__APPEARANCE, null, msgs);
			if (newAppearance != null)
				msgs = ((InternalEObject)newAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WEBSITE__APPEARANCE, null, msgs);
			msgs = basicSetAppearance(newAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__APPEARANCE, newAppearance, newAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Media> getMediaLibrary() {
		if (mediaLibrary == null) {
			mediaLibrary = new EObjectContainmentEList<Media>(Media.class, this, WdpDslPackage.WEBSITE__MEDIA_LIBRARY);
		}
		return mediaLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Functionality> getFunctionalities() {
		if (functionalities == null) {
			functionalities = new EObjectContainmentEList<Functionality>(Functionality.class, this, WdpDslPackage.WEBSITE__FUNCTIONALITIES);
		}
		return functionalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, WdpDslPackage.WEBSITE__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, WdpDslPackage.WEBSITE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, WdpDslPackage.WEBSITE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(Settings newSettings, NotificationChain msgs) {
		Settings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__SETTINGS, oldSettings, newSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(Settings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WEBSITE__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WEBSITE__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deletion getDeletion() {
		return deletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeletion(Deletion newDeletion, NotificationChain msgs) {
		Deletion oldDeletion = deletion;
		deletion = newDeletion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__DELETION, oldDeletion, newDeletion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletion(Deletion newDeletion) {
		if (newDeletion != deletion) {
			NotificationChain msgs = null;
			if (deletion != null)
				msgs = ((InternalEObject)deletion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WEBSITE__DELETION, null, msgs);
			if (newDeletion != null)
				msgs = ((InternalEObject)newDeletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WdpDslPackage.WEBSITE__DELETION, null, msgs);
			msgs = basicSetDeletion(newDeletion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WEBSITE__DELETION, newDeletion, newDeletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.WEBSITE__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__POSTS:
				return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__APPEARANCE:
				return basicSetAppearance(null, msgs);
			case WdpDslPackage.WEBSITE__MEDIA_LIBRARY:
				return ((InternalEList<?>)getMediaLibrary()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__FUNCTIONALITIES:
				return ((InternalEList<?>)getFunctionalities()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case WdpDslPackage.WEBSITE__SETTINGS:
				return basicSetSettings(null, msgs);
			case WdpDslPackage.WEBSITE__DELETION:
				return basicSetDeletion(null, msgs);
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
			case WdpDslPackage.WEBSITE__ADMIN_USER:
				if (resolve) return getAdminUser();
				return basicGetAdminUser();
			case WdpDslPackage.WEBSITE__USERS:
				return getUsers();
			case WdpDslPackage.WEBSITE__POSTS:
				return getPosts();
			case WdpDslPackage.WEBSITE__PAGES:
				return getPages();
			case WdpDslPackage.WEBSITE__APPEARANCE:
				return getAppearance();
			case WdpDslPackage.WEBSITE__MEDIA_LIBRARY:
				return getMediaLibrary();
			case WdpDslPackage.WEBSITE__FUNCTIONALITIES:
				return getFunctionalities();
			case WdpDslPackage.WEBSITE__COMMENTS:
				return getComments();
			case WdpDslPackage.WEBSITE__CATEGORIES:
				return getCategories();
			case WdpDslPackage.WEBSITE__TAGS:
				return getTags();
			case WdpDslPackage.WEBSITE__SETTINGS:
				return getSettings();
			case WdpDslPackage.WEBSITE__DELETION:
				return getDeletion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WdpDslPackage.WEBSITE__ADMIN_USER:
				setAdminUser((User)newValue);
				return;
			case WdpDslPackage.WEBSITE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case WdpDslPackage.WEBSITE__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection<? extends Post>)newValue);
				return;
			case WdpDslPackage.WEBSITE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WdpDslPackage.WEBSITE__APPEARANCE:
				setAppearance((Appearance)newValue);
				return;
			case WdpDslPackage.WEBSITE__MEDIA_LIBRARY:
				getMediaLibrary().clear();
				getMediaLibrary().addAll((Collection<? extends Media>)newValue);
				return;
			case WdpDslPackage.WEBSITE__FUNCTIONALITIES:
				getFunctionalities().clear();
				getFunctionalities().addAll((Collection<? extends Functionality>)newValue);
				return;
			case WdpDslPackage.WEBSITE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case WdpDslPackage.WEBSITE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case WdpDslPackage.WEBSITE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case WdpDslPackage.WEBSITE__SETTINGS:
				setSettings((Settings)newValue);
				return;
			case WdpDslPackage.WEBSITE__DELETION:
				setDeletion((Deletion)newValue);
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
			case WdpDslPackage.WEBSITE__ADMIN_USER:
				setAdminUser((User)null);
				return;
			case WdpDslPackage.WEBSITE__USERS:
				getUsers().clear();
				return;
			case WdpDslPackage.WEBSITE__POSTS:
				getPosts().clear();
				return;
			case WdpDslPackage.WEBSITE__PAGES:
				getPages().clear();
				return;
			case WdpDslPackage.WEBSITE__APPEARANCE:
				setAppearance((Appearance)null);
				return;
			case WdpDslPackage.WEBSITE__MEDIA_LIBRARY:
				getMediaLibrary().clear();
				return;
			case WdpDslPackage.WEBSITE__FUNCTIONALITIES:
				getFunctionalities().clear();
				return;
			case WdpDslPackage.WEBSITE__COMMENTS:
				getComments().clear();
				return;
			case WdpDslPackage.WEBSITE__CATEGORIES:
				getCategories().clear();
				return;
			case WdpDslPackage.WEBSITE__TAGS:
				getTags().clear();
				return;
			case WdpDslPackage.WEBSITE__SETTINGS:
				setSettings((Settings)null);
				return;
			case WdpDslPackage.WEBSITE__DELETION:
				setDeletion((Deletion)null);
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
			case WdpDslPackage.WEBSITE__ADMIN_USER:
				return adminUser != null;
			case WdpDslPackage.WEBSITE__USERS:
				return users != null && !users.isEmpty();
			case WdpDslPackage.WEBSITE__POSTS:
				return posts != null && !posts.isEmpty();
			case WdpDslPackage.WEBSITE__PAGES:
				return pages != null && !pages.isEmpty();
			case WdpDslPackage.WEBSITE__APPEARANCE:
				return appearance != null;
			case WdpDslPackage.WEBSITE__MEDIA_LIBRARY:
				return mediaLibrary != null && !mediaLibrary.isEmpty();
			case WdpDslPackage.WEBSITE__FUNCTIONALITIES:
				return functionalities != null && !functionalities.isEmpty();
			case WdpDslPackage.WEBSITE__COMMENTS:
				return comments != null && !comments.isEmpty();
			case WdpDslPackage.WEBSITE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case WdpDslPackage.WEBSITE__TAGS:
				return tags != null && !tags.isEmpty();
			case WdpDslPackage.WEBSITE__SETTINGS:
				return settings != null;
			case WdpDslPackage.WEBSITE__DELETION:
				return deletion != null;
		}
		return super.eIsSet(featureID);
	}

} //WebsiteImpl
