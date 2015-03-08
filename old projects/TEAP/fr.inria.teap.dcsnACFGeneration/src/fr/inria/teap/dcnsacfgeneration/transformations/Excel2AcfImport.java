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

package fr.inria.teap.dcnsacfgeneration.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;

import fr.inria.teap.dcnsacfgeneration.tools.ATLTransformationManager;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class Excel2AcfImport implements IAtlTransformation{

	private ATLTransformationManager manager;
	private String reposMetamodel;
	private String reposModel;
	private String fileNameWithoutExtension;
	private String outXmi;
	private IModel extendedACFModel;
	private List<IModel> models = new ArrayList<IModel>();
	private List<String> modelsPaths = new ArrayList<String>();
	
	public Excel2AcfImport(String fileNameWithoutExtension){
		this.fileNameWithoutExtension = fileNameWithoutExtension;
	}
	
	public void run(List<IModel> iModels){
		
		System.out.println("EXCEL to Extended_ACF");
		StopWatch timeLoadParam = new StopWatch();
		timeLoadParam.start();		
		
		manager.initLauncher();
		
		List<IReferenceModel> metamodels = manager.loadMetamodels(	reposMetamodel + "excel/xls.ecore", 
																	reposMetamodel + "acf/contentfwk.ecore",
																	reposMetamodel + "acf/extendedcontentfwk.ecore");
		IModel excelModel = manager.loadInModel(metamodels.get(0), reposModel + fileNameWithoutExtension + ".xmi", false);
		
		IModel acfModel = manager.loadModel(metamodels.get(1));
		extendedACFModel = manager.loadModel(metamodels.get(2));
				
		manager.addInModel(excelModel, "IN", "EXCEL");
						
		String absolutePathToTransfo = "/atlTransformations/";		
		manager.addLibrary("EXCEL2ACFHelpers", absolutePathToTransfo + "EXCEl2ACFHelpers.asm");
		
		manager.addOutModel(acfModel, "OUT", "ACF");
		manager.addOutModel(extendedACFModel, "OUTEXTENDED", "ACFEXTENDED");	
		
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("allowInterModelReferences", true);
		outXmi = reposModel + fileNameWithoutExtension + "_ExtendedACF.xmi";
		
		System.out.println("Execution time - Loading parameters - Transformation part : "
				+ (timeLoadParam.getTime()/1000.0));
		
		manager.runATLTransformation(options, absolutePathToTransfo + "EXCEL2ACF.asm", outXmi, extendedACFModel);
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
		models.add(extendedACFModel);
		//TODO
		//models.add(importModel);
		return models;
	}
	
}
