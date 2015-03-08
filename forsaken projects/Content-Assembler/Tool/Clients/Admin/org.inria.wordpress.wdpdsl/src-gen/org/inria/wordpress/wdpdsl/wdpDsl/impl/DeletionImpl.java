/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.inria.wordpress.wdpdsl.wdpDsl.Deletion;
import org.inria.wordpress.wdpdsl.wdpDsl.PostDateAuthor;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.functionalities;
import org.inria.wordpress.wdpdsl.wdpDsl.themes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deletion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getPostsByTitle <em>Posts By Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getPagesByTitle <em>Pages By Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getUsersByLogin <em>Users By Login</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getMediasByTitle <em>Medias By Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getFunctionalitiesByName <em>Functionalities By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getThemesByName <em>Themes By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getCategoriesByName <em>Categories By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getTagsByName <em>Tags By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getMenusByName <em>Menus By Name</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.DeletionImpl#getCommentsByPostDateAuthor <em>Comments By Post Date Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeletionImpl extends MinimalEObjectImpl.Container implements Deletion {
	/**
	 * The cached value of the '{@link #getPostsByTitle() <em>Posts By Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostsByTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postsByTitle;

	/**
	 * The cached value of the '{@link #getPagesByTitle() <em>Pages By Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagesByTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pagesByTitle;

	/**
	 * The cached value of the '{@link #getUsersByLogin() <em>Users By Login</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsersByLogin()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usersByLogin;

	/**
	 * The cached value of the '{@link #getMediasByTitle() <em>Medias By Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediasByTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mediasByTitle;

	/**
	 * The cached value of the '{@link #getFunctionalitiesByName() <em>Functionalities By Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalitiesByName()
	 * @generated
	 * @ordered
	 */
	protected EList<functionalities> functionalitiesByName;

	/**
	 * The cached value of the '{@link #getThemesByName() <em>Themes By Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemesByName()
	 * @generated
	 * @ordered
	 */
	protected EList<themes> themesByName;

	/**
	 * The cached value of the '{@link #getCategoriesByName() <em>Categories By Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriesByName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> categoriesByName;

	/**
	 * The cached value of the '{@link #getTagsByName() <em>Tags By Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagsByName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tagsByName;

	/**
	 * The cached value of the '{@link #getMenusByName() <em>Menus By Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenusByName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> menusByName;

	/**
	 * The cached value of the '{@link #getCommentsByPostDateAuthor() <em>Comments By Post Date Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsByPostDateAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<PostDateAuthor> commentsByPostDateAuthor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.DELETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPostsByTitle() {
		if (postsByTitle == null) {
			postsByTitle = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__POSTS_BY_TITLE);
		}
		return postsByTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPagesByTitle() {
		if (pagesByTitle == null) {
			pagesByTitle = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__PAGES_BY_TITLE);
		}
		return pagesByTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsersByLogin() {
		if (usersByLogin == null) {
			usersByLogin = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__USERS_BY_LOGIN);
		}
		return usersByLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMediasByTitle() {
		if (mediasByTitle == null) {
			mediasByTitle = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__MEDIAS_BY_TITLE);
		}
		return mediasByTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<functionalities> getFunctionalitiesByName() {
		if (functionalitiesByName == null) {
			functionalitiesByName = new EDataTypeEList<functionalities>(functionalities.class, this, WdpDslPackage.DELETION__FUNCTIONALITIES_BY_NAME);
		}
		return functionalitiesByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<themes> getThemesByName() {
		if (themesByName == null) {
			themesByName = new EDataTypeEList<themes>(themes.class, this, WdpDslPackage.DELETION__THEMES_BY_NAME);
		}
		return themesByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCategoriesByName() {
		if (categoriesByName == null) {
			categoriesByName = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__CATEGORIES_BY_NAME);
		}
		return categoriesByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTagsByName() {
		if (tagsByName == null) {
			tagsByName = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__TAGS_BY_NAME);
		}
		return tagsByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMenusByName() {
		if (menusByName == null) {
			menusByName = new EDataTypeEList<String>(String.class, this, WdpDslPackage.DELETION__MENUS_BY_NAME);
		}
		return menusByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostDateAuthor> getCommentsByPostDateAuthor() {
		if (commentsByPostDateAuthor == null) {
			commentsByPostDateAuthor = new EObjectContainmentEList<PostDateAuthor>(PostDateAuthor.class, this, WdpDslPackage.DELETION__COMMENTS_BY_POST_DATE_AUTHOR);
		}
		return commentsByPostDateAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdpDslPackage.DELETION__COMMENTS_BY_POST_DATE_AUTHOR:
				return ((InternalEList<?>)getCommentsByPostDateAuthor()).basicRemove(otherEnd, msgs);
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
			case WdpDslPackage.DELETION__POSTS_BY_TITLE:
				return getPostsByTitle();
			case WdpDslPackage.DELETION__PAGES_BY_TITLE:
				return getPagesByTitle();
			case WdpDslPackage.DELETION__USERS_BY_LOGIN:
				return getUsersByLogin();
			case WdpDslPackage.DELETION__MEDIAS_BY_TITLE:
				return getMediasByTitle();
			case WdpDslPackage.DELETION__FUNCTIONALITIES_BY_NAME:
				return getFunctionalitiesByName();
			case WdpDslPackage.DELETION__THEMES_BY_NAME:
				return getThemesByName();
			case WdpDslPackage.DELETION__CATEGORIES_BY_NAME:
				return getCategoriesByName();
			case WdpDslPackage.DELETION__TAGS_BY_NAME:
				return getTagsByName();
			case WdpDslPackage.DELETION__MENUS_BY_NAME:
				return getMenusByName();
			case WdpDslPackage.DELETION__COMMENTS_BY_POST_DATE_AUTHOR:
				return getCommentsByPostDateAuthor();
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
			case WdpDslPackage.DELETION__POSTS_BY_TITLE:
				getPostsByTitle().clear();
				getPostsByTitle().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__PAGES_BY_TITLE:
				getPagesByTitle().clear();
				getPagesByTitle().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__USERS_BY_LOGIN:
				getUsersByLogin().clear();
				getUsersByLogin().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__MEDIAS_BY_TITLE:
				getMediasByTitle().clear();
				getMediasByTitle().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__FUNCTIONALITIES_BY_NAME:
				getFunctionalitiesByName().clear();
				getFunctionalitiesByName().addAll((Collection<? extends functionalities>)newValue);
				return;
			case WdpDslPackage.DELETION__THEMES_BY_NAME:
				getThemesByName().clear();
				getThemesByName().addAll((Collection<? extends themes>)newValue);
				return;
			case WdpDslPackage.DELETION__CATEGORIES_BY_NAME:
				getCategoriesByName().clear();
				getCategoriesByName().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__TAGS_BY_NAME:
				getTagsByName().clear();
				getTagsByName().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__MENUS_BY_NAME:
				getMenusByName().clear();
				getMenusByName().addAll((Collection<? extends String>)newValue);
				return;
			case WdpDslPackage.DELETION__COMMENTS_BY_POST_DATE_AUTHOR:
				getCommentsByPostDateAuthor().clear();
				getCommentsByPostDateAuthor().addAll((Collection<? extends PostDateAuthor>)newValue);
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
			case WdpDslPackage.DELETION__POSTS_BY_TITLE:
				getPostsByTitle().clear();
				return;
			case WdpDslPackage.DELETION__PAGES_BY_TITLE:
				getPagesByTitle().clear();
				return;
			case WdpDslPackage.DELETION__USERS_BY_LOGIN:
				getUsersByLogin().clear();
				return;
			case WdpDslPackage.DELETION__MEDIAS_BY_TITLE:
				getMediasByTitle().clear();
				return;
			case WdpDslPackage.DELETION__FUNCTIONALITIES_BY_NAME:
				getFunctionalitiesByName().clear();
				return;
			case WdpDslPackage.DELETION__THEMES_BY_NAME:
				getThemesByName().clear();
				return;
			case WdpDslPackage.DELETION__CATEGORIES_BY_NAME:
				getCategoriesByName().clear();
				return;
			case WdpDslPackage.DELETION__TAGS_BY_NAME:
				getTagsByName().clear();
				return;
			case WdpDslPackage.DELETION__MENUS_BY_NAME:
				getMenusByName().clear();
				return;
			case WdpDslPackage.DELETION__COMMENTS_BY_POST_DATE_AUTHOR:
				getCommentsByPostDateAuthor().clear();
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
			case WdpDslPackage.DELETION__POSTS_BY_TITLE:
				return postsByTitle != null && !postsByTitle.isEmpty();
			case WdpDslPackage.DELETION__PAGES_BY_TITLE:
				return pagesByTitle != null && !pagesByTitle.isEmpty();
			case WdpDslPackage.DELETION__USERS_BY_LOGIN:
				return usersByLogin != null && !usersByLogin.isEmpty();
			case WdpDslPackage.DELETION__MEDIAS_BY_TITLE:
				return mediasByTitle != null && !mediasByTitle.isEmpty();
			case WdpDslPackage.DELETION__FUNCTIONALITIES_BY_NAME:
				return functionalitiesByName != null && !functionalitiesByName.isEmpty();
			case WdpDslPackage.DELETION__THEMES_BY_NAME:
				return themesByName != null && !themesByName.isEmpty();
			case WdpDslPackage.DELETION__CATEGORIES_BY_NAME:
				return categoriesByName != null && !categoriesByName.isEmpty();
			case WdpDslPackage.DELETION__TAGS_BY_NAME:
				return tagsByName != null && !tagsByName.isEmpty();
			case WdpDslPackage.DELETION__MENUS_BY_NAME:
				return menusByName != null && !menusByName.isEmpty();
			case WdpDslPackage.DELETION__COMMENTS_BY_POST_DATE_AUTHOR:
				return commentsByPostDateAuthor != null && !commentsByPostDateAuthor.isEmpty();
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
		result.append(" (postsByTitle: ");
		result.append(postsByTitle);
		result.append(", pagesByTitle: ");
		result.append(pagesByTitle);
		result.append(", usersByLogin: ");
		result.append(usersByLogin);
		result.append(", mediasByTitle: ");
		result.append(mediasByTitle);
		result.append(", functionalitiesByName: ");
		result.append(functionalitiesByName);
		result.append(", themesByName: ");
		result.append(themesByName);
		result.append(", categoriesByName: ");
		result.append(categoriesByName);
		result.append(", tagsByName: ");
		result.append(tagsByName);
		result.append(", menusByName: ");
		result.append(menusByName);
		result.append(')');
		return result.toString();
	}

} //DeletionImpl
