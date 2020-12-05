package com.qa.test.cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FaceBookMainPage;	
import com.crm.qa.pages.LoginPage;

public class FaceBookMainPageTest extends TestBase {
	LoginPage Login_Page;
	FaceBookMainPage FaceBookMain_Page;
	public FaceBookMainPageTest() {
		super(); // base call constructor will be called and property will be initialized
	}

	//LoginPage = new LoginPageTest();
	
	@BeforeMethod
	public void Setup() {
		Initialization(); // This is a method. now browser is initialized -- url is not open yet. next we have to login using url
		Login_Page = new LoginPage();					//becuase in login page login method is there hence we are creating login obj to open the page
				//Because login method is returning home page - so we have to add home page.this way when this method is executed then page will be transfered to home page
				// below u have to import then only it will work
		FaceBookMain_Page = Login_Page.Login(prop.getProperty("FBEmailID"),prop.getProperty("FBPassword"));
	}

	
	@Test
	public void Test_ValidateFaceBookTitle() {
		String TitlePage =FaceBookMain_Page.ValidatePageTitle(); // this method is coming from FaceBookMain_Page, hence we have used this object
		Assert.assertEquals(TitlePage, "FaceBook", "this facebook assertion not matched");
	}	
	
	
	
	@AfterMethod
	public void Logout() {
		driver.quit();
	}
	
	
	
}
