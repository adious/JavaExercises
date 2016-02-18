package com.adious.practice1;

import java.util.Scanner;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Java Practice 1 ................................!" );
        
        System.out.println("How many number program should generate");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println("Generating fibonacci number up till..."+ number);
        
        System.out.println("\n Recursion\n ======================");
        for(int i=1;i<=number;i++)
        	System.out.print(Fibonacci.fibonacciReq(i)+" ");
        System.out.println("\n======================");
        
        System.out.println("\n For Loop1\n ======================");
        for(int i=1;i<=number;i++)
        	System.out.print(Fibonacci.fibonacciLoop1(i)+" ");
        System.out.println("\n======================");
        
        System.out.println("\n For Loop2\n ======================");
        Fibonacci.fibonacciLoop2(number);
        System.out.println("\n======================");
        
        System.out.println("\n While Loop\n ======================");
        Fibonacci.fibonacciWhile(number);
        System.out.println("\n======================");
        
        System.out.println("\n Is Fibonacci Number\n ======================\n");
        System.out.println(Fibonacci.IsFibonacciNumber(number));
        System.out.println("\n======================");
        	
      
    }
        
       
    }

