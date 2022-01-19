package com.homedepot;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.homedepot.base.BaseTest;

public class FirstTest  { 
	WebDriver driver;
	 

	public void methodSetUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver() { 
				
			 }
	@Test
	public void firstTestMethod() {
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	System.out.println("homedepot opend");
}
	WebDriver driver;
	
	
    @FindBy(name ="email") WebElement Email;
  WebElement enteryourEmail;
			
    @FindBy(name=("password-input-field"))
	WebElement fialdpassword;
	@FindBy(id=("//input[@id='zipCode']"))
	WebElement enterzipCode;
	@FindBy(id=("//input[@id='phone']"))
	WebElement enterphoneNumber;{ 
	}
		
}


