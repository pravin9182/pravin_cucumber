package com.acc.selenium_21_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class jqueri_action_frame_demo {
	WebDriver driver;
@Test
public void actionsClass() throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "C:\\driver999\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             
Actions act = new Actions(driver);

        
driver.get("http://jqueryui.com/droppable/");
int total = driver.findElements(By.tagName("iframe")).size();
System.out.println("Total iframes - "+ total);
           //driver.switchTo().frame(0) ;  
WebDriverWait wait = new WebDriverWait(driver, 5);

wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));

//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
//WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
         //WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
WebElement sourceLocator = driver.findElement(By.id("draggable"));              

WebElement targetLocator = driver.findElement(By.id("droppable"));           
act.dragAndDrop(sourceLocator, targetLocator).build().perform();



        }
}







