package com.acc.selenium_21_aug;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_alert {
WebDriver driver;
	@BeforeTest
	public void launch_browser(){
		 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();	
		
	}
	@Test
	public void rediff_alert() throws Exception{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());

		Alert al =driver.switchTo().alert();
		String str=al.getText();
		System.out.println(str);
		Assert.assertEquals(str, "Please enter a valid user name");
		System.out.println(" test passed ");
		Thread.sleep(2000);
		al.accept();
		driver.findElement(By.id("login1")).sendKeys("pravin");
		
		driver.findElement(By.id("password")).sendKeys("pravin918");
		driver.findElement(By.name("proceed")).click();
		
	}
	@AfterTest
	
	public void close_browser(){
		driver.close();
	}
	
	
	
	
}
