package com.jayemith.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayemith.base.TestBase;
import com.jayemith.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException {
		
		if(!data.get("runmode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
		click("addCustBtn_CSS");
		type("firstname_CSS",data.get("firstname"));
		type("lastname_XPATH",data.get("lastname"));
		type("postcode_CSS",data.get("postcode"));
		click("addBtn_CSS");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		//driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstName);
		//driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastName);
		//driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postCode);
		//driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();
		
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		//Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		//alert.accept();
		
		//To fail test
		//Assert.fail("Customer not added successfully");
		//Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(2000);
		alert.accept();
		
	}
	
}
