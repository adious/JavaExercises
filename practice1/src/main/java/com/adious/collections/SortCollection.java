package com.adious.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.adious.collections.Person;
import java.util.List;

public class SortCollection {
	
	
	public static void main(String arg[]){
	
		List<Person> people = new ArrayList<Person>();
			
		people.add(new Person("Zorro","shane"));
		people.add(new Person("John","Don"));
		people.add(new Person("Shaun","Paul"));
		people.add(new Person("M","Abdul"));
				
		//java 7 sort
		people.sort(new Comparator<Person>() {
			public int compare(Person p1, Person p2){
				return p1.getFirtname().compareTo(p2.getFirtname());
			}
		} );
		
		for(Person p: people){
			System.out.println("Java 7 ----"+p.getFirtname() +" "+p.getLastname());
		}
		
		//java 8
		//Collections.sort(people, (p1, p2) -> p1.getFirtname().compareTo(p2.getFirtname()));
		
		//another way
		people.sort((p1,p2)-> p1.getFirtname().compareTo(p2.getFirtname()));
				
		people.forEach(p->System.out.println("Java 8 ---- "+p.getFirtname()+" "+p.getLastname()));
		
		
		//Equal and == concept
		Person p1 = new Person("ABC","XYZ");
		Person p2 = new Person("ABC","XYZ");
		
		System.out.println(p1.equals(p2)); //true
		System.out.println(p1==p2); //false
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		
		String s1 = "ABC";
		String s2 = "ABC";
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
			
	
	}
	
	

	

}
