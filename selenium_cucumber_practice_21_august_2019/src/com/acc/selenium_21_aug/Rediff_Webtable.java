package com.acc.selenium_21_aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Rediff_Webtable {
static WebDriver driver;
    // public static void main(String[] args) {
@Test 

public void rediff_webtable99(){
         String companyName="Aditya Birla Capital99";
         
         // code
         System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
         
         int cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
         int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
         System.out.println("Rows - "+rows);
         System.out.println("Cols - "+cols);
         
         List<WebElement> names = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
         List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
         System.out.println("Total names " +names.size());
         System.out.println("Total Prices "+currentPrices.size());
         
         for(int i=0;i<names.size();i++){
              if(companyName.equals(names.get(i).getText())){
                   System.out.println(names.get(i).getText() +" --- "+ currentPrices.get(i).getText());
                  break;
              }
         }



     }

}


