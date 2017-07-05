package com.josh.ssh.beans;
import java.sql.Timestamp;



public class BookInfo {
	
	private Integer autoID;
	private String title;
	private String author;
	private String press;
	private Timestamp publishdate;
	private Double price;
	
	public BookInfo(){
	}
	
	public BookInfo(int autoID, String title, String author, String press){
		this.title = title;
		this.author = author;
		this.press = press;
		this.autoID = autoID;
	}
	
	public BookInfo(int autoID, String title, String author, String press, Timestamp publishdate, Double price){
		this.title = title;
		this.author = author;
		this.press = press;
		this.autoID = autoID;
		this.publishdate = publishdate;
		this.price = price;
	}
	
	//getter and setter must match the name of the variables
	//which muust be the same as the hbm.xml files
	//name=<NAME_IN_THE_ENTITY> column=<NAME_IN_THE_TABLE>
	public Integer getAutoID() {
		return this.autoID;
	}

	public void setAutoID(Integer autoID) {
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
		
}