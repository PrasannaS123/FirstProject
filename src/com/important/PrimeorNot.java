package com.important;

public class PrimeorNot {
public static void main(String[] args) {
	int n = 13;
	boolean prime = true;
	
	for (int i = 2; i < n; i++) {
		if (n%i==0) {
			prime = false;
			break;
			
		}
	}
	if(prime==true) {
		System.out.println("Prime Number");
	}
	else {
		System.out.println("Not a prime number");
	}
	}
}
