/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.mallon.tools.xls.injector.elements.interf.XlsFactory;
import org.mallon.tools.xls.injector.elements.interf.XlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XlsPackageImpl extends EPackageImpl implements XlsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeTypeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workbookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worksheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colOrRowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.smartea.injector.xls.XlsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XlsPackageImpl() {
		super(eNS_URI, XlsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XlsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XlsPackage init() {
		if (isInited) return (XlsPackage)EPackage.Registry.INSTANCE.getEPackage(XlsPackage.eNS_URI);

		// Obtain or create and register package
		XlsPackageImpl theXlsPackage = (XlsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XlsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XlsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theXlsPackage.createPackageContents();

		// Initialize created meta-data
		theXlsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXlsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XlsPackage.eNS_URI, theXlsPackage);
		return theXlsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeType() {
		return dateTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Year() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Month() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Day() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Hour() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Minute() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Second() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_Vt_data() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberValue_Value() {
		return (EAttribute)numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeTypeValue() {
		return dateTimeTypeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTimeTypeValue_Value() {
		return (EReference)dateTimeTypeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorValue() {
		return errorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkbook() {
		return workbookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkbook_Wb_worksheets() {
		return (EReference)workbookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorksheet() {
		return worksheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksheet_Ws_workbook() {
		return (EReference)worksheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksheet_Ws_table() {
		return (EReference)worksheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorksheet_Name() {
		return (EAttribute)worksheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_T_worksheet() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_T_cols() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_T_rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableElement() {
		return tableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableElement_Index() {
		return (EAttribute)tableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColOrRowElement() {
		return colOrRowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColOrRowElement_Hidden() {
		return (EAttribute)colOrRowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColOrRowElement_Span() {
		return (EAttribute)colOrRowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_C_table() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_AutoFitWidth() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Width() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_R_table() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_R_cells() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_AutoFitHeight() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Height() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_C_row() {
		return (EReference)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_ArrayRange() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Formula() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_HRef() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_MergeAcross() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_MergeDown() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_C_data() {
		return (EReference)cellEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_D_cell() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Value() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XlsFactory getXlsFactory() {
		return (XlsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__YEAR);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__MONTH);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__DAY);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__HOUR);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__MINUTE);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__SECOND);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__VT_DATA);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__VALUE);

		dateTimeTypeValueEClass = createEClass(DATE_TIME_TYPE_VALUE);
		createEReference(dateTimeTypeValueEClass, DATE_TIME_TYPE_VALUE__VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		errorValueEClass = createEClass(ERROR_VALUE);

		workbookEClass = createEClass(WORKBOOK);
		createEReference(workbookEClass, WORKBOOK__WB_WORKSHEETS);

		worksheetEClass = createEClass(WORKSHEET);
		createEReference(worksheetEClass, WORKSHEET__WS_WORKBOOK);
		createEReference(worksheetEClass, WORKSHEET__WS_TABLE);
		createEAttribute(worksheetEClass, WORKSHEET__NAME);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TWORKSHEET);
		createEReference(tableEClass, TABLE__TCOLS);
		createEReference(tableEClass, TABLE__TROWS);

		tableElementEClass = createEClass(TABLE_ELEMENT);
		createEAttribute(tableElementEClass, TABLE_ELEMENT__INDEX);

		colOrRowElementEClass = createEClass(COL_OR_ROW_ELEMENT);
		createEAttribute(colOrRowElementEClass, COL_OR_ROW_ELEMENT__HIDDEN);
		createEAttribute(colOrRowElementEClass, COL_OR_ROW_ELEMENT__SPAN);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__CTABLE);
		createEAttribute(columnEClass, COLUMN__AUTO_FIT_WIDTH);
		createEAttribute(columnEClass, COLUMN__WIDTH);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__RTABLE);
		createEReference(rowEClass, ROW__RCELLS);
		createEAttribute(rowEClass, ROW__AUTO_FIT_HEIGHT);
		createEAttribute(rowEClass, ROW__HEIGHT);

		cellEClass = createEClass(CELL);
		createEReference(cellEClass, CELL__CROW);
		createEAttribute(cellEClass, CELL__ARRAY_RANGE);
		createEAttribute(cellEClass, CELL__FORMULA);
		createEAttribute(cellEClass, CELL__HREF);
		createEAttribute(cellEClass, CELL__MERGE_ACROSS);
		createEAttribute(cellEClass, CELL__MERGE_DOWN);
		createEReference(cellEClass, CELL__CDATA);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__DCELL);
		createEReference(dataEClass, DATA__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stringValueEClass.getESuperTypes().add(this.getValueType());
		numberValueEClass.getESuperTypes().add(this.getValueType());
		dateTimeTypeValueEClass.getESuperTypes().add(this.getValueType());
		booleanValueEClass.getESuperTypes().add(this.getValueType());
		errorValueEClass.getESuperTypes().add(this.getValueType());
		colOrRowElementEClass.getESuperTypes().add(this.getTableElement());
		columnEClass.getESuperTypes().add(this.getColOrRowElement());
		rowEClass.getESuperTypes().add(this.getColOrRowElement());
		cellEClass.getESuperTypes().add(this.getTableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeType_Year(), ecorePackage.getEInt(), "year", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateTimeType_Month(), ecorePackage.getEInt(), "month", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateTimeType_Day(), ecorePackage.getEInt(), "day", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateTimeType_Hour(), ecorePackage.getEInt(), "hour", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateTimeType_Minute(), ecorePackage.getEInt(), "minute", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateTimeType_Second(), ecorePackage.getEInt(), "second", null, 1, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueType_Vt_data(), this.getData(), this.getData_Value(), "vt_data", null, 1, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, NumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dateTimeTypeValueEClass, DateTimeTypeValue.class, "DateTimeTypeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateTimeTypeValue_Value(), this.getDateTimeType(), null, "value", null, 1, 1, DateTimeTypeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorValueEClass, ErrorValue.class, "ErrorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workbookEClass, Workbook.class, "Workbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkbook_Wb_worksheets(), this.getWorksheet(), this.getWorksheet_Ws_workbook(), "wb_worksheets", null, 0, -1, Workbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worksheetEClass, Worksheet.class, "Worksheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksheet_Ws_workbook(), this.getWorkbook(), this.getWorkbook_Wb_worksheets(), "ws_workbook", null, 1, 1, Worksheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorksheet_Ws_table(), this.getTable(), this.getTable_T_worksheet(), "ws_table", null, 0, 1, Worksheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorksheet_Name(), ecorePackage.getEString(), "name", null, 1, 1, Worksheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_T_worksheet(), this.getWorksheet(), this.getWorksheet_Ws_table(), "t_worksheet", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTable_T_cols(), this.getColumn(), this.getColumn_C_table(), "t_cols", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_T_rows(), this.getRow(), this.getRow_R_table(), "t_rows", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableElementEClass, TableElement.class, "TableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(colOrRowElementEClass, ColOrRowElement.class, "ColOrRowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColOrRowElement_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, ColOrRowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getColOrRowElement_Span(), ecorePackage.getEInt(), "span", null, 0, 1, ColOrRowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_C_table(), this.getTable(), this.getTable_T_cols(), "c_table", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getColumn_AutoFitWidth(), ecorePackage.getEBoolean(), "autoFitWidth", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getColumn_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_R_table(), this.getTable(), this.getTable_T_rows(), "r_table", null, 1, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRow_R_cells(), this.getCell(), this.getCell_C_row(), "r_cells", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_AutoFitHeight(), ecorePackage.getEBoolean(), "autoFitHeight", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRow_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCell_C_row(), this.getRow(), this.getRow_R_cells(), "c_row", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCell_ArrayRange(), ecorePackage.getEString(), "arrayRange", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCell_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCell_HRef(), ecorePackage.getEString(), "hRef", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCell_MergeAcross(), ecorePackage.getEDouble(), "mergeAcross", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCell_MergeDown(), ecorePackage.getEDouble(), "mergeDown", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCell_C_data(), this.getData(), this.getData_D_cell(), "c_data", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_D_cell(), this.getCell(), this.getCell_C_data(), "d_cell", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getData_Value(), this.getValueType(), this.getValueType_Vt_data(), "value", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XlsPackageImpl
