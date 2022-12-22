package com.io;

import java.io.FileOutputStream;

public class FileOutputStramExceptionExample {

	public static void main(String[] args) {
		try {
			FileOutputStream write = new FileOutputStream();
			write.write(57);
			write.close();
			System.out.println("Success...");
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
