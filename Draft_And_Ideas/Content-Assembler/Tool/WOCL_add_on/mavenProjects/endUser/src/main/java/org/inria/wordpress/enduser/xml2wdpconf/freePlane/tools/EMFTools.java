package org.inria.wordpress.enduser.xml2wdpconf.freePlane.tools;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.inria.wordpress.wdpdsl.wdpDsl.WdpDslPackage;

public class EMFTools {

	public void registryMetaModel(String filePath){
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);		
		URI wdpcMetaModUri = URI.createFileURI(filePath);
		
		Resource r = rs.getResource(wdpcMetaModUri, true);
		EObject eObject = r.getContents().get(0);
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage)eObject;
			EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
		}
	}	
	
	public void registryWdpDslMetaModel(){
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(WdpDslPackage.eNS_URI, WdpDslPackage.eINSTANCE);
	}
	
	public void persistWdpDslMetaModel(){
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new  XMLResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createURI("metamodels/wdpDsl.ecore"));
		resource.getContents().add(WdpDslPackage.eINSTANCE);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
}
