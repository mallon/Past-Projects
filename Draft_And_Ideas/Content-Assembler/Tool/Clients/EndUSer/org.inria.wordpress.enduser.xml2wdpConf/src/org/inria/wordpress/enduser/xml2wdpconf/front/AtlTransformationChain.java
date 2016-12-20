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

package org.inria.wordpress.enduser.xml2wdpconf.front;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.m2m.atl.core.IModel;
import org.inria.wordpress.enduser.xml2wdpconf.tools.ATLTransformationManager;
import org.inria.wordpress.enduser.xml2wdpconf.transformations.IAtlTransformation;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class AtlTransformationChain {

	private IAtlTransformation [] iAtlTransformations = null;
	private List<IModel> iModels = new ArrayList<IModel>();
	
	public AtlTransformationChain(ATLTransformationManager manager, String reposMetamodel, String reposModel,
										IAtlTransformation ... iAtlTransformations){
		
		this.iAtlTransformations = iAtlTransformations;			
		
		for(IAtlTransformation iatlTransformation : iAtlTransformations){
			StopWatch timeLoadAndTransfo = new StopWatch();	
			timeLoadAndTransfo.start();
					
			iatlTransformation.loadParameters(manager, reposMetamodel, reposModel);				
			iatlTransformation.run(iModels);
			
			System.out.println("Execution time - All (Loading parameters and run transformation) - Transformation part : "
												+ (timeLoadAndTransfo.getTime()/1000.0));
			timeLoadAndTransfo.stop();
			
			if (iatlTransformation.getOutPutModels() != null){
				iModels = new ArrayList<IModel>();
				iModels.addAll(iatlTransformation.getOutPutModels());
			}			
		}		
		
	}
	
	public IAtlTransformation getIAtlTransformation(int idAtlTransformation){
		return iAtlTransformations[idAtlTransformation];
	}
}
