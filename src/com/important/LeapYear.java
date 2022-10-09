package com.important;

public class LeapYear {
	public static void main(String[] args) {
		int Year = 2022;
		if (Year%4==0 && Year%100!=0 || Year%400==0)  {
			System.out.println(Year+" is a Leap Year.");
		} else {
			System.out.println(Year+ " is not a Leap Year.");
		}
	}

}
