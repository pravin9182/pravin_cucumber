package com.acc.selenium_maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_demo {
	public  WebDriver driver;

	@Test

	public void hdfc_frame() throws Exception {

	System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");



	//Create Browser object

	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().window().maximize();


driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
	//driver.get("https://netbanking.hdfcbank.com/netbanking/");

	Thread.sleep(2000);

	int total = driver.findElements(By.tagName("frame")).size();

	System.out.println("Total frames - "+ total);

   driver.switchTo().frame(1);// switch to first frame

driver.findElement(By.linkText("Privacy Policy")).click();

}
}
