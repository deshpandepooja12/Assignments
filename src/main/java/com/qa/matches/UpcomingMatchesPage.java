package com.qa.matches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpcomingMatchesPage  {

	
 public void SelectupcomingMatch()
 {
	 
	 WebDriver driver = new ChromeDriver();
	 
	 WebDriverWait wait = new WebDriverWait(driver,20);
	 
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'vs')][1]")));
	 
	WebElement firstmatch = driver.findElement(By.xpath("//div[contains(text(),'vs')][1]"));	 
	firstmatch.click();
	
	
	
 }
	
	
	
	
	
}
