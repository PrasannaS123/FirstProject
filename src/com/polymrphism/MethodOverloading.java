package com.polymrphism;

public class MethodOverloading {
	public void employeeDetails(String s1,String s2,String s3,long i,String s5,String s6) {
		

	} 
	public void employeeDetails(String d,float f,String d1) {
		
		

	}
	public static void main(String[] args) {
		MethodOverloading b = new MethodOverloading();
		b.employeeDetails("my name is", "Prasanna",  "mobile number is", 6383087278l,"DOB is","31jul2001");
		b.employeeDetails("complted BE degree with", 7.7f, "CGPA");
	}

}