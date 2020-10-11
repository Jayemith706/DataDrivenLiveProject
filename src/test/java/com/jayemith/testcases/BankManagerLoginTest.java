package com.jayemith.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import com.jayemith.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		
	
		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
	
		//System.setProperty("org.uncommons.reportng.escape-output", "false");
		log.debug("Inside Login Test");
		click("bmlBtn_CSS");
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login successfully executed");
		
		//to fail test
		//Assert.fail("Login not successful");
		
		//Reporter.log("Login successfully executed");
		//Reporter.log("<a target=\"_blank\" href=\"/Users/jonathanemethilue/Screenshots/Screenshot.png\">Screenshot</a>");
		//Reporter.log("<br>"); 
		//Reporter.log("<a target=\"_blank\" href=\"/Users/jonathanemethilue/Screenshots/Screenshot.png\"><img src=\"/Users/jonathanemethilue/Screenshots/Screenshot.png\" height=200 width=200></img></a>");
		
		
	}

}
