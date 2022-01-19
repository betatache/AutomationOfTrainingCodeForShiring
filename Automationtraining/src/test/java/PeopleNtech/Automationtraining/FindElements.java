package PeopleNtech.Automationtraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Utility;
import PageObjectModel.HomeOfFacebook;

public class FindElements extends Utility{
  @Test
  public void f() {
	 List<WebElement> ti=driver.findElements(By.tagName("a"));
	 System.out.println(ti.size());
	 for (WebElement tx:ti) {
		 System.out.println(tx.getText());
	 }
  }
  @Test
	 public void PropertiesOfMethod() throws InterruptedException,IOException {
	  String local= System.getProperty("user.dir");
	  Properties pro=new Properties();
	  FileInputStream sd= new FileInputStream(local+ "\\target\Regression.properties")
			  pro.load(sd);
	  String email=pro.getProperty("Email");
	  String Psswd=pro.getProperty("Passwrd");
		  HomeOfFacebook home=new HomeOfFacebook(driver);
		  home.emailfieldkeys(n);
		  home.psswdfieldkeys(s);
		  home.buttontoclick();
		  Thread.sleep(5000);
	  }
  @Test
     public void Exelsheetdate() {
	  XSSFWorkbook ExcelWbook;
	  XSSFSheet ExcelWSheet;
	  XSSFCell Cell;
     // Location of the Excel file
	  String path="C:\\Users\\betat\\git\\repository\\Automationtraining\\Utilities.xlsx";
			  String sheetName= "Sheet1";
	  try {
		  FileInputStream ExcelFile = new FileInputStream(path);
		  ExcelWbook = new XSSFWorkbook(ExcelFile);
		  ExcelWSheet = ExcelWbook.getSheet(sheetName);
		  
		  Cell = ExcelWSheet.getRow(1).getCell(2);
		  String cellData = Cell.getStringCellValue();
		  System.out.println("Cell Data:"+ cellData);
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }
  
     
  
  
  }
  

