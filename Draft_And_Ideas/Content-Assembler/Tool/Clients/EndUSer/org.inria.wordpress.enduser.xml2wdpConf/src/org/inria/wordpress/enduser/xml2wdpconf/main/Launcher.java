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

package org.inria.wordpress.enduser.xml2wdpconf.main;

import java.io.IOException;
import java.util.Collections;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.inria.wordpress.WdpConfModel2JSON.WdpConfModel2JSON;
import org.inria.wordpress.enduser.xml2wdpconf.front.AtlTransformationChain;
import org.inria.wordpress.enduser.xml2wdpconf.tools.ATLTransformationManager;
import org.inria.wordpress.enduser.xml2wdpconf.tools.EMFTools;
import org.inria.wordpress.enduser.xml2wdpconf.tools.FilePluginManager;
import org.inria.wordpress.enduser.xml2wdpconf.tools.XMLInjector;
import org.inria.wordpress.enduser.xml2wdpconf.transformations.XML2WDPConf;


/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class Launcher extends AbstractModelDiscoverer<IFile> {

	private FilePluginManager filManager = FilePluginManager.getInstance();
	private String inputXLFileDirectoryUri = null;
	private String dirWithoutLastOne = null;

	public Launcher() {
		super();
	}

	@Override
	public boolean isApplicableTo(IFile file) {
		return file.getName().endsWith("xml");
	}

	@Override
	protected void basicDiscoverElement(IFile file,
			IProgressMonitor monitor) throws DiscoveryException {

		try{
			
			inputXLFileDirectoryUri = filManager.getDirectoriesURI(file.getLocationURI().toString());
			
			System.out.println("---- Execution started ----");
			StopWatch globalTime = new StopWatch();
			globalTime.start();
						
			ATLTransformationManager manager = new ATLTransformationManager();
			FilePluginManager filManager = FilePluginManager.getInstance();
			manager.initLauncher();
					
			String relativeFilePath = file.getFullPath().toString();
			String absoluteFilePath = file.getLocation().toString();
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
				String xmlEcoreURL = filManager.findPluginFilePath("metamodels/XML.ecore");
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
			
			XML2WDPConf xml2wdpConf = new XML2WDPConf(fileNameWithoutExtension);
			
			//XML to WDPConf			
			new AtlTransformationChain(	manager, "/metamodels/", reposModel,
					xml2wdpConf
			);
						
			new EMFTools().registryWdpDslMetaModel();
						
			String wpcXmiPath = inputXLFileDirectoryUri + filManager.getSystemFileSeparator() + "generatedFiles"
								+ filManager.getSystemFileSeparator()
								+ fileNameWithoutExtension + "_WDPDSL.xmi";	
						
			URI uriWdpcModel = URI.createURI(wpcXmiPath);
			new WdpConfModel2JSON(uriWdpcModel);			
	
			System.out.println("Execution time : " + (globalTime.getTime()/1000.0));			
			
		}catch(Exception e){			
			e.printStackTrace();
			filManager.setLogPath(dirWithoutLastOne + "/");
			filManager.writeLogError(e);
		}
	}

}
