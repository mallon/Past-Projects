package main;

import java.io.IOException;

import org.mallon.tools.file.FileManager;

public class ATLComments {

	private static FileManager fileManager = new FileManager();
	private ATLFeatures atlFeatures = new ATLFeatures();	
	
	public ATLComments(String[] filePaths){				
		try {
						
			System.out.println("Starting comments...");
			for (String filePath : filePaths){
				fileManager.readAndReplaceStrings(filePath, this);
			}			
			
			System.out.println("End of comments.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String lineTreatment(String line) throws IOException{
		String toWrite = "";
		
		if (line.contains("helper")){			
			String context = atlFeatures.getContext(line);
			String params = atlFeatures.getParamsTypes(line);
			String helperReturn = atlFeatures.getHelperReturn(line);
			
			toWrite = (context==""?"":context + "\n") +
								(params==""?"":params + "\n") +
								helperReturn + "\n" + line + "\n";			
		}else 
			if (line.contains("rule")){
				String params = atlFeatures.getParamsTypes(line);
				String sourceType = atlFeatures.getSourceType(fileManager, line);
				String targetType = atlFeatures.getTargetType(fileManager, line);
				
				toWrite = (params==""?"":params + "\n") +
						(sourceType==""?"":sourceType + "\n") +
						(targetType==""?"":targetType + "\n") +
						line + "\n";
				
			}else{
				toWrite = (line + "\n");
			}
		return toWrite;
	}
	
}
