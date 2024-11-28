package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import View.Alert;

public class Database {
	
	private String user = "root";//username for the database 
	private String pass = "";//password for the database
	private String url = "jdbc:mysql://localhost:3306/socialmedia";//url for the database connection 
	private Statement statement;//statement object 
	
	//constructor for the database connection 
	public Database() {
		try {
			//establish a connection to the database 
			Connection connection = DriverManager.getConnection(url, user, pass);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
									ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			//display an alert if a SQL exception occurs 
			new Alert(e.getMessage(), null);
		}
	}
	
	public Statement getStatement() {
		return statement;
	}

}
