package com.runnable;

public class ClassA implements Runnable
{
public void run()
{
	for(int i=1;i<=3;i++)
	{
		
	System.out.println("Class A");

	try {Thread.sleep(1000);}
	catch(Exception e)
	{
	}
}
}
}