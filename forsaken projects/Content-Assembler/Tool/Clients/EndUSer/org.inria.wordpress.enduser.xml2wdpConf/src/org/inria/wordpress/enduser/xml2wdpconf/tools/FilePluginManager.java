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

package org.inria.wordpress.enduser.xml2wdpconf.tools;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class FilePluginManager extends FileManager{

	private Bundle bundle = Platform.getBundle("org.inria.wordpress.enduser.xml2wdpConf");	
	private static FilePluginManager singleFPluginManager = null ;
	
	private FilePluginManager(){}
	
	public static FilePluginManager getInstance(){
		if (singleFPluginManager == null){
			singleFPluginManager = new FilePluginManager();			
		}
		return singleFPluginManager;
	}
			
	public String findPluginFilePath(String originalPath){		
		
		URL xmlEcoreURL = bundle.getEntry(originalPath);	
		String pluginFilePath = "";
		
		try {
			pluginFilePath = FileLocator.resolve(xmlEcoreURL).toURI().toString();
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		
		return pluginFilePath;
	}
	
	public Bundle getBundle() {
		return bundle;
	}
}