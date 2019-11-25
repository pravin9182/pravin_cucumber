package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{

WebDriver driver;

By username=By.id("userName");
By password=By.id("password");
By loginButton=By.name("Login");
By Sign_link=By.partialLinkText("SignIn");
By sign_out_link=By.linkText("SignOut");

public LoginPage(WebDriver driver)
{
this.driver=driver;
}


public void loginToTestMeApp(String userid,String pass)
{
driver.findElement(Sign_link).click();
driver.findElement(username).sendKeys(userid);
driver.findElement(password).sendKeys(pass);
driver.findElement(loginButton).click();
driver.findElement(sign_out_link).click();


}

public void sign_in() {
	driver.findElement(Sign_link).click();
	
}
public void typeUserName(String uid)
{

driver.findElement(username).sendKeys(uid);
}

public void typePassword(String pass)
{

driver.findElement(password).sendKeys(pass);
}

public void clickOnLoginButton()
{
driver.findElement(loginButton).click();
}
public void sign_out()
{
driver.findElement(sign_out_link).click();
}
}