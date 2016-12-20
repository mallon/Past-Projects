/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>dateformat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getdateformat()
 * @model
 * @generated
 */
public enum dateformat implements Enumerator {
	/**
	 * The '<em><b>Jn Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JN_Y_VALUE
	 * @generated
	 * @ordered
	 */
	JN_Y(0, "jnY", "j/n/Y"),

	/**
	 * The '<em><b>Fj Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FJ_Y_VALUE
	 * @generated
	 * @ordered
	 */
	FJ_Y(1, "FjY", "F j, Y"),

	/**
	 * The '<em><b>Ynj</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YNJ_VALUE
	 * @generated
	 * @ordered
	 */
	YNJ(2, "Ynj", "Y/n/j"),

	/**
	 * The '<em><b>Nj Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NJ_Y_VALUE
	 * @generated
	 * @ordered
	 */
	NJ_Y(3, "njY", "n/j/Y"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(4, "custom", "custom");

	/**
	 * The '<em><b>Jn Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jn Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JN_Y
	 * @model name="jnY" literal="j/n/Y"
	 * @generated
	 * @ordered
	 */
	public static final int JN_Y_VALUE = 0;

	/**
	 * The '<em><b>Fj Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fj Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FJ_Y
	 * @model name="FjY" literal="F j, Y"
	 * @generated
	 * @ordered
	 */
	public static final int FJ_Y_VALUE = 1;

	/**
	 * The '<em><b>Ynj</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ynj</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YNJ
	 * @model name="Ynj" literal="Y/n/j"
	 * @generated
	 * @ordered
	 */
	public static final int YNJ_VALUE = 2;

	/**
	 * The '<em><b>Nj Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nj Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NJ_Y
	 * @model name="njY" literal="n/j/Y"
	 * @generated
	 * @ordered
	 */
	public static final int NJ_Y_VALUE = 3;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 4;

	/**
	 * An array of all the '<em><b>dateformat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final dateformat[] VALUES_ARRAY =
		new dateformat[] {
			JN_Y,
			FJ_Y,
			YNJ,
			NJ_Y,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>dateformat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<dateformat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>dateformat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dateformat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			dateformat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>dateformat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dateformat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			dateformat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>dateformat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dateformat get(int value) {
		switch (value) {
			case JN_Y_VALUE: return JN_Y;
			case FJ_Y_VALUE: return FJ_Y;
			case YNJ_VALUE: return YNJ;
			case NJ_Y_VALUE: return NJ_Y;
			case CUSTOM_VALUE: return CUSTOM;
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
	private dateformat(int value, String name, String literal) {
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
	
} //dateformat
