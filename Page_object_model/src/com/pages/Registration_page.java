package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration_page {
	WebDriver driver;
	
	By username=By.id("userName");
	By firstname=By.name("firstName");
	By Lastname=By.name("lastName");
	By Password=By.name("password");
	By confirmpassword=By.id("pass_confirmation");
	By gender_male=By.xpath("//input[@value='Male']");
	By gender_female=By.xpath("//input[@value='Female']");
	By email=By.name("emailAddress");
	By mobilenumber=By.name("mobileNumber");
	By dob=By.name("dob");
	By address = By.name("address");
	By security_question=By.name("securityQuestion");
	By answer=By.name("answer");
	By register_button=By.name("Submit");
	By loginButton=By.name("Login");
	By Sign_link=By.partialLinkText("SignIn");
	By sign_out_link=By.linkText("SignOut");
    By sign_up_link=By.linkText("SignUp");
    
	
	
	public Registration_page(WebDriver driver) {
		this.driver=driver;
	}
	public void registration_to_test_me_app99(String uname,String fname,String lname,String pwd, String cpwd,String emailadd,String mob,String dobbb,String add,String ans) throws Exception
	{
	driver.findElement(sign_up_link).click();
	driver.findElement(username).sendKeys(uname);
	driver.findElement(firstname).sendKeys(fname);
	driver.findElement(Lastname).sendKeys(lname);
	driver.findElement(Password).sendKeys(pwd);
	driver.findElement(confirmpassword).sendKeys(cpwd);
	driver.findElement(gender_male).click();
	driver.findElement(email).sendKeys(emailadd);
	driver.findElement(mobilenumber).sendKeys(mob);
	driver.findElement(dob).sendKeys(dobbb);
	driver.findElement(address).sendKeys(add);
	WebElement security_ques=driver.findElement(security_question);
	Select s= new Select(security_ques);
	s.selectByVisibleText("What is your favour color?");
	
	driver.findElement(answer).sendKeys(ans);
	Thread.sleep(3000);
	driver.findElement(register_button).click();
	
	}
	
}
