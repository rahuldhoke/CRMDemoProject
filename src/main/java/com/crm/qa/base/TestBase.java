package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;  // golbal variables can be used throut program. inside child class and any class//bcuse of public keyword
	public static Properties prop; // // golbal variables can be used throut program. inside child class and any class
	
	public TestBase() {  // creating a constructor for test base class
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:/Softwares/Eclipse/Ecl_wrksp/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Initialization() {
		String strBrwName = prop.getProperty("browser"); // getting browser name
		//if (strBrwName == "chrome") {
			 
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
			  driver = new ChromeDriver(); //Webdrive is already defined at class so removing it from here
			  System.out.println("done");
			  	driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); //PAGE_LOAD_TIMEOUT is taken from util class
				driver.get(prop.getProperty("url")); // fetching url from property file - opening url from here
			
		//}
		///else if(strBrwName == "chrome1") {
		//	System.setProperty("webdriver.gecko.driver","D:\\Softwares\\Sel Firefox driver\\geckodriver.exe");
		//	  WebDriver driver = new FirefoxDriver();
		}
	
	}




