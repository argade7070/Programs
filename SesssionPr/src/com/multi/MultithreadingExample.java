package com.multi;

public class MultithreadingExample extends Thread {


		public void run() {
			for(int i=0; i<=5; i++) {
				try {
					Thread.sleep(500); // it will pause the thread execution for perticular milliseconds
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(i);
			}
		}
public static void main(String[] args) {
	MultithreadingExample thread1 = new MultithreadingExample();
	MultithreadingExample thread2 = new MultithreadingExample();
    thread1.start();
    thread2.start();
    
	
}
	

}
