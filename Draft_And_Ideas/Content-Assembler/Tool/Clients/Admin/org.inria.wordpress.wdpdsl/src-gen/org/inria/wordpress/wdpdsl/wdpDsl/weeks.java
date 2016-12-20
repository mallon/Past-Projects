/**
 */
package org.inria.wordpress.wdpdsl.wdpDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>weeks</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage#getweeks()
 * @model
 * @generated
 */
public enum weeks implements Enumerator {
	/**
	 * The '<em><b>Monday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONDAY_VALUE
	 * @generated
	 * @ordered
	 */
	MONDAY(0, "monday", "Monday"),

	/**
	 * The '<em><b>Tuesday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	TUESDAY(1, "tuesday", "Tuesday"),

	/**
	 * The '<em><b>Wednesday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDNESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	WEDNESDAY(2, "wednesday", "Wednesday"),

	/**
	 * The '<em><b>Thirsday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRSDAY_VALUE
	 * @generated
	 * @ordered
	 */
	THIRSDAY(3, "thirsday", "Thursday"),

	/**
	 * The '<em><b>Friday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIDAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRIDAY(4, "friday", "Friday"),

	/**
	 * The '<em><b>Saturday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SATURDAY(5, "saturday", "Saturday"),

	/**
	 * The '<em><b>Sunday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUNDAY(6, "sunday", "Sunday");

	/**
	 * The '<em><b>Monday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONDAY
	 * @model name="monday" literal="Monday"
	 * @generated
	 * @ordered
	 */
	public static final int MONDAY_VALUE = 0;

	/**
	 * The '<em><b>Tuesday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tuesday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUESDAY
	 * @model name="tuesday" literal="Tuesday"
	 * @generated
	 * @ordered
	 */
	public static final int TUESDAY_VALUE = 1;

	/**
	 * The '<em><b>Wednesday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wednesday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEDNESDAY
	 * @model name="wednesday" literal="Wednesday"
	 * @generated
	 * @ordered
	 */
	public static final int WEDNESDAY_VALUE = 2;

	/**
	 * The '<em><b>Thirsday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thirsday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRSDAY
	 * @model name="thirsday" literal="Thursday"
	 * @generated
	 * @ordered
	 */
	public static final int THIRSDAY_VALUE = 3;

	/**
	 * The '<em><b>Friday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Friday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRIDAY
	 * @model name="friday" literal="Friday"
	 * @generated
	 * @ordered
	 */
	public static final int FRIDAY_VALUE = 4;

	/**
	 * The '<em><b>Saturday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Saturday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATURDAY
	 * @model name="saturday" literal="Saturday"
	 * @generated
	 * @ordered
	 */
	public static final int SATURDAY_VALUE = 5;

	/**
	 * The '<em><b>Sunday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sunday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUNDAY
	 * @model name="sunday" literal="Sunday"
	 * @generated
	 * @ordered
	 */
	public static final int SUNDAY_VALUE = 6;

	/**
	 * An array of all the '<em><b>weeks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final weeks[] VALUES_ARRAY =
		new weeks[] {
			MONDAY,
			TUESDAY,
			WEDNESDAY,
			THIRSDAY,
			FRIDAY,
			SATURDAY,
			SUNDAY,
		};

	/**
	 * A public read-only list of all the '<em><b>weeks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<weeks> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>weeks</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static weeks get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			weeks result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>weeks</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static weeks getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			weeks result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>weeks</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static weeks get(int value) {
		switch (value) {
			case MONDAY_VALUE: return MONDAY;
			case TUESDAY_VALUE: return TUESDAY;
			case WEDNESDAY_VALUE: return WEDNESDAY;
			case THIRSDAY_VALUE: return THIRSDAY;
			case FRIDAY_VALUE: return FRIDAY;
			case SATURDAY_VALUE: return SATURDAY;
			case SUNDAY_VALUE: return SUNDAY;
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
	private weeks(int value, String name, String literal) {
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
	
} //weeks
