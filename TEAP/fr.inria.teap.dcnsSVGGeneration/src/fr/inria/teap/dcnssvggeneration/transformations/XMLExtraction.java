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

import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.m2m.atl.core.IModel;

import fr.inria.teap.dcnssvggeneration.tools.ATLTransformationManager;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class XMLExtraction implements IAtlTransformation{

	private ATLTransformationManager manager;
	private String target;
	private String reposModel;
	private String fileNameWithoutExtension;

	public XMLExtraction(String target, String fileNameWithoutExtension){
		this.fileNameWithoutExtension = fileNameWithoutExtension;
		this.target = target + fileNameWithoutExtension + "_temp.svg";
	}
	
	public void loadParameters(ATLTransformationManager manager,
			String reposMetamodel, String reposModel) {
		this.manager = manager;
		this.reposModel = reposModel;
	}

	public void run(List<IModel> iModels) {
		System.out.println("XML extraction");	
		StopWatch timeXtraction = new StopWatch();
		timeXtraction.start();	
		
		manager.initLauncher();
		IModel xmlModel = manager.injectModel(iModels.get(0), reposModel + fileNameWithoutExtension + "_XML.xmi");
					
		manager.xmlExtraction(xmlModel, target);
		
		System.out.println("Execution time - Loading parameters - Transformation part : "
				+ (timeXtraction.getTime()/1000.0));
	}

	public List<String> getOutPutModelsPath() {
		return null;
	}

	public List<IModel> getOutPutModels() {
		return null;
	}

}
