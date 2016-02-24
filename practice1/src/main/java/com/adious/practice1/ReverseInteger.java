package com.adious.practice1;

import java.awt.print.Printable;
import java.util.Stack;

public class ReverseInteger {

	public static void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
	
	public static void main(String[] args) {
		
		int number = 123456;
		int reverse=0;

		while(number!=0){
			reverse = (reverse*10) + (number%10);
			number = number/10;
		}
		
		System.out.println(reverse);

		//Java API
		number=123456;
		String str = String.valueOf(number);
		str = new StringBuffer(str).reverse().toString();
		System.out.println(str);

		
		printBinaryFormat(number);
		
		Integer i = new Integer(number);
		System.out.println("\n"+i.toBinaryString(i));
		
		
	}

}
