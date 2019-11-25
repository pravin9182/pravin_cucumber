package com.acc.selenium_21_aug;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_DEMO_SELENIUMHQ {
	WebDriver driver;

	@BeforeTest
	public void start(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver99\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	}
	@Test
	public void start1() throws InterruptedException{
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/div/ul/li[1]/a")).click();
		
	}
	@AfterTest
	public void close_browser(){
		//driver.close();
		
	}

}
