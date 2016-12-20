package org.mallon.tools.converter.excel;

import java.io.File;

import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;

public class ExcelXML2XLS {

	public ExcelXML2XLS(String xmlExcelFileName){
		OfficeManager officeManager = new DefaultOfficeManagerConfiguration().buildOfficeManager();
	    officeManager.start();

	    OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
	    converter.convert(new File(xmlExcelFileName + ".xml"), new File(xmlExcelFileName + ".xls"));
	        
	    officeManager.stop();
	}
}
