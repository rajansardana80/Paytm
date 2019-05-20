package org.selenium.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.selenium.qa.util.*;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	public static WebEventListner eventListner;
	public TestBase() 
	{
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("/home/rajansardana/AutomationPractice/seleniumautomation/src/main/java/org/selenium/qa/config/config.properties");
		
			prop.load(ip);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void initilization()
	{
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
				
			
			System.setProperty("webdriver.chrome.driver", "/home/rajansardana/Downloads/chromedriver (2)");
		
		driver= new ChromeDriver(); 
		}
	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TesttUtil.implicit_timeout, TimeUnit.SECONDS);
	
		
e_driver =		new EventFiringWebDriver(driver);
eventListner= new WebEventListner();
	e_driver.register(eventListner);
	driver=e_driver;
	}
}
