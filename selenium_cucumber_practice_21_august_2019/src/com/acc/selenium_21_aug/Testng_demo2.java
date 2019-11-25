package com.acc.selenium_21_aug;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo2 {
	@BeforeMethod
	
	public void beforemethod(){
		System.out.println(" i m in beforemethod ");
	}
	
	@AfterMethod
	
public void aftermethod(){	System.out.println(" i m in aftermethod  ");
		
	}
	@BeforeTest
	public void launch_browser(){System.out.println(" open browser");
		
	}
	@AfterTest
	
	public void close_browser(){System.out.println(" close  browser");
		
	}

	@Test()
	public void Gacebook(){
		System.out.println("i m using facebook" );
	}
	@Test(priority=0)
	public void gmail(){
		System.out.println("i m using gmail" );
	}
	@Test(priority=1)
	public void google(){
		System.out.println("i m using google" );
	}
}
