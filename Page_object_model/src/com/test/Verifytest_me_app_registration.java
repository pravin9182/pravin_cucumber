package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.Registration_page;

@Test
public class Verifytest_me_app_registration {
	public void verifyValidRegistration() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://driver999//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 
	driver.manage().window().maximize();
	 

	driver.get("http://localhost:8097/TestMeApp"); 
//	LoginPage login=new LoginPage(driver);
	
	//Registration_page regis=new Registration_page(driver);
	 Registration_page regis=new Registration_page(driver);
	  regis.registration_to_test_me_app99("zzzzzzpravin", "pravin", "singh", "samar918", "samar918", "abc@gmail.com", "9986111370", "09/09/1984", "ecospace bellandur ", "red");
//	regis.registration_to_test_me_app99(uname, fname, lname, pwd, cpwd, emailadd, mob, dobbb, add, ans);
	 
	driver.quit();
	 
	}
	 
	 
	}

