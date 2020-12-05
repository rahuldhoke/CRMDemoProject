package com.qa.test.cases;

import org.openqa.selenium.support.CacheLookup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class LoginPageTest extends TestBase {
	LoginPage LoginPage;
	SignUpPage SignUpPage;
	
	//Creating 1 more constructor is mandtor to call the cong file class
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void Setup() {
		Initialization(); // This is a method
		LoginPage = new LoginPage(); //Login Page object is created and constructor of this is called above. 
									//due to this allmethod of this page can be access
	}
	
	@Test
	public void LoginPageTitle() throws Exception {
		LoginPage.Login(prop.getProperty("FBEmailID"),prop.getProperty("FBPassword"));
		Thread.sleep(5000);
		//SignUpPage.Method_SignUpPage();
		System.out.println("test");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("finally done");
		driver.quit();
	}
	
}
