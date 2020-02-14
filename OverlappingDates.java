package com.assignment2.overlappingdates;

import java.time.LocalDate;
import java.time.Month;

public class OverlappingDates
{
public static void main(String[] args)
{
	DateBand db1=new DateBand(LocalDate.of(2020,Month.JANUARY,1),LocalDate.of(2020,Month.JANUARY,31));
	DateBand db2=new DateBand(LocalDate.of(2020,Month.JANUARY,15),LocalDate.of(2020,Month.FEBRUARY,20));
	DateBand db3=new DateBand();
	
	if(db1.startdate.compareTo(db2.enddate)>0)
	{
		try
		{
		throw new NoOverlappingBandFound("no over lapping dates") ;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	else if(db1.enddate.compareTo(db1.startdate)<0||db2.enddate.compareTo(db2.startdate)<0)
	{
		System.out.println("invalid start and end date");
	}
	else
	{
	DateBand db4=db3.findOverlappingBand(db1,db2);
	System.out.println(db4.startdate);
	System.out.println(db4.enddate);
	}
}


}
