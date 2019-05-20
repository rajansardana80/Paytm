package org.selenium.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.selenium.qa.base.TestBase;
import org.selenium.qa.pages.HomePage;
import org.selenium.qa.pages.LoginPage;
import org.selenium.qa.util.TesttUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginPageTest  extends TestBase{
//LoginPage loginPage;
//HomePage homePage;	
ExtentHtmlReporter  reporter;
//String sheetname="LogIn";
/*	public LoginPageTest()
	{
		super();
	}*/
	
/*	public  void name ()
	{
		

	
		
		
		
	}*/
	
/*	@BeforeMethod
	public void setup()
	{
		initilization();
		loginPage = new LoginPage();
		
		
		
		
	}*/
	
	
	// make each test case independent of another test case
	
	
	/*@DataProvider
	public Object[][] getCRMTestData()
	{
		Object data [][]=TesttUtil.getTestData();

	return data;
	}
	*/
	//without data provider

@BeforeTest

public void intialize()
{

	//TestBase initializeApplication = null;
	TestBase.initilization();

}

	@Test
	public void verifyUsername()
	{
		 Logger log4jLogger=Logger.getLogger("LoginPageTest");
		 

		    // Here we need to create logger instance so we need to pass Class name for 
		     //which  we want to create log file in my case Google is classname
		       //  Logger log4jLogger=Logger.getLogger("Google");
		 
		 // configure log4j properties file
	       PropertyConfigurator.configure("/home/rajansardana/AutomationPractice/seleniumautomation/src/main/java/org/selenium/qa/config/log4j.properties");
		
		 reporter = new ExtentHtmlReporter("/home/rajansardana/AutomationPractice/seleniumautomation/test-output/ExtentReport.html");
			
			ExtentReports extent = new ExtentReports();
			
			extent.attachReporter(reporter);
			
		ExtentTest logger=	extent.createTest("verifyUsername");
	//	SoftAssert softAssert = new SoftAssert();
		LoginPage loginPage=new LoginPage();
		log4jLogger.info("LoginPage object is created");
		
	boolean result=	loginPage.username(prop.getProperty("username"));
	log4jLogger.info("Make call to function username");
	//log4jLogger.info("Make call to function logintoamazon");
		Assert.assertTrue(result, "Test Case failed");
	//	log4jLogger.
		//Assert.assertTrue(result, "Test Case failed");
		//   softAssert.assertTrue(condition);(true, true);
				logger.log(Status.INFO,"Execution of verifyUsername() Test is completed");
				logger.log(Status.PASS,"Status pass");
				
				extent.flush();
		
		
	
	}
	
	@Test
	public void verifyPassword()
	{

		 Logger log4jLogger=Logger.getLogger("LoginPageTest");
		 

		    // Here we need to create logger instance so we need to pass Class name for 
		     //which  we want to create log file in my case Google is classname
		       //  Logger log4jLogger=Logger.getLogger("Google");
		 
		 // configure log4j properties file
	       PropertyConfigurator.configure("/home/rajansardana/AutomationPractice/seleniumautomation/src/main/java/org/selenium/qa/config/log4j.properties");
		
		 reporter = new ExtentHtmlReporter("/home/rajansardana/AutomationPractice/seleniumautomation/test-output/ExtentReport.html");
			
			ExtentReports extent = new ExtentReports();
			
			extent.attachReporter(reporter);
			
		ExtentTest logger=	extent.createTest("verifyPassword");
	//	SoftAssert softAssert = new SoftAssert();
		LoginPage loginPage=new LoginPage();
		log4jLogger.info("LoginPage object is created");
		
	boolean result=	loginPage.password(prop.getProperty("password"));
	log4jLogger.info("Make call to function password");
	//log4jLogger.info("Make call to function logintoamazon");
		Assert.assertTrue(result, "Test Case failed");
	//	log4jLogger.
		//Assert.assertTrue(result, "Test Case failed");
		//   softAssert.assertTrue(condition);(true, true);
				logger.log(Status.INFO,"Execution of verifyPassword() Test is completed");
				logger.log(Status.PASS,"Status pass");
				
				extent.flush();
		
		
	
	
	}
	
	
	@AfterTest

	public void close()
	{
driver.quit();
	

	}
	
	
/*	//with data provider
		@Test(dataProvider="getCRMTestData")
		public void LoginPageTestWithdataProvider(String username,String pwd)
		{
			
			
			 homePage= loginPage.login(username,pwd);
		
		}
		*/
	
	/*	@Test
		public void binary()
		{
			 reporter = new ExtentHtmlReporter("/home/rajansardana/AutomationPractice/seleniumautomation/test-output/ExtentReport.html");
				
				ExtentReports extent = new ExtentReports();
				
				extent.attachReporter(reporter);
				
			ExtentTest logger=	extent.createTest("logintoamazon");
			
			SoftAssert softAssert = new SoftAssert();
			   
			   //Assertion failing
			   softAssert.fail("Failing first assertion");
			   System.out.println("Failing 1");			  
			
			   softAssert.assertEquals(true, true);
			logger.log(Status.INFO,"Execution of binaryTrue Test");
			logger.log(Status.PASS,"status pass");
			
			extent.flush();
			
			ExtentTest logger1=	extent.createTest("binary");
			softAssert.assertEquals(true, false);
			logger1.log(Status.INFO,"Execution of binaryTrue Test");
			logger1.log(Status.FAIL,"status fail");
			
			extent.flush();
		}*/
	
/*	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		 
	}*/
}
