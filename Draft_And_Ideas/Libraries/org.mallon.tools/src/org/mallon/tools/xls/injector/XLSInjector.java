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

package org.mallon.tools.xls.injector;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.mallon.tools.atl.transformation.ATLTransformationManager;
import org.mallon.tools.file.FileManager;
import org.mallon.tools.xls.injector.elements.interf.BooleanValue;
import org.mallon.tools.xls.injector.elements.interf.Cell;
import org.mallon.tools.xls.injector.elements.interf.Data;
import org.mallon.tools.xls.injector.elements.interf.NumberValue;
import org.mallon.tools.xls.injector.elements.interf.Row;
import org.mallon.tools.xls.injector.elements.interf.StringValue;
import org.mallon.tools.xls.injector.elements.interf.Table;
import org.mallon.tools.xls.injector.elements.interf.ValueType;
import org.mallon.tools.xls.injector.elements.interf.Workbook;
import org.mallon.tools.xls.injector.elements.interf.Worksheet;
import org.mallon.tools.xls.injector.elements.interf.XlsFactory;

/**
 * XLS file to XLS model injector.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 * @author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class XLSInjector {

	private int maxNumberCell = 0;
	private ATLTransformationManager manager;
	private IReferenceModel xlsMetamodel;
	private String xmiFileName;
	private FileManager fileManager = new FileManager();

	public XLSInjector(){
		manager = new ATLTransformationManager();
		manager.initLauncher();
	}

	public IModel getXmiModel(File XLSFile){

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		URI outputURI = URI.createFileURI(XLSFile.getPath().toString()).trimFileExtension().appendFileExtension("xmi");
		xmiFileName = outputURI.trimFileExtension().path();

		Resource resource = resourceSet.createResource(outputURI);

		Workbook workbook;
		try {

			workbook = inject(XLSInjector.readWorkbook(XLSFile.getPath().toString()));
			resource.getContents().add(workbook);
			resource.save(Collections.emptyMap());

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		List<IReferenceModel> metamodels = manager.loadMetamodels("org/mallon/tools/atl/metamodels/excel/xls.ecore");
		xlsMetamodel = metamodels.get(0);		
		IModel excelModel = manager.loadInModel(xlsMetamodel, outputURI.path(), false);

		return excelModel;
	}	

	private Workbook inject(HSSFWorkbook xlsWorkbook) {
		Workbook workbook = XlsFactory.eINSTANCE.createWorkbook();
		for (int i = 0; i < xlsWorkbook.getNumberOfSheets(); i++) {
			Sheet xlsSheet = xlsWorkbook.getSheetAt(i);
			workbook.getWb_worksheets().add(inject(xlsSheet));
		}
		return workbook;
	}

	private Worksheet inject(Sheet xlsSheet) {
		Worksheet sheet = XlsFactory.eINSTANCE.createWorksheet();
		sheet.setName(xlsSheet.getSheetName());
		Table table = XlsFactory.eINSTANCE.createTable();
		sheet.setWs_table(table);
		for (org.apache.poi.ss.usermodel.Row xlsRow : xlsSheet) {
			//Management of the rows just inserted by user (and so with empty cells)
			if ( ! StringUtils.isBlank(xlsRow.getCell(0).getStringCellValue())){
				table.getT_rows().add(inject(xlsRow));
			}
		}
		return sheet;
	}

	private Row inject(org.apache.poi.ss.usermodel.Row xlsRow) {
		Row row = XlsFactory.eINSTANCE.createRow();
		for (org.apache.poi.ss.usermodel.Cell xlsCell : xlsRow) {
			row.getR_cells().add(inject(xlsCell));
		}
		//To have the same number of cells for each rows
		if (row.getR_cells().size() > this.maxNumberCell) {
			this.maxNumberCell = row.getR_cells().size();
		}else{
			while(row.getR_cells().size() < this.maxNumberCell){
				row.getR_cells().add(XlsFactory.eINSTANCE.createCell());
			}
		}
		return row;
	}

	private Cell inject(org.apache.poi.ss.usermodel.Cell xlsCell) {
		Cell cell = XlsFactory.eINSTANCE.createCell();
		Data data = XlsFactory.eINSTANCE.createData();		
		data.setValue(getCellValueType(xlsCell));
		cell.setC_data(data);
		return cell;
	}

	private static HSSFWorkbook readWorkbook(String xlsFileName) throws IOException {
		InputStream input = new FileInputStream(xlsFileName);
		HSSFWorkbook xlsWorkbook = new HSSFWorkbook(input);
		input.close();
		return xlsWorkbook;
	}

	public static Workbook createWorkBook(int lineNumber) throws IOException {

		Workbook workbook = XlsFactory.eINSTANCE.createWorkbook();
		Worksheet xlsSheet = XlsFactory.eINSTANCE.createWorksheet();

		xlsSheet.setName("Test");
		Table table = XlsFactory.eINSTANCE.createTable();

		for (int i = 0; i < lineNumber; i++) {
			Row newRow = XlsFactory.eINSTANCE.createRow();				


			List<Cell> cells = new ArrayList<Cell>();
			if (i == 0){
				cells.addAll(
						createCells("Application", "Libellé", "Domaine fonctionnel", "Modules", "Type d'application", "Numéro du processus",
								"Pôle DSI", "Correspondant DSI", "Entités concernées", "Correspondant métiers", "Intérêt stratégique",
								"Endettement", "Liste des sites qui utilisent l'application", "Nombre d'utilisateur", "Date de mise en " +
										"exploitation", "Criticité au sens métier", "Criticité au sens PSI", "Evolution de l'application",
										"statut application", "Confidentialité des données", "Convention de service", "Nom de la convention de " +
												"service", "Numéro de nomenclature", "Date de MAJ", "Nom du progiciel et version", "", "", "", "", "", "",
												"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
								)
						);
			}else{
				//1,2,3,4,5,6--,8,9,10,11,14--,19 to 47 firsts : strings
				//--7--,12,13--,15,16,17,18-- : integers
				String [] tabStatus = {"O", "S", "P", "A", "C"};
				String [] tabConfidentiality = {"TSD", "SD", "CD", "NP"};
				String [] tabUsers = {"user_A", "user_B", "user_C", "user_D", "user_E", "user_F"};
				String [] tabFunctionDomain = {"01-Décisionnel", "02-Finance", "03-Commerce", "04-Ressources humaines", "05-Achats"};		
				String[] tabPoleDSI = {"BHU", "PLO", "RES", "DEV", "SYS"};

				String[] cellsTab = {	"APP_"+i, "LIB_APP_"+i, 
						/*Functionnal domain*/tabFunctionDomain[Integer.valueOf(getRandomIntInString(5))],
						/*Module - useless to generate*/"", 											
						/*Function*/"FUNCT_"+i, /*Type appli*/"SERV_APP"+i,
						/*num process*/""+i, /*Pole dsi*/tabPoleDSI[Integer.valueOf(getRandomIntInString(5))],
						/*Corr. DSI*/"CORR_DSI_"+i, /*Entite*/"ENT_DSI_"+i, /*Corr.metiers*/"CORR_MET_"+i,											
						/*inté. stratég.*/getRandomIntInString(2), /*endett.*/getRandomIntInString(2),
						/*sites users*/getRandomSetOfUsers(tabUsers), /*nb users*/getRandomIntInString(20000), 
						/*date exploit*/getRandomYear(), /*critic.metier*/getRandomIntInString(2), 
						/*critic.PSI*/getRandomIntInString(2), /*evol app. - useless to generate*/"", 
						/*statut*/tabStatus[Integer.valueOf(getRandomIntInString(5))],
						/*conf.data*/tabConfidentiality[Integer.valueOf(getRandomIntInString(4))]
				};	
				cells.addAll(							
						createCells(cellsTab)
						);		
			}


			newRow.getR_cells().addAll(cells);				
			table.getT_rows().add(newRow);
		}

		xlsSheet.setWs_table(table);
		workbook.getWb_worksheets().add(xlsSheet);

		return workbook;
	}

	public void anonymizeExcelFileTitledOnFirstRow(String xlsFileName){
		try {
			HSSFWorkbook hssfWorkbook = readWorkbook(xlsFileName);
			List<String> titlesList = new ArrayList<String>();
			
			for (int i = 0; i < hssfWorkbook.getNumberOfSheets(); i ++){
				
				for (org.apache.poi.ss.usermodel.Row xlsRow : hssfWorkbook.getSheetAt(i)) {
					for (org.apache.poi.ss.usermodel.Cell xlsCell : xlsRow) {
						
						if (xlsRow.getRowNum() == 0){
							titlesList.add(xlsCell.getStringCellValue());
						}else if (StringUtils.isNotBlank(getCellValue(xlsCell))){				
							String newCellValue = xlsRow.getRowNum() + xlsCell.getColumnIndex() +
													"_" + titlesList.get(xlsCell.getColumnIndex()).substring(0, 5).toUpperCase();														
							changeCellsWithSameValueOnSameColumn(hssfWorkbook.getSheetAt(i), getCellValue(xlsCell), newCellValue, 
																	xlsCell.getColumnIndex());
							xlsCell.setCellValue(newCellValue);
						}
						
					}
					
				}
				
			}			
			
			writeHssFWorkbook(hssfWorkbook, xlsFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void changeCellsWithSameValueOnSameColumn(HSSFSheet sheetToAnonymize, String cellOldValue, String newCellValue, Integer columnToControl){
		for (org.apache.poi.ss.usermodel.Row xlsRow : sheetToAnonymize) {
			for (org.apache.poi.ss.usermodel.Cell xlsCell : xlsRow) {	
				if (xlsCell.getColumnIndex() == columnToControl){
					if(getCellValue(xlsCell).equals(cellOldValue)){
						xlsCell.setCellValue(newCellValue);
					}
				}
			}
		}
	}
	
	private ValueType getCellValueType(org.apache.poi.ss.usermodel.Cell xlsCell){		
		ValueType value = null;
		
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
		
		return value;		
	}
	
	private String getCellValue(org.apache.poi.ss.usermodel.Cell xlsCell){		
		String value = null;
		
		switch (xlsCell.getCellType()) {
		case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BOOLEAN:
			value = String.valueOf(xlsCell.getBooleanCellValue());
			break;

		case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING:
		case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK:
		case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_FORMULA:
			value = xlsCell.getStringCellValue();
			break;

		case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC:
			value = String.valueOf((long)xlsCell.getNumericCellValue());
			break;

		case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_ERROR:
			value = String.valueOf(XlsFactory.eINSTANCE.createErrorValue());
			break;

		default:
			break;
		}
		
		return value;		
	}
		
	private void writeHssFWorkbook(HSSFWorkbook hssfWorkbook, String xlsFileName) throws IOException{
		
		File file = new File(fileManager.getDirectories(new File(xlsFileName)) + fileManager.getFileNameWithoutExtension(xlsFileName) + "_Anonymized.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		hssfWorkbook.write(fileOutputStream);
		fileOutputStream.close();
	}
	
	private static List<Cell> createCells(String ... values){
		List<Cell> cells = new ArrayList<Cell>();		

		for (String valueString : values){
			Data newData = XlsFactory.eINSTANCE.createData();
			ValueType value = null;

			value = XlsFactory.eINSTANCE.createStringValue();
			System.out.println("valueString : " + valueString);
			((StringValue)value).setValue(valueString);
			newData.setValue(value);

			Cell newCell = XlsFactory.eINSTANCE.createCell();
			newCell.setC_data(newData);
			cells.add(newCell);
			System.out.println("newCell : " + newCell.getC_data().getValue().toString());
		}

		return cells;
	}

	private static String getRandomIntInString(int seed){
		return String.valueOf(Math.abs(new Random().nextInt(seed)));
	}

	private static String getRandomYear(){
		Calendar now = Calendar.getInstance();
		String randomYear = getRandomIntInString(now.get(Calendar.YEAR))+1995;
		return randomYear;
	}

	private static String getRandomSetOfUsers(String [] tabUsers){
		String setOfUsers = "";
		for (int i = 0; i < Integer.valueOf(getRandomIntInString(6)); i ++){
			setOfUsers += tabUsers[Integer.valueOf(getRandomIntInString(6))] + "\n";
		}
		return setOfUsers;
	}

	public ATLTransformationManager getManager() {
		return manager;
	}

	public IReferenceModel getXlsMetamodel() {
		return xlsMetamodel;
	}

	public String getXmiFileName() {
		return xmiFileName;
	}

}
