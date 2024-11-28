package Controller;

import java.sql.SQLException;

import Model.Comment;
import Model.Database;
import Model.Post;
import Model.User;
import View.Alert;

public class CreateComment {
	// instance variable 
	private Comment c;
	private Post p;
	private User u;
	private Database database;
	
	//constructor to initialize the createcomment class 
	public CreateComment(Comment c, Post p, User u, Database database) {
		this.c = c;
		this.p = p;
		this.u = u;
		this.database = database;
	}
	
	public boolean commented() {
		boolean commented = false;
		//sql query to store comment 
		String insert = "INSERT INTO `comments`(`Content`, `Post`, `User`, `DateTime`)"
				+ " VALUES ('"+c.getContent()+"','"+p.getID()+"','"+u.getID()+"','"
				+c.getDateTimeToString()+"');";
		try {
			//execute the sql query 
			database.getStatement().execute(insert);
			commented = true;
		} 
		//exception handling 
		catch (SQLException e) {
			new Alert(e.getMessage(), null);
			commented = false;
		}
		return commented;
	}

}
