/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;

import fr.inria.teap.dcnssvggeneration.Activator;
import fr.obeo.smartea.injector.xls.BooleanValue;
import fr.obeo.smartea.injector.xls.Cell;
import fr.obeo.smartea.injector.xls.Column;
import fr.obeo.smartea.injector.xls.Data;
import fr.obeo.smartea.injector.xls.DateTimeType;
import fr.obeo.smartea.injector.xls.DateTimeTypeValue;
import fr.obeo.smartea.injector.xls.ErrorValue;
import fr.obeo.smartea.injector.xls.NumberValue;
import fr.obeo.smartea.injector.xls.Row;
import fr.obeo.smartea.injector.xls.StringValue;
import fr.obeo.smartea.injector.xls.Table;
import fr.obeo.smartea.injector.xls.Workbook;
import fr.obeo.smartea.injector.xls.Worksheet;
import fr.obeo.smartea.injector.xls.XlsFactory;
import fr.obeo.smartea.injector.xls.XlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XlsFactoryImpl extends EFactoryImpl implements XlsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XlsFactory init() {
		try {
			XlsFactory theXlsFactory = (XlsFactory)EPackage.Registry.INSTANCE.getEFactory("xls"); 
			if (theXlsFactory != null) {
				return theXlsFactory;
			}
		}
		catch (Exception exception) {
			MoDiscoLogger.logError("Error on the xls factory creation", Activator.getDefault());
		}
		return new XlsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XlsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XlsPackage.DATE_TIME_TYPE: return createDateTimeType();
			case XlsPackage.STRING_VALUE: return createStringValue();
			case XlsPackage.NUMBER_VALUE: return createNumberValue();
			case XlsPackage.DATE_TIME_TYPE_VALUE: return createDateTimeTypeValue();
			case XlsPackage.BOOLEAN_VALUE: return createBooleanValue();
			case XlsPackage.ERROR_VALUE: return createErrorValue();
			case XlsPackage.WORKBOOK: return createWorkbook();
			case XlsPackage.WORKSHEET: return createWorksheet();
			case XlsPackage.TABLE: return createTable();
			case XlsPackage.COLUMN: return createColumn();
			case XlsPackage.ROW: return createRow();
			case XlsPackage.CELL: return createCell();
			case XlsPackage.DATA: return createData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType createDateTimeType() {
		DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
		return dateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeTypeValue createDateTimeTypeValue() {
		DateTimeTypeValueImpl dateTimeTypeValue = new DateTimeTypeValueImpl();
		return dateTimeTypeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorValue createErrorValue() {
		ErrorValueImpl errorValue = new ErrorValueImpl();
		return errorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workbook createWorkbook() {
		WorkbookImpl workbook = new WorkbookImpl();
		return workbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worksheet createWorksheet() {
		WorksheetImpl worksheet = new WorksheetImpl();
		return worksheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XlsPackage getXlsPackage() {
		return (XlsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XlsPackage getPackage() {
		return XlsPackage.eINSTANCE;
	}

} //XlsFactoryImpl
