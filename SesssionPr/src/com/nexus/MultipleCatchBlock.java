package com.nexus;

public class MultipleCatchBlock {

	public static void main(String[] args) {
	int i, j;
	j=0;
	try {
		i = 90/j; // Can cause exception(Arithmetic exception)
	}catch(Exception e) {
		System.out.println(e);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}

	}

}
