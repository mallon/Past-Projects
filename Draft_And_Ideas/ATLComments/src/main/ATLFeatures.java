package main;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.mallon.tools.file.FileManager;

public class ATLFeatures{
		
	public String getContext(String line){
		String context = "context";
		String contextType = "";
		
		if (line.contains(context)){
			contextType = "---@context " + StringUtils.strip(line.substring(line.indexOf(context) + context.length(), line.indexOf("def")));
		}
		
		return contextType;
	}
	
	public String getParamsTypes(String line){
		String leftParenthesis = "(";
		String paramsBlock = null;
		String paramType = "";
		
		if ((line.contains("helper ") || line.contains("rule ")) & line.contains(leftParenthesis)
			& (!line.contains("---") & !line.contains("--"))){
			
			if (line.indexOf(leftParenthesis) < line.lastIndexOf(":")){
				paramsBlock = line.substring(line.indexOf(leftParenthesis), line.lastIndexOf(":"));
				
				String [] paramsTypes = paramsBlock.split(":");
				
				for (String typeParam : paramsTypes){
					if (typeParam.contains(",")){
						paramType += "---@param " + StringUtils.strip(typeParam.split(",")[0]) + (typeParam == paramsTypes[paramsTypes.length-1]?"":"\n");
					}else{
						if (typeParam.contains(")")){
							paramType += "---@param " + StringUtils.strip(typeParam.substring(0, typeParam.lastIndexOf(")"))) + (typeParam == paramsTypes[paramsTypes.length-1]?"":"\n");
						}
					}
				}
			}
			
		}
		
		return paramType;
	}
	
	public String getHelperReturn(String line){
		String twoDots = ":";
		String helperReturn = "";
		
		if ((line.contains("helper") || line.contains("rule")) & line.contains(twoDots) & !line.contains("---")){
			helperReturn = "---@return " + StringUtils.strip(line.substring(line.lastIndexOf(twoDots), line.indexOf("=")));
		}
		
		return helperReturn;
	}
	
	public String getSourceType(FileManager fileManager, String line){
		String sourcePatternTypeBlock = getPatternType(fileManager, line, "\\s*from\\s*", "@sourcePattern");
		
		return sourcePatternTypeBlock;
	}
	
	public String getTargetType(FileManager fileManager, String line){
		String targetPatternTypeBlock = getPatternType(fileManager, line, "\\s*to\\s*", "@targetPattern");
		
		return targetPatternTypeBlock;
	}

	private String getPatternType(FileManager fileManager, String startedLine, String patternWordKey, String patternTag){
		String patternTypeBlock = "";
		List<String> patternTypeList = new ArrayList<String>();
		
		String ruleParenthClosed = "[\\s*})\\s*[do*]]";
		String	patternBlock = fileManager.getBlock(startedLine, patternWordKey, (patternWordKey=="\\s*to\\s*"?ruleParenthClosed:"\\s*to\\s*"));
				
		if (patternBlock != ""){
			String [] tabLines = patternBlock.split("\n");			
			for (String line : tabLines){				
				if (line.contains(":") & !line.contains("--") & !line.contains(".debug") & !line.contains("<-") 
						& !line.contains(",") & !line.contains("let")
				){
					if (line.lastIndexOf("(") == line.length()-1){
						line = line.substring(0, line.lastIndexOf("(")-1);
					}
					if(line.split(":").length > 1){
						patternTypeList.add("---" + patternTag + " " + StringUtils.strip(line.split(":")[1]));
					}					
				}				
			}			
		}
		
		for (String patternType : patternTypeList){
			patternTypeBlock += patternType + (patternType==patternTypeList.get(patternTypeList.size()-1)?"":"\n");
		}
				
		return patternTypeBlock;
	}
}
