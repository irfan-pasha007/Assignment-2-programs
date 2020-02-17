package com.ito.assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Num2wordsJUnit {

	@Test
	void test()
	{
		NumberToWords n1=new NumberToWords();
	String str=	n1.convert(123);
		assertEquals("one hundred twenty three",str);
	}
	@Test
	void test1()
	{
		NumberToWords n1=new NumberToWords();
	String str=	n1.convert(-1);
		assertEquals("number cannot be negative",str);
	}
	@Test
	void test2()
	{
		NumberToWords n1=new NumberToWords();
	String str=	n1.convert(900000000);
		assertEquals("limit exceeded",str);
	}
	

}
