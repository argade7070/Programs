package com.str;

public class SampleTest5 {

	public static void main(String[] args) {
		String str = "The cyber king capitals pune kharadi";
		int counter = 0;
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == ' ') {
				counter ++ ;
				
				}
			
		}
		System.out.println("Total space in string are>>>" + counter);
	}

}
