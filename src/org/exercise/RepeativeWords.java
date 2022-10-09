package org.exercise;
import java.util.*;
public class RepeativeWords {

	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner s= new Scanner(System.in);
		String a = s.nextLine();
		
		String[] b = a.split(" ");
		for (String string : b) {
			System.out.println(string);
			
		}
		for (int i = 0; i < b.length; i++) {
			int count=1;
			for (int j = i+1; j < b.length; j++) {
				if (b[1].equals(b[j])) {
					count++;
					b[j] = "0";
					
				}
			}
			if (b[i]!="0" && count>1) {
				System.out.println(b[i]+":"+count);
				
			}
			
			
		}
		

	}

}
