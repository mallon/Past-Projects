package org.inria.wordpress.enduser.xml2wdpconf.freePlane.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.inria.wordpress.WdpConfModel2JSON.WdpConfModel2JSON;
import org.inria.wordpress.enduser.xml2wdpconf.freePlane.tools.ATLTransformationManager;
import org.inria.wordpress.enduser.xml2wdpconf.freePlane.tools.EMFTools;
import org.inria.wordpress.enduser.xml2wdpconf.freePlane.tools.FilePluginManager;
import org.inria.wordpress.enduser.xml2wdpconf.freePlane.tools.XMLInjector;

public class XmlFreePlaneTransfo {
	private FilePluginManager filManager = FilePluginManager.getInstance();
	private String inputXLFileDirectoryUri = null;
	
	public XmlFreePlaneTransfo(String xmlFilePath){
		try{
			File file = new File(xmlFilePath);
			System.out.println("PAR : " + file.getParent());
			inputXLFileDirectoryUri = filManager.getDirectoriesURI(file);
			
			System.out.println("---- Execution started ----");
			StopWatch globalTime = new StopWatch();
			globalTime.start();
						
			ATLTransformationManager manager = new ATLTransformationManager();
			FilePluginManager filManager = FilePluginManager.getInstance();
			manager.initLauncher();
					
			String relativeFilePath = file.getPath().toString();
			String absoluteFilePath = file.getAbsolutePath().toString();
			URI xmlModelUri = URI.createFileURI(filManager.insertGeneratedFilesDir(relativeFilePath)).trimFileExtension().appendFileExtension("xmi");
			String reposModel = filManager.getDirectories(xmlModelUri.segments());
			String fileNameWithoutExtension = xmlModelUri.trimFileExtension().lastSegment();	
			ModelFactory modelFactory = manager.getModelFactory();
			IInjector injector = manager.getInjector();
			
			//XML injection
			
			//Loading XML metamodel
			IReferenceModel xmlMetamodel = null;		
			try {
				xmlMetamodel = modelFactory.newReferenceModel();
				
				String xmlEcore = File.separator+"metamodels"+File.separator+"XML.ecore";
				String xmlEcoreURL = this.getClass().getClassLoader().getResource(xmlEcore).getPath();
				
				System.out.println("xmlEcoreURL : " + xmlEcoreURL);
				
				injector.inject(xmlMetamodel, xmlEcoreURL, Collections.<String, Object> emptyMap());	
			} catch (ATLCoreException e1) {
				e1.printStackTrace();
			}			
					
			//XML model creation
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());			
			Resource resource = resourceSet.createResource(xmlModelUri);
			IModel xmlModel = manager.loadModel(xmlMetamodel);
			
			XMLInjector xmlInjector = new XMLInjector();
			try {
				
				xmlInjector.inject(xmlModel, absoluteFilePath);
			} catch (ATLCoreException e) {
				e.printStackTrace();
			}
			
			EMFModel xmlEMFModel = (EMFModel) xmlModel;
			resource.getContents().addAll(xmlEMFModel.getResource().getContents());
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}		
			
			//XML to WDPConf	
			manager.initLauncher();
			
			//Loading WOCL metamodel
			IReferenceModel woclMetamodel = null;		
			try {
				woclMetamodel = modelFactory.newReferenceModel();
				
				String woclEcore = File.separator+"metamodels"+File.separator+"wdpDsl.ecore";
				String woclEcoreURL = this.getClass().getClassLoader().getResource(woclEcore).getPath();				
				injector.inject(woclMetamodel, woclEcoreURL, Collections.<String, Object> emptyMap());	
			} catch (ATLCoreException e1) {
				e1.printStackTrace();
			}	
			
			List<IReferenceModel> metamodels = new ArrayList<IReferenceModel>();
			metamodels.add(woclMetamodel);
			metamodels.add(xmlMetamodel);
			IModel xmlModelConstruct = manager.loadInModel(metamodels.get(1), reposModel + fileNameWithoutExtension +  ".xmi", false);
			manager.addInModel(xmlModelConstruct, "IN", "XML");

			IModel wdpcModel = manager.loadModel(metamodels.get(0));	
			manager.addOutModel(wdpcModel, "OUT", "WDPDSL");		

			String absolutePathToTransfo = File.separator+"atlTransformations"+File.separator;	
			InputStream xlm2woclLibStream = this.getClass().getClassLoader().getResourceAsStream(absolutePathToTransfo + "WSXML2WDPDSLHelpers.asm");
			manager.getTransformationLauncher().addLibrary("WSXML2WDPDSLHelpers", xlm2woclLibStream);
					
			HashMap<String, Object> options = new HashMap<String, Object>();
			options.put("allowInterModelReferences", true);
			String outXmi = reposModel + fileNameWithoutExtension + "_WDPDSL.xmi";
					
			InputStream xlm2woclStream = this.getClass().getClassLoader().getResourceAsStream(absolutePathToTransfo + "WSXML2WDPDSL.asm");
			
			System.out.println("IS : " + xlm2woclStream);
			
			manager.launch(options, xlm2woclStream);
			manager.extract(wdpcModel, outXmi);	
			
			new EMFTools().registryWdpDslMetaModel();
						
			String wpcXmiPath = inputXLFileDirectoryUri + File.separator + "generatedFiles"
									+ File.separator + fileNameWithoutExtension + "_WDPDSL.xmi";	
						
			URI uriWdpcModel = URI.createFileURI(wpcXmiPath);
			
			System.out.println(uriWdpcModel);
			
			new WdpConfModel2JSON(uriWdpcModel);			
	
			System.out.println("Execution time : " + (globalTime.getTime()/1000.0));			
			
		}catch(Exception e){			
			e.printStackTrace();
		}
	}
}
