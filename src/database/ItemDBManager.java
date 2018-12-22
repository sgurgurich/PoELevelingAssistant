package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemDBManager {

	private String url;


	public ItemDBManager(){
		this.url = "jdbc:sqlite:./Database/itemData.db";
	}

	private Connection connect() {
		Connection conn = null;
		try {

			conn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return conn;
	}

	public void createTable(String inputString) {
		String sql = inputString;

		try (Connection conn = connect();
				Statement stmt = conn.createStatement()) {

			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectAll() {
		String sql = "SELECT id, name, capacity FROM warehouses";

		try (Connection conn = connect();
				Statement stmt  = conn.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){

			// loop through the result set
			while (rs.next()) {
				System.out.println(rs.getInt("id") +  "\t" + 
						rs.getString("name") + "\t" +
						rs.getDouble("capacity"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


}
