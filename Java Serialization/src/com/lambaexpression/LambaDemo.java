package com.lambaexpression;

public class LambaDemo {

	public static void main(String[] args) {

Thread t1=new Thread(() ->
{
	for(int i=1;i<=4;i++)
	{
		System.out.println("Thread 1");
	}
	try {Thread.sleep(1000);}
	catch(Exception e)
	{
		
	}
});
Thread t2=new Thread(() ->
{
	for(int i=1;i<=4;i++)
	{
		System.out.println("Thread 2");
	}
	try {Thread.sleep(1000);}
	catch(Exception e)
	{
		
	}
});

t1.start();
try {Thread.sleep(10);}
catch(Exception e){}
t2.start();
try {
t1.join();
t2.join();}
catch(Exception e2) {}
t1.setName("First");
t2.setName("Second");
System.out.println(t1.getName());
System.out.println(t2.getName());
System.out.println(t1.isAlive());
System.out.println("bye");
	}
	

}
