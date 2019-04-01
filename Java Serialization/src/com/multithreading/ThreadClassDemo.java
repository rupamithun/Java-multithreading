package com.multithreading;

public class ThreadClassDemo {

	public static void main(String[] args) {
		Demo1 obj1=new Demo1();
		Demo2 obj2=new Demo2();
		
		obj1.start();
		obj2.start();

	}

}
