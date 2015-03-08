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

package fr.inria.teap.dcnssvggeneration.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;

import fr.inria.teap.dcnssvggeneration.tools.ATLTransformationManager;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class Excel2AcfImport implements IAtlTransformation{

	private ATLTransformationManager manager;
	private String reposMetamodel;
	private String reposModel;
	private String fileNameWithoutExtension;
	private String outXmi;
	private IModel acfModel;
	private IModel importModel;
	private List<IModel> models = new ArrayList<IModel>();
	private List<String> modelsPaths = new ArrayList<String>();
	
	public Excel2AcfImport(String fileNameWithoutExtension){
		this.fileNameWithoutExtension = fileNameWithoutExtension;
	}
	
	public void run(List<IModel> iModels){
		
		System.out.println("EXCEL to ACF_IMPORT");
		StopWatch timeLoadParam = new StopWatch();
		timeLoadParam.start();		
		
		manager.initLauncher();
		
		List<IReferenceModel> metamodels = manager.loadMetamodels(	reposMetamodel + "excel/xls.ecore", 
																	reposMetamodel + "acf/contentfwk.ecore",
																	reposMetamodel + "import/import.ecore");
		IModel excelModel = manager.loadInModel(metamodels.get(0), reposModel + fileNameWithoutExtension + ".xmi", false);
		
		acfModel = manager.loadModel(metamodels.get(1));
		importModel = manager.loadModel(metamodels.get(2));	
				
		manager.addInModel(excelModel, "IN", "EXCEL");
						
		String absolutePathToTransfo = "/atlTransformations/";		
		manager.addLibrary("EXCEL2ACFHelpers", absolutePathToTransfo + "EXCEl2ACFHelpers.asm");
		
		manager.addOutModel(acfModel, "OUT", "ACF");
		manager.addOutModel(importModel, "OUTIMPORT", "IMPORT");			
		
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("allowInterModelReferences", true);
		outXmi = reposModel + fileNameWithoutExtension + "_ACF_IMPORT.xmi";	
				
		System.out.println("Execution time - Loading parameters - Transformation part : "
				+ (timeLoadParam.getTime()/1000.0));
		
		manager.runATLTransformation(options, absolutePathToTransfo + "EXCEL2ACF.asm", outXmi, acfModel, importModel);	
	}

	public void loadParameters(ATLTransformationManager manager,
			String reposMetamodel, String reposModel) {
		this.manager = manager;
		this.reposMetamodel = reposMetamodel;
		this.reposModel = reposModel;
	}
	
	public List<String> getOutPutModelsPath(){
		modelsPaths.add(outXmi);
		return modelsPaths;
	}
	
	public List<IModel> getOutPutModels(){
		models.add(acfModel);
		models.add(importModel);
		return models;
	}
	
}
