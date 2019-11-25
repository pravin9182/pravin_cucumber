package com.acc.selenium_21_aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keyword_action_example {
     WebDriver driver;
     @BeforeTest
     public void launch_browser() {
          System.setProperty("webdriver.chrome.driver", "C:\\driver999\\chromedriver.exe");
          driver = new ChromeDriver();
     }
     @Test(priority=1, enabled=true)
     public void login() {
          driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
          driver.manage().window().maximize();
         
          WebElement uname= driver.findElement(By.name("login"));
          Actions act = new Actions(driver);
          
        
         act.moveToElement(uname)
          .click()
          .keyDown(uname, Keys.SHIFT)
          .sendKeys(uname, "pravin")
          .keyUp(uname, Keys.SHIFT)
          .doubleClick(uname)
          .contextClick().build().perform();
          
         
          
          

     }
}



