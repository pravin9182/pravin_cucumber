package com.acc.selenium_21_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
     WebDriver driver;
     
       @DataProvider(name = "Authentication")
     
       public static Object[][] credentials() {
     
             return new Object[][] { 
            	 { "lalitha", "password123" }, 
              { "admin", "password456" },
              { "annesha", "vennela" },
             
              };
     
       }
       
      
// Here we are calling the Data Provider object with its Name
     
  @Test(dataProvider = "Authentication")
     
       public void test99(String sUsername, String sPassword) {
     
           System.setProperty("webdriver.chrome.driver", "C:\\driver999\\chromedriver.exe");

              //Create Browser object
              driver = new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         
              driver.manage().window().maximize();
             
            

         driver.findElement(By.name("login")).sendKeys(sUsername);
         driver.findElement(By.name("passwd")).sendKeys(sPassword);
              driver.findElement(By.name("proceed")).click();
              String str2=  driver.getTitle();
              System.out.println(str2);
              //Assert.assertEquals(str2,"Home" );
              driver.quit();
     
          
      
          
      
       }
     
}

