/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>pages Sorter</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getpagesSorter()
 * @model
 * @generated
 */
public enum pagesSorter implements Enumerator {
	/**
	 * The '<em><b>Page Title</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_TITLE(0, "pageTitle", "page_title"),

	/**
	 * The '<em><b>Page Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_ORDER(1, "pageOrder", "menu_order"),

	/**
	 * The '<em><b>Page Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_ID_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_ID(2, "pageId", "page_id");

	/**
	 * The '<em><b>Page Title</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Title</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_TITLE
	 * @model name="pageTitle" literal="page_title"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_TITLE_VALUE = 0;

	/**
	 * The '<em><b>Page Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Order</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_ORDER
	 * @model name="pageOrder" literal="menu_order"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_ORDER_VALUE = 1;

	/**
	 * The '<em><b>Page Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_ID
	 * @model name="pageId" literal="page_id"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_ID_VALUE = 2;

	/**
	 * An array of all the '<em><b>pages Sorter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final pagesSorter[] VALUES_ARRAY =
		new pagesSorter[] {
			PAGE_TITLE,
			PAGE_ORDER,
			PAGE_ID,
		};

	/**
	 * A public read-only list of all the '<em><b>pages Sorter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<pagesSorter> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>pages Sorter</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pagesSorter get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			pagesSorter result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>pages Sorter</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pagesSorter getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			pagesSorter result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>pages Sorter</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pagesSorter get(int value) {
		switch (value) {
			case PAGE_TITLE_VALUE: return PAGE_TITLE;
			case PAGE_ORDER_VALUE: return PAGE_ORDER;
			case PAGE_ID_VALUE: return PAGE_ID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private pagesSorter(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //pagesSorter
