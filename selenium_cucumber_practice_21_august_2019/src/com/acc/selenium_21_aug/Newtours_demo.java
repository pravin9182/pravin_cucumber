package com.acc.selenium_21_aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours_demo {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
  System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("pravin");
	
	driver.findElement(By.name("lastName")).sendKeys("singh");
	
	//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys("gurugram");
	driver.findElement(By.xpath("//form/table/tbody/tr[9]/td[2]/input")).sendKeys("gurugram");
	
	WebElement cnt =driver.findElement(By.name("country"));
	Select s1= new Select(cnt);
	s1.selectByVisibleText("INDIA");
	Thread.sleep(3000);
	s1.selectByValue("93");
	Thread.sleep(3000);
	s1.selectByIndex(92);
	Thread.sleep(3000);
	
	driver.findElement(By.name("register")).click();
	driver.findElement(By.linkText("sign-in")).click();	
driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	
WebElement passenger=driver.findElement(By.name("passCount"));
Select s2= new Select(passenger);
s2.selectByValue("3");
driver.findElement(By.xpath("//input[@value='Business']")).click();
	driver.findElement(By.xpath("//input[@src='/images/forms/continue.gif']")).click();
	}

}





