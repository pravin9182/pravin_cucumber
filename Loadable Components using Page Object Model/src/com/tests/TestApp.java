package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.RegisterPage;

public class TestApp {
	WebDriver driver;
	LoginPage page1;
	RegisterPage page2;
	@BeforeTest
	public void beforeTest () {
	System.setProperty("webdriver.chrome.driver", "C:\\driver99\\chromedriver.exe");
	driver = new ChromeDriver();
	page1=PageFactory.initElements (driver, LoginPage.class) ;
	page2=PageFactory.initElements(driver, RegisterPage.class);
	}
	@AfterTest
	public void afterTest() {
	driver.close();
	}

	@Test
	public void testMeApp() {
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	page1.get();
	String title1=page1.clickRegister();
	Assert.assertEquals(title1, "Sign Up");
	page2.submitUserInfo();
	String title2=page1.clickLogin();
	Assert.assertTrue(title2.contains("Home"));
}
}