package com.nexus;

public class ExceptionDemo2 {

	public static void main(String[] args) {
	System.out.println("First Line");
	System.out.println("Second Line");
	
	try{
		int a = 10/0;    // Due to the try and catch block the exception are handled and the code are 
		}                // normally due to the exception are handeled by try and catch block 
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println("Third Line");
	
	System.out.println("Fourth Line");
	System.out.println("Fifth Line");
	
	System.out.println("Sixth Line");
	
	}

}
