package com.base.driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.test.action.TestEngine;
import com.test.support.WebDriverFactory;
import com.test.util.Util;

public class DriverScript {
	
	public static WebDriver driver = null;
	public static String baseUrl = "";
	public static String BROWSER = null;
	//path of data
	
	public static boolean isRunnable (boolean runnable) {
		try {
			driver = null;
			if (driver == null) {
				baseUrl = "https://www.lyft.com/rider/airports";
				BROWSER = Util.getProperty("Browser");
				WebDriverFactory.initialize();
			}
		} catch (Throwable t) {
			System.out.println("Please choose correct TC");
			runnable = false;
			t.printStackTrace();
		}
		return runnable;
	}
	
	
	@AfterTest
	public void tearDown() {
		TestEngine.quit();
	}

}


