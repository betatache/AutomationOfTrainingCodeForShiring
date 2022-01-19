package PeopleNtech.Automationtraining;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Home;
import PageObjectModel.SignInPage;

public class SignInAmazon2 {
	 public WebDriver driver;
		@Test(priority = 2,dependsOnMethods ="VerificationOfText" )
	    public void f() throws InterruptedException {
			Home ob=new Home(driver);
			Thread.sleep(6000);
			ob.SignToClick();
			SignInPage it=new SignInPage(driver);
			Thread.sleep(6000);
			it.EmailFieldSendKeys();
			Thread.sleep(6000);
			it.ContinueButtonClick();
	  }
		@Test(priority = 1)
		public void VerificationOfText() throws InterruptedException, IOException {
			Home ob=new Home(driver);
			Thread.sleep(6000);
			ob.SignToClick();
			shots();
			SignInPage it=new SignInPage(driver);
			Thread.sleep(6000);
			it.EmailFieldSendKeys();
			shots();
			Thread.sleep(6000);
			it.ContinueButtonClick();
			shots();
		String errorit=	it.text();
		System.out.println(errorit);
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(errorit, "We cannot find an account with that email address");
		System.out.println("This is after assertion");
		soft.assertAll();
		}
	  @BeforeMethod
	  public void beforeMethod() {
	     browsers("Edge","https://www.amazon.com"); 
	      
	      
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(6000);
		  driver.quit();
	  }
	  public void browsers(String browser,String wbsite) {
		 String local= System.getProperty("user.dir");
		 System.out.println(local);
		  if(browser.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver", local+"\\src\\Drivers\\chromedriver.exe");
			     driver=new ChromeDriver();
			     driver.navigate().to(wbsite);
			      driver.manage().window().maximize();
		  }else if(browser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver",local+"\\src\\Drivers\\msedgedriver.exe" );
		      driver=new EdgeDriver();
		      driver.navigate().to(wbsite);
		      driver.manage().window().maximize();
			  
		  }else {
			  System.out.println("Correct browser name");
		  }
		  
	  }
	  public void shots() throws IOException {
		  Date dt=new Date();
		  System.out.println(dt);
		  String it=dt.toString().replace(" ", "_").replace(":","_");
		  System.out.println(it);
		  String local= System.getProperty("user.dir");
		 File stored= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(stored, new File(local+"\\Pictures\\"+it+"captured.jpg"));
	  }
}
