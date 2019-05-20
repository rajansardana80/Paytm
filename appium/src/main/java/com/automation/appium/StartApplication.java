package com.automation.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;		
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartApplication {

		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			/*File classpathRoot = new File(System.getProperty("user.dir"));
			System.out.println(classpathRoot);
			File appDir = new File(classpathRoot, "/Apps/Amazon/");
			File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "OnePlus 3T");
			//capabilities.setCapability("platformVersion", "8.0.0");
			capabilities.setCapability(CapabilityType.VERSION,"8.0.0");
			capabilities.setCapability("platformName", "Android");
			
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

			driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.quit();*/
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(CapabilityType.BROWSER_NAME, "");
			//caps.setCapability("deviceName", "My Android");
			caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "8.0.0");
			
			
			caps.setCapability("appPackage", "io.selendroid.testapp");
			caps.setCapability("appActivity", "HomeScreenActivity");
		//	caps.setCapability("noReset", "true");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			
			//Instantiate Appium Driver
			try {
					AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
		}

	

}