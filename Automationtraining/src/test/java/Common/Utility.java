package Common;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

public class Utility {
	public WebDriver driver;
	 @Parameters({"browser","wbsite"}) 
	 @BeforeMethod
	  public void beforeMethod(String browser,String wbsite) {
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

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(6000);
		  driver.quit();
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
