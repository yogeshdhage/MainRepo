package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	 
	XSSFWorkbook wb; //globally declare -->to use'wb' in another constructor
	
	public ExcelDataProvider() throws Exception { //Excel name --> ExcelTestData
	   
		//to use this path directly in string Add --> extends BaseClass --> public class ExcelDataProvider extends BaseClass {   at line no 8
		//String path =config.getExcelPath1();
	   
		//to use this path directly in string remove --> extends BaseClass
		String path ="C:\\Users\\yoges\\eclipse-workspace\\Batch15_Framework1\\TestData\\ExcelTestData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
	    wb = new XSSFWorkbook(fis); 
	}

	public String getStringData_Excel(String SheetName,int row,int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
}
