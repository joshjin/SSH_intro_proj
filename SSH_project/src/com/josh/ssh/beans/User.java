package com.josh.ssh.beans;
import java.sql.Timestamp;



public class User {
	
	/*
	private int autoID;
	private String title;
	private String author;
	private String press;
	private Timestamp publishdate;
	private Double price;
	
	public User(){
	}
	
	public User(int autoID, String title, String author, String press){
		this.title = title;
		this.author = author;
		this.press = press;
		this.autoID = autoID;
	}
	
	public User(int autoID, String title, String author, String press, Timestamp publishdate, Double price){
		this.title = title;
		this.author = author;
		this.press = press;
		this.autoID = autoID;
		this.publishdate = publishdate;
		this.price = price;
	}
	

	public Integer getAutoId() {
		return this.autoID;
	}

	public void setAutoId(Integer autoID) {
		this.autoID = autoID;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return this.press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public Timestamp getPublishdate() {
		return this.publishdate;
	}

	public void setPublishdate(Timestamp publishdate) {
		this.publishdate = publishdate;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
		*/

	
    private String username;  
    private String password; 
    private int userId;
    private int gender;  
  
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    
    public int getUserId() {  
        return userId;  
    }  
  
    public void setUserId(int userId) {  
        this.userId = userId;  
    }  

    public int getGender() {  
        return gender;  
    }  
  
    public void setGender(int gender) {  
        this.gender = gender;  
    }  
	 
}
