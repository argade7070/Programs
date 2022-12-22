package com.str;

public class SampleTest6 extends Thread {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		SampleTest6 thread = new SampleTest6();
		thread.start();
		//thread.stop();
		

	}

}
