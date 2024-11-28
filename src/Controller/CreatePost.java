package Controller;

import java.sql.SQLException;

import Model.Database;
import Model.Post;
import View.Alert;

public class CreatePost {
	//initializing the variables 
	private Post post;
	private Database database;
	//basic constructor 
	public CreatePost(Post post, Database database) {
		this.post = post;
		this.database = database;
	}
	
	public boolean posted() {
		boolean posted = false;                                                                             
		//sql query to store 
		String insert = "INSERT INTO `posts`(`Content`, `User`, `DateTime`) VALUES"
				+ " ('"+post.getContent()+"','"+post.getUser().getID()+"','"+
				post.getDateTimeToString()+"');";
		//exception handling
		try {
			database.getStatement().execute(insert);
			posted = true;
		} catch (SQLException e) {
			new Alert(e.getMessage(), null);
			posted = false;
		}
		return posted;
	}

}
