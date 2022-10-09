package org.firstassignment;
import java.util.*;

public class ListDemo{
	public static void main(String[] args) {
		
		List <Object> a= new LinkedList<>();
		a.add("Prasanna");
		a.add("Mechanical Engineering");
		a.add("732118114021");
		a.add("NCT");
	System.out.println(a);
	
	for (Object object : a) {
		System.out.println(object);
		
	}
	
	
		
	}
}

