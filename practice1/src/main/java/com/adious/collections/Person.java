package com.adious.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

	private String firtname;
	private String lastname;
	private int age;
	private String country;
	
	

	Person(String firstname,String lastname,String country){
		this.firtname = firstname;
		this.lastname=lastname;
		this.age=25;
		this.country=country;
	}


	Person(String firstname,String lastname,int age,String country){
		this.firtname = firstname;
		this.lastname=lastname;
		this.age=age;
		this.country=country;
	}

	
	public int getAge() {
		return age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public void setAge(int age) {
		this.age = age;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firtname == null) ? 0 : firtname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firtname == null) {
			if (other.firtname != null)
				return false;
		} else if (!firtname.equals(other.firtname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [firtname=" + firtname + ", lastname=" + lastname +" Age=" + age + "]";
	}

	
	public static List<Person> getPersonList(){
	
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Zorro","shane",60,"US"));
		people.add(new Person("John","Don",25,"CHI"));
		people.add(new Person("Shaun","Paul",32,"PAK"));
		people.add(new Person("M","Abdul",20,"US"));
		people.add(new Person("M","Abdul",16,"UK"));
		people.add(0,new Person("Oldie","Guy",80,"UK"));
	
	return people;
	
	}
	
	public static Map<String,Person> getPersonHashMap(){
		
		Map<String,Person> people = new HashMap<>();
		
		people.put("Key 1",new Person("Zorro","shane",60,"US"));
		people.put("Key 2",new Person("John","Don",25,"CHI"));
		people.put("Key 6",new Person("Shaun","Paul",32,"PAK"));
		people.put("Key 3",new Person("M","Abdul",20,"US"));
		people.put("Key 5",new Person("M","Abdul",16,"UK"));
		people.put("Key 4",new Person("Oldie","Guy",80,"UK"));
	
	return people;
	
	}
	
}
