package com.adious.practice1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.adious.practice1.Fibonacci;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
        
  @Test
    public void testFibonacciReq()
    {
    	assertEquals(1,Fibonacci.fibonacciReq(2));
    	
    }
    
  @Test
    public void testFibonacciNumber(){
    	assertEquals(true, Fibonacci.IsFibonacciNumber(13));
    }
    
  @Test
  	public void testSingleton(){
        MySingleton obj1 = MySingleton.getInstance();
		obj1.testMe();
		
		MySingleton obj2 = MySingleton.getInstance();
		obj2.testMe();
		
		assertEquals(obj1,obj2);
		
  }

}
