import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import api.StashTabApiAccessor;

public class ApiTests {

	@Test
	public void test() throws ClientProtocolException, IOException {
		
		StashTabApiAccessor api;
		api = new StashTabApiAccessor();

		api.grabCurrentDatabase();
		
	}

}
