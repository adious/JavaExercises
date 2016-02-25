package com.adious.classes;

public interface MyInterface {

	//allow contanst filed
	public static final String TITLE="My Interface";
	
	void TurnOn();  // public abstract by default
	public abstract	void TurnOff();
	
	public static void printItemArray(){
		System.out.println("Java 8 new helper static method");
	}
	
	public default void print(){
		System.out.println("Java 8 new feature...");
	}
}
