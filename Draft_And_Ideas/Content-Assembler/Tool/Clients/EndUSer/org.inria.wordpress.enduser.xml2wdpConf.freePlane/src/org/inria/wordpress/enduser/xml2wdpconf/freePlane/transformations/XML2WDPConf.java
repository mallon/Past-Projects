package org.inria.wordpress.enduser.xml2wdpconf.freePlane.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.inria.wordpress.enduser.xml2wdpconf.freePlane.tools.ATLTransformationManager;

public class XML2WDPConf implements IAtlTransformation{
	private ATLTransformationManager manager;
	private String reposMetamodel;
	private String reposModel;
	private String fileNameWithoutExtension;
	private String outXmi;
	private IModel extendedACFModel;
	private List<IModel> models = new ArrayList<IModel>();
	private List<String> modelsPaths = new ArrayList<String>();
	
	public XML2WDPConf(String fileNameWithoutExtension){
		this.fileNameWithoutExtension = fileNameWithoutExtension;
	}
	
	public void run(List<IModel> iModels){
		
		System.out.println("XML to XMI");
		StopWatch timeLoadParam = new StopWatch();
		timeLoadParam.start();	
		
		//Loading ATL transformation (WSXML ==> WDPC) parameters and running it
		manager.initLauncher();
		System.out.println(reposMetamodel);
		List<IReferenceModel> metamodels = manager.loadMetamodels(	reposMetamodel + "XML.ecore",
																	reposMetamodel + "wdpDsl.ecore"
																  );
		IModel xmlModelConstruct = manager.loadInModel(metamodels.get(0), reposModel + fileNameWithoutExtension +  ".xmi", false);
		manager.addInModel(xmlModelConstruct, "IN", "XML");
		
		IModel wdpcModel = manager.loadModel(metamodels.get(1));	
		manager.addOutModel(wdpcModel, "OUT", "WDPDSL");		
		
		String absolutePathToTransfo = "/atlTransformations/";	
		manager.addLibrary("WSXML2WDPDSLHelpers", absolutePathToTransfo + "WSXML2WDPDSLHelpers.asm");
				
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("allowInterModelReferences", true);
		outXmi = reposModel + fileNameWithoutExtension + "_WDPDSL.xmi";
				
		System.out.println("Execution time - Loading parameters - Transformation part : "
				+ (timeLoadParam.getTime()/1000.0));		
		
		manager.runATLTransformation(options, absolutePathToTransfo + "WSXML2WDPDSL.asm", outXmi, wdpcModel);
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
		return models;
	}
}
