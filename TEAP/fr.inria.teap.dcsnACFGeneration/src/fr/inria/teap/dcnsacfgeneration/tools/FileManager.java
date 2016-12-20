package fr.inria.teap.dcnsacfgeneration.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.lang.exception.ExceptionUtils;

public class FileManager {
	
	private File logFile = null;
	private BufferedWriter bufferLog = null;
	
	public String insertGeneratedFilesDir(String originalPath){
		String newPath = originalPath.substring(0,originalPath.lastIndexOf("/")) + "/generatedFiles" 
				+ originalPath.substring(originalPath.lastIndexOf("/"), originalPath.length());
		System.out.println(newPath);
		return newPath;
	}
	
	public InputStream getStream(String originalPath){
		InputStream fInputStream = FileManager.class.getResourceAsStream(originalPath);
		return fInputStream;
	}
	
	public String getDirectories (String[] segments){
		String directories = "";
		int i = 0;
		for (String segment : segments){
			i++;
			if (i < segments.length){
				directories += "/" + segment;
			}
		}
		directories += "/";
		return directories;
	}

	public void copyFile(String source, String target){
		InputStream inStream = null;
		OutputStream outStream = null;
	 
    	try{
 
    	    File bfile =new File(target);
 
    	    inStream = getStream(source);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = inStream.read(buffer)) > 0){	 
    	    	outStream.write(buffer, 0, length);	 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 	 
    	}catch(IOException e){
    		writeLogError(e);
    	}
	}
		
	public void setLogPath(String logPath){	
		logFile = new File(logPath + "logFile_" + DateFactory.getActualDate() + ".log");
		
		try {
			FileWriter fw = new FileWriter(logFile, true);
			this.bufferLog = new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
	
	public void writeLogError(Exception exception){
		try {
			bufferLog.write(ExceptionUtils.getStackTrace(exception));
			bufferLog.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File getLogFile() {
		return logFile;
	}
}
