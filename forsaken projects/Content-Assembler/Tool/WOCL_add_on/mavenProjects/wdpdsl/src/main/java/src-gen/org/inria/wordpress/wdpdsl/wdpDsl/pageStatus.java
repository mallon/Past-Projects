/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>page Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getpageStatus()
 * @model
 * @generated
 */
public enum pageStatus implements Enumerator {
	/**
	 * The '<em><b>Published</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHED(0, "published", "publish"),

	/**
	 * The '<em><b>Pendingreview</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDINGREVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PENDINGREVIEW(1, "pendingreview", "pending"),

	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(2, "draft", "draft"),

	/**
	 * The '<em><b>Auto Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_DRAFT(3, "autoDraft", "auto-draft"),

	/**
	 * The '<em><b>Trash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRASH_VALUE
	 * @generated
	 * @ordered
	 */
	TRASH(4, "trash", "trash"),

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(5, "private", "private"),

	/**
	 * The '<em><b>New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(6, "new", "new"),

	/**
	 * The '<em><b>Inherit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(7, "inherit", "inherit"),

	/**
	 * The '<em><b>Future</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUTURE_VALUE
	 * @generated
	 * @ordered
	 */
	FUTURE(8, "future", "future");

	/**
	 * The '<em><b>Published</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Published</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED
	 * @model name="published" literal="publish"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHED_VALUE = 0;

	/**
	 * The '<em><b>Pendingreview</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pendingreview</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENDINGREVIEW
	 * @model name="pendingreview" literal="pending"
	 * @generated
	 * @ordered
	 */
	public static final int PENDINGREVIEW_VALUE = 1;

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Draft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 2;

	/**
	 * The '<em><b>Auto Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto Draft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_DRAFT
	 * @model name="autoDraft" literal="auto-draft"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_DRAFT_VALUE = 3;

	/**
	 * The '<em><b>Trash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRASH
	 * @model name="trash"
	 * @generated
	 * @ordered
	 */
	public static final int TRASH_VALUE = 4;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 5;

	/**
	 * The '<em><b>New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model name="new"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 6;

	/**
	 * The '<em><b>Inherit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inherit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT
	 * @model name="inherit"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 7;

	/**
	 * The '<em><b>Future</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Future</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUTURE
	 * @model name="future"
	 * @generated
	 * @ordered
	 */
	public static final int FUTURE_VALUE = 8;

	/**
	 * An array of all the '<em><b>page Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final pageStatus[] VALUES_ARRAY =
		new pageStatus[] {
			PUBLISHED,
			PENDINGREVIEW,
			DRAFT,
			AUTO_DRAFT,
			TRASH,
			PRIVATE,
			NEW,
			INHERIT,
			FUTURE,
		};

	/**
	 * A public read-only list of all the '<em><b>page Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<pageStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>page Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pageStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			pageStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>page Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pageStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			pageStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>page Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pageStatus get(int value) {
		switch (value) {
			case PUBLISHED_VALUE: return PUBLISHED;
			case PENDINGREVIEW_VALUE: return PENDINGREVIEW;
			case DRAFT_VALUE: return DRAFT;
			case AUTO_DRAFT_VALUE: return AUTO_DRAFT;
			case TRASH_VALUE: return TRASH;
			case PRIVATE_VALUE: return PRIVATE;
			case NEW_VALUE: return NEW;
			case INHERIT_VALUE: return INHERIT;
			case FUTURE_VALUE: return FUTURE;
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
	private pageStatus(int value, String name, String literal) {
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
	
} //pageStatus
