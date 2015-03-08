/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>functionalities</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getfunctionalities()
 * @model
 * @generated
 */
public enum functionalities implements Enumerator {
	/**
	 * The '<em><b>ECommerce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECOMMERCE_VALUE
	 * @generated
	 * @ordered
	 */
	ECOMMERCE(0, "eCommerce", "eCommerce"),

	/**
	 * The '<em><b>Forms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMS_VALUE
	 * @generated
	 * @ordered
	 */
	FORMS(1, "forms", "forms"),

	/**
	 * The '<em><b>Ham Spam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAM_SPAM_VALUE
	 * @generated
	 * @ordered
	 */
	HAM_SPAM(2, "hamSpam", "hamSpam"),

	/**
	 * The '<em><b>Indexing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEXING_VALUE
	 * @generated
	 * @ordered
	 */
	INDEXING(3, "indexing", "indexing"),

	/**
	 * The '<em><b>Multi Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_LANGUAGE(4, "multiLanguage", "multiLanguage"),

	/**
	 * The '<em><b>Pictures</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICTURES_VALUE
	 * @generated
	 * @ordered
	 */
	PICTURES(5, "pictures", "pictures"),

	/**
	 * The '<em><b>SEO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEO_VALUE
	 * @generated
	 * @ordered
	 */
	SEO(6, "SEO", "seo"),

	/**
	 * The '<em><b>Social Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL_NETWORK(7, "socialNetwork", "socialNetwork");

	/**
	 * The '<em><b>ECommerce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECommerce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECOMMERCE
	 * @model name="eCommerce"
	 * @generated
	 * @ordered
	 */
	public static final int ECOMMERCE_VALUE = 0;

	/**
	 * The '<em><b>Forms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Forms</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMS
	 * @model name="forms"
	 * @generated
	 * @ordered
	 */
	public static final int FORMS_VALUE = 1;

	/**
	 * The '<em><b>Ham Spam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ham Spam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAM_SPAM
	 * @model name="hamSpam"
	 * @generated
	 * @ordered
	 */
	public static final int HAM_SPAM_VALUE = 2;

	/**
	 * The '<em><b>Indexing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indexing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEXING
	 * @model name="indexing"
	 * @generated
	 * @ordered
	 */
	public static final int INDEXING_VALUE = 3;

	/**
	 * The '<em><b>Multi Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multi Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_LANGUAGE
	 * @model name="multiLanguage"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_LANGUAGE_VALUE = 4;

	/**
	 * The '<em><b>Pictures</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pictures</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PICTURES
	 * @model name="pictures"
	 * @generated
	 * @ordered
	 */
	public static final int PICTURES_VALUE = 5;

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
	public static final int SEO_VALUE = 6;

	/**
	 * The '<em><b>Social Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Social Network</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_NETWORK
	 * @model name="socialNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_NETWORK_VALUE = 7;

	/**
	 * An array of all the '<em><b>functionalities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final functionalities[] VALUES_ARRAY =
		new functionalities[] {
			ECOMMERCE,
			FORMS,
			HAM_SPAM,
			INDEXING,
			MULTI_LANGUAGE,
			PICTURES,
			SEO,
			SOCIAL_NETWORK,
		};

	/**
	 * A public read-only list of all the '<em><b>functionalities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<functionalities> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>functionalities</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static functionalities get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			functionalities result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>functionalities</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static functionalities getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			functionalities result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>functionalities</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static functionalities get(int value) {
		switch (value) {
			case ECOMMERCE_VALUE: return ECOMMERCE;
			case FORMS_VALUE: return FORMS;
			case HAM_SPAM_VALUE: return HAM_SPAM;
			case INDEXING_VALUE: return INDEXING;
			case MULTI_LANGUAGE_VALUE: return MULTI_LANGUAGE;
			case PICTURES_VALUE: return PICTURES;
			case SEO_VALUE: return SEO;
			case SOCIAL_NETWORK_VALUE: return SOCIAL_NETWORK;
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
	private functionalities(int value, String name, String literal) {
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
	
} //functionalities
