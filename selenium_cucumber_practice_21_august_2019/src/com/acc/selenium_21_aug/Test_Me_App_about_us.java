package com.acc.selenium_21_aug;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_Me_App_about_us {
WebDriver driver;
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver99\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");	
	}
	
	@Test
	public void run()
	{
		Actions act = new Actions(driver);
		WebElement hover1 = driver.findElement(By.linkText("AboutUs"));
		act.moveToElement(hover1);
		WebElement hover2 = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span"));
		act.moveToElement(hover2);
		WebElement hover3 = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li[2]/a/span"));
		act.moveToElement(hover3).click().build().perform();
		Set <String> wind = driver.getWindowHandles();
		Iterator<String> IT = wind.iterator();
		System.out.println("Total Windows "+wind.size());
		String wind1 = IT.next();
		String wind2 = IT.next();
		driver.switchTo().window(wind2);
		driver.switchTo().frame("main_page");
		WebElement Text = driver.findElement(By.xpath("//*[@id='demo3']"));
		String Text1 = Text.getText();
		System.out.println("Inner Text is "+Text1);
		
	}
	
	
	

}


