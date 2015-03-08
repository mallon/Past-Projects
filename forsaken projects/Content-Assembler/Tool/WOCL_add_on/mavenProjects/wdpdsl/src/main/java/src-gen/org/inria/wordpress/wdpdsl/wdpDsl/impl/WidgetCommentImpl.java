/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetComment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCommentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetCommentImpl#getNumberOfDisplayedComments <em>Number Of Displayed Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetCommentImpl extends MinimalEObjectImpl.Container implements WidgetComment {
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
	 * The default value of the '{@link #getNumberOfDisplayedComments() <em>Number Of Displayed Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisplayedComments()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DISPLAYED_COMMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfDisplayedComments() <em>Number Of Displayed Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisplayedComments()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDisplayedComments = NUMBER_OF_DISPLAYED_COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WIDGET_COMMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_COMMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDisplayedComments() {
		return numberOfDisplayedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDisplayedComments(int newNumberOfDisplayedComments) {
		int oldNumberOfDisplayedComments = numberOfDisplayedComments;
		numberOfDisplayedComments = newNumberOfDisplayedComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS, oldNumberOfDisplayedComments, numberOfDisplayedComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.WIDGET_COMMENT__TITLE:
				return getTitle();
			case WdpDslPackage.WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS:
				return getNumberOfDisplayedComments();
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
			case WdpDslPackage.WIDGET_COMMENT__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS:
				setNumberOfDisplayedComments((Integer)newValue);
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
			case WdpDslPackage.WIDGET_COMMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS:
				setNumberOfDisplayedComments(NUMBER_OF_DISPLAYED_COMMENTS_EDEFAULT);
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
			case WdpDslPackage.WIDGET_COMMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.WIDGET_COMMENT__NUMBER_OF_DISPLAYED_COMMENTS:
				return numberOfDisplayedComments != NUMBER_OF_DISPLAYED_COMMENTS_EDEFAULT;
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
		result.append(", numberOfDisplayedComments: ");
		result.append(numberOfDisplayedComments);
		result.append(')');
		return result.toString();
	}

} //WidgetCommentImpl
