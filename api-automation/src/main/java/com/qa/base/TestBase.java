package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;
	public TestBase() 
	{
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("/home/rajansardana/AutomationPractice/api-automation/src/main/java/com/qa/config/config.properties");
		
			prop.load(ip);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
