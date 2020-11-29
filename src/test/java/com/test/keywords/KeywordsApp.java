package com.test.keywords;

import com.base.driver.DriverScript;
import com.test.action.ActionEngine;
import com.test.action.TestEngine;

import pageobject.Home;

public class KeywordsApp extends DriverScript{

	public static void search () throws InterruptedException {
		ActionEngine.sendKeys(Home.searchBox, "orlando Sanford Internal Airport");
		ActionEngine.click("//div[@role = 'listbox']//li[1]");
		
		if (TestEngine.isElementPresent("//h1[text() = 'Lyft at SFB airport.']")) {
			System.out.println("Page validated");
		} else {
			System.out.println("Page NOT validated");
		}
		
		Thread.sleep(5000L);
	}
	
}
