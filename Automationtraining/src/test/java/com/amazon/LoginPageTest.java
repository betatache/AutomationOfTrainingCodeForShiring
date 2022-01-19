package com.amazon;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	public LoginPageTest() throws Exception {
		super();
	}
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();	
	}
	
	@Test
	public void loginTest()
	{
		loginpage.login();
		
	}
	@Test
	public void LoginpageTitleTest()
	{
		String expectedTitle="Online Shopping site in USA: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.com";
		String Title= loginpage.loginPageTitle();
		Assert.assertEquals(Title, expectedTitle);
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

}
