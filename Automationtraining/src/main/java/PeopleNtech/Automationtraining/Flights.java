package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("https://www.expedia.com/");
	    driver.manage().window().maximize();
	    WebElement flights=driver.findElement(By.xpath("//*[text()='Flights']"));
	    flights.click();
	    WebElement departure=driver.findElement(By.id("d1-btn"));
	    departure.click();
	    Thread.sleep(5000);
	    WebElement selectdatefor=driver.findElement(By.xpath("//*@[aria-label='Dec 29, 2021']"));
	    selectdatefor.click();
	    

	}

}
