package com.adious.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {
	 public static void main(String[] args) {

		    String input = "banana frog dog cricket person banana leaf cat drink red red wallet dog cat leave drink banana dog banana cat";
		    boolean orderByFrequency = true;

		    outputWordCount(input, orderByFrequency);
		  }

		  public static void outputWordCount(String input, boolean orderByFrequency) {
		    
			  List<String> list = Arrays.asList(input.split("\\W+"));
			
			  //Method 1 - Single Stream
			  Map<String,Long> map1 = list.stream().collect(Collectors.groupingBy(i->i.toString(),Collectors.counting()));
			  System.out.println(map1);
			  
			  //Method 2 - Parallel Strem
			  Stream<String> stream = Stream.of(input.toLowerCase().split("\\W+")).parallel();
			  Map<String,Long> map2 = stream.collect(Collectors.groupingBy(i->i.toString(),Collectors.counting()));		  
			  System.out.println(map2);
			   
			  //Method 3 - Without Steram
			  Map<String, Integer> map3 = new HashMap<>();
			    for (String w : list) {
			        Integer n = map3.get(w);
			        n = (n == null) ? 1 : ++n;
			        map3.put(w, n);
			    }
			    
			    System.out.println(map3);
				    
			  
		  }
}
