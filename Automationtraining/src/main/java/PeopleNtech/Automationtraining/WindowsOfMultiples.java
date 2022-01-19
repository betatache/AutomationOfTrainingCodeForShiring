package PeopleNtech.Automationtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsOfMultiples {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IGU Staff\\git\\AutomationOfTrainingCodeForSharing\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	      driver.navigate().to("https://www.amazon.com");
	      driver.manage().window().maximize();
	      WebElement books=driver.findElement(By.linkText("Kindle Books"));
	      Actions ob=new Actions(driver);
	      ob.keyDown(Keys.SHIFT).build().perform();
	      books.click();
	      ob.keyUp(Keys.SHIFT).build().perform();
	    String Current=  driver.getWindowHandle();
	    System.out.println(Current);
	Set<String> windowhandles= driver.getWindowHandles();
	    Iterator<String> iterators=windowhandles.iterator();
	    String Parentwindowhandle=iterators.next();
	    String Childwindowhandle=iterators.next();
	    System.out.println("This is parent window="+Parentwindowhandle);
	    System.out.println("This is child window="+Childwindowhandle);
	    driver.switchTo().window(Childwindowhandle);
	    Thread.sleep(6000);
	     WebElement exclusive=driver.findElement(By.linkText("Kindle Exclusives"));
	      exclusive.click();
	}
}
