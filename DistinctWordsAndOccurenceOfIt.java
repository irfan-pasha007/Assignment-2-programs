
package com.ito.assignment2.occurencefile;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class DistinctWordsAndOccurenceOfIt 
{
	 public static void main(String[] args) throws Exception
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
	 for (Entry<String, Integer> entry : h.entrySet()) { 
         System.out.println(entry.getKey() + " \t" + entry.getValue()); 
     } 
	        }
	    }
