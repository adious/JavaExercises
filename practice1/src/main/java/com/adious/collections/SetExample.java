package com.adious.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String arg[]){
		
		Set<String> set = new TreeSet<>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Three"); // not added only unique
		set.add("Four");
		
		//Java 7
		for(String s : set)
			System.out.println(s);
		
		//Java 8 Lambda
		//set.forEach(s->System.out.println(s));
		
		
	}
}
