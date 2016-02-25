package com.adious.classes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class LambdaExpression {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		List<String> str = Arrays.asList("abc","efg","xyz","hello");
		
		list.stream()
		.map((x)->x*x)
		.forEach(System.out::println);
		
		str.forEach(s->System.out.println(s));
		str.forEach(System.out::println);
		
		list.stream().map(x->x+x).forEach(System.out::println);;

	}

}
