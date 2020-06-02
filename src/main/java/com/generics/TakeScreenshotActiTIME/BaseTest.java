package com.generics.TakeScreenshotActiTIME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(chromeKey, chromeValue);
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}
