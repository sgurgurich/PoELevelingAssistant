package database;

public class ItemTableCreator extends TableCreator{

	public ItemTableCreator(){
		super();
		tableString = "CREATE TABLE IF NOT EXISTS items (\n"
					+ " verified integer,\n"
			    	+ "	w integer,\n"
			    	+ "	h integer,\n"
			    	+ " ilvl integer,\n"
			    	+ " icon text,\n"
			    	+ " league text NOT NULL,\n"
			       	+ "	id text PRIMARY KEY,\n"
			    	+ " name text NOT NULL"
			    	+ "	typeLine text,\n"
			    	+ "	identified integer,\n"
			    	+ " requirements FOREIGN KEY,\n"
			    	+ " implicitMods FOREIGN KEY,\n"
			    	+ " explicitMods FOREIGN KEY,\n"
			    	+ " frameType integer,\n"
			    	+ " catagory FOREIGN KEY,\n"
			    	+ " x integer,\n"
			    	+ " y integer,\n"
			    	+ " inventoryId text,\n"
			    	+ ");";
	}
}
