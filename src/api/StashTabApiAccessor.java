package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

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

	private String next_id;



	public StashTabApiAccessor(){
		next_id = "";

	}

	public <T> boolean grabCurrentDatabase() throws ClientProtocolException, IOException{
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
			//System.out.println("Next: " + next_id);


			// loop array
			JSONArray msg = (JSONArray) raw_json_obj.get("stashes");
			Iterator<T> iterator = msg.iterator();

			while (iterator.hasNext()) {
				// make sure it's public
				Object pub_obj = parser.parse(iterator.next().toString());
				JSONObject pub_json_obj = (JSONObject)pub_obj;

				if (pub_json_obj.get("public").toString().equals("true")) {
					// Now filter by league
					JSONArray item_msg = (JSONArray) pub_json_obj.get("items");
					Iterator<T> item_it = item_msg.iterator();
					
					while (item_it.hasNext()) {
						
						Object item_obj = parser.parse(item_it.next().toString());
						JSONObject item_json_obj = (JSONObject)item_obj;
						
						if (item_json_obj.get("league").toString().equals("Betrayal")) {
							System.out.println(item_json_obj.get("name"));
						}
					}
				}

			}


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
			System.out.println(npe);
		}
		return done;

	}
}
