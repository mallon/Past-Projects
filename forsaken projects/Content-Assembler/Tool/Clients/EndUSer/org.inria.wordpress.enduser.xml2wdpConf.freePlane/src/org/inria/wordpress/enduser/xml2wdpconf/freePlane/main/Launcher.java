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

package org.inria.wordpress.enduser.xml2wdpconf.freePlane.main;


/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class Launcher {
	public static void main(String [] args) {
		new XmlFreePlaneTransfo(args[0]);	
//		new XmlFreePlaneTransfo("C:\\Users\\MALLON\\Desktop\\WebsiteExperimExampleTest.mm.xml");				
	}

}
