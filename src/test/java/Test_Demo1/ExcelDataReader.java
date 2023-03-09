package Test_Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {
		
		String path = "C:\\Users\\yoges\\eclipse-workspace\\Batch15_Framework1\\TestData\\ExcelTestData.xlsx";
	
	    FileInputStream fis = new FileInputStream(path);
	    
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    
	    
	    String data_0_0 = wb.getSheet("New").getRow(0).getCell(0).getStringCellValue();
	 
	    String data_0_1 = wb.getSheet("New").getRow(0).getCell(1).getStringCellValue();
	
	    //Browser Opening
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//identifying Username & Password webelement
		
		WebElement txt_email =driver.findElement(By.xpath("//input[@name='email']"));
		txt_email.sendKeys(data_0_0);
		
		WebElement txt_password =driver.findElement(By.xpath("//input[@name='pass']"));
		txt_password.sendKeys(data_0_1);
	}

}
