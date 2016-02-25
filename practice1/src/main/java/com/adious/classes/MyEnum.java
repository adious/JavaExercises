package com.adious.classes;

public enum MyEnum {
	ON ("The Power is ON"),
	OFF("The Power is OFF"),
	SUSPEND("The Power is Suspend");
	
	private String description;
	
	private MyEnum(String d){
		description=d;
	}
	
	public String getDescription(){
		return description;
	}
}
