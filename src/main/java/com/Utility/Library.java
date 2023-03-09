package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Library {
	
	public static void custom_Sendkeys(WebElement element, String value) {
		
		try {
			element.sendKeys(value);	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void custom_click (WebElement element) {
		
		try {
			element.click();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void ScrollIntoElement (WebDriver driver,WebElement element) {
		
		try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView()", element);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Alert HandleAlert(WebDriver driver) {
		
		return driver.switchTo().alert();
	}
	
	public static void MovetoElement_Click(WebDriver driver,WebElement element) {
		
		try {
			Actions act = new Actions (driver);
			act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
    public static void rightClickOnElement (WebDriver driver,WebElement element) {
		
		try {
			Actions act = new Actions (driver);
			act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
    public static String getText_Element(WebElement element) {
    	
    	return element.getText();
    }
    
    public static void CopyText_Keyboard(WebDriver driver) {
    	
    	
    	try {
    		Actions act = new Actions (driver);
    		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
    	}catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    
}



