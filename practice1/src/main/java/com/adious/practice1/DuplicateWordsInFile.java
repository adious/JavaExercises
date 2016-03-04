package com.adious.practice1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInFile {
	
	
	public static Map<String,Integer> DuplicateWordCount(String fileName) throws NullPointerException,IOException,Exception{

		Map<String,Integer> wordmap = new HashMap<>();
		String line="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(fileName))); 
	
			while( (line = br.readLine())!= null){
				
				String[] words = line.split(" ");
				
					for(String s: words){
						int n=0;
						if(wordmap.get(s.toLowerCase())!=null)
							n = wordmap.get(s.toLowerCase());
								wordmap.put(s.toLowerCase(),n+1);
								
					} // for each
			}//reader
			
			
			return wordmap;		
		
	}
	
	
	//Java 7 now in java 8 can use lambda see below
	public static List<Entry<String,Integer>> SortMapByValue(Map<String,Integer> map){
	
		
	  Set<Entry<String,Integer>> set = map.entrySet(); 
	  List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
	  
	   Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			System.out.println("value of o2: "+ o2.getValue() +" value of o1: "+o1.getValue()+" ---"+ o2.getValue().compareTo(o1.getValue()));
			return o2.getValue().compareTo(o1.getValue());
		}
	});  
	  
	  return list;
	}
	

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		
		
		try{
			map = DuplicateWordsInFile.DuplicateWordCount("words.txt");
			System.out.println("Unsorted map: "+map);

//		Old way
//			List<Entry<String,Integer>> list = DuplicateWordsInFile.SortMapByValue(map);
//			System.out.println("Sorted Map");
//			for(Entry<String,Integer> item: list)
//				System.out.println(item.getKey() + " = "+item.getValue());
//		
			
			
			//Lambda way
			List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
			Collections.sort(list, (o1,o2)-> o2.getValue().compareTo(o1.getValue()));
			list.stream().forEach(System.out::println);
			
			
		}
		catch(NullPointerException n){
			System.out.println("Please check filename "+n.getMessage());
		}
		
		catch(FileNotFoundException f){
			System.out.println("File not found " + f.getMessage());
		}
		catch (IOException e) {
			System.out.println("IO Exception "+ e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

