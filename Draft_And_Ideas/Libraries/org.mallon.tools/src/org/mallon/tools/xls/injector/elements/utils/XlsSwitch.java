/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.mallon.tools.xls.injector.elements.interf.BooleanValue;
import org.mallon.tools.xls.injector.elements.interf.Cell;
import org.mallon.tools.xls.injector.elements.interf.ColOrRowElement;
import org.mallon.tools.xls.injector.elements.interf.Column;
import org.mallon.tools.xls.injector.elements.interf.Data;
import org.mallon.tools.xls.injector.elements.interf.DateTimeType;
import org.mallon.tools.xls.injector.elements.interf.DateTimeTypeValue;
import org.mallon.tools.xls.injector.elements.interf.ErrorValue;
import org.mallon.tools.xls.injector.elements.interf.NumberValue;
import org.mallon.tools.xls.injector.elements.interf.Row;
import org.mallon.tools.xls.injector.elements.interf.StringValue;
import org.mallon.tools.xls.injector.elements.interf.Table;
import org.mallon.tools.xls.injector.elements.interf.TableElement;
import org.mallon.tools.xls.injector.elements.interf.ValueType;
import org.mallon.tools.xls.injector.elements.interf.Workbook;
import org.mallon.tools.xls.injector.elements.interf.Worksheet;
import org.mallon.tools.xls.injector.elements.interf.XlsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.smartea.injector.xls.XlsPackage
 * @generated
 */
public class XlsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XlsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XlsSwitch() {
		if (modelPackage == null) {
			modelPackage = XlsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XlsPackage.DATE_TIME_TYPE: {
				DateTimeType dateTimeType = (DateTimeType)theEObject;
				T result = caseDateTimeType(dateTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseValueType(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.NUMBER_VALUE: {
				NumberValue numberValue = (NumberValue)theEObject;
				T result = caseNumberValue(numberValue);
				if (result == null) result = caseValueType(numberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.DATE_TIME_TYPE_VALUE: {
				DateTimeTypeValue dateTimeTypeValue = (DateTimeTypeValue)theEObject;
				T result = caseDateTimeTypeValue(dateTimeTypeValue);
				if (result == null) result = caseValueType(dateTimeTypeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseValueType(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.ERROR_VALUE: {
				ErrorValue errorValue = (ErrorValue)theEObject;
				T result = caseErrorValue(errorValue);
				if (result == null) result = caseValueType(errorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.WORKBOOK: {
				Workbook workbook = (Workbook)theEObject;
				T result = caseWorkbook(workbook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.WORKSHEET: {
				Worksheet worksheet = (Worksheet)theEObject;
				T result = caseWorksheet(worksheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.TABLE_ELEMENT: {
				TableElement tableElement = (TableElement)theEObject;
				T result = caseTableElement(tableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.COL_OR_ROW_ELEMENT: {
				ColOrRowElement colOrRowElement = (ColOrRowElement)theEObject;
				T result = caseColOrRowElement(colOrRowElement);
				if (result == null) result = caseTableElement(colOrRowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseColOrRowElement(column);
				if (result == null) result = caseTableElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseColOrRowElement(row);
				if (result == null) result = caseTableElement(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = caseTableElement(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XlsPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeType(DateTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberValue(NumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeTypeValue(DateTimeTypeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorValue(ErrorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workbook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workbook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkbook(Workbook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worksheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worksheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorksheet(Worksheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableElement(TableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col Or Row Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col Or Row Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColOrRowElement(ColOrRowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XlsSwitch
