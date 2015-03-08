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

package fr.inria.teap.dcnsacfgeneration.tools;

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class FilePluginManager extends FileManager{

	private Bundle bundle = Platform.getBundle("fr.inria.teap.dcnsSVGGeneration");	
	private IPath path = null;
	private URL pluginURL = null;
	private static FilePluginManager singleFPluginManager = null ;
	
	private FilePluginManager(){}
	
	public static FilePluginManager getInstance(){
		if (singleFPluginManager == null){
			singleFPluginManager = new FilePluginManager();			
		}
		return singleFPluginManager;
	}
			
	public String findPluginFilePath(String originalPath){		
		
		path = new Path(originalPath);
		pluginURL = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
		
		return pluginURL.getPath();
	}
	
	public Bundle getBundle() {
		return bundle;
	}
}