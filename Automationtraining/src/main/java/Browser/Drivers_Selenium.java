package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	  //  WebDriver driver=new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver"," C:\\Users\\betat\\git\\repository\\Automationtraining\\src\\Drivers\\geckodriver.exe");
	//	WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\betat\\git\\repository\\Automationtraining\\src\\Drivers\\msedgedriver.exe" );
	      WebDriver driver=new EdgeDriver();
	}

}
