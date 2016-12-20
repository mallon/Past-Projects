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

package fr.inria.teap.dcnsXlsAnonymize.main;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.mallon.tools.xls.injector.XLSInjector;

/**
 * @author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public class XlsAnonymize extends AbstractModelDiscoverer<IFile>{

	public XlsAnonymize() {
		super();
	}

	@Override
	public boolean isApplicableTo(IFile source) {
		return source.getName().endsWith("xls");
	}

	@Override
	protected void basicDiscoverElement(IFile source, IProgressMonitor monitor) throws DiscoveryException {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//Transformation of EXCEL model to an anonymized EXCEL one
		XLSInjector xlsInjector = new XLSInjector();		
		xlsInjector.anonymizeExcelFileTitledOnFirstRow(source.getLocation().toString());
		
		System.out.println("End of anonymizing - executing time : " + stopWatch.getTime()/1000.0);
		stopWatch.stop();
	}

}
