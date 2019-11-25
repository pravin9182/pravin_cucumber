package com.acc.selenium_21_aug;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Workbookcreatexlsx {
	 @Test
	  public void f() throws Exception {
		  XSSFWorkbook wb = new XSSFWorkbook();
		  FileOutputStream out = new FileOutputStream(new File("sep192019.xls"));
		  wb.write(out);
	  }
	  
	} 

