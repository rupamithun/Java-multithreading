package com.runnable;

public class ClassB implements Runnable 
{
public void run()
{
	for(int i=1;i<=3;i++)
	{
	System.out.println("classB");
	try {Thread.sleep(1000);}
	catch(Exception e)
	{
	}
}
}
}