package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class add_product_page {
	WebDriver driver;

	By username=By.id("userName");
	By password=By.id("password");
	By loginButton=By.name("Login");
	By Sign_link=By.partialLinkText("SignIn");
	By sign_out_link=By.linkText("SignOut");
	WebElement all_categories=driver.findElement(By.xpath("//span[contains(.,'All Categories')]"));
	WebElement electronics=driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
	By headphone=By.xpath("//span[contains(.,'Head Phone')]");
	By add_cart_button=By.xpath("//a[contains(.,' Add to cart')]");
	By Cart_link=By.xpath("//a[contains(.,'Cart')]");
	By Chekout_button=By.xpath("//a[contains(.,'Checkout ')]");
	By procced_to_pay_button=By.xpath("//input[@value='Proceed to Pay']");
	
	

	public add_product_page(WebDriver driver)
	{
	this.driver=driver;
	}


	public void add_product_to_the_cart(String userid,String pass) throws InterruptedException
	{
	driver.findElement(Sign_link).click();
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginButton).click();
	Thread.sleep(20000);
	Actions act = new Actions(driver);
	act.moveToElement( all_categories);
	act.moveToElement( electronics);
	act.click().build().perform();
	Thread.sleep(3000);
	driver.findElement(headphone).click();
	driver.findElement(add_cart_button).click();
	driver.findElement(Cart_link).click();
	driver.findElement(Chekout_button).click();
	driver.findElement(procced_to_pay_button).click();
	
//	driver.findElement(sign_out_link).click();


	}

}
