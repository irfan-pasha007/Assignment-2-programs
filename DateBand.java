package com.assignment2.overlappingdates;
import java.time.LocalDate;
public class DateBand
{
LocalDate startdate;
LocalDate enddate;

public DateBand(LocalDate startdate, LocalDate enddate)
{
	super();
	this.startdate = startdate;
	this.enddate = enddate;
}
public DateBand() {}
	LocalDate result_strt_date;
	LocalDate result_end_date;
public DateBand  findOverlappingBand(DateBand db1, DateBand db2)
{
	int startdatediff=db1.startdate.compareTo(db2.startdate);
	int enddatediff=db1.enddate.compareTo(db2.enddate);
	if(startdatediff < 0)
	{
		result_strt_date=db2.startdate;
    	if(enddatediff < 0)
	  {
		result_end_date=db1.enddate;
	 }
	else { 
		result_end_date=db2.enddate;
	 }
	}
	else {
		result_strt_date=db1.startdate;
		if(enddatediff < 0)
		{
	
			result_end_date=db1.enddate;
		}
		else { 
			result_end_date=db2.enddate;
		}
	}
	
	return new DateBand(result_strt_date,result_end_date);
	
}


}
