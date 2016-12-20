/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getrole()
 * @model
 * @generated
 */
public enum role implements Enumerator {
	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(0, "author", "author"),

	/**
	 * The '<em><b>Administrator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATOR(1, "administrator", "administrator"),

	/**
	 * The '<em><b>Suscriber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSCRIBER_VALUE
	 * @generated
	 * @ordered
	 */
	SUSCRIBER(2, "suscriber", "subscriber"),

	/**
	 * The '<em><b>Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR(3, "editor", "editor"),

	/**
	 * The '<em><b>Contributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIBUTOR(4, "contributor", "contributor");

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Author</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model name="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 0;

	/**
	 * The '<em><b>Administrator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Administrator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATOR
	 * @model name="administrator"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATOR_VALUE = 1;

	/**
	 * The '<em><b>Suscriber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suscriber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSCRIBER
	 * @model name="suscriber" literal="subscriber"
	 * @generated
	 * @ordered
	 */
	public static final int SUSCRIBER_VALUE = 2;

	/**
	 * The '<em><b>Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Editor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDITOR
	 * @model name="editor"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_VALUE = 3;

	/**
	 * The '<em><b>Contributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contributor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR
	 * @model name="contributor"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final role[] VALUES_ARRAY =
		new role[] {
			AUTHOR,
			ADMINISTRATOR,
			SUSCRIBER,
			EDITOR,
			CONTRIBUTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static role get(int value) {
		switch (value) {
			case AUTHOR_VALUE: return AUTHOR;
			case ADMINISTRATOR_VALUE: return ADMINISTRATOR;
			case SUSCRIBER_VALUE: return SUSCRIBER;
			case EDITOR_VALUE: return EDITOR;
			case CONTRIBUTOR_VALUE: return CONTRIBUTOR;
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
	private role(int value, String name, String literal) {
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
	
} //role
