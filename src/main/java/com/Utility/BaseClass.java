package com.Utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver; // globally declared, becoz ha driver sarv Test Classes la send karych aahe
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void initialization() throws Exception {
		
		config = new ConfigDataProvider(); 
	    excel = new ExcelDataProvider();
	}
	
	@Parameters ("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase(config.getBrowserChrome())) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(BrowserName.equalsIgnoreCase(config.getBrowserEdge())) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
		
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
}
