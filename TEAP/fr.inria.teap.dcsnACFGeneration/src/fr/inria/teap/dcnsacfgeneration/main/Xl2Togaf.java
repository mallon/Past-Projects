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

package fr.inria.teap.dcnsacfgeneration.main;

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
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

import fr.inria.teap.dcnsacfgeneration.front.AtlTransformationChain;
import fr.inria.teap.dcnsacfgeneration.tools.ATLTransformationManager;
import fr.inria.teap.dcnsacfgeneration.tools.FilePluginManager;
import fr.inria.teap.dcnsacfgeneration.tools.XLSInjector;
import fr.inria.teap.dcnsacfgeneration.transformations.Excel2AcfImport;
import fr.inria.teap.dcsnacfgeneration.Activator;
import fr.obeo.smartea.injector.xls.Workbook;

/**
 * 	@author <a href="mailto:guillaume.doux@inria.fr">Guillaume Doux</a>
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class Xl2Togaf extends AbstractModelDiscoverer<IFile> {

	private FilePluginManager filManager = FilePluginManager.getInstance();
	private String inputXLFileDirectory = null;
	private String dirWithoutLastOne = null;

	public Xl2Togaf() {
		super();
	}

	@Override
	public boolean isApplicableTo(IFile file) {

		return file.getName().endsWith("xls");

	}

	@Override
	protected void basicDiscoverElement(IFile file,
			IProgressMonitor monitor) throws DiscoveryException {

		try{
			inputXLFileDirectory = filManager.getDirectories(file.getLocation().segments());
			dirWithoutLastOne = inputXLFileDirectory.substring(0, inputXLFileDirectory.lastIndexOf("/"));
			
			System.out.println("---- EXCEL injection ----");
			StopWatch globalTime = new StopWatch();
			globalTime.start();
	
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	
			URI outputURI = URI.createFileURI(filManager.insertGeneratedFilesDir(file.getFullPath().toString())).trimFileExtension().appendFileExtension("xmi");
			String fileNameWithoutExtension = outputURI.trimFileExtension().lastSegment();		
	
			Resource resource = resourceSet.createResource(outputURI);
	
			Workbook workbook;
			try {
	
				workbook = new XLSInjector().inject(XLSInjector.readWorkbook(file.getLocation().toString()));
				resource.getContents().add(workbook);
				resource.save(Collections.emptyMap());
	
			} catch (IOException ioe) {
				filManager.writeLogError(ioe);
				MoDiscoLogger.logError(ioe, "Could not inject data, from the EXCEL source file (" + file.getLocation().toString() + "), in the target EXCEL model", Activator.getDefault());
			}
	
			System.out.println("Execution time - Injection part : " + (globalTime.getTime()/1000.0));
			
			//*************************************************
			System.out.println("---- ATL transformations ----");
	
			ATLTransformationManager manager = new ATLTransformationManager();
	
			String reposMetamodel = "/metamodels/";
			String reposModel = filManager.getDirectories(outputURI.segments());
			
	
			System.out.println("reposMetamodel : " + reposMetamodel);
			System.out.println("reposModel : " + reposModel);
			new AtlTransformationChain(	manager, reposMetamodel, reposModel,
										new Excel2AcfImport(fileNameWithoutExtension)
			);
				
			System.out.println("Executing time - All transformations chain : " + globalTime.getTime()/1000.0);
			globalTime.stop();	
			
		}catch(Exception e){			
			filManager.setLogPath(dirWithoutLastOne + "/");
			filManager.writeLogError(e);
		}
	}

}
