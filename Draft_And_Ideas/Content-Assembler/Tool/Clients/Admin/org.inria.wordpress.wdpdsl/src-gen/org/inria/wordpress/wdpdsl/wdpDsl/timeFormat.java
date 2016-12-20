/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>time Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#gettimeFormat()
 * @model
 * @generated
 */
public enum timeFormat implements Enumerator {
	/**
	 * The '<em><b>GiaLower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIALOWER_VALUE
	 * @generated
	 * @ordered
	 */
	GIALOWER(0, "g_i_aLower", "g:i a"),

	/**
	 * The '<em><b>GiAUpper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIAUPPER_VALUE
	 * @generated
	 * @ordered
	 */
	GIAUPPER(1, "g_i_AUpper", "g:i A"),

	/**
	 * The '<em><b>Gg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GG_VALUE
	 * @generated
	 * @ordered
	 */
	GG(2, "Gg", "G:g"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(3, "custom", "custom");

	/**
	 * The '<em><b>GiaLower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GiaLower</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIALOWER
	 * @model name="g_i_aLower" literal="g:i a"
	 * @generated
	 * @ordered
	 */
	public static final int GIALOWER_VALUE = 0;

	/**
	 * The '<em><b>GiAUpper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GiAUpper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIAUPPER
	 * @model name="g_i_AUpper" literal="g:i A"
	 * @generated
	 * @ordered
	 */
	public static final int GIAUPPER_VALUE = 1;

	/**
	 * The '<em><b>Gg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GG
	 * @model name="Gg" literal="G:g"
	 * @generated
	 * @ordered
	 */
	public static final int GG_VALUE = 2;

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
	public static final int CUSTOM_VALUE = 3;

	/**
	 * An array of all the '<em><b>time Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final timeFormat[] VALUES_ARRAY =
		new timeFormat[] {
			GIALOWER,
			GIAUPPER,
			GG,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>time Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<timeFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>time Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static timeFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			timeFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>time Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static timeFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			timeFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>time Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static timeFormat get(int value) {
		switch (value) {
			case GIALOWER_VALUE: return GIALOWER;
			case GIAUPPER_VALUE: return GIAUPPER;
			case GG_VALUE: return GG;
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
	private timeFormat(int value, String name, String literal) {
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
	
} //timeFormat
