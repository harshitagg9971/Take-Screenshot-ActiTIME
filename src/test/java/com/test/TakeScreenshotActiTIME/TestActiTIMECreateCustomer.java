package com.test.TakeScreenshotActiTIME;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.TakeScreenshotActiTIME.BaseTest;
import com.pom.TakeScreenshotActiTIME.POMActiTIMECreateCustomer;
import com.pom.TakeScreenshotActiTIME.POMActiTIMEHomePage;
import com.pom.TakeScreenshotActiTIME.POMActiTIMELoginPage;

@Listeners(com.generics.TakeScreenshotActiTIME.Utility.class)
public class TestActiTIMECreateCustomer extends BaseTest
{
	@Test
	public void createCustomer() throws IOException
	{
		POMActiTIMELoginPage task1 =  new POMActiTIMELoginPage(driver);
		task1.loginMethod();
		
		POMActiTIMEHomePage task2 = new POMActiTIMEHomePage(driver);
		task2.taskTabMethod();
		
		POMActiTIMECreateCustomer task3 = new POMActiTIMECreateCustomer(driver);
		task3.createCustomerMethod();
	}
}
