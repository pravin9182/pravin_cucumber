package com.acc.selenium_21_aug;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testmeapp_window_frame_address_suggestion {

	WebDriver driver;
	@BeforeTest
	public void launch_browser(){
	 System.setProperty("webdriver.chrome.driver","C://driver99//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	@Test(priority=1, enabled=true)
	public void login() {
	//driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	//driver.manage().window().maximize();
	driver.findElement(By.linkText("SignIn")).click();
	String str1=  driver.getTitle();
	System.out.println(str1);
	Assert.assertEquals(str1,"Login" );

	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.name("Login")).click();
	String str2=  driver.getTitle();
	System.out.println(str2);
	Assert.assertEquals(str2,"Home" );


	//driver.findElement(By.linkText("SignOut")).click();
	}
	@Test(priority=2, enabled=true)
	public void address_window() throws Exception{
		
	 Actions act=new Actions(driver);
	 WebElement contact=driver.findElement(By.linkText("AboutUs"));
	 act.moveToElement(contact);
	 Thread.sleep(3000);
	 WebElement offices=driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span"));
	 act.moveToElement(offices);
	 Thread.sleep(3000);
	 WebElement location=driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li[1]/a/span"));
	 act.click(location);
	 act.build().perform();
	 Set<String> windowId=driver.getWindowHandles();
	 Iterator<String> it=windowId.iterator();
	 String mainwin=it.next();
	 String secondwin=it.next();
	 driver.switchTo().window(secondwin);
	 driver.switchTo().frame("main_page");
	 WebElement add=driver.findElement(By.id("demo3"));
	//  WebElement add=driver.findElement(By.xpath("//*[@id='demo3']"));
	 String str=add.getText();
	 System.out.println(str);
	 Assert.assertEquals(str, "Testme Inc.\n123, Velachery Main Road\nChennai, India\nMobile: +91 9898912345\nFax: 84554323\nEmail: info@testmeapp.com");
	 System.out.println("Pass");
	 driver.switchTo().window(mainwin);
	 driver.findElement(By.name("products")).sendKeys("h");
	 Thread.sleep(1000);
	 driver.findElement(By.name("products")).sendKeys("e");
	 Thread.sleep(1000);
	 driver.findElement(By.name("products")).sendKeys("a");
	 Thread.sleep(1000);
	 driver.findElement(By.name("products")).sendKeys("d");
	 Thread.sleep(1000);
	 WebElement a=driver.findElement(By.name("products"));
	 act.moveToElement(a);
	 a.sendKeys(Keys.DOWN);
	 a.click();
	//  driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div")).click();
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 WebElement addcart_button=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
	 addcart_button.click();
	 Thread.sleep(3000);
	 WebElement cart_link=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]"));
	 cart_link.click();
	 String str3=  driver.getTitle();
	 System.out.println(str3);
	 Assert.assertEquals(str3,"View Cart" );
	 WebElement chek_out_button=driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a"));
	 chek_out_button.click();
	 String str4=  driver.getTitle();
	 System.out.println(str4);
	 Assert.assertEquals(str4,"Cart Checkout" );
	 WebElement proceed_to_pay_button=driver.findElement(By.xpath("//input[contains(@value,'Proceed to Pay')]"));
	 proceed_to_pay_button.click();
	 WebElement icici_radio_button=driver.findElement(By.xpath("//*[@id='swit']/div[6]/div/label"));
	 icici_radio_button.click();
	 WebElement continue_button=driver.findElement(By.id("btn"));
	 continue_button.click();
	 driver.findElement(By.name("username")).sendKeys("pravin");
	 driver.findElement(By.name("password")).sendKeys("pravin");
	 WebElement 
	 login_button=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input"));
	 login_button.click();

	}
	@AfterTest
	public void close_browser(){
	// driver.close();
	}

}
