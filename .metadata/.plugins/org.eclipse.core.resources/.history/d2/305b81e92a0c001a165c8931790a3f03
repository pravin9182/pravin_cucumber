package com.acc.selenium_21_aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Newtours_drop_down {
	 WebDriver driver;
	
	@Test
	public void registration() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "C://driver999//chromedriver.exe");
		driver = new ChromeDriver();
		//        System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		//            driver = new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//ChromeDriver   driver = new ChromeDriver();
		//System.setProperty("webdriver.firefox.marionette", "C://geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		WebElement country_dropdown =driver.findElement(By.name("country"));

		Select country=new Select(country_dropdown);

		List<WebElement> dropdown=country.getOptions();
		System.out.println(dropdown.size());
		for(int i=1;i<dropdown.size();i++){

			String drop_down_values=dropdown.get(i).getText();
		
          
			System.out.println("dropdown values are "+drop_down_values);



		}


	}

}

