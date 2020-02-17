package com.ito.assignment2.occurencefile;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.*;

import org.junit.jupiter.api.Test;

class OccuranceJunitTest {

	@Test
	void test() throws IOException
	{
		 DistinctWordsAndOccurenceOfIt d1=new DistinctWordsAndOccurenceOfIt();
		 
			LinkedHashMap<String,Integer> h1=d1.m1();
			assertEquals(3,h1.get("I"));
	}
	@Test
	void test1() throws IOException
	{
		 DistinctWordsAndOccurenceOfIt d1=new DistinctWordsAndOccurenceOfIt();
		 
			LinkedHashMap<String,Integer> h1=d1.m1();
			assertEquals(false,h1.isEmpty());
	}
	@Test
	void test2() throws IOException
	{
		 DistinctWordsAndOccurenceOfIt d1=new DistinctWordsAndOccurenceOfIt();
		 
			LinkedHashMap<String,Integer> h1=d1.m1();
			assertEquals(11,h1.size());
	}
	@Test
	void test3() throws IOException
	{
		 DistinctWordsAndOccurenceOfIt d1=new DistinctWordsAndOccurenceOfIt();
		 
			LinkedHashMap<String,Integer> h1=d1.m1();
			assertEquals(false,h1.containsKey("javab"));
	}

}
