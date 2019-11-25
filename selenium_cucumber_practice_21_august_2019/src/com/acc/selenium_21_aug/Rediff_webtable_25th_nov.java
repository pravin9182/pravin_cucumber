package com.acc.selenium_21_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_webtable_25th_nov {

	WebDriver driver ;
	
	@BeforeTest
	public void launch_browser(){
		 System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
			driver = new ChromeDriver();		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test 
public void Rediff_webtable_reading(){
		
		
	}
	
	@AfterTest 
public void close_browser(){
		
		
	}
	
}
