package com.adious.collections;

public class Person {
	
	private String firtname;
	private String lastname;
	
	Person(String firstname,String lastname){
		this.firtname = firstname;
		this.lastname=lastname;
	}
	
	public String getFirtname() {
		return firtname;
	}
	public void setFirtname(String firtname) {
		this.firtname = firtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
