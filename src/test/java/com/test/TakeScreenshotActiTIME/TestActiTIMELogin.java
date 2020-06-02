package com.test.TakeScreenshotActiTIME;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.TakeScreenshotActiTIME.BaseTest;
import com.pom.TakeScreenshotActiTIME.POMActiTIMELoginPage;

@Listeners(com.generics.TakeScreenshotActiTIME.Utility.class)
public class TestActiTIMELogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActiTIMELoginPage task1 = new POMActiTIMELoginPage(driver);
		task1.loginMethod();
	}
}
