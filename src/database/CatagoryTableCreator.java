package database;

public class CatagoryTableCreator extends TableCreator {
	
	public CatagoryTableCreator() {
		super();
		tableString = "CREATE TABLE IF NOT EXISTS stash (\n"
			       	+ "	id text PRIMARY KEY,\n"
			    	+ " public integer"
			    	+ "	accountName text,\n"
			    	+ "	lastCharName text,\n"
			    	+ " stashName text,\n"
			    	+ " stashType text,\n"
			    	+ " league text NOT NULL,\n"
			    	+ " items FOREIGN KEY\n"
			    	+ ");";
	}
}
