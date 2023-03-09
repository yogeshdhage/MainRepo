package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass {

	//here we write only test cases --> steps
	
	@Test
	public void verify_loginpage() {  //verify_loginpage is a Test Case
		
		//now we req elements-->emailid,password,login
		//this elements we store in LoginPom class which is under com.Pages package
		
		LoginPom login = PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_Sendkeys(login.getTxt_email(), excel.getStringData_Excel("New", 0, 0));
		Library.custom_Sendkeys(login.getTxt_password(), excel.getStringData_Excel("New", 0, 1));
		Library.custom_click(login.getBtn_login());
		
		
	}
	
}
