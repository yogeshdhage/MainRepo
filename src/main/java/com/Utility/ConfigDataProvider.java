package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
	 String filepath = "C:\\Users\\yoges\\eclipse-workspace\\Batch15_Framework1\\Config\\Config.Properties";	
	
	 FileInputStream fis = new FileInputStream(filepath);
	
	 pro = new Properties();
	 pro.load(fis);
	
	}
	
	public String getBaseUrl() {
		
		return pro.getProperty("BaseUrl");
	}
	
	public String getBrowserChrome() {
		
		return pro.getProperty("BrowserChrome");
	}
	
    public String getBrowserEdge() {
		
		return pro.getProperty("BrowserEdge");
	}

    public String getExcelPath() {
		
		return pro.getProperty("ExcelPath");
	}
    
    public String getExcelPath1() {
		
		return pro.getProperty("ExcelPath1");
	}
}
