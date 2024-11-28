package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
	//instance variables to store data 
	private int ID;
	private String content;
	private User user;
	private LocalDateTime dateTime;
	// date and time formating 
	private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy");
	
	public Post() {}
	
	public Post(String content, User user) {
		this.content = content;	//Assign the content 
		this.user = user;	//assign the user 
		dateTime = LocalDateTime.now();//set current date n time 
	}
	//getter and setter method for ID 
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	//getter and setter method for content 
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	//getter and setter method for user 
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	//getting the local time 
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	//setting the time to local one 
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public String getDateTimeToString() {
		return dateTimeFormatter.format(dateTime);
	}
	//formating the time stamp
	public void setDateTimeFromString(String dateTime) {
		this.dateTime = LocalDateTime.parse(dateTime, dateTimeFormatter);
	}
	
	public String getDateToString() {
		return dateFormatter.format(dateTime);
	}
	
}
