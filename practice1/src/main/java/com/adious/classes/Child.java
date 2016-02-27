package com.adious.classes;


public  class Child extends AbstractParent  {

	@Override
	public void TurnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TurnOff() {
		// TODO Auto-generated method stub
		
	}	
	
	public void childFunction(){
		System.out.println("Child function ....");
	}
	
	
	public static void main(String args[]){
		MyEnum myenum = null;
		System.out.println(myenum.ON);
		System.out.println(myenum.ON.getDescription());
		
		AbstractParent e = new Child();
		e.parentFunction();
		
		
		
		
		
		
		
	}
	
}
