package org.inria.wordpress.xText2Model.actions;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.inria.wordpress.WdpConfModel2JSON.WdpConfModel2JSON;
import org.inria.wordpress.wdpdsl.WdpDslStandaloneSetup;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

import com.google.inject.Injector;

public class WdpGrammar2XMI {
		
	private Resource res = null;
	
	public WdpGrammar2XMI(IFile file){			
			try {
				new WdpConfModel2JSON(createModel(file));
				res.delete(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	private URI createModel(IFile file){
		URI outputUri = null;
		
		URI outputURI = URI.createURI(file.getFullPath().toString());
		String dir = "";
		String [] segments = outputURI.segments();
		int i = 0;
		for (String segment : segments){
			i++;
			if (i < segments.length){
				dir += "/" + segment;
			}
		}
		dir += "/";
		String fileNameWithoutExtension = outputURI.trimFileExtension().lastSegment();  
		
		try {
			Injector injector = new WdpDslStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet xTextResourceSet = injector.getInstance(XtextResourceSet.class);	
			xTextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = xTextResourceSet.getResource(outputURI, true);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getPackageRegistry().put(WdpDslPackage.eNS_URI, WdpDslPackage.eINSTANCE);
	
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EcoreResourceFactoryImpl());
			
			outputUri = (URI.createURI(dir+fileNameWithoutExtension+".xmi"));
						
			res = resourceSet.createResource(outputUri);
			res.getContents().addAll(resource.getContents());		
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}					
				
		return outputUri;
	}
}
