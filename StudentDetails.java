package com.ito.assignment2.Student;

public class StudentDetails 
{
private StudentId id;
private String 	firstName; 	
private String	lastName;	
private int	age;
private String	deptName;	
private String	courseName;
public StudentDetails(StudentId id, String firstName, String lastName, int age, String deptName, String courseName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.deptName = deptName;
	this.courseName = courseName;
}
@Override
public String toString()
{
	return "StudentDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ ", deptName=" + deptName + ", courseName=" + courseName + "]";
}
public StudentId getId() {
	return id;
}
public void setId(StudentId id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}	

}
