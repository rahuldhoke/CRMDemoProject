package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//All below are login related elements avaliable only on login page
	//@FindBy - keyword in Selenium
		//name : this is keyword in selenium, username word is we have used in our config file and value for this dhokerahus@yahoo.co.in
		//Webelement -- this keyword is creating the username word in config file as webelement
		
//NOte Very Imp ;; Username, Password and Submit - these are variables created in config.properties file
//WebElement keyword is converting all the above variables to weblements
	// methods are created in different class check it propery
	
		@FindBy(name="email") // edit box emaid property is name-- error will be gone after u write below line --semicolon is not required // import org.openqa.selenium.support.FindBy;
		WebElement webElt_FBUsername; // this is from properties file -creating webelement
		
		@FindBy(name="pass") // edit box password - property is pass for name locator-- error will be gone after u write below line --semicolon is not required // import org.openqa.selenium.support.FindBy;
		WebElement webElt_FBPassword;
		
		//Below xpath I am using it for submit button. this submitt button is defined in confi.properties
		@FindBy(xpath="//button[@name='login']") // semicolon not required
		WebElement webEltBtn_Submit;

		// below constructor is used to initialize all the page objects
		public LoginPage() {
			PageFactory.initElements(driver, this); // check below meaning
			// meaning of above 
				//driver constructor is created wihich will get initialize
				// second all the findby objects present inside this class will get loaded
				// meaning of this it pointing to all the objects inside the class. All these objects will get initialized
						//so to initialize the object above this keyword is used
		}
		
		
		//Actions - different functioanlity on login page inform of test methods ////////////////////////////
		
		public FaceBookMainPage Login(String un, String pwd) {
			webElt_FBUsername.sendKeys(un);  // ussernme is my eleent we have created in config
			webElt_FBPassword.sendKeys(pwd); // password is my eleent we have created in config
			webEltBtn_Submit.click();
			return new FaceBookMainPage();
		}

	}
	
	
	
	
	
	
	
	
	
	

