package com.adious.classes;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.adious.collections.Person;

public class MyStream {

	public static void main(String[] args) {

		//Load data from Person class as list
		List<Person> persons = Person.getPersonList();
		
		//Strem -> filter -> filter criteria --> output
		persons.stream()
				.filter(p->p.getAge() > 60)
				.forEach(p->System.out.println(p));

		//Using Predicate
		Predicate<Person> predicate = p -> p.getAge() > 20;
		persons.stream()
				.filter(predicate)
				.forEach(p -> System.out.println(p));
		
		//Method Chaining & Method Reference
		persons.stream()
				.filter(predicate)
				.filter(p->p.getFirtname().equals("John"))
				.forEach(System.out::println);
				
		//Load data from Person class as HashMap
		Map<String,Person> peoples = Person.getPersonHashMap();
		peoples.entrySet()
				.stream()
				.filter(p->p.getValue().getAge() > 60).
				forEach(p->System.out.println(p));
		
		//PartitioningBy Collector which take Predicate
		System.out.println(
				persons.stream()
						.collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"))));
	
		//GroupingBy Collector which take function
		System.out.println(
					persons.stream().collect(Collectors.groupingBy(p->p.getCountry().equals("US"))));
					
		//PartitioningBy Collector which take Predicate and count US
		System.out.println(
					persons.stream()
							.collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"),Collectors.counting())));
			
		//GroupingBy Collector which take function and count US
		System.out.println(
					persons.stream().collect(Collectors.groupingBy(p->p.getCountry().equals("US"),Collectors.counting())));
						
		//PartitioningBy Collector which take Predicate and count US
		System.out.println(
					persons.stream()
							.collect(Collectors.groupingBy(p -> p.getCountry())));
			
		//GroupingBy Collector which take function and count US
		System.out.println(
					persons.stream().collect(Collectors.groupingBy(p->p.getCountry(),Collectors.counting())));
			
		//PartitioningBy Collector which take Predicate and count US and map 
		System.out.println(
					persons.stream()
							.collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"),Collectors.mapping(p->p.getFirtname().toUpperCase(), Collectors.toList()))));
				
	}

}
