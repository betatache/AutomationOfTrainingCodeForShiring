package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointers {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("http://www.amazon.com");
	    driver.manage().window().maximize();
	    
	    Actions ob=new Actions(driver);
	    WebElement viewds=driver.findElement(By.id("nav-link-accountList"));
	    ob.moveToElement(viewds).build().perform();
	    
	    
	}

}
