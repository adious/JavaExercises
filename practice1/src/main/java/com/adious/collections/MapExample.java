package com.adious.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class MapExample {
	
	public static void main(String arg[]){
		
		

		//Hashmap
		HashMap<String,String> hashmap = new HashMap<>();

		hashmap.put("key 1", "element 1");
		hashmap.put("key 2", "element 2");
		hashmap.put("key 3", "element 3");
		hashmap.put("key 4", "element 4");
		hashmap.put(null, "Key is null");
		hashmap.put("Key 5",null);
		hashmap.put("key 2", "new element 2");
		hashmap.put("key 6", "new element 1");
		
		System.out.println("=========HashMap=========");
		hashmap.forEach((k,v)-> System.out.println(k+" --- "+v));
			
		//HashTable
		Hashtable<String,String> table = new Hashtable<>();
		table.put("key 1", "element 1");
		table.put("key 2", "element 2");
		table.put("key 3", "element 3");
		table.put("key 4", "element 4");
		//table.put(null,"Key is null"); //error
		//table.put("Key 5",null);		 //error
		table.put("key 2", "new element 2");
		table.put("key 6", "new element 1");
			
		
		System.out.println("=========HashTable=========");
		table.forEach((k,v)-> System.out.println(k+" --- "+v));
		
		//Tree Map
		TreeMap<String,String> tree = new TreeMap<>();
		tree.put("key 2", "element 2");
		tree.put("key 4", "element 4");
		tree.put("key 3", "element 3");
		tree.put("key 1", "element 1");
		//tree.put(null,"Key is null"); //error
		//tree.put("Key 5",null);		 //error
		tree.put("key 2", "new element 2");
		tree.put("key 6", "new element 1");
		
		System.out.println("=========TreeMap=========");
		tree.forEach((k,v)-> System.out.println(k+" --- "+v));
			
	
	}
	
}
