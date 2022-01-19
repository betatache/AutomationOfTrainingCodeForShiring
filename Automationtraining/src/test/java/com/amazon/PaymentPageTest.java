package com.amazon;

import java.lang.System.Logger;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import junit.framework.Assert;

public class PaymentPageTest extends TestBase {

	public PaymentPageTest() throws Exception {
		super();
	}
	LoginPage loginpage;
	HomePage homepage;
	TestUtility util;
	ItemPage itempage;
	PaymentPage paymentpage;
	Logger log=Logger.getLogger(LoginPageTest.class);
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		loginpage=new LoginPage();	
		homepage=new HomePage();
		itempage=new ItemPage();
		paymentpage =new PaymentPage();
		loginpage.login();
		util=new TestUtility();
		homepage.searchItem();
		homepage.selectItem();
		util.navigateToNextTab();
		itempage.buyNow();
		
	}
	
	@Test
	public void AddCreditcardDetails() throws InterruptedException
	{

		boolean ispresent=paymentpage.Addcard();
		String msg;
		String expected="fail";
		if(ispresent)
		{
			log.info("Wrong Credit Card Number");
			msg="fail";
		}
		else
		{
			log.info("Credit Card  Added");
			msg="true";
		}
		
		Assert.assertEquals(expected, msg);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}


