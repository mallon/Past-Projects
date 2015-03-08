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

package org.inria.wordpress.enduser.xml2wdpconf.transformations;

import java.util.List;

import org.eclipse.m2m.atl.core.IModel;
import org.inria.wordpress.enduser.xml2wdpconf.tools.ATLTransformationManager;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public interface IAtlTransformation {
	
	public void loadParameters(ATLTransformationManager manager, String reposMetamodel, String reposModel);
	
	public void run(List<IModel> iModels);
	
	public List<String> getOutPutModelsPath();
	
	public List<IModel> getOutPutModels();
}
