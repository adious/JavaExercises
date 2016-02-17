package com.adious.practice1;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
       // 30= 10+20;
        x = x+y;
       //10 = 30-20
        y=x-y;
       //20 = 30-10;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);


	}

}
