/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mallon.tools.xls.injector.elements.interf;

import org.eclipse.emf.ecore.EFactory;
import org.mallon.tools.xls.injector.elements.impl.XlsFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.smartea.injector.xls.XlsPackage
 * @generated
 */
public interface XlsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XlsFactory eINSTANCE = XlsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Type</em>'.
	 * @generated
	 */
	DateTimeType createDateTimeType();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Value</em>'.
	 * @generated
	 */
	NumberValue createNumberValue();

	/**
	 * Returns a new object of class '<em>Date Time Type Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Type Value</em>'.
	 * @generated
	 */
	DateTimeTypeValue createDateTimeTypeValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Error Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Value</em>'.
	 * @generated
	 */
	ErrorValue createErrorValue();

	/**
	 * Returns a new object of class '<em>Workbook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workbook</em>'.
	 * @generated
	 */
	Workbook createWorkbook();

	/**
	 * Returns a new object of class '<em>Worksheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worksheet</em>'.
	 * @generated
	 */
	Worksheet createWorksheet();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell</em>'.
	 * @generated
	 */
	Cell createCell();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XlsPackage getXlsPackage();

} //XlsFactory
