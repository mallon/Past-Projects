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

package org.mallon.tools.atl.transformation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.mallon.tools.file.FileManager;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class ATLTransformationManager {

	private ILauncher transformationLauncher = null;	
	private ModelFactory modelFactory = null;	
	private IInjector injector = null;
	private IExtractor extractor = null;
	private XMLExtractor xmlExtractor = null;
	private FileManager fileManager = new FileManager();
	private AtlParser atlParser = new AtlParser();
	private Boolean refiningTrace =false;

	private void launch(HashMap<String, Object> options, InputStream atlFileInputStream) {		
		StopWatch timeTransfo = new StopWatch();
		timeTransfo.start();
		
		transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), options, atlFileInputStream);	
		
		System.out.println("Execution time - Transformation only ('launch' method) - Transformation part : "
				+ (timeTransfo.getTime()/1000.0));
	}

	public void extract(IModel model, String outputXmiFile) {
		try {
			extractor.extract(model, outputXmiFile);
		} catch (ATLCoreException ace) {
			ace.printStackTrace();
		}
	}
	
	public void extract(IModel model, String outputXmiFile, HashMap<String, Object> options) {
		try {
			extractor.extract(model, outputXmiFile, options);
		} catch (ATLCoreException ace) {
			ace.printStackTrace();
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
		
		try {

			for(String metamodelPath : metamodelsPaths){
				IReferenceModel metamodel = modelFactory.newReferenceModel();				
				injector.inject(metamodel, fileManager.getStream(metamodelPath), Collections.<String, Object> emptyMap());
				metamodels.add(metamodel);
			}			

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		return metamodels;
	}
	
	public IModel loadModel(IReferenceModel metamodel){

		IModel model = null;

		try {
			model = modelFactory.newModel(metamodel);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}

		return model;
	}
	
	public IModel parseATL2XMI(InputStream atlInputStream){
		IModel atlModel = null;
		try {
			atlModel = atlParser.parseToModel(atlInputStream);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		return atlModel;
	}
	
	public void parseXMI2ATL(String atlfilePath){

		try {
			
			InputStream in = new FileInputStream(atlfilePath);
			
			System.out.println("in is null ? " + (in == null));
			
			EObject [] atlEObject = atlParser.parseWithProblems(in);
			
			for (EObject test :  atlEObject){
				System.out.println(test.toString());
			}
			
			
//			EObject atlEObject = atlParser.parse(in);
//			
//			System.out.println("EObject is null ? " + (atlEObject == null));
//			
//			ResourceSet resourceSet = new ResourceSetImpl();
//			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
//					new XMIResourceFactoryImpl());
//			URI outputURI = URI.createFileURI(atlfilePath.split("[.]")[0]+".atl");
//			Resource resource = resourceSet.createResource(outputURI);
//
//			resource.getContents().add(atlEObject);
//			resource.save(Collections.emptyMap());	
			
		} catch (FileNotFoundException | ATLCoreException e) {
			e.printStackTrace();
		}
		
	}
	
	public IModel injectModel(IModel model, String modelPath){
		try {
			injector.inject(model, modelPath);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		return model;
	}
		
	public IModel loadInModel(IReferenceModel metamodel, String modelPath, Boolean isLocalPluginFile){

		IModel model = loadModel(metamodel);		
		return injectModel(model, modelPath);
	}

	public void addInOutModel(IModel model, String modelInOutName, String modelName) {
		transformationLauncher.addInOutModel(model, modelInOutName, modelName);
		
		if (!refiningTrace){
			IReferenceModel refiningTraceMetamodel = null;
			try {
				refiningTraceMetamodel = modelFactory.getBuiltInResource("RefiningTrace.ecore");
			} catch (ATLCoreException e) {
				e.printStackTrace();
			}
			IModel refiningTraceModel = loadModel(refiningTraceMetamodel);
			addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
			refiningTrace = true;
		}	
	}
	
	public void addInModel(IModel model, String modelInName, String modelName) {
		transformationLauncher.addInModel(model, modelInName, modelName);
	}

	public void addOutModel(IModel model, String modelOutName, String modelName) {
		transformationLauncher.addOutModel(model, modelOutName, modelName);
	}

	public void addLibrary(String libraryName, String libraryPath) {
		transformationLauncher.addLibrary(libraryName, fileManager.getStream(libraryPath));
	}

	public void runATLTransformation(HashMap<String, Object> options, String atlFilePath, String outputXmiFile, IModel ... models) {
		StopWatch timeTransfoAndExtraction = new StopWatch();
		timeTransfoAndExtraction.start();
		
		launch(options, fileManager.getStream(atlFilePath));
		
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
			
			System.out.println("model : " + model);
			System.out.println("filePath : " + filePath);
			
			xmlExtractor.extract(model, filePath);	
			
		} catch (ATLCoreException ace) {
			ace.printStackTrace();
		}

	}
	
	public IModel getModel(String modelName){
		return transformationLauncher.getModel(modelName);
	}

	public ModelFactory getModelFactory() {
		return modelFactory;
	}
	
	public IExtractor getExtractor() {
		return extractor;
	}
	
	public AtlParser getAtlParser() {
		return atlParser;
	}
	
	public ILauncher getTransformationLauncher() {
		return transformationLauncher;
	}

	public IInjector getInjector() {
		return injector;
	}

	public XMLExtractor getXmlExtractor() {
		return xmlExtractor;
	}

	public FileManager getFileManager() {
		return fileManager;
	}

	public Boolean getRefiningTrace() {
		return refiningTrace;
	}

}
