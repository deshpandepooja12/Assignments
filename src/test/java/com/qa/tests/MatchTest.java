package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.matches.UpcomingMatchesPage;

import junit.framework.Assert;

public class MatchTest extends TestBase{

	public MatchTest(WebDriver driver) {
		super(driver);
		
	}

	WebDriver driver;
	TestBase base;
	UpcomingMatchesPage match;
	String url;
	
	@BeforeMethod
	public void setup()
	{
		;
		base = new TestBase(driver);
		url = prop.getProperty("url");
		
	}
	
	@Test
	public void LogoTest()
	{
	
	WebElement logo =driver.findElement(By.xpath("//img[@class='logo_32840']"));
	boolean LogoisDisplayed = logo.isDisplayed();
	Assert.assertEquals(LogoisDisplayed, true);
		
	}
	
	@Test
	public void SelectUpcomingMatchTest()
	{
		match.SelectupcomingMatch();
		
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
		
	}
	
	
}
