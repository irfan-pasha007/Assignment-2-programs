package com.ito.assignment2.Student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class StudentJunitTest {

	@Test
	void test()
	{
		StudentRecord s1=new StudentRecord();
		TreeMap <StudentId,StudentDetails> tree_map1=	s1.record();
		assertEquals(10,tree_map1.size());
	}
	@Test
	void test1()
	{
		StudentRecord s1=new StudentRecord();
		TreeMap <StudentId,StudentDetails> tree_map1=	s1.record();
		assertEquals(false,tree_map1.isEmpty());
	}
	@Test
	void test2()
	{
		StudentRecord s1=new StudentRecord();
		TreeMap <StudentId,StudentDetails> tree_map1=	s1.record();
		assertEquals("StudentId [deptcode=aa54, year=2013, id=2]",tree_map1.firstKey().toString());
	}

}
