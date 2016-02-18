package com.adious.practice1;

public class MySingleton {
	
	private static MySingleton instance = null;
	
	private MySingleton(){
	}
	
	public static MySingleton getInstance(){
		
		if(instance == null) {
	         instance = new MySingleton();
	      }
	      
		return instance;
	}
	
	public void testMe(){
		System.out.println("This is working fine..... ");
	}

}
