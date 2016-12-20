package org.inria.wordpress.WdpConfModel2JSON.tools;


import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class WdpConfModel2JSONTools {
	public static EList<EStructuralFeature> getStructFeatureEList(EObject eObject){		
		EList<EStructuralFeature> attributes = eObject.eClass().getEAllStructuralFeatures();				
		return attributes;		
	}
		
	public static EStructuralFeature getStructFeatureAttribute(EList<EStructuralFeature> attributes, String name){
		EStructuralFeature eAttributeReturned = null;
		for (EStructuralFeature eAttribute : attributes) {	
			if (eAttribute.getName().equals(name)){
				eAttributeReturned = eAttribute;
			}
	    } 
		return eAttributeReturned;
	}
	
	public static String removeQuote(String characters){		
		String strReturned = "";
		if (StringUtils.isNotBlank(characters)){
			strReturned = StringEscapeUtils.escapeHtml4(characters.replaceAll("\"", ""));
		}
		return strReturned;
	}
	
	public static String removeNull(String characters){		
		String strReturned = "";
		if (StringUtils.isNotBlank(characters)){
			strReturned = characters.replaceAll("null", "");
		}
		return strReturned;
	}
	
	public static Boolean isNotLastValue(Object value, Object[] values){
		Boolean isNotLastValue = true;
		if (value == values[values.length-1]){
			isNotLastValue=false;
		}
		return isNotLastValue;
	}
	
	public static String toJsonObjectListGenKey(Object commonName, Object[] values){		
		String strReturned = "";
		int v= 0;
		for(Object value : values){	
			if (StringUtils.isNotBlank(String.valueOf(values[v]))){
				String name = ((EObject)values[v]).eGet(getStructFeatureAttribute(getStructFeatureEList((EObject)values[v]), "name")).toString();
				strReturned+=toJsonObject(commonName+"_"+v, name, isNotLastValue(value, values));
				v++;	
			}	
		}
		return strReturned;
	}
	
//	public static String toJsonObjectList(String[] keys, Object[] values){	
//		String strReturned = "";
//		int v= 0;		
//		for(String key : keys){				
//			strReturned+=toJsonObject(key, String.valueOf(values[v]), isNotLastValue((Object)key, (Object[])keys));
//			v++;			
//		}
//		return strReturned;
//	}
	
	public static String toJsonObjectList(List<String> keys, List<String> values){	
		String strReturned = "";
		int v= 0;		
		for(String key : keys){				
			strReturned+=toJsonObject(key, values.get(v), isNotLastValue((Object)key, keys.toArray()));
			v++;			
		}
		return strReturned;
	}
		
	public static String toJsonObject(String key, String value, Boolean comma){		
		String strReturned = "";
		if (StringUtils.isNotBlank(String.valueOf(value))){		
			strReturned="{\""+key+"\":\""+removeQuote(value)+"\"}";
			if (comma){
				strReturned += ",";
			}	
		}	
		return strReturned;
	}
	
//	public static String toKeyValuesJsonArrayObject(String[] attributes, EList<?> eList){
//		List<String> objectList = new ArrayList<String>();
//		String JSONArrayObjects="";
//		for (Object object : eList){			
//			for (Method method : object.getClass().getMethods()){
//				String methodShortName = method.getName().replaceAll("^is", "").replaceAll("get", "").replaceAll("()", "");
//				String jsonObject ="";
//				
//				for (String attribute : attributes){
//					if (methodShortName.equals(attribute)){
//						try {
////							objectList.add(toJsonObject(attribute, method.invoke(object, new Object[]{}).toString(), false));
//							jsonObject += toJsonObject(attribute, method.invoke(object, new Object[]{}).toString(), false);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//						if (WordPressGrammar2JsonTools.isLastValue(attribute, attributes)){
//							jsonObject += ",";
//						}
//					}
//				}
//				JSONArrayObjects+=toJsonArrayObject("JSONArrayObject", jsonObject);
//				if (WordPressGrammar2JsonTools.isLastValue(method, object.getClass().getMethods())){
//					JSONArrayObjects += ",";
//				}
//			}
//			
//		}
////		String objectTab = "";
////		for (String strObj : objectList){
////			objectTab += strObj;
////			if (WordPressGrammar2JsonTools.isLastValue(strObj, objectList.toArray())){
////				objectTab += ",";
////			}
////		}
//		return JSONArrayObjects;
//	}
	
	private static LinkedList<String> getNotBlankValues(String[]values){
		LinkedList<String> notEmptyValues = new LinkedList<String>();
		for(String value : values){	
			if (StringUtils.isNotBlank(value)){
				notEmptyValues.add(value);
			}
		}
		return notEmptyValues;
	}
	
	public static List<List<String>> getNotEmptyValuesAndKeys(String[]keys, String[]values){
		List<List<String>> keysAndValues = new ArrayList<List<String>>();
		List<String> keysList = new ArrayList<String>();
		List<String> valuesList = new ArrayList<String>();
		
		for (int i = 0; i < values.length; i ++){
			if (StringUtils.isNotBlank(values[i])){
				keysList.add(keys[i]);
				valuesList.add(values[i]);
			}
		}
		keysAndValues.add(keysList);
		keysAndValues.add(valuesList);
		return keysAndValues;
	}
	
	public static String toMultiJsonElement(String[] values){	
		String returnStr="";
		LinkedList<String> notEmptyValues = getNotBlankValues(values);
		Iterator<String> iterStr = notEmptyValues.listIterator();
		
		while(iterStr.hasNext()){
			String value = iterStr.next();
			if (value != notEmptyValues.getLast()){
				returnStr += value + ",";
			}else{
				returnStr += value;
			}
		}
				
		return returnStr;
	}
	
	public static String toJsonArrayObject(String key, String values){	
		String returnStr="";
		if (StringUtils.isNotBlank(String.valueOf(values))){	
			returnStr = "{\""+key+"\":["+values+"]}";
		}else{
			returnStr = "{\""+key+"\":[]}";
		}
		return returnStr;
	}
	
	public static String compressAndUTF8Encode(String input){
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream  deflate = new DeflaterOutputStream(out);
		String output = "";
		
		try {
			deflate.write(input.getBytes());
			deflate.close();
			output = URLEncoder.encode(out.toString("ISO-8859-1"), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}		
			        
		return output;
	}
	
	public static String manageComma(String values, String befAfter){
		return (values==""?"":(befAfter=="before"?","+values:values+","));
	}
	
}
