package org.firstassignment;
import java.util.*;
public class IfElse {
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		System.out.println("enter a age");
		byte age = file.nextByte();
		
		
		if (age >= 60) {
			System.out.println("Grandparent");
			}
		else if (age >= 50 ) {
			System.out.println("Grandmother");
			
		}
		else if(age >= 40) {
			System.out.println("Father");
		}
		else if (age >= 30) {
			System.out.println("mother");
		}
		else {
			System.out.println("son");
		}
	}}	
	


	
		
	

	
