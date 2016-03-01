package com.adious.practice1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.adious.classes.User;
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
  
  @Test
  public void testUserBuilder(){
	  	User usr = new User.UserBuilder("Uncle","Tom")
	  			.age(20)
	  			.phone("1234567")
	  			.address("UK")
	  			.build();
	  	
	  	assertEquals(usr.getFirstname(),"Uncle");
  }

//  @Test
//  public void testUserBuilderDateOutOfIndex(){
//	  	assertEquals(new User.UserBuilder("Uncle","Tom")
//	  			.age(130)
//	  			.phone("1234567")
//	  			.address("UK")
//	  			.build(),new IllegalStateException("Age out of range"));
//  }
}
