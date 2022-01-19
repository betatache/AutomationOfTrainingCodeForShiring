package PeopleNtech.Automationtraining;

import java.io.IOException;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import PageObjectModel.Home;
import PageObjectModel.SignInPage;

public class SignInAmazon extends Utility{
	@Test(priority = 2, dependsOnMethods ="VerificationOfText" )
    public void f() throws InterruptedException {
		Home ob=new Home(driver);
		Thread.sleep(6000);
		ob.SignToClick();
		SignInPage it=new SignInPage(driver);
		Thread.sleep(6000);
		it.EmailFieldSendKeys();
		Thread.sleep(6000);
		it.ContinueButtonClick();
  }
	@Test(priority = 1)
	public void VerificationOfText() throws InterruptedException, IOException {
		Home ob=new Home(driver);
		Thread.sleep(6000);
		ob.SignToClick();
		shots();
		SignInPage it=new SignInPage(driver);
		Thread.sleep(6000);
		it.EmailFieldSendKeys();
		shots();
		Thread.sleep(6000);
		it.ContinueButtonClick();
		shots();
	String errorit=	it.text();
	System.out.println(errorit);
	SoftAssert soft=new SoftAssert();
	
	soft.assertEquals(errorit, "We cannot find an account with that email address");
	System.out.println("This is after assertion");
	soft.assertAll();
	}
  
}
