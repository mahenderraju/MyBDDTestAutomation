package com.retail.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mktrip.utilities.ReadConfig;

public class InitiateDriver {
	public static WebDriver driver;
	
	public static void startDriverInstance() throws Exception {
		String browser = ReadConfig.readProjectConfig("BrowserName");
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty(ReadConfig.readProjectConfig("FF_Key"), ReadConfig.readProjectConfig("FF_Path"));
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(ReadConfig.readProjectConfig("ApplicationURL"));
		Thread.sleep(3000);
	}
	
	public WebDriver getDriverInstance() throws Exception {
		InitiateDriver.startDriverInstance();
		return driver;
	}

}
