package com.nexus;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try{
		System.out.println("First Line");
		System.out.println("Second Line");
		int a = 10/0;
		System.out.println("Third Line");
		}catch(Exception e) {
			System.out.println(e);
		}
	    
		System.out.println("Fourth Line");

	}

}
