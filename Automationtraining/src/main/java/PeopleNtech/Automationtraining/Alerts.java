package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    WebElement simplealert=driver.findElement(By.id("alertbutton"));
	    simplealert.click();
	    Thread.sleep(6000);
	    driver.switchTo().alert().accept();

	}

}
