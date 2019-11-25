package com.acc.selenium_21_aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_selenium {
	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		
		System.out.println("hello selenium how r u ? ");
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
 driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(3000);
driver.findElement(By.name("btnK")).click();



	}

}
