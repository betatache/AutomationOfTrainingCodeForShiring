package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	public static WebDriver driver;
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(6000);
	WebElement MonthOfBrith=driver.findElement(By.name("birthday_month"));
	Select ob =new Select (MonthOfBrith);
	 ob.selectByValue(1);
	 WebElement BirthDay=driver.findElement(By.name("birthday_day"));
	 Select day=new Select(BirthDay);
	 day.selectByVisibleText(6);
	 WebElement yearbirth=driver.findElement(By.name("birthday_year");
	 Select year=new Select(yearbirth);
	 year.selectByIndex(2020);
	 WebElement femaletoggle=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
	 femaletoggle.click();
	 
	 
	 
	 
	 
	}
	

}
