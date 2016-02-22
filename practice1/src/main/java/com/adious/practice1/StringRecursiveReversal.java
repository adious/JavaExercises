package com.adious.practice1;

public class StringRecursiveReversal {

	public static String Reverse(String str){
		
		String output="";
	
		for(int i=str.length()-1;i>=0;i--)
			output += str.charAt(i);
		
		return output;
	}
	
	public static String ReverseString(String str){
		
			String reverse="";
			
			if(str.length()==1)
				return str;
			else
				reverse += str.charAt(str.length()-1) + ReverseString(str.substring(0,str.length()-1));
			
			return reverse;
		}

	
	public static void main(String[] args) {

		System.out.println(StringRecursiveReversal.Reverse("Hello World"));
		System.out.println(StringRecursiveReversal.ReverseString("Hello World"));
		
		//Reverse with API
		String reverse  = new StringBuffer("Hello World").reverse().toString();
		System.out.println(reverse);
		
	}

}
