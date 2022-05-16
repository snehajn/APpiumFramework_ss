package org.automation.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.automation.listeners.RetryFailedTests;
import org.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.*;

public final class Calculator extends BaseSetup {

	@Test(testName = "Lcalculator", description = "verify")
	public void verifyLoginPage() throws MalformedURLException {
		AppiumDriver driver;
		
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability("DeviceName", "samsung");

		cap.setCapability("udid", "f251cc2b");

		cap.setCapability("platformName", "Android");

		cap.setCapability("platformVersion", "10");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("application started");
		

	
	}
	}
