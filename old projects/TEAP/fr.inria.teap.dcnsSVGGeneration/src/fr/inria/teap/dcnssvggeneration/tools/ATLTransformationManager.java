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

package fr.inria.teap.dcnssvggeneration.tools;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
//import org.eclipse.m2m.atl.projectors.xml.XMLExtractor;

import fr.inria.teap.dcnssvggeneration.Activator;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class ATLTransformationManager {

	private ILauncher transformationLauncher = null;
	private ModelFactory modelFactory = null;
	private IInjector injector = null;
	private IExtractor extractor = null;
	private XMLExtractor xmlExtractor = null;
	private FilePluginManager filePluginManager = FilePluginManager.getInstance();

	private void launch(HashMap<String, Object> options, InputStream atlFileInputStream) {		
		StopWatch timeTransfo = new StopWatch();
		timeTransfo.start();
		
		transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), options, atlFileInputStream);	
		
		System.out.println("Execution time - Transformation only ('launch' method) - Transformation part : "
				+ (timeTransfo.getTime()/1000.0));
	}

	private void extract(IModel model, String outputXmiFile) {
		try {
			extractor.extract(model, outputXmiFile);
		} catch (ATLCoreException ace) {
			MoDiscoLogger.logError("Model extraction failed. Path of target : " + outputXmiFile, Activator.getDefault());
		}
	}

	public ATLTransformationManager(){
		modelFactory = new EMFModelFactory();
		injector = new EMFInjector();
		extractor = new EMFExtractor();
	}

	public void initLauncher(ILauncher launcher){
		transformationLauncher = launcher;
		transformationLauncher.initialize(new HashMap<String, Object>());
	}

	public void initLauncher(){
		transformationLauncher = new EMFVMLauncher();
		transformationLauncher.initialize(new HashMap<String, Object>());
	}

	public List<IReferenceModel> loadMetamodels(String ... metamodelsPaths){

		List<IReferenceModel> metamodels = new ArrayList<IReferenceModel>();
		String currentMetamodelPath = "";
		
		try {

			for(String metamodelPath : metamodelsPaths){
				currentMetamodelPath = metamodelPath;
				IReferenceModel metamodel = modelFactory.newReferenceModel();
				
				injector.inject(metamodel, filePluginManager.getStream(metamodelPath), Collections.<String, Object> emptyMap());
				metamodels.add(metamodel);
			}			

		} catch (ATLCoreException e) {
			MoDiscoLogger.logError("Metamodel injection failed. Path of source : " + currentMetamodelPath, Activator.getDefault());
		}
		
		return metamodels;
	}

	public IModel loadModel(IReferenceModel metamodel){

		IModel model = null;

		try {
			model = modelFactory.newModel(metamodel);
		} catch (ATLCoreException e) {
			MoDiscoLogger.logError("Model loading failed", Activator.getDefault());
		}

		return model;
	}

	public IModel injectModel(IModel model, String modelPath){
		try {
			injector.inject(model, modelPath);
		} catch (ATLCoreException e) {
			MoDiscoLogger.logError("Model injection failed. Path of source : " + modelPath, Activator.getDefault());
		}
		return model;
	}
	
	public IModel loadInModel(IReferenceModel metamodel, String modelPath, Boolean isLocalPluginFile){

		IModel model = loadModel(metamodel);		
		return injectModel(model, modelPath);
	}

	public void addInModel(IModel model, String modelINOUTIdentifier, String modelName) {
		transformationLauncher.addInModel(model, modelINOUTIdentifier, modelName);
	}

	public void addOutModel(IModel model, String modelINOUTIdentifier, String modelName) {
		transformationLauncher.addOutModel(model, modelINOUTIdentifier, modelName);
	}

	public void addLibrary(String libraryName, String libraryPath) {
		transformationLauncher.addLibrary(libraryName, filePluginManager.getStream(libraryPath));
	}

	public void runATLTransformation(HashMap<String, Object> options, String atlFilePath, String outputXmiFile, IModel ... models) {
		StopWatch timeTransfoAndExtraction = new StopWatch();
		timeTransfoAndExtraction.start();
		
		launch(options, filePluginManager.getStream(atlFilePath));
		
		StopWatch timeExtraction = new StopWatch();
		timeExtraction.start();
		for (IModel model : models) {
			this.extract(model, outputXmiFile);
		}	
		
		System.out.println("Execution time - Model(s) extraction - Transformation part : "
				+ (timeExtraction.getTime()/1000.0));
				
		System.out.println("Execution time - Transfo. and model(s) extraction - Transformation part : "
				+ (timeTransfoAndExtraction.getTime()/1000.0));
	}

	public void xmlExtraction(IModel model, String filePath){
		try {
			
			xmlExtractor = new XMLExtractor();
			xmlExtractor.extract(model, filePath);	
			
		} catch (ATLCoreException ace) {
			MoDiscoLogger.logError("XML extraction failed. Path of xml model : " + filePath, Activator.getDefault());
		}

	}
	
	public IModel getModel(String modelName){
		return transformationLauncher.getModel(modelName);
	}

}
