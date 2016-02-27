package com.adious.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;


public class MapExample {
	
	public static void main(String arg[]){

		Map<String,String> map1 = new HashMap<>();
		
		map1.put("key 1", "element 1");
		map1.put("key 2", "element 2");
		map1.put("key 3", "element 3");
		map1.put("key 4", "element 4");
	
		String val = (String) map1.get("key 1");
		
		//Key iterator
		Iterator it1 = map1.keySet().iterator();
		
		//System.out.println(map1);
		
		
		Hashtable<String,String> table = new Hashtable<>();
		table.put("Alive is ", "awesome");
		table.put("Love", "yourself");
		System.out.println("Hashtable output :"+ table);
		
		HashMap<String,String> hashmap = new HashMap<>();
		hashmap.put("Alive is ", "awesome");
		hashmap.put("Love", "yourself");
		hashmap.put(null, "Key is null");
		hashmap.put("null value", null);
		hashmap.put("sss", "yourself");
		
		
		System.out.println("Hashtable output :"+ hashmap);
		
	}
	
}
