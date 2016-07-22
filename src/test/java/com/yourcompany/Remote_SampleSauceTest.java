package com.yourcompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import com.saucelabs.saucerest.SauceREST; //allows us to use the Sauce Labs API to send and query data

import java.net.MalformedURLException;
import java.net.URL;

public class Remote_SampleSauceTest {

	 public static final String USERNAME = "dragoon013";
	 public static final String ACCESS_KEY = "98d61e8d-a05f-4581-8572-3fb129fe5e9e";
	 public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com/wd/hub";
	 public static String id;
	 
	 @Test
	 public static void  main() throws MalformedURLException {
		 
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("platformVersion", "5.1");
		 capabilities.setCapability("deviceName", "Android Emulator");
		 //capabilities.setCapability("appActivity", ".graphics.TouchPaint");
		 capabilities.setCapability("app", "https://github.com/appium/sample-code/blob/master/sample-code/apps/ApiDemos/bin/ApiDemos-debug.apk?raw=true"); 
		 capabilities.setCapability("newCommandTimeout", "120");
		 
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);
		
		//session id string queried from Sauce Labs
		//id = ((RemoteWebDriver) driver).getSessionId().toString();	     
		 	     
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		 WebElement graphic_btn = driver.findElementByAccessibilityId("Graphics");
         driver.tap(1,graphic_btn,750);
         //1 finger, webelement, 750ms duration
         
         driver.scrollTo("Touch Paint").click();
                           
         WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElementById("title")));

         //assert here
         
		 TouchAction eye1 = new TouchAction(driver);
		 TouchAction eye2 = new TouchAction(driver);
		 TouchAction smile = new TouchAction(driver);
		 
		 eye1.press(150, 200).release().perform();
		 eye2.press(250, 200).release().perform();
		 
		 smile.press(100,300)
		 .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(1, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(2, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(3, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(4, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 1)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, 0)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(5, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(4, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(3, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(2, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .moveTo(1, -1)
         .perform();		
		 
		 driver.quit();
	     
    }
	 
	/* @AfterMethod
	 public void after(ITestResult testResult) {		 
		 SauceREST restAPI = new SauceREST(USERNAME, ACCESS_KEY);
		 
		 if (testResult.isSuccess()) {
	        restAPI.jobPassed(id);
	     } else {
	        restAPI.jobFailed(id);
	     }
	 }*/
	 
}

