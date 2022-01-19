package PeopleNtech.Automationtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kboard {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IGU Staff\\git\\AutomationOfTrainingCodeForSharing\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.navigate().to("https://www.amazon.com");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      WebElement searchfields=driver.findElement(By.id("twotabsearchtextbox"));
	      searchfields.sendKeys("Computer");
	      Actions ob=new Actions(driver);
	     // Thread.sleep(6000);
	      ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	      ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	      searchfields.clear();
	     // Thread.sleep(6000);
	      searchfields.click();
	     
	      ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	      WebElement searchfields6=driver.findElement(By.id("twotabsearchtextbox"));
	      WebDriverWait wt=new WebDriverWait(driver, 100);
	      wt.until(ExpectedConditions.elementToBeClickable(searchfields6));
	
	}
}
