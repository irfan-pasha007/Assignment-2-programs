package com.ito.assignment2.Student;

import java.util.*;

public class StudentId implements Comparator<StudentId>
{
	
private String deptcode;
private int year;
private int id;

public StudentId() {
	super();
}
public String getDeptcode() {
	return deptcode;
}
public void setDeptcode(String deptcode) {
	this.deptcode = deptcode;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public StudentId(String deptcode, int year, int id) {
	super();
	this.deptcode = deptcode;
	this.year = year;
	this.id = id;
}
@Override
public String toString() {
	return "StudentId [deptcode=" + deptcode + ", year=" + year + ", id=" + id + "]";
}
@Override
public int compare(StudentId o1, StudentId o2) 
{
	if(o1.getDeptcode().equals(o2.getDeptcode()))
	{
		if(o1.getYear()==o2.getYear())
		{
			return o1.getId()-o2.getId();
		}
		else
		{
			return o1.getYear()-o2.getYear();
		}
	}
	else
	return o1.getDeptcode().compareTo(o2.getDeptcode()); 
	
}

}
