package com.homedepot.base;

import org.openqa.selenium.WebDriver;

public class BasePageObject {
	protected WebDriver driver;
	protected BasePageObject(WebDriver driver) throws InterruptedException {
		this.driver= driver;
		Thread.sleep(5000);
	}

}
