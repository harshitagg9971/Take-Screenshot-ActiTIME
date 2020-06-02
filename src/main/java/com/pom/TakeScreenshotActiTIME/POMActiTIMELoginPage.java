package com.pom.TakeScreenshotActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.TakeScreenshotActiTIME.AutoConstant;
import com.generics.TakeScreenshotActiTIME.ExcelLibrary;

public class POMActiTIMELoginPage implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;
	
	public POMActiTIMELoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName, 1, 1));
		keepMeLoggedInCheckBox.click();
		loginButton.click();
	}
	
	public void forgotPasswordMethod() 
	{
		forgotPasswordLink.click();
	}
	
	public void actiTimeIncMethod()
	{
		actiTimeIncLink.click();
	}
}
