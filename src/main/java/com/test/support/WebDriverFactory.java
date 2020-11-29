package com.test.support;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.driver.DriverScript;
import com.test.action.TestEngine;
import com.test.util.Util;

public class WebDriverFactory extends DriverScript{

	public static WebDriver initialize () {
		if (BROWSER.toUpperCase().equals("CHROME")) {
			System.setProperty ("webdriver.chrome.silentOutput", "true");
			System.setProperty ("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(baseUrl);
			//capabilities
			TestEngine.deleteCookies();
			TestEngine.maximize();
		} else if (BROWSER.toUpperCase().equals("IE")) {
			//IE code
		} else if (BROWSER.toUpperCase().equals("FF")) {
			// FF code
		} else {
			System.out.println("Please choose correct browser");
		}
		return driver;
	}
	
	
}
