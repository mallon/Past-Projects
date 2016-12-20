/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>url Form</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#geturlForm()
 * @model
 * @generated
 */
public enum urlForm implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "defaultForm"),

	/**
	 * The '<em><b>Day And Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_AND_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_AND_NAME(1, "dayAndName", "dayAndName"),

	/**
	 * The '<em><b>Month And Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_AND_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH_AND_NAME(2, "monthAndName", "monthAndName"),

	/**
	 * The '<em><b>Numeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(3, "numeric", "numeric"),

	/**
	 * The '<em><b>Post Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	POST_NAME(4, "postName", "postName"),

	/**
	 * The '<em><b>Custom Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_STRUCTURE(5, "customStructure", "customStructure");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default" literal="defaultForm"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Day And Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day And Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_AND_NAME
	 * @model name="dayAndName"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_AND_NAME_VALUE = 1;

	/**
	 * The '<em><b>Month And Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Month And Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH_AND_NAME
	 * @model name="monthAndName"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_AND_NAME_VALUE = 2;

	/**
	 * The '<em><b>Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model name="numeric"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 3;

	/**
	 * The '<em><b>Post Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_NAME
	 * @model name="postName"
	 * @generated
	 * @ordered
	 */
	public static final int POST_NAME_VALUE = 4;

	/**
	 * The '<em><b>Custom Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom Structure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_STRUCTURE
	 * @model name="customStructure"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_STRUCTURE_VALUE = 5;

	/**
	 * An array of all the '<em><b>url Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final urlForm[] VALUES_ARRAY =
		new urlForm[] {
			DEFAULT,
			DAY_AND_NAME,
			MONTH_AND_NAME,
			NUMERIC,
			POST_NAME,
			CUSTOM_STRUCTURE,
		};

	/**
	 * A public read-only list of all the '<em><b>url Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<urlForm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>url Form</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static urlForm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			urlForm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>url Form</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static urlForm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			urlForm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>url Form</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static urlForm get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case DAY_AND_NAME_VALUE: return DAY_AND_NAME;
			case MONTH_AND_NAME_VALUE: return MONTH_AND_NAME;
			case NUMERIC_VALUE: return NUMERIC;
			case POST_NAME_VALUE: return POST_NAME;
			case CUSTOM_STRUCTURE_VALUE: return CUSTOM_STRUCTURE;
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
	private urlForm(int value, String name, String literal) {
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
	
} //urlForm
