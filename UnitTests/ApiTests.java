import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import api.StashTabApiAccessor;

public class ApiTests {

	@Test
	public void test() throws ClientProtocolException, IOException, InterruptedException {
		
		long start_time = System.nanoTime();
		
		StashTabApiAccessor api;
		api = new StashTabApiAccessor();
		
		boolean done = false;
		
		while (!done) {
			done = api.grabCurrentDatabase();
		}
		
		long end_time = System.nanoTime();
		
		long total_time = end_time - start_time;
		
		System.out.println("Program took: " + (total_time) + " nanoseconds");
		
	}

}
