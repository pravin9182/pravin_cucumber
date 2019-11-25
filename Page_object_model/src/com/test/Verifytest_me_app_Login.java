package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;
 

public class Verifytest_me_app_Login 
{
 
 
@Test
public void verifyValidLogin() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C://driver999//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
 
driver.manage().window().maximize();
 

driver.get("http://localhost:8097/TestMeApp"); 
LoginPage login=new LoginPage(driver);
 
 
 login.loginToTestMeApp("lalitha", "password123");
 Thread.sleep(4000);
 login.sign_in();
 login.typeUserName("admin");
 login.typePassword("password456");
login.clickOnLoginButton();
login.sign_out();
 
 
driver.quit();
 
}
 
 
}