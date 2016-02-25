package com.adious.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapExample {
	
	public static void main(String arg[]){

		Map map1 = new HashMap();
		
		map1.put("key 1", "element 1");
		map1.put("key 2", "element 2");
		map1.put("key 3", "element 3");
		map1.put("key 4", "element 4");
	
		String val = (String) map1.get("key 1");
		
		//Key iterator
		Iterator it1 = map1.keySet().iterator();
		
		
		
	}
	
}
