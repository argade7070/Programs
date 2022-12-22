package com.str;

public class SampleTest7 {

	public static void main(String[] args) {
		String str = "Velocity Training center pune";
		int counter = 0;
		for(int i =0; i<=10; i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				counter++;
				
			}
		
	}
		System.out.println("total space in string are >>" + counter);
}
}