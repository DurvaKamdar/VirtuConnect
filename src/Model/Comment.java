package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Comment {
	
	//Instance Variables to store data 
	private int ID;
	private String content;
	private User user;
	private LocalDateTime dateTime;
	
	//Date and Time formatters for formating and parsing dates
	private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy");
	//default Constructor 
	public Comment() {}
	
	public Comment(String content, User user) {
		this.content = content;
		this.user = user;
		dateTime = LocalDateTime.now();
	}
	//getter method for ID 
	public int getID() {
		return ID;
	}
	//Setter method for ID 
	public void setID(int ID) {
		this.ID = ID;
	}
	//getter for content 
	public String getContent() {
		return content;
	}
	//setter for content 
	public void setContent(String content) {
		this.content = content;
	}
	//get the user who created the comment 
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	//getter and seeter for timestamp 
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public String getDateTimeToString() {
		return dateTimeFormatter.format(dateTime);
	}
	//formating the date and time string 
	public void setDateTimeFromString(String dateTime) {
		this.dateTime = LocalDateTime.parse(dateTime, dateTimeFormatter);
	}
	
	public String getDateToString() {
		return dateFormatter.format(dateTime);
	}

}
