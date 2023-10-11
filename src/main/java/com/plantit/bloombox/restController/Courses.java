package com.plantit.bloombox.restController;

public class Courses {
 private long id;
 private String name;
 private String price;

 public long getId() {
	return id;
}
public Courses(long id, String name, String price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
 
 
}
