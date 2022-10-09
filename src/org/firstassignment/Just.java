package org.firstassignment;

public class Just {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if (i==1 & j==2) {
					break;
				}
				if (i==3 & j==2) {
					break;
					
				}
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
}
}
