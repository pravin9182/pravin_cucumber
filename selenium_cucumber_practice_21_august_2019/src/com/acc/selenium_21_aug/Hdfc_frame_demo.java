package com.acc.selenium_21_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Hdfc_frame_demo {
	public static WebDriver driver;
	@Test
	public void hdfc_frame() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C://driver99//chromedriver.exe");

		//Create Browser object
		//driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver","C:\\driver999\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		int total = driver.findElements(By.tagName("frame")).size();
		System.out.println("Total frames - "+ total);

		driver.switchTo().frame("login_page");// switch to first frame
		driver.findElement(By.name("fldLoginUserId")).sendKeys("444378");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("footer");// switch to first frame

		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
}
	
}
