package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Abc;
import com.qa.data.CustomerAddress;
import com.qa.data.ReverseShipper;
import com.qa.data.Users;
import com.qa.data.Abc;
import com.qa.util.TestUtil;

public class PostAPITest {


	

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
		 apiUrl= testBase.prop.getProperty("serviceUrl1");
		 
		 System.out.println(testBase.prop.getProperty("Url_reverseshipper"));
			System.out.println(testBase.prop.getProperty("serviceUrl1"));
	url = serviceUrl+apiUrl;
	
	System.out.println(url);
		 
				 
		 
		 
	}
	
	@Test
	public void postAPITest() throws ClientProtocolException, IOException, JSONException
	{
		RestClient restClient= new RestClient();
		System.out.println(url); 
		restClient.get(url);
		
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
	//	String [] x= new String[5];
		Header[] headerArray = closeableHttpResponse.getAllHeaders();

		// Create a map to store headers of the response for easy iterations
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for (Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}

		System.out.println("Header Array : " + allHeaders);
		 
	}
	
	
	
	@Test
	public void postAPITestWithHeader() throws ClientProtocolException, IOException, JSONException
	{
		RestClient restClient= new RestClient();
		System.out.println(url); 
		
		HashMap<String,String> headerMap= new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		
		
		// jackson api  (Marshlling)
	ObjectMapper mapper=	new ObjectMapper();
	
	CustomerAddress customerAddress=new CustomerAddress();
	customerAddress.setPincode("201301");
	Abc abc= new Abc();

	abc.setCustomerAddress(customerAddress);
	abc.setMerchantId(601178);
	abc.setProductId(1200142700);

	
	
	ReverseShipper users = new  ReverseShipper();
	//_134955592185 _134955592185;
	users.setAbc(abc);
//	System.out.println("users ::"+users.get134955592185());
	

	
	//object to json file
	//mapper.writeValue(new File("/home/rajansardana/AutomationPractice/api-automation/src/main/java/com/qa/data/Users.json"), users);
	
	
	// java object to json in string
	String usersJsonString = mapper.writeValueAsString(users);
	System.out.println("usersJsonString : "+usersJsonString);
	
	closeableHttpResponse = restClient.post(url, usersJsonString, headerMap);  // call the api
	
	
	//validate response
	int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
	System.out.println("Status Code is  :  "+statusCode);
	
	Assert.assertEquals(statusCode, 412);
	
	// To get complete response as string
			String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
	System.out.println("responseString ::"+responseString);
			// To convert string response to json response
			JSONObject responseJSON = new JSONObject(responseString);
			System.out.println("Response JSON from api  : " + responseJSON);
			
			String expected ="{\"stack\":[\"Error: No route possible for all items in request\",\"    at /var/www/fulfillment-logistics/releases/source/20190322173121/lib/courier/index.js:640:29\",\"    at _fulfilled (/var/www/fulfillment-logistics/releases/source/20190322173121/node_modules/q/q.js:854:54)\",\"    at self.promiseDispatch.done (/var/www/fulfillment-logistics/releases/source/20190322173121/node_modules/q/q.js:883:30)\",\"    at Promise.promise.promiseDispatch (/var/www/fulfillment-logistics/releases/source/20190322173121/node_modules/q/q.js:816:13)\",\"    at /var/www/fulfillment-logistics/releases/source/20190322173121/node_modules/q/q.js:624:44\",\"    at runSingle (/var/www/fulfillment-logistics/releases/source/20190322173121/node_modules/q/q.js:137:13)\",\"    at flush (/var/www/fulfillment-logistics/releases/source/20190322173121/node_modules/q/q.js:125:13)\",\"    at _combinedTickCallback (internal/process/next_tick.js:132:7)\",\"    at process._tickDomainCallback (internal/process/next_tick.js:219:9)\"],\"message\":\"No route possible for all items in request\",\"error\":\"No route possible for all items in request\",\"statusCode\":412,\"status\":\"error\"}";
			
			JSONAssert.assertEquals(
					expected, responseString, JSONCompareMode.STRICT);

	
	// json to java object (unmarshlling)   ultimately we are comparing the input json in request and output json in response is same
			
	//		Users usersResObj = mapper.readValue(responseString, Users.class);
		//	System.out.println(usersResObj);
			
		/*	Assert.assertTrue(users.getName().equals(usersResObj.getName()));
			
			Assert.assertTrue(users.getJob().equals(usersResObj.getJob()));
			
			System.out.println(usersResObj.getId());
			System.out.println(usersResObj.getCreatedAt());*/
			
	
	}

}
