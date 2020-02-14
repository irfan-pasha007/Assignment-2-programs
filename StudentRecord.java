package com.ito.assignment2.Student;
import java.util.*;
public class StudentRecord
{
public static void main(String[] args)
{
	TreeMap <StudentId,StudentDetails> tree_map=new TreeMap<StudentId,StudentDetails>(new StudentId());
	
	
	StudentId s1=new StudentId("ca001",2012,01);
	StudentId s2=new StudentId("aa54",2013,02);
	StudentId s3=new StudentId("aa54",2016,03);
	StudentId s4=new StudentId("ba43",2012,04);
	StudentId s5=new StudentId("mc56",2013,05);
	StudentId s6=new StudentId("mc56",2013,07);
	StudentId s7=new StudentId("bc34",2011,07);
	StudentId s8=new StudentId("bth43",2019,05);
	StudentId s9=new StudentId("mt54",2013,11);
	StudentId s10=new StudentId("m98",2010,10);
	
	tree_map.put(s1,new StudentDetails(s1,"irfan","pasha",23,"cs","mca"));
	tree_map.put(s2,new StudentDetails(s2,"loke","kum",24,"cs","bca"));
	tree_map.put(s3,new StudentDetails(s3,"fan","sha",24,"ca","mca"));
	tree_map.put(s4,new StudentDetails(s4,"irf","pasa",13,"ca","bca"));
	tree_map.put(s5,new StudentDetails(s5,"tgf","aaa",23,"cr","bca"));
	tree_map.put(s6,new StudentDetails(s6,"ikj","bbb",21,"ca","mca"));
	tree_map.put(s7,new StudentDetails(s7,"abc","ccc",28,"ca","cca"));
	tree_map.put(s8,new StudentDetails(s8,"def","ddd",26,"ca","dca"));
	tree_map.put(s9,new StudentDetails(s9,"irth","eee",24,"cs","gca"));
	tree_map.put(s10,new StudentDetails(s10,"kith","fff",21,"cs","rca"));
	
	
	for(Map.Entry<StudentId,StudentDetails> entry : tree_map.entrySet())
	{
		
		  System.out.println(entry.getKey()+""+entry.getValue()); 
		  System.out.println();
    }
	
}
}
