/********************************************************************************
 * Copyright (c) 2013 INRIA. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors: 
 * 	INRIA - Initial implementation
 *********************************************************************************/

package fr.inria.teap.dcnsacfgeneration.tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import fr.obeo.smartea.injector.xls.BooleanValue;
import fr.obeo.smartea.injector.xls.Cell;
import fr.obeo.smartea.injector.xls.Data;
import fr.obeo.smartea.injector.xls.NumberValue;
import fr.obeo.smartea.injector.xls.Row;
import fr.obeo.smartea.injector.xls.StringValue;
import fr.obeo.smartea.injector.xls.Table;
import fr.obeo.smartea.injector.xls.ValueType;
import fr.obeo.smartea.injector.xls.Workbook;
import fr.obeo.smartea.injector.xls.Worksheet;
import fr.obeo.smartea.injector.xls.XlsFactory;

/**
 * XLS file to XLS model injector.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 * @author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class XLSInjector {

	private int maxNumberCell = 0;
	
	public Workbook inject(HSSFWorkbook xlsWorkbook) {
		Workbook workbook = XlsFactory.eINSTANCE.createWorkbook();
		for (int i = 0; i < xlsWorkbook.getNumberOfSheets(); i++) {
			Sheet xlsSheet = xlsWorkbook.getSheetAt(i);
			workbook.getWb_worksheets().add(inject(xlsSheet));
		}
		return workbook;
	}

	public Worksheet inject(Sheet xlsSheet) {
		Worksheet sheet = XlsFactory.eINSTANCE.createWorksheet();
		sheet.setName(xlsSheet.getSheetName());
		Table table = XlsFactory.eINSTANCE.createTable();
		sheet.setWs_table(table);
		for (org.apache.poi.ss.usermodel.Row xlsRow : xlsSheet) {
			//Management of the rows just inserted by user (and so with empty cells)
			if (xlsRow.getCell(0) != null){
				if ( ! StringUtils.isBlank(xlsRow.getCell(0).getStringCellValue())){
					table.getT_rows().add(inject(xlsRow));
				}
			}
		}
		return sheet;
	}

	public Row inject(org.apache.poi.ss.usermodel.Row xlsRow) {
		Row row = XlsFactory.eINSTANCE.createRow();
		
		//Iterator ignore null object, but it is necessary to consider
		//cells with null value (this cells are null objects in the Apache POI API)
		for (int i = 0; i < xlsRow.getLastCellNum(); i++){
			row.getR_cells().add(inject(xlsRow.getCell(i)));
		}
		return row;
	}

	public Cell inject(org.apache.poi.ss.usermodel.Cell xlsCell) {
		Cell cell = XlsFactory.eINSTANCE.createCell();
		Data data = XlsFactory.eINSTANCE.createData();
		ValueType value = null;
		if (xlsCell == null){
			value = XlsFactory.eINSTANCE.createStringValue();
			((StringValue)value).setValue("");
		}else{
			switch (xlsCell.getCellType()) {
				case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BOOLEAN:
					value = XlsFactory.eINSTANCE.createBooleanValue();
					((BooleanValue)value).setValue(xlsCell.getBooleanCellValue());
					break;
	
				case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING:
				case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK:
				case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_FORMULA:
					value = XlsFactory.eINSTANCE.createStringValue();
					((StringValue)value).setValue(xlsCell.getStringCellValue());
					break;
	
				case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC:
					value = XlsFactory.eINSTANCE.createNumberValue();
					((NumberValue)value).setValue(xlsCell.getNumericCellValue());
					break;
	
				case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_ERROR:
					value = XlsFactory.eINSTANCE.createErrorValue();
					break;
	
				default:
					break;
			}
		}	
		data.setValue(value);
		cell.setC_data(data);
		return cell;
	}

	public static HSSFWorkbook readWorkbook(String xlsFileName) throws IOException {
		InputStream input = new FileInputStream(xlsFileName);
		HSSFWorkbook xlsWorkbook = new HSSFWorkbook(input);
		input.close();
		return xlsWorkbook;
	}
}
