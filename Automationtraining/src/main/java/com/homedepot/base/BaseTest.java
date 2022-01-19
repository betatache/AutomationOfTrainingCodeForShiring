package com.homedepot.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	@BeforeMethod
	protected  void methodSetUp() {
		System.out.println("Method Set Up");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\betat\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	@AfterMethod
	protected  void methodTearDown() {
		System.out.println("Method Tear Down");
		driver.quit(); 
}
}