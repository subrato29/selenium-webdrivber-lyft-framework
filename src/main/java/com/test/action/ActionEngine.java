package com.test.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.driver.DriverScript;

public class ActionEngine extends DriverScript{
	public static boolean sendKeys (String locator, String value) {
		try {
			if (TestEngine.isElementPresent(locator)) {
				//driver.findElement(By.xpath(locator)).clear();
				driver.findElement(By.xpath(locator)).sendKeys(value);
				return true;
			} else {
				return false;
			}
		} catch(Throwable t) {
			t.printStackTrace();
		}
		return false;
	}
	
	public static boolean click (String locator) {
		try {
			if (TestEngine.isElementPresent(locator)) {
				driver.findElement(By.xpath(locator)).click();
				return true;
			} else {
				return false;
			}
		} catch(Throwable t) {
			t.printStackTrace();
		}
		return false;
	}
	
	public static boolean clickElement (String locator) {
		try {
			if (TestEngine.isElementPresent(locator)) {
				WebElement element = driver.findElement(By.xpath(locator));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
				return true;
			} else {
				return false;
			}
		} catch(Throwable t) {
			t.printStackTrace();
		}
		return false;
	}
	
	public static boolean selectByValue (String locator, String value) {
		try {
			if (TestEngine.isElementPresent(locator)) {
				Select select = new Select(driver.findElement(By.xpath(locator)));
				select.selectByValue(value);
				return true;
			} else {
				return false;
			}
		} catch(Throwable t) {
			t.printStackTrace();
		}
		return false;
	}
}
