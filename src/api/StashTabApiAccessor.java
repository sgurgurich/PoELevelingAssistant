package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class StashTabApiAccessor {

	public StashTabApiAccessor(){
		
	}
	
	public void grabCurrentDatabase() throws ClientProtocolException, IOException{
		String url = "http://api.pathofexile.com/public-stash-tabs";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", "USER_AGENT");
		HttpResponse response = client.execute(request);

		System.out.println("Response Code : " 
	                + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(
			new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			System.out.println(line);
		}
		
		// Decode the JSON Objects
		/**
		JSONParser parser = new JSONParser();
	      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
			
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
				
	         System.out.println("The 2nd element of array");
	         System.out.println(array.get(1));
	         System.out.println();

	         JSONObject obj2 = (JSONObject)array.get(1);
	         System.out.println("Field \"1\"");
	         System.out.println(obj2.get("1"));    

	         s = "{}";
	         obj = parser.parse(s);
	         System.out.println(obj);

	         s = "[5,]";
	         obj = parser.parse(s);
	         System.out.println(obj);

	         s = "[5,,2]";
	         obj = parser.parse(s);
	         System.out.println(obj);
	      }catch(ParseException pe){
			
	         System.out.println("position: " + pe.getPosition());
	         System.out.println(pe);
	      }
	      **/
	}
}
