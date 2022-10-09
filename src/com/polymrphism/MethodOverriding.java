package com.polymrphism;

public class MethodOverriding extends MethodOverloading {
	@Override
	public void employeeDetails(String s1, String s2, String s3, long i, String s5, String s6) {
		System.out.println("My name is" + " " + "Prasanna " + "\n" + "mobile number is" + " " + 6383087278l + "\n" 
				+ "DOB is" + " " + "31jul2001");
		super.employeeDetails(s1, s2, s3, i, s5, s6);
	}
	@Override
	public void employeeDetails(String d, float f, String d1) {
		System.out.println("Complted BE degree with" +" " +7.7f + " "+  "CGPA" );
		super.employeeDetails(d, f, d1);
	}
	public static void main(String[] args) {
		MethodOverriding g = new MethodOverriding();
		g.employeeDetails("my name is", "Prasanna", "mobile number is", 6383087278l, "DOB is","31jul2001");
		g.employeeDetails("Completed BE degree", 7.7f, "CGPA");
		
	}
	
	}


  