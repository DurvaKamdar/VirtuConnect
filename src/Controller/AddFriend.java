package Controller;

import java.sql.SQLException;

import Model.Database;
import Model.User;
import View.Alert;

public class AddFriend {
	//instance variable 
	private User user, f;
	private Database database;
	//constructors 
	public AddFriend(User user, Database database, User f) {
		this.user = user;
		this.database = database;
		this.f = f;
	}
	//
	public boolean isAdded() {
		boolean added = false;//initialize the added flag to false 
		String insert = "INSERT INTO `friends`(`User`, `Friend`) VALUES ('"+
				user.getID()+"','"+f.getID()+"');";
		try {
			//execute the SQL query 
			database.getStatement().execute(insert);
			added = true;
		} catch (SQLException e)
		{//exception handling 
			new Alert(e.getMessage(), null);
			added = false;
		}
		return added;//return the result of the operation
	}

}
