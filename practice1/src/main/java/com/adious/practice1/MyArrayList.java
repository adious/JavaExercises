package com.adious.practice1;

import java.util.Arrays;

public class MyArrayList {

	private int size=0;
	private Object [] myStore;
	
	public MyArrayList(){
		myStore = new Object[10];
	}
	
	//get size of array
	public int getSize(){
		return this.size;
	}

	//get value at index
	public Object get(int index){
		
		if(index<size)
			return myStore[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	//add in array list
	public void add(int obj){
		if(myStore.length-size<=5)
			increaseListSize();
		myStore[size++] = obj;
	}
	
	//remove in array list
	public void remove(int obj){
		
	}
	
	private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
		
	
	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		list.add(new Integer(2));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		list.add(new Integer(77));
		
		for(int i=0;i<list.size;i++)
			System.out.print(" "+list.get(i));
		
		list.add(new Integer(99));
		
		System.out.println("Element at :"+ list.get(2));
		System.out.println("Size of my list :" + list.size);
		
		System.out.println(list.getClass().getName());
		System.out.println(list.hashCode());
		System.out.println(list instanceof MyArrayList);

		
		
	}

}
