package com.williansmartins.basic;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start");
		
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
		
		System.out.println("End");

	}

}
