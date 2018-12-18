import static org.junit.Assert.*;

import org.junit.Test;

import database.ItemDBManager;

public class DatabaseTests {

	@Test
	public void test() {
		
		ItemDBManager item_db = new ItemDBManager();
		
		item_db.createTable();
		item_db.selectAll();
		
	}

}
