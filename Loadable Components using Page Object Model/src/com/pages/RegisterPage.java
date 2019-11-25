package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class RegisterPage extends LoadableComponent<RegisterPage> {
WebDriver driver;
@FindBy (id="userName")WebElement userName;
@FindBy (id="firstName")WebElement firstName;
@FindBy (id="lastName")WebElement lastName;
@FindBy(id="password")WebElement password;
@FindBy (css="input[type='password'][id='pass_confirmation']") WebElement confirmPassword ;
@FindBy (xpath="//input[@value='Male']")WebElement gender;
@FindBy (id="emailAddress")WebElement email;
@FindBy (id="mobileNumber")WebElement mobile;
@FindBy(css="img[alt='Ch']")WebElement dob;
@FindBy (id="address")WebElement address;
@FindBy (id="securityQuestion")WebElement question;
@FindBy (id="answer")WebElement answer;
@FindBy (name="Submit")WebElement submit;
public RegisterPage (WebDriver driver) {

super() ;
this.driver=driver;
}

public String submitUserInfo() {
userName.sendKeys("ZZZZZXXPxxselenium123456");
firstName.sendKeys ("pravin");
lastName.sendKeys ("singh");
password.sendKeys("Password123");
confirmPassword.sendKeys ("Password123");
gender.click();
email.sendKeys ("abc@xyz.com");
mobile.sendKeys ("9986111370");
dob.click();
new Select (driver.findElement (By.className("ui-datepicker-month"))).selectByVisibleText("May");
new Select (driver.findElement (By.className("ui-datepicker-year"))).selectByVisibleText("1985");
driver.findElement (By.linkText("29")).click();
address.sendKeys ("gurgaon 21 sector");
new Select (question).selectByValue("411011");
answer.sendKeys("olive");
submit.click();
return driver.getTitle(); 
}
@Override
protected void isLoaded() throws Error {
System.out.println("in isLoaded method");
String url=driver.getCurrentUrl();
//Assert.assertTrue(url.contains ("RegisterUser"), "Not on the issue entry page:" + url);
Assert.assertTrue(url.contains ("RegisterUser"), "Not on the issue entry page:"+ url);
}
@Override
protected void load() {
	};
}
