package resources;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;

public WebDriver intializeDriver() {
	String browserName = "firefox";
	if (browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
	}else if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
	}else if(browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
	}

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
return driver;
}
}

	


