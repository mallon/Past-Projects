/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.inria.wordpress.wdpdsl.wdpDsl.Page;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;
import org.inria.wordpress.wdpdsl.wdpDsl.WidgetPage;
import org.inria.wordpress.wdpdsl.wdpDsl.pagesSorter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl#getWidgetPagesSorter <em>Widget Pages Sorter</em>}</li>
 *   <li>{@link org.inria.wordpress.wdpdsl.wdpDsl.impl.WidgetPageImpl#getIdPageExcluded <em>Id Page Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetPageImpl extends MinimalEObjectImpl.Container implements WidgetPage {
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
	 * The default value of the '{@link #getWidgetPagesSorter() <em>Widget Pages Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetPagesSorter()
	 * @generated
	 * @ordered
	 */
	protected static final pagesSorter WIDGET_PAGES_SORTER_EDEFAULT = pagesSorter.PAGE_TITLE;

	/**
	 * The cached value of the '{@link #getWidgetPagesSorter() <em>Widget Pages Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetPagesSorter()
	 * @generated
	 * @ordered
	 */
	protected pagesSorter widgetPagesSorter = WIDGET_PAGES_SORTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdPageExcluded() <em>Id Page Excluded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPageExcluded()
	 * @generated
	 * @ordered
	 */
	protected Page idPageExcluded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdpDslPackage.Literals.WIDGET_PAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pagesSorter getWidgetPagesSorter() {
		return widgetPagesSorter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetPagesSorter(pagesSorter newWidgetPagesSorter) {
		pagesSorter oldWidgetPagesSorter = widgetPagesSorter;
		widgetPagesSorter = newWidgetPagesSorter == null ? WIDGET_PAGES_SORTER_EDEFAULT : newWidgetPagesSorter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_PAGE__WIDGET_PAGES_SORTER, oldWidgetPagesSorter, widgetPagesSorter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getIdPageExcluded() {
		if (idPageExcluded != null && idPageExcluded.eIsProxy()) {
			InternalEObject oldIdPageExcluded = (InternalEObject)idPageExcluded;
			idPageExcluded = (Page)eResolveProxy(oldIdPageExcluded);
			if (idPageExcluded != oldIdPageExcluded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdpDslPackage.WIDGET_PAGE__ID_PAGE_EXCLUDED, oldIdPageExcluded, idPageExcluded));
			}
		}
		return idPageExcluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetIdPageExcluded() {
		return idPageExcluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPageExcluded(Page newIdPageExcluded) {
		Page oldIdPageExcluded = idPageExcluded;
		idPageExcluded = newIdPageExcluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdpDslPackage.WIDGET_PAGE__ID_PAGE_EXCLUDED, oldIdPageExcluded, idPageExcluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdpDslPackage.WIDGET_PAGE__TITLE:
				return getTitle();
			case WdpDslPackage.WIDGET_PAGE__WIDGET_PAGES_SORTER:
				return getWidgetPagesSorter();
			case WdpDslPackage.WIDGET_PAGE__ID_PAGE_EXCLUDED:
				if (resolve) return getIdPageExcluded();
				return basicGetIdPageExcluded();
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
			case WdpDslPackage.WIDGET_PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case WdpDslPackage.WIDGET_PAGE__WIDGET_PAGES_SORTER:
				setWidgetPagesSorter((pagesSorter)newValue);
				return;
			case WdpDslPackage.WIDGET_PAGE__ID_PAGE_EXCLUDED:
				setIdPageExcluded((Page)newValue);
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
			case WdpDslPackage.WIDGET_PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_PAGE__WIDGET_PAGES_SORTER:
				setWidgetPagesSorter(WIDGET_PAGES_SORTER_EDEFAULT);
				return;
			case WdpDslPackage.WIDGET_PAGE__ID_PAGE_EXCLUDED:
				setIdPageExcluded((Page)null);
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
			case WdpDslPackage.WIDGET_PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WdpDslPackage.WIDGET_PAGE__WIDGET_PAGES_SORTER:
				return widgetPagesSorter != WIDGET_PAGES_SORTER_EDEFAULT;
			case WdpDslPackage.WIDGET_PAGE__ID_PAGE_EXCLUDED:
				return idPageExcluded != null;
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
		result.append(", widgetPagesSorter: ");
		result.append(widgetPagesSorter);
		result.append(')');
		return result.toString();
	}

} //WidgetPageImpl
