package com.sapient.College.model;


public class Student {
	
	
	private String id;
	private String name;
	private String regno;	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", regno=" + regno + "]";
	}
}
