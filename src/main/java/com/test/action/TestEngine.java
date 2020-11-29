package com.test.action;

import org.openqa.selenium.By;

import com.base.driver.DriverScript;

public class TestEngine extends DriverScript{
	
	public static int MAXOUT = 100;
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public static boolean isElementPresent (String locator) {
		int nStartTime = 0;
		try {
			while (nStartTime < MAXOUT) {
				if (driver.findElements(By.xpath(locator)).size() > 0) {
					nStartTime = MAXOUT;
					return true;
				} else {
					nStartTime++;
				}
			}
		} catch (Throwable t) {
			nStartTime ++;
		}
		return false;
	}
	
	
	public static boolean isElementPresent (String locator, int timeout) {
		int nStartTime = 0;
		try {
			while (nStartTime < MAXOUT) {
				if (driver.findElements(By.xpath(locator)).size() > 0) {
					nStartTime = timeout;
					return true;
				} else {
					nStartTime++;
				}
			}
		} catch (Throwable t) {
			nStartTime ++;
		}
		return false;
	}
	
	public static void quit() {
		try {
			driver.quit();
		} catch (Throwable t) {
			
		}
	}
	
	
}
