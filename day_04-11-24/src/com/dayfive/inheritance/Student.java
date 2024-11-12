package com.dayfive.inheritance; 
//creating child class 
public class Student extends Citizen { 
private long rollNo; 
private String collegeName; 
public Student() { 
super(); 
} 
public Student(String name, String aadharNo, String address, long phno, long rollNo, String 
collegeName) { 
super(name, aadharNo, address, phno); //accessing parent class constructor 
this.rollNo = rollNo; 
this.collegeName = collegeName; 
} 
public long getRollNo() { 
return rollNo; 
} 
public void setRollNo(int rollNo) { 
this.rollNo = rollNo; 
} 
public String getCollegeName() { 
return collegeName; 
} 
public void setCollegeName(String collegeName) { 
this.collegeName = collegeName; 
} 
@Override 
public String toString() { 
return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName() 
+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno() 
+ "]"; 
} 
}