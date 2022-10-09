package org.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Exet {
	public static void main(String[] args) {
		// Prime number:
		int a =70;
		boolean b = BigInteger.valueOf(a).isProbablePrime(1);
		System.out.println(b);
		System.out.println("---------------------------------------");
		
		// Reverse of string
		String s = "Prasanna";
		for (int i = s.length()-1; i >=0 ; i--) {
			System.out.print(s.charAt(i));
			
		}
		System.out.println("---------------------------------------");
		//leap year or not
		int year = 2024;
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("Leap Year");
			
		} else {
			System.out.println(" Not a Leap Year");

		}
		System.out.println("---------------------------------------");
		// multiple matrix
		int h [][] = new int [2][2];
		int g [][]= new int [2][2];
		int c[][]= new int [2][2];
		
		h[0][0] = 2;
		h[0][1] = 4;
		h[1][0] = 2;
		h[1][1] = 4;
		g[0][0]= 5;
		g[0][1] = 4;
		g[1][0] = 5;
		g[1][1]= 4;
		
		
		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h.length; j++) {
				 for(int k = 0; k<h.length; k++) {
				c[i][j] = c[i][j]+(h[i][k]*g[k][j]);
				System.out.print(c[i][j] + " ");
			
			}
				 System.out.println();
				}
			
		}
		System.out.println("---------------------------------------");
		// reverse the array
		int[] s1 = new int []{10,50,23,89,23};
		for (int i = s1.length-1; i >=0 ; i--) {
			System.out.print(s1[i]+ " ");
			
		}
		System.out.println();
	
		System.out.println("---------------------------------------");
		//count nuber od letters in string
		String k = "Prasanna";
		System.out.println(k.length());
		System.out.println("---------------------------------------");
	
		Scanner p = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String next = p.next();
		String rev = " ";
		for (int i = next.length()-1; i >=0; i--) {
		
			System.out.print(next.charAt(i));
			
		}
		System.out.println();
//		if (next.equals(rev)) {
//			System.out.println("Palindrome String");
//			
//		} else {
//			System.out.println(" Not a palindrome");
//
//		}
//		System.out.println();
	
	
	


	
	
	}


}
