package com.str;

import javax.annotation.processing.SupportedSourceVersion;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "pune";
		String s3 = "pune";
		String s2 = new String("Mumbai");
		System.out.println(s1 == s2);  // Addresses are the diffrent of both the strings
		System.out.println(s1.equals(s2));  // content is also diff of both of the strings
		System.out.println(s1 == s3);   // Address are the same of both of the string
		System.out.println(s1.equals(s3)); // Content is also same of both of the string
		System.out.println(s3.equals(s2));  // content of the string are the different

	}

}
