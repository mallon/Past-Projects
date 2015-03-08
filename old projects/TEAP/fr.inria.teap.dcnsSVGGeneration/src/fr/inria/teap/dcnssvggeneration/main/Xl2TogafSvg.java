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

package fr.inria.teap.dcnssvggeneration.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

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

import fr.inria.teap.dcnssvggeneration.Activator;
import fr.inria.teap.dcnssvggeneration.front.AtlTransformationChain;
import fr.inria.teap.dcnssvggeneration.tools.ATLTransformationManager;
import fr.inria.teap.dcnssvggeneration.tools.DateFactory;
import fr.inria.teap.dcnssvggeneration.tools.FilePluginManager;
import fr.inria.teap.dcnssvggeneration.tools.XLSInjector;
import fr.inria.teap.dcnssvggeneration.transformations.AcfImport2Svg;
import fr.inria.teap.dcnssvggeneration.transformations.Excel2AcfImport;
import fr.inria.teap.dcnssvggeneration.transformations.Svg2Xml;
import fr.inria.teap.dcnssvggeneration.transformations.XMLExtraction;
import fr.obeo.smartea.injector.xls.Workbook;

/**
 * 	@author <a href="mailto:guillaume.doux@inria.fr">Guillaume Doux</a>
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class Xl2TogafSvg extends AbstractModelDiscoverer<IFile> {

	private FilePluginManager filManager = FilePluginManager.getInstance();
	private String inputXLFileDirectory = null;
	private String dirWithoutLastOne = null;

	public Xl2TogafSvg() {
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
					new Excel2AcfImport(fileNameWithoutExtension),
					new AcfImport2Svg(fileNameWithoutExtension),
					new Svg2Xml(fileNameWithoutExtension),
					new XMLExtraction(inputXLFileDirectory, fileNameWithoutExtension)
					);
	
			StopWatch timeDateImageInjection = new StopWatch();
			timeDateImageInjection.start();
			
			//Current date and image (Logo, plus and equals) injection		
			File fileSource = new File(inputXLFileDirectory + fileNameWithoutExtension + "_temp.svg");
			String searchingStringDate = "As is a la fin";
			String searchingLogoUri = "../resources/DCNSLogo.png";
			String plusUri = "../resources/plus.png";
			String equalUri = "../resources/equal.png";
	
			try {
				try(
						Scanner scanner = new Scanner(fileSource);        			
						FileWriter fw = new FileWriter(new File(inputXLFileDirectory + fileNameWithoutExtension + ".svg").getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						){
	
					while (scanner.hasNextLine()) {
						String line = scanner.nextLine();
	
						if (line.contains(searchingStringDate)){
	
							bw.write(	line.substring(0, line.indexOf(searchingStringDate)) 
									+ "As is à la fin " + DateFactory.getActualYear() 
									+ " (mis à jour " + DateFactory.getActualMonthAndYear()
									+ " " + line.substring(line.indexOf(")"), line.length()) 
									+ "\n"
									);
	
						}else 
							if (line.contains(searchingLogoUri)){
								replaceRefOfPicture(bw, line, searchingLogoUri, "DCNSLogo.png");
							}else
								if (line.contains(plusUri)){
									replaceRefOfPicture(bw, line, plusUri, "plus.png");
								}else
									if (line.contains(equalUri)){
										replaceRefOfPicture(bw, line, equalUri, "equal.png");
									}else{
										bw.write(line + "\n");
									}	
					}
	
				}
				fileSource.delete();
			} catch (IOException e) {
				filManager.writeLogError(e);
				MoDiscoLogger.logError(e, "Could not write the current date, logo and other svg pictures in the target SVG file", 
						Activator.getDefault());
			}
	
			System.out.println("Executing time - Current date and images injection part: " 
									+ (timeDateImageInjection.getTime()/1000.0));
			timeDateImageInjection.stop();
			
			System.out.println("Executing time - All transformations chain : " + globalTime.getTime()/1000.0);
			globalTime.stop();	
			
		}catch(Exception e){			
			filManager.setLogPath(dirWithoutLastOne + "/");
			filManager.writeLogError(e);
		}
	}

	private void replaceRefOfPicture(BufferedWriter bwWriteOn, String line, String oldPictureRef, String newPictureRef) throws IOException{
		filManager.copyFile("/resources/" + newPictureRef, dirWithoutLastOne + "/generatedFiles/" + newPictureRef);

		bwWriteOn.write(	line.substring(0, line.indexOf(oldPictureRef)) 
				+ "./generatedFiles/" + newPictureRef
				+ "\"/"
				+ line.substring(line.indexOf(">"), line.length()) 
				+ "\n"
				);
	}

}
