package com.nexus;

public class Test1 {

	public static void main(String[] args) {
		try {
			throw new Test("Invalid input");
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
