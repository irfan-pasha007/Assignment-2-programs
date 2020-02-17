/*2. WAP to read a file and print distinct words in the file and number of occurrences of it. 
	for example, if below is the content of the file, 
		"I am Java. I am a programming language. I run in millions of computers"
	the output should be. 
		I 				3
		am 				2
		java			1
		a				1
		programming		1
		language		1
		run				1
		in				1
		millions		1
		of 				1
		computers		1*/
package com.ito.assignment2.occurencefile;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class DistinctWordsAndOccurenceOfIt 
{

      String[] str0;
	 public static void main(String[] args) throws Exception
	 { 
		 DistinctWordsAndOccurenceOfIt d1=new DistinctWordsAndOccurenceOfIt();
		 
	LinkedHashMap<String,Integer> h1=d1.m1();
	 for (Entry<String, Integer> entry : h1.entrySet()) { 
         System.out.println(entry.getKey() + " \t" + entry.getValue()); 
     } 
	        }
	 
	 
	 public LinkedHashMap<String,Integer> m1() throws IOException 
	 {
		 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Irfan Pasha\\Desktop\\samocc.txt"));
		    String str= br.readLine();
		    String newstr="";
		    for (int i = 0; i < str.length(); i++)
		    {
				if(str.charAt(i)>=65&&str.charAt(i)<=92||str.charAt(i)>=97&&str.charAt(i)<=122||str.charAt(i)==32)
				{
				newstr=newstr+str.charAt(i);	
				}
			}
		String[] str1=newstr.split(" ");
	LinkedHashMap<String,Integer> h=new LinkedHashMap<String,Integer>();
		for (String i:str1)
		{
		if(h.containsKey(i))
		{
			h.put(i, h.get(i)+1);
		}
		else
		{
			h.put(i, 1);
		}
		
		}
		return h;
	    }
}