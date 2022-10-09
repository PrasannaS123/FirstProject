package org.firstassignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		
		Set<String> web = new TreeSet<>();
		web.add("Hi,");
		web.add("I am");
		web.add("using");
		web.add("Whatsapp.");
		
		
		System.out.println(web);
		
		for (String string : web) {
			System.out.println(string);
			
		}

}
}
