package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPage extends LoadableComponent<LoginPage> {
WebDriver driver;
@FindBy (how=How.ID, using="userName")WebElement userName;
@FindBy (how=How.ID,using="password")WebElement password;
@FindBy (how=How.NAME , using="Login")WebElement login;
@FindBy (how=How.PARTIAL_LINK_TEXT,using="New User")WebElement register;
public LoginPage(WebDriver driver) {
super();
this.driver=driver;
}
public String clickRegister() {
register.click();
return driver.getTitle();
}
public String clickLogin() {
userName.sendKeys("lalitha");
password.sendKeys("Password123");
login.click();
return driver.getTitle();
}

@Override
protected void isLoaded() throws Error {

System.out.println("in isLoaded method");
String url=driver.getCurrentUrl();
Assert.assertTrue(url.contains("login"), "Not on the issue entry page: " +url);
}
@Override
protected void load() {

System.out.println("in load");
driver.get ("http://10.232.237.143:443/TestMeApp/login.htm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
}










