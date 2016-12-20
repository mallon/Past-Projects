/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>themes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getthemes()
 * @model
 * @generated
 */
public enum themes implements Enumerator {
	/**
	 * The '<em><b>Responsive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSIVE(0, "responsive", "responsive"),

	/**
	 * The '<em><b>SEO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEO_VALUE
	 * @generated
	 * @ordered
	 */
	SEO(1, "SEO", "seo"),

	/**
	 * The '<em><b>Header Parallax Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_PARALLAX_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER_PARALLAX_EFFECT(2, "headerParallaxEffect", "headerParallaxEffect"),

	/**
	 * The '<em><b>Business</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS(3, "business", "business"),

	/**
	 * The '<em><b>Magazine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGAZINE_VALUE
	 * @generated
	 * @ordered
	 */
	MAGAZINE(4, "magazine", "magazine"),

	/**
	 * The '<em><b>Galleries</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GALLERIES_VALUE
	 * @generated
	 * @ordered
	 */
	GALLERIES(5, "galleries", "galleries");

	/**
	 * The '<em><b>Responsive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Responsive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSIVE
	 * @model name="responsive"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSIVE_VALUE = 0;

	/**
	 * The '<em><b>SEO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEO
	 * @model literal="seo"
	 * @generated
	 * @ordered
	 */
	public static final int SEO_VALUE = 1;

	/**
	 * The '<em><b>Header Parallax Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Header Parallax Effect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADER_PARALLAX_EFFECT
	 * @model name="headerParallaxEffect"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_PARALLAX_EFFECT_VALUE = 2;

	/**
	 * The '<em><b>Business</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Business</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS
	 * @model name="business"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_VALUE = 3;

	/**
	 * The '<em><b>Magazine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Magazine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGAZINE
	 * @model name="magazine"
	 * @generated
	 * @ordered
	 */
	public static final int MAGAZINE_VALUE = 4;

	/**
	 * The '<em><b>Galleries</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Galleries</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GALLERIES
	 * @model name="galleries"
	 * @generated
	 * @ordered
	 */
	public static final int GALLERIES_VALUE = 5;

	/**
	 * An array of all the '<em><b>themes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final themes[] VALUES_ARRAY =
		new themes[] {
			RESPONSIVE,
			SEO,
			HEADER_PARALLAX_EFFECT,
			BUSINESS,
			MAGAZINE,
			GALLERIES,
		};

	/**
	 * A public read-only list of all the '<em><b>themes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<themes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>themes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static themes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			themes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>themes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static themes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			themes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>themes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static themes get(int value) {
		switch (value) {
			case RESPONSIVE_VALUE: return RESPONSIVE;
			case SEO_VALUE: return SEO;
			case HEADER_PARALLAX_EFFECT_VALUE: return HEADER_PARALLAX_EFFECT;
			case BUSINESS_VALUE: return BUSINESS;
			case MAGAZINE_VALUE: return MAGAZINE;
			case GALLERIES_VALUE: return GALLERIES;
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
	private themes(int value, String name, String literal) {
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
	
} //themes
