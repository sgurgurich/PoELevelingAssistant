package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import utilities.LogSeverityEnum;
import utilities.LoggingUtility;

import org.json.simple.parser.JSONParser;

public class StashTabApiAccessor {

	private String next_id;
	private ArrayList<String> string_buffer;



	public StashTabApiAccessor(){
		next_id = "";
		string_buffer = new ArrayList<String>();

	}

	public <T> boolean grabCurrentDatabase() throws ClientProtocolException, IOException, InterruptedException{
		boolean done = false;

		String url = "http://api.pathofexile.com/public-stash-tabs/" + next_id;


		JSONParser parser = new JSONParser();

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", "USER_AGENT");
		HttpResponse response = client.execute(request);

		//System.out.println("Response Code : " 
		//            + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

		try {
			Object obj = parser.parse(rd.readLine());
			JSONObject raw_json_obj = (JSONObject)obj;
			
			next_id = (String) raw_json_obj.get("next_change_id");
			
			JSONArray stashes = (JSONArray) raw_json_obj.get("stashes");
			
			// this is a list of all "stashes in the JSON objects
			ArrayList<JSONObject> stash_list = new ArrayList<JSONObject>();
			
			for (int i = 0; i < stashes.size(); i++) {
				stash_list.add((JSONObject) stashes.get(i));
			}
			
			//System.out.println(stash_list.get(64).get("lastCharacterName"));
			//System.out.println(stash_list.get(64).get("items"));
			//System.out.println(stash_list.get(64).get("accountName"));
			
			
			if (next_id == null) {
				done = true;
				System.out.println("All tabs processed!");
			}
		}

		catch(ParseException pe){

			System.out.println("position: " + pe.getPosition());
			System.out.println(pe);
		}		
		catch(NullPointerException npe){
			//npe.printStackTrace();
			for (int i=0; i < string_buffer.size(); i++) {
				System.out.println(string_buffer.get(i));
			}
			System.out.println(npe);
			
			assert(false);
		}
		return done;

	}
}
