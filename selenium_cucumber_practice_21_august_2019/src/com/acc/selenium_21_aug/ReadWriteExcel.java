package com.acc.selenium_21_aug;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadWriteExcel {
	
WebDriver driver;

FileInputStream FRead;

FileOutputStream FWrite;

XSSFWorkbook wb;

XSSFSheet sh;

String d1, d2;

String uname, pwd;

String expmsg, acumsg;

String pass="Test case is Passed";

String fail="Test case is Failed";

int rowval, rowcount;

@BeforeTest
public void beforeTest() throws Exception, Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
	driver = new ChromeDriver();
	
	/*File*/ FRead=new FileInputStream("C:\\Users\\pravin.a.kumar.singh\\Desktop\\orangehrmidandpassword99.xlsx");
	
	/*XSSFWorkbook*/ wb=new XSSFWorkbook(FRead);
	
	/*XSSFSheet*/ sh= wb.getSheetAt(0); 
	
	
	
	//XSSFSheet sh= wb.getSheet("Login");
	
	/*String*/ d1=sh.getRow(0).getCell(0).getStringCellValue();
	/*String*/ d2=sh.getRow(0).getCell(1).getStringCellValue();
	rowcount=sh.getPhysicalNumberOfRows();
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(rowcount);

}


  @Test 
  public void ReadWrite() throws InterruptedException, Exception {
	    
	 for(rowval=1;rowval<rowcount;rowval++)
	 {
		 uname=sh.getRow(rowval).getCell(0).getStringCellValue();
	  pwd=sh.getRow(rowval).getCell(1).getStringCellValue();
	  expmsg=sh.getRow(rowval).getCell(2).getStringCellValue();
		 
	  driver.get("http://professional.demo.orangehrmlive.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.id("txtUsername")).clear();
	  driver.findElement(By.id("txtUsername")).sendKeys(uname);
	  driver.findElement(By.id("txtPassword")).clear();
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(2000);
	  acumsg=driver.findElement(By.id("account-name")).getText();
	  System.out.println(acumsg);
	  driver.findElement(By.id("user-dropdown")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("logoutLink")).click();

	  System.out.println(" ");
	  System.out.println(" ");
	  
	  System.out.println("Login id used is " + uname);
	  System.out.println("Password used is " + pwd);
	  System.out.println("The user name is " + expmsg);
	  
	 
	
	  FWrite=new FileOutputStream("C:\\Users\\pravin.a.kumar.singh\\Desktop\\orangehrmidandpassword99.xlsx");
	  sh.getRow(rowval).createCell(3).setCellValue(acumsg);

		  if(expmsg.equals(acumsg))
		  {
			 System.out.println(pass);
			 sh.getRow(rowval).createCell(4).setCellValue(pass);
		  }
		  else
		  {
			System.out.println(fail);
			sh.getRow(rowval).createCell(4).setCellValue(fail);
		  }
		  wb.write(FWrite);
	 }
  	 }
	 
  

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(2000);
	  driver.close();
	  wb.close();
  
  }

}

