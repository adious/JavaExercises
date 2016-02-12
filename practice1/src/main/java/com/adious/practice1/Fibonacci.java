package com.adious.practice1;

public class Fibonacci {
	
	 public static int fibonacciReq(int num)
     {
     	if(num == 1 || num==2)
     		return 1;
     	
     	//tail recursion
     	return fibonacciReq(num-1) + fibonacciReq(num-2);
     	
     }
	 
	 public static int fibonacciLoop1(int num)
	 {
		 if(num == 1 || num==2)
	     		return 1;
	
		 int fibo1 = 1, fibo2 = 1, fibonacci=1;
	
		 for(int i= 3; i<= num; i++)
		 {
			 fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
			 fibo1 = fibo2;
			 fibo2 = fibonacci;

			 //Fibonacci number
		 }
		 
		 return fibonacci;
	}
	 
	 public static void fibonacciLoop2(int num)
	 {
		 int first=1;
		 int second=1;
		 int next;
		 
		 System.out.print(first +" " + second+" ");
		 
		 for(int i=3;i<=num;i++)
		 {
			 next = first + second;
			 first = second;
			 second= next;
			 
			 System.out.print(next+" ");
			 
		 }
		 
		 
	 }
	 
	 public static void fibonacciWhile(int num)
	 {
		 int first=1;
		 int second=1;
		 int next;
		 
		 System.out.print(first +" " + second+" ");
		 
		 int counter=3;
		 
		 while(counter<=num){
			 
			 next = first + second;
			 first = second;
			 second= next;
			 
			 System.out.print(next+" ");
			 counter++;
		 }
		 
	 }
	 
	 public static boolean IsFibonacciNumber(int num)
	 {
		 int first=1;
		 int second=1;
		 int next;
		 boolean flag=false;
		 
		 if ((num==0) || (num==1))
			 return true;
		 
		 
		 int counter=3;
		 
		 while(counter<=num){
			 
			 next = first + second;
			 first = second;
			 second= next;
			 
			 if(next==num)
				 return true;

			 counter++;
		 }
		 
		 return false;
	 }
	 
}
