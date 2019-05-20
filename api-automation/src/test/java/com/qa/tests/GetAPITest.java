package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.data.cancel;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.TestUtil;

public class GetAPITest extends TestBase{
	

	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException, JSONException
	{
		 testBase = new TestBase();
		 serviceUrl=	 testBase.prop.getProperty("Url_reverseshipper");
		 apiUrl= testBase.prop.getProperty("serviceUrl");
		 
		 System.out.println(testBase.prop.getProperty("Url_reverseshipper"));
			System.out.println(testBase.prop.getProperty("serviceURL"));
	url = serviceUrl+apiUrl;
	
	System.out.println(url);
		 
				 
		 
		 
	}
	
	@Test
	public void getAPITestWithoutHeader() throws ClientProtocolException, IOException, JSONException
	{
		RestClient restClient= new RestClient();
		System.out.println(url); 
		restClient.get(url);
		
	//	cancel a= new cancel(1);
		
		
		// To get status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code is  :  ");

		// To get complete response as string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
/*
		// To convert string response to json response
		JSONObject responseJSON = new JSONObject(responseString);
		System.out.println("Response JSON from api  : " + responseJSON);*/
		
		System.out.println(responseString);
		
		
		

		/*//Normal JSON value
		String perPageValue=TestUtil.getValueByJPath(responseJSON, "/per_page");
		System.out.println("Value per page : "+perPageValue);
		
		Assert.assertEquals(Integer.parseInt(perPageValue),3);
		*/
		
		//Array value
		/*String last_name=TestUtil.getValueByJPath(responseJSON, "/data[0]/last_name");
		String id=TestUtil.getValueByJPath(responseJSON, "/data[0]/id");*/
		
		//Assert.assertEquals(last_name,"Bluth");
		
		
		// To get header in response of api
		Header[] headerArray = closeableHttpResponse.getAllHeaders();

		// Create a map to store headers of the response for easy iterations
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for (Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}

		System.out.println("Header Array : " + allHeaders);
		 
	}
	
	
	
	@Test
	public void getAPITestWithHeader() throws ClientProtocolException, IOException, JSONException
	{
		RestClient restClient= new RestClient();
		System.out.println(url); 
		
		HashMap<String,String> headerMap= new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		
		
		restClient.get(url,headerMap);
		
		// To get status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code is  :  ");

		// To get complete response as string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		// To convert string response to json response
		JSONObject responseJSON = new JSONObject(responseString);
		System.out.println("Response JSON from api  : " + responseJSON);

		//Normal JSON value
		String perPageValue=TestUtil.getValueByJPath(responseJSON, "/per_page");
		System.out.println("Value per page : "+perPageValue);
		
		Assert.assertEquals(Integer.parseInt(perPageValue),3);
		
		
		//Array value
		String last_name=TestUtil.getValueByJPath(responseJSON, "/data[0]/last_name");
		String id=TestUtil.getValueByJPath(responseJSON, "/data[0]/id");
		
		Assert.assertEquals(last_name,"Bluth");
		
		
		// To get header in response of api
		Header[] headerArray = closeableHttpResponse.getAllHeaders();

		// Create a map to store headers of the response for easy iterations
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for (Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}

		System.out.println("Header Array : " + allHeaders);
		 
	}
}
