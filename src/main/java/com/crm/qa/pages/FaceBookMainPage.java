package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FaceBookMainPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Rahul Dhoke')]") // semicolon not required
	WebElement webEltBtn_UsrNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Videos')]")
	WebElement WL_Btn_Videos;
//************************************************	
	//Creating contructor for home page
	public FaceBookMainPage() {
		PageFactory.initElements(driver, this);
	}
//************************************************
	//All Methods are written here
		public String ValidatePageTitle() {
			return driver.getTitle();
		}
		
		public NotificationPage ClickonVideosLink() {
			WL_Btn_Videos.click();
			return new NotificationPage(); // when u r returning any class then adding new keyword is necessary
		}
		
		public void test1() {
			System.out.println("this method returns nothing");
		}
	
}
