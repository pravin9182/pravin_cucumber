package com.acc.selenium_21_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

//import com.drivers.Drivers;


public class Case_study {
public static WebDriver driver;
@BeforeTest
public void openBrowser() {
//driver=Drivers.getDriver("chrome");
//driver=Drivers.getDriver("ie");
//driver=Drivers.getDriver("selenium3firefox");

System.setProperty("webdriver.chrome.driver", "C://driver999//chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://localhost:8097/TestMeApp");
String str5=  driver.getTitle();
System.out.println(str5);
//Assert.assertEquals(str5,"Home" );

}

@Test(priority=1,enabled=true)
public void signup() {

driver.findElement(By.linkText("SignUp")).click();
String str=  driver.getTitle();
System.out.println(str);
//Assert.assertEquals(str,"Sign Up" );

driver.findElement(By.name("userName")).sendKeys("praveen1234");
driver.findElement(By.name("firstName")).sendKeys("praveen");
WebDriverWait wait = new WebDriverWait(driver,5);
  boolean flag =wait.until(ExpectedConditions.textToBe(By.id("err"),"Available"));
  
  System.out.println(flag);
  Assert.assertTrue(flag);
  String flag2=driver.findElement(By.id("err")).getText();
  System.out.println(flag2);
  Assert.assertEquals("Available", flag2);
driver.findElement(By.name("lastName")).sendKeys("singh");
driver.findElement(By.name("password")).sendKeys("samar918");
driver.findElement(By.name("confirmPassword")).sendKeys("samar918");
driver.findElement(By.xpath("//input[@value='Male']")).click();
driver.findElement(By.name("emailAddress")).sendKeys("pravinsingh918@gmail.com");
driver.findElement(By.name("mobileNumber")).sendKeys("9986111370");
driver.findElement(By.name("dob")).click();
driver.findElement(By.xpath("//img[@alt='Ch']")).click();
Select s2 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
s2.selectByVisibleText("Feb");
Select s3 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
s3.selectByVisibleText("1995");
driver.findElement(By.xpath("//a[contains(.,'28')]")).click();
driver.findElement(By.id("address")).sendKeys("Marathahalli, Spice Garden");
Select s1 = new Select(driver.findElement(By.name("securityQuestion")));
s1.selectByVisibleText("What is your favour color?");
driver.findElement(By.name("answer")).sendKeys("Red");
driver.findElement(By.name("Submit")).click();
}
@Test(priority=2, enabled=true)
public void login() {
driver.get("http://localhost:8097/TestMeApp/fetchcat.htm");
driver.manage().window().maximize();
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
@Test(priority=3, enabled=true)
public void cart() throws Exception  {

//Main Menu
WebElement allcategories = driver.findElement(By.xpath("//*[@id='menu3']/li[2]/a/span"));
//*[@id="menu3"]/li[2]/a/span
//Create object 'action' of an Actions class
Actions act = new Actions(driver);
//To mouseover on main menu
act.moveToElement(allcategories);


//Sub Menu
WebElement electronics = driver.findElement(By.xpath("//*[@id='menu3']/li[2]/ul/li[1]/a/span"));
//To mouseover on sub menu
act.moveToElement(electronics);
//build() method is used to compile all the actions into a single step 
act.click().build().perform();



Thread.sleep(3000);
WebElement headphone
=driver.findElement(By.xpath("//*[@id='submenuul11290']/li[1]/a/span"));
headphone.click();

Thread.sleep(3000);
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
//WebElement icici_radio_button=driver.findElement(By.xpath("//*[@id='swit']/div[6]/div/label"));
//icici_radio_button.click();
//WebElement continue_button=driver.findElement(By.id("btn"));
//continue_button.click();
//driver.findElement(By.name("username")).sendKeys("pravin");
//driver.findElement(By.name("password")).sendKeys("pravin");
//WebElement 
//login_button=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input"));
//login_button.click();

}



@AfterTest
public void afterTest() {
driver.close();
driver.quit();
}
}

