package com.multithreading;

public class Demo2 extends Thread
{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Hello");
	}
	try
	{
		Thread.sleep(1000);
	}
catch(Exception e)
	{
	
	}
}
}
