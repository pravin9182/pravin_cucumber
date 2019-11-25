package com.acc.selenium_21_aug;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rediff_create_account {
	WebDriver driver;
	
	@Test

	public void registration(){
		
			System.setProperty("webdriver.chrome.driver", "C://driver99//chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.rediff.com/");
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Harsh");
			driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[1]")).sendKeys("vhakd");
			WebDriverWait wait = new WebDriverWait(driver,5);
			driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();

			Boolean flag =wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='check_availability']/font/b"),
					"Yippie! The ID you've chosen is available."
	));
			Assert.assertTrue(flag);
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("Ted<3");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("Ted<3");
//			driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("gharit0243@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
			
			WebElement security = driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select"));
			Select s7 = new Select(security);
			s7.selectByValue("What is your favourite pass-time?");
			
			driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("cricket");;

			driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input")).sendKeys("Sab g");;

//			WebElement mobile = driver.findElement(By.id("mob_txt"));
//			Select s1 = new Select(mobile);
//			s1.selectByVisibleText("India (+91)");
			WebElement cnt =driver.findElement(By.xpath("//*[@id='hid_countryCode']"));
			Actions act= new Actions(driver);
			act.moveToElement(cnt).click().keyDown(cnt, Keys.ARROW_DOWN).keyDown(cnt, Keys.DOWN).click().build().perform();
			//driver.findElement(By.xpath("//*[@id='country_id']/ul/li[2]")).sendKeys("USA / Canada (+1)");
			driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("8930096144");
			
			WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select s2 = new Select(day);
			s2.selectByVisibleText("10");
			
			WebElement month = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
			Select s3 = new Select(month);
			s3.selectByVisibleText("MAY");
			
			WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			Select s4 = new Select(year);
			s4.selectByVisibleText("1998");
			
			driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).click();

			WebElement coun = driver.findElement(By.xpath("//*[@id='country']"));
			Select s5 = new Select(coun);
			s5.selectByVisibleText("India");
			
			WebElement city = driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
			Select s6= new Select(city);
			s6.selectByVisibleText("Agra");
		}

	}


