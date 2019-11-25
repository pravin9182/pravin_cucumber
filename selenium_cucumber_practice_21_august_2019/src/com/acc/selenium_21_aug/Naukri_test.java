package com.acc.selenium_21_aug;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Naukri_test {
	 WebDriver driver;
     @Test
     public void NAUKRI_WINDOW() throws InterruptedException
     {
          Set<String> winIds = driver.getWindowHandles();
          Iterator<String> it = winIds.iterator();
          
          String mainWindowID = it.next();
          
          //for loop implementation
          /*int winSize = winIds.size();
          
          for(int i=1; i<=winSize; i++)
          {
          driver.switchTo().window(it.next());
          driver.close();
          }    */
          
          //while loop implementation
          while(it.hasNext())
          {
              driver.switchTo().window(it.next());
              String str =driver.getTitle();
              System.out.println(str);
              driver.close();
              
          }
          
          driver.switchTo().window(mainWindowID);
          driver.findElement(By.xpath("//*[@id='qsbClick']/span[1]")).click();
          Thread.sleep(3000);
          driver.findElement(By.name("qp")).sendKeys("selenium");
          Thread.sleep(3000);
          
          driver.findElement(By.name("ql")).sendKeys("delhi");
          WebElement exp=driver.findElement(By.xpath("//*[@id='exp_dd']/div[1]/input[1]"));
          exp.sendKeys("7");
          Thread.sleep(3000);
         // Select s1= new Select(exp);
         // s1.selectByValue("7");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//*[@id='salary_dd']/div[1]/input[1]")).sendKeys("9");
          driver.findElement(By.id("qsbFormBtn")).click();
     }
     
     
     @BeforeTest
     public void load() throws InterruptedException
{
          System.setProperty("webdriver.chrome.driver", "C:\\driver999\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          driver.get("https://www.naukri.com");
          Thread.sleep(2000);
     }
     
     @AfterTest
     public void after()
     {
          
     }
     
}


