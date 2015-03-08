/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.smartea.injector.xls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.smartea.injector.xls.XlsFactory
 * @model kind="package"
 * @generated
 */
public interface XlsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "xls";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xls";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XlsPackage eINSTANCE = fr.obeo.smartea.injector.xls.impl.XlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.DateTimeTypeImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__DAY = 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__HOUR = 3;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__MINUTE = 4;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__SECOND = 5;

	/**
	 * The number of structural features of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.ValueTypeImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Vt data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VT_DATA = 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.StringValueImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Vt data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VT_DATA = VALUE_TYPE__VT_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.NumberValueImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Vt data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__VT_DATA = VALUE_TYPE__VT_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.DateTimeTypeValueImpl <em>Date Time Type Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.DateTimeTypeValueImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getDateTimeTypeValue()
	 * @generated
	 */
	int DATE_TIME_TYPE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Vt data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_VALUE__VT_DATA = VALUE_TYPE__VT_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_VALUE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.BooleanValueImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Vt data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VT_DATA = VALUE_TYPE__VT_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.ErrorValueImpl <em>Error Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.ErrorValueImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getErrorValue()
	 * @generated
	 */
	int ERROR_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Vt data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_VALUE__VT_DATA = VALUE_TYPE__VT_DATA;

	/**
	 * The number of structural features of the '<em>Error Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.WorkbookImpl <em>Workbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.WorkbookImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getWorkbook()
	 * @generated
	 */
	int WORKBOOK = 7;

	/**
	 * The feature id for the '<em><b>Wb worksheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBOOK__WB_WORKSHEETS = 0;

	/**
	 * The number of structural features of the '<em>Workbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBOOK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.WorksheetImpl <em>Worksheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.WorksheetImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getWorksheet()
	 * @generated
	 */
	int WORKSHEET = 8;

	/**
	 * The feature id for the '<em><b>Ws workbook</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHEET__WS_WORKBOOK = 0;

	/**
	 * The feature id for the '<em><b>Ws table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHEET__WS_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHEET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Worksheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSHEET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.TableImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 9;

	/**
	 * The feature id for the '<em><b>Tworksheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TWORKSHEET = 0;

	/**
	 * The feature id for the '<em><b>Tcols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TCOLS = 1;

	/**
	 * The feature id for the '<em><b>Trows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TROWS = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.TableElementImpl <em>Table Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.TableElementImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getTableElement()
	 * @generated
	 */
	int TABLE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__INDEX = 0;

	/**
	 * The number of structural features of the '<em>Table Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.ColOrRowElementImpl <em>Col Or Row Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.ColOrRowElementImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getColOrRowElement()
	 * @generated
	 */
	int COL_OR_ROW_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OR_ROW_ELEMENT__INDEX = TABLE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OR_ROW_ELEMENT__HIDDEN = TABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OR_ROW_ELEMENT__SPAN = TABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Col Or Row Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OR_ROW_ELEMENT_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.ColumnImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INDEX = COL_OR_ROW_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HIDDEN = COL_OR_ROW_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SPAN = COL_OR_ROW_ELEMENT__SPAN;

	/**
	 * The feature id for the '<em><b>Ctable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CTABLE = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Fit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__AUTO_FIT_WIDTH = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.RowImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 13;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__INDEX = COL_OR_ROW_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__HIDDEN = COL_OR_ROW_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SPAN = COL_OR_ROW_ELEMENT__SPAN;

	/**
	 * The feature id for the '<em><b>Rtable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__RTABLE = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rcells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__RCELLS = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Fit Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__AUTO_FIT_HEIGHT = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__HEIGHT = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = COL_OR_ROW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.CellImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 14;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__INDEX = TABLE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Crow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CROW = TABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ARRAY_RANGE = TABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__FORMULA = TABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HRef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__HREF = TABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Merge Across</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__MERGE_ACROSS = TABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Merge Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__MERGE_DOWN = TABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CDATA = TABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link fr.obeo.smartea.injector.xls.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.smartea.injector.xls.impl.DataImpl
	 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getData()
	 * @generated
	 */
	int DATA = 15;

	/**
	 * The feature id for the '<em><b>Dcell</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DCELL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType
	 * @generated
	 */
	EClass getDateTimeType();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.DateTimeType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType#getYear()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Year();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.DateTimeType#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType#getMonth()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Month();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.DateTimeType#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType#getDay()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Day();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.DateTimeType#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType#getHour()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Hour();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.DateTimeType#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType#getMinute()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Minute();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.DateTimeType#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeType#getSecond()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Second();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see fr.obeo.smartea.injector.xls.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.ValueType#getVt_data <em>Vt data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vt data</em>'.
	 * @see fr.obeo.smartea.injector.xls.ValueType#getVt_data()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Vt_data();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.NumberValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.NumberValue#getValue()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.DateTimeTypeValue <em>Date Time Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeTypeValue
	 * @generated
	 */
	EClass getDateTimeTypeValue();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.smartea.injector.xls.DateTimeTypeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.DateTimeTypeValue#getValue()
	 * @see #getDateTimeTypeValue()
	 * @generated
	 */
	EReference getDateTimeTypeValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.ErrorValue <em>Error Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.ErrorValue
	 * @generated
	 */
	EClass getErrorValue();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Workbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workbook</em>'.
	 * @see fr.obeo.smartea.injector.xls.Workbook
	 * @generated
	 */
	EClass getWorkbook();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.smartea.injector.xls.Workbook#getWb_worksheets <em>Wb worksheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wb worksheets</em>'.
	 * @see fr.obeo.smartea.injector.xls.Workbook#getWb_worksheets()
	 * @see #getWorkbook()
	 * @generated
	 */
	EReference getWorkbook_Wb_worksheets();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Worksheet <em>Worksheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksheet</em>'.
	 * @see fr.obeo.smartea.injector.xls.Worksheet
	 * @generated
	 */
	EClass getWorksheet();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_workbook <em>Ws workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ws workbook</em>'.
	 * @see fr.obeo.smartea.injector.xls.Worksheet#getWs_workbook()
	 * @see #getWorksheet()
	 * @generated
	 */
	EReference getWorksheet_Ws_workbook();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.smartea.injector.xls.Worksheet#getWs_table <em>Ws table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ws table</em>'.
	 * @see fr.obeo.smartea.injector.xls.Worksheet#getWs_table()
	 * @see #getWorksheet()
	 * @generated
	 */
	EReference getWorksheet_Ws_table();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Worksheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.smartea.injector.xls.Worksheet#getName()
	 * @see #getWorksheet()
	 * @generated
	 */
	EAttribute getWorksheet_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see fr.obeo.smartea.injector.xls.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.Table#getT_worksheet <em>Tworksheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tworksheet</em>'.
	 * @see fr.obeo.smartea.injector.xls.Table#getT_worksheet()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_T_worksheet();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.smartea.injector.xls.Table#getT_cols <em>Tcols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tcols</em>'.
	 * @see fr.obeo.smartea.injector.xls.Table#getT_cols()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_T_cols();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.smartea.injector.xls.Table#getT_rows <em>Trows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trows</em>'.
	 * @see fr.obeo.smartea.injector.xls.Table#getT_rows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_T_rows();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.TableElement <em>Table Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Element</em>'.
	 * @see fr.obeo.smartea.injector.xls.TableElement
	 * @generated
	 */
	EClass getTableElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.TableElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see fr.obeo.smartea.injector.xls.TableElement#getIndex()
	 * @see #getTableElement()
	 * @generated
	 */
	EAttribute getTableElement_Index();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.ColOrRowElement <em>Col Or Row Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col Or Row Element</em>'.
	 * @see fr.obeo.smartea.injector.xls.ColOrRowElement
	 * @generated
	 */
	EClass getColOrRowElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.ColOrRowElement#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see fr.obeo.smartea.injector.xls.ColOrRowElement#isHidden()
	 * @see #getColOrRowElement()
	 * @generated
	 */
	EAttribute getColOrRowElement_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.ColOrRowElement#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see fr.obeo.smartea.injector.xls.ColOrRowElement#getSpan()
	 * @see #getColOrRowElement()
	 * @generated
	 */
	EAttribute getColOrRowElement_Span();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see fr.obeo.smartea.injector.xls.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.Column#getC_table <em>Ctable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctable</em>'.
	 * @see fr.obeo.smartea.injector.xls.Column#getC_table()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_C_table();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Column#isAutoFitWidth <em>Auto Fit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Fit Width</em>'.
	 * @see fr.obeo.smartea.injector.xls.Column#isAutoFitWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_AutoFitWidth();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.obeo.smartea.injector.xls.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Width();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see fr.obeo.smartea.injector.xls.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.Row#getR_table <em>Rtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rtable</em>'.
	 * @see fr.obeo.smartea.injector.xls.Row#getR_table()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_R_table();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.smartea.injector.xls.Row#getR_cells <em>Rcells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rcells</em>'.
	 * @see fr.obeo.smartea.injector.xls.Row#getR_cells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_R_cells();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Row#isAutoFitHeight <em>Auto Fit Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Fit Height</em>'.
	 * @see fr.obeo.smartea.injector.xls.Row#isAutoFitHeight()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_AutoFitHeight();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Row#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.obeo.smartea.injector.xls.Row#getHeight()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Height();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.Cell#getC_row <em>Crow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Crow</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getC_row()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_C_row();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Cell#getArrayRange <em>Array Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Range</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getArrayRange()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ArrayRange();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Cell#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getFormula()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Formula();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Cell#getHRef <em>HRef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HRef</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getHRef()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_HRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Cell#getMergeAcross <em>Merge Across</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Across</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getMergeAcross()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_MergeAcross();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.smartea.injector.xls.Cell#getMergeDown <em>Merge Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Down</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getMergeDown()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_MergeDown();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.smartea.injector.xls.Cell#getC_data <em>Cdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cdata</em>'.
	 * @see fr.obeo.smartea.injector.xls.Cell#getC_data()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_C_data();

	/**
	 * Returns the meta object for class '{@link fr.obeo.smartea.injector.xls.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see fr.obeo.smartea.injector.xls.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.smartea.injector.xls.Data#getD_cell <em>Dcell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dcell</em>'.
	 * @see fr.obeo.smartea.injector.xls.Data#getD_cell()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_D_cell();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.smartea.injector.xls.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.obeo.smartea.injector.xls.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XlsFactory getXlsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.DateTimeTypeImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getDateTimeType()
		 * @generated
		 */
		EClass DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__YEAR = eINSTANCE.getDateTimeType_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__MONTH = eINSTANCE.getDateTimeType_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__DAY = eINSTANCE.getDateTimeType_Day();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__HOUR = eINSTANCE.getDateTimeType_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__MINUTE = eINSTANCE.getDateTimeType_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_TYPE__SECOND = eINSTANCE.getDateTimeType_Second();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.ValueTypeImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Vt data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__VT_DATA = eINSTANCE.getValueType_Vt_data();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.StringValueImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.NumberValueImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.DateTimeTypeValueImpl <em>Date Time Type Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.DateTimeTypeValueImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getDateTimeTypeValue()
		 * @generated
		 */
		EClass DATE_TIME_TYPE_VALUE = eINSTANCE.getDateTimeTypeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_TIME_TYPE_VALUE__VALUE = eINSTANCE.getDateTimeTypeValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.BooleanValueImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.ErrorValueImpl <em>Error Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.ErrorValueImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getErrorValue()
		 * @generated
		 */
		EClass ERROR_VALUE = eINSTANCE.getErrorValue();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.WorkbookImpl <em>Workbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.WorkbookImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getWorkbook()
		 * @generated
		 */
		EClass WORKBOOK = eINSTANCE.getWorkbook();

		/**
		 * The meta object literal for the '<em><b>Wb worksheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBOOK__WB_WORKSHEETS = eINSTANCE.getWorkbook_Wb_worksheets();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.WorksheetImpl <em>Worksheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.WorksheetImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getWorksheet()
		 * @generated
		 */
		EClass WORKSHEET = eINSTANCE.getWorksheet();

		/**
		 * The meta object literal for the '<em><b>Ws workbook</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSHEET__WS_WORKBOOK = eINSTANCE.getWorksheet_Ws_workbook();

		/**
		 * The meta object literal for the '<em><b>Ws table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSHEET__WS_TABLE = eINSTANCE.getWorksheet_Ws_table();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSHEET__NAME = eINSTANCE.getWorksheet_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.TableImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Tworksheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TWORKSHEET = eINSTANCE.getTable_T_worksheet();

		/**
		 * The meta object literal for the '<em><b>Tcols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TCOLS = eINSTANCE.getTable_T_cols();

		/**
		 * The meta object literal for the '<em><b>Trows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TROWS = eINSTANCE.getTable_T_rows();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.TableElementImpl <em>Table Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.TableElementImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getTableElement()
		 * @generated
		 */
		EClass TABLE_ELEMENT = eINSTANCE.getTableElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ELEMENT__INDEX = eINSTANCE.getTableElement_Index();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.ColOrRowElementImpl <em>Col Or Row Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.ColOrRowElementImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getColOrRowElement()
		 * @generated
		 */
		EClass COL_OR_ROW_ELEMENT = eINSTANCE.getColOrRowElement();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_OR_ROW_ELEMENT__HIDDEN = eINSTANCE.getColOrRowElement_Hidden();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_OR_ROW_ELEMENT__SPAN = eINSTANCE.getColOrRowElement_Span();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.ColumnImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Ctable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CTABLE = eINSTANCE.getColumn_C_table();

		/**
		 * The meta object literal for the '<em><b>Auto Fit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__AUTO_FIT_WIDTH = eINSTANCE.getColumn_AutoFitWidth();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__WIDTH = eINSTANCE.getColumn_Width();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.RowImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Rtable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__RTABLE = eINSTANCE.getRow_R_table();

		/**
		 * The meta object literal for the '<em><b>Rcells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__RCELLS = eINSTANCE.getRow_R_cells();

		/**
		 * The meta object literal for the '<em><b>Auto Fit Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__AUTO_FIT_HEIGHT = eINSTANCE.getRow_AutoFitHeight();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__HEIGHT = eINSTANCE.getRow_Height();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.CellImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Crow</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__CROW = eINSTANCE.getCell_C_row();

		/**
		 * The meta object literal for the '<em><b>Array Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ARRAY_RANGE = eINSTANCE.getCell_ArrayRange();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__FORMULA = eINSTANCE.getCell_Formula();

		/**
		 * The meta object literal for the '<em><b>HRef</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__HREF = eINSTANCE.getCell_HRef();

		/**
		 * The meta object literal for the '<em><b>Merge Across</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__MERGE_ACROSS = eINSTANCE.getCell_MergeAcross();

		/**
		 * The meta object literal for the '<em><b>Merge Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__MERGE_DOWN = eINSTANCE.getCell_MergeDown();

		/**
		 * The meta object literal for the '<em><b>Cdata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__CDATA = eINSTANCE.getCell_C_data();

		/**
		 * The meta object literal for the '{@link fr.obeo.smartea.injector.xls.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.smartea.injector.xls.impl.DataImpl
		 * @see fr.obeo.smartea.injector.xls.impl.XlsPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Dcell</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DCELL = eINSTANCE.getData_D_cell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__VALUE = eINSTANCE.getData_Value();

	}

} //XlsPackage
