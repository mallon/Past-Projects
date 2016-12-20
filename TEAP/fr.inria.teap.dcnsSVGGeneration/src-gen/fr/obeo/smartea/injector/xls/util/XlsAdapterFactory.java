/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.util;

import fr.obeo.smartea.injector.xls.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.smartea.injector.xls.XlsPackage
 * @generated
 */
public class XlsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XlsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XlsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XlsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XlsSwitch<Adapter> modelSwitch =
		new XlsSwitch<Adapter>() {
			@Override
			public Adapter caseDateTimeType(DateTimeType object) {
				return createDateTimeTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseNumberValue(NumberValue object) {
				return createNumberValueAdapter();
			}
			@Override
			public Adapter caseDateTimeTypeValue(DateTimeTypeValue object) {
				return createDateTimeTypeValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseErrorValue(ErrorValue object) {
				return createErrorValueAdapter();
			}
			@Override
			public Adapter caseWorkbook(Workbook object) {
				return createWorkbookAdapter();
			}
			@Override
			public Adapter caseWorksheet(Worksheet object) {
				return createWorksheetAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableElement(TableElement object) {
				return createTableElementAdapter();
			}
			@Override
			public Adapter caseColOrRowElement(ColOrRowElement object) {
				return createColOrRowElementAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType
	 * @generated
	 */
	public Adapter createDateTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.NumberValue
	 * @generated
	 */
	public Adapter createNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.DateTimeTypeValue <em>Date Time Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.DateTimeTypeValue
	 * @generated
	 */
	public Adapter createDateTimeTypeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.ErrorValue <em>Error Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.ErrorValue
	 * @generated
	 */
	public Adapter createErrorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Workbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Workbook
	 * @generated
	 */
	public Adapter createWorkbookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Worksheet <em>Worksheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Worksheet
	 * @generated
	 */
	public Adapter createWorksheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.TableElement <em>Table Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.TableElement
	 * @generated
	 */
	public Adapter createTableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.ColOrRowElement <em>Col Or Row Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.ColOrRowElement
	 * @generated
	 */
	public Adapter createColOrRowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.smartea.injector.xls.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.smartea.injector.xls.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XlsAdapterFactory
