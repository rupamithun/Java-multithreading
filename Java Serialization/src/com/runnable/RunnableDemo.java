package com.runnable;

public class RunnableDemo {

	public static void main(String[] args) {
		ClassA a=new ClassA();
		ClassB b=new ClassB();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		t1.start();
		t2.start();

	}

}
