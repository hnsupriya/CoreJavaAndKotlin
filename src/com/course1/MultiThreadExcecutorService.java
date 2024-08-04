package com.course1;

public class MultiThreadExcecutorService extends Thread {
	
	public void run() {
		System.out.println("I am in Run Method");
	}
	public static void main(String[] args) {
		MultiThreadExcecutorService obj1 = new MultiThreadExcecutorService();
		obj1.start();
	}
	

}
