package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public Properties prop;
	WebDriver driver;
	
	
	public TestBase(WebDriver driver)
	{
		
	try {
		 prop = new Properties();
		
		FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\Pooja Deshpande\\eclipse-workspace\\uiAssignment\\src\\main\\java\\config.properties"));
		
		prop.load(ip);
		
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch (IOException e) {
	
		e.printStackTrace();
	
	}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
	     WebDriverManager.chromedriver().setup();	
	     driver = new ChromeDriver();
		
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
		 WebDriverManager.firefoxdriver().setup();	
	     driver = new FirefoxDriver();
		
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	
	}
}
	

	
