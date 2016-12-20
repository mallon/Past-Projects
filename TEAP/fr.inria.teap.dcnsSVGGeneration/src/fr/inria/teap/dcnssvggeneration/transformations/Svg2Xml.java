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
public class Svg2Xml implements IAtlTransformation{

	private ATLTransformationManager manager;
	private String reposMetamodel;
	private String reposModel;
	private String outXmi;
	private IModel xmlModel;
	private List<IModel> models = new ArrayList<IModel>();
	private List<String> modelsPaths = new ArrayList<String>();
	private String fileNameWithoutExtension;
	
	public Svg2Xml(String fileNameWithoutExtension){
		this.fileNameWithoutExtension = fileNameWithoutExtension;
	}
	
	public void run(List<IModel> iModels) {
		
		System.out.println("SVG to XML");
		
		StopWatch timeLoadParam = new StopWatch();
		timeLoadParam.start();	
		
		manager.initLauncher();
		
		IModel svgModel = manager.injectModel(iModels.get(0), reposModel + fileNameWithoutExtension + "_SVG.xmi");
		manager.addInModel(svgModel, "IN", "SVG");
		
		String absolutePathToTransfo = "/atlTransformations/";
		manager.addLibrary("SVG2XMLHelpers", absolutePathToTransfo + "SVG2XMLHelpers.asm");
				
		List<IReferenceModel> metamodels = manager.loadMetamodels(reposMetamodel + "xml/XML.ecore");
		xmlModel = manager.loadModel(metamodels.get(0));	
		manager.addOutModel(xmlModel, "OUT", "XML");
					
		HashMap<String, Object> options = new HashMap<String, Object>();
		outXmi = reposModel + fileNameWithoutExtension + "_XML.xmi";
				
		System.out.println("Execution time - Loading parameters - Transformation part : "
				+ (timeLoadParam.getTime()/1000.0));
		
		manager.runATLTransformation(options, absolutePathToTransfo + "SVG2XML.asm", outXmi, xmlModel);
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
		models.add(xmlModel);
		return models;
	}
}
