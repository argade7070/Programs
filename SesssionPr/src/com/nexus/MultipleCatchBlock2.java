package com.nexus;

public class MultipleCatchBlock2 {

	public static void main(String[] args) {
	
	try {
		int a[] = new int[5];
		a[5] = 30/0;
	}catch(Exception e) {
		System.out.println("common task completed");
	}catch(ArithmeticException e) {
		System.out.println("Task one is completed");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Task two is completed");
	}
	System.out.println("rest of code........");
	}

}
