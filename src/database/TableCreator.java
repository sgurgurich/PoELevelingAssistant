package database;

public class TableCreator {
	
	protected ItemDBManager itemDB = new ItemDBManager();
	protected String tableString;

	public TableCreator(){
		tableString = ""; // Parent does not create a table
	}
	
	public void addTableToDB() {
		itemDB.createTable(tableString);
	}
	
}
