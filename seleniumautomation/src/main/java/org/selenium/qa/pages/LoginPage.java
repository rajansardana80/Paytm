package org.selenium.qa.pages;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Object repository
	@FindBy(xpath="//input[@id='ap_email']")
	@CacheLookup
	WebElement username;
	////input[@id='ap_password']
	
	
	@FindBy(xpath="//input[@id='ap_password']")
	@CacheLookup
	WebElement password;
	
	
	/*@FindBy(name="password")
	WebElement password;*/
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement	continuebutton;
	
	/*@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;*/
	
	
	//intialize web elements
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//Different	Actions available on page
	
	
	 Logger log4jLogger=Logger.getLogger("LoginPage");
	
	public boolean username(String usrname)
	{
		try
		{
		username.sendKeys(usrname);
		log4jLogger.info("Username has been sent to username input box");
	//	password.sendKeys(pwd);
		continuebutton.click();
		log4jLogger.info("continue button has been clicked successfully");
		return true;
		//return new HomePage();  // will return object of homepage on click
		}catch (Exception e) {
			
			log4jLogger.error("Element not found");
			return false;
		}
	
	}
	
	public boolean password(String pwd)
	{

		try
		{
		password.sendKeys();
		log4jLogger.info("Username has been sent to username input box");
	//	password.sendKeys(pwd);
		continuebutton.click();
		log4jLogger.info("continue button has been clicked successfully");
		return true;
		//return new HomePage();  // will return object of homepage on click
		}catch (Exception e) {
			
			log4jLogger.error("Element not found");
			return false;
		}
	
	
	}
	
	
	
}
