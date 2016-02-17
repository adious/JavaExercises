package com.adious.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		Integer duplicate=0;
		
		for(int i=0;i<30;i++)
			numbers.add(i);
	
			//add duplicate number
			numbers.add(3);
		
			//For Loop - O(n!)
			for(int i=0;i<numbers.size();i++)
			{
				temp.add(numbers.get(i));
				
				for(int x=0;x<temp.size();x++)
				{
					if(numbers.get(i)==temp.get(x))
					{
						duplicate = numbers.get(i);
						break;
					}				
				}				
			}
			
			System.out.println("Duplicate number "+duplicate);
		
			//for each - O(n!)
			for(Integer i: numbers)
			{
				temp.add(i);
				for(Integer x: temp)
				{
					if(i==x)
						duplicate = numbers.get(i);
				}
			}
			
			System.out.println("Duplicate number "+duplicate);

			

		
	}
}
