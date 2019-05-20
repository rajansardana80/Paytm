package com.qa.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class RestClient {

	//GET without header
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException, JSONException {
		// To create a http client
		CloseableHttpClient httpClient = HttpClients.createDefault();

		URIBuilder builder = new URIBuilder();
		builder.setScheme("http").setHost("fulfillment-staging.paytm.com/dev3").setPath("/v1/admin/get_cancellation_reasons")
		    .setParameter("id", "1");
		    
		URI uri = null;
		try {
			uri = builder.build();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpGet httpget = new HttpGet(uri);
		
// To create a get request
		//HttpGet httpGet = new HttpGet(url);
		

		// To execute the request and get complete response
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget);
		
return		 closeableHttpResponse;



	}
	
	
	//GET request with Headers
	public CloseableHttpResponse get(String url , HashMap<String, String> hashMap) throws ClientProtocolException, IOException, JSONException {
		// To create a http client
		CloseableHttpClient httpClient = HttpClients.createDefault();

// To create a get request
		HttpGet httpGet = new HttpGet(url);

		
		for(Map.Entry<String, String> entry:hashMap.entrySet())
		{
			httpGet.addHeader(entry.getKey(),entry.getValue());
		}
		
		// To execute the request and get complete response
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
		
return		 closeableHttpResponse;



	}
	
	
	//Post request with Headers
		public CloseableHttpResponse post(String url , String entityString , HashMap<String, String> hashMap) throws ClientProtocolException, IOException, JSONException {
			// To create a http client
			CloseableHttpClient httpClient = HttpClients.createDefault();

	// To create a get request
			HttpPost httpPost = new HttpPost(url);

			httpPost.setEntity(new StringEntity(entityString));
			
			
			for(Map.Entry<String, String> entry:hashMap.entrySet())
			{
				httpPost.addHeader(entry.getKey(),entry.getValue());
			}
			
			// To execute the request and get complete response
			CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpPost);
			
	return		 closeableHttpResponse;



		}
}
