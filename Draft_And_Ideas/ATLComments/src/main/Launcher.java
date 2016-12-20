package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.mallon.tools.atl.transformation.ATLTransformationManager;

public class Launcher {

	public static void main(String[] args) {

		ATLTransformationManager atlTransformationManager = new ATLTransformationManager();	
		atlTransformationManager.initLauncher();
		try {
			InputStream in = new FileInputStream("resources/JavaMethods2UMLActivityDiagram.atl");
			IModel atlRuleModel = atlTransformationManager.parseATL2XMI(in);
			atlTransformationManager.extract(atlRuleModel, "resources/JavaMethods2UMLActivityDiagram_ATL.xmi");
			
			List<IReferenceModel> metamodels = atlTransformationManager.loadMetamodels("metamodels/atl/ATL.ecore");
			IModel atlModel = atlTransformationManager.loadInModel(metamodels.get(0), "resources/JavaMethods2UMLActivityDiagram_ATL.xmi", false);
						
			atlTransformationManager.addInOutModel(atlModel, "IN", "ATL");
			
			IModel oclModel = atlTransformationManager.loadInModel(metamodels.get(0), "resources/JavaMethods2UMLActivityDiagram_ATL.xmi", false);
			atlTransformationManager.addInOutModel(oclModel, "SECIN", "OCL");
			
			atlTransformationManager.addLibrary("ATL2ATLCommentedHelpers", "transformations/ATL2ATLCommentedHelpers.asm");
			
			HashMap<String, Object> options = new HashMap<String, Object>();
			String outXmi = "resources/JavaMethods2UMLActivityDiagram_Commented.xmi";	
			
			atlTransformationManager.runATLTransformation(options, "transformations/ATL2ATLCommented.asm", outXmi, atlModel);	
								
			IModel xmiModelATL = atlTransformationManager.loadInModel(metamodels.get(0), outXmi, false);
			
			try {
				AtlParser.getDefault().extract(xmiModelATL, "resources/JavaMethods2UMLActivityDiagram_Commented.atl");
			} catch (ATLCoreException e) {
				e.printStackTrace();
			}					
						
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
