package com.assignment2.multithreading;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitMultiThreading {

	@Test
	void test() 
	{
		PrintOneToHundred oep = new PrintOneToHundred();
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		assertFalse(t1.isAlive());
	}
	@Test
	void test1() 
	{
		PrintOneToHundred oep = new PrintOneToHundred();
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		assertEquals("java.lang.ThreadGroup[name=main,maxpri=10]",t1.getThreadGroup().toString());
	}
	@Test
	void test2() 
	{
		PrintOneToHundred oep = new PrintOneToHundred();
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		assertEquals(false,t1.isDaemon());
	}
	@Test
	void test3() 
	{
		PrintOneToHundred oep = new PrintOneToHundred();
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				oep.printEven();
			}
		});
		assertEquals(false,t1.isInterrupted());
	}

}
