package com.amazon;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import junit.framework.Assert;

public class ItemPageTest extends TestBase {

	public ItemPageTest() throws Exception {
		super();
	}
	LoginPage loginpage;
	HomePage homepage;
	TestUtility util;
	ItemPage itempage;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();	
		homepage=new HomePage();
		itempage=new ItemPage();
		loginpage.login();
		util=new TestUtility();
		homepage.searchItem();
		homepage.selectItem();
		util.navigateToNextTab();
		
	}
	
	@Test
	public void loginTest()
	{
		itempage.buyNow();
		
	}
	@Test
	public void ItemPageTitleTest()
	{
		String expectedTitle="New Apple iPhone 12 Mini (128GB) - Black : Amazon.com: Electronics";
		String Title= itempage.GetItemPageTitle();
		Assert.assertEquals(Title, expectedTitle);
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

}
