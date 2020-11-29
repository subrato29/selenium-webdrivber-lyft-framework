package testscript;

import org.testng.annotations.Test;

import com.base.driver.DriverScript;
import com.test.keywords.KeywordsApp;

public class TestScript extends DriverScript{
	@Test
	public void test1() throws InterruptedException {
		if (isRunnable(true)) {
			KeywordsApp.search();
		}
	}
}
