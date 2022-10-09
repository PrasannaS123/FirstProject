package org.firstassignment;

public class Matrixes {
	public static void main(String[] args) {
		byte b[][]= new byte[2][2];
		byte a[][] = new byte[2][2];
		byte c[][] = new byte [2][2];
		
		a[0][0] = 4;
		a[0][1] = 5;
		a[1][0]= 6;
		a[1][1] = 5;
		
		b[0][0] = 3;
		b[0][1] = 5;
		b[1][0] = 2;
		b[1][1] = 3;
	for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					c[i][j] = (byte) (c[i][j]+(a[i][k]*b[k][j]));
				}
				
				
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		
		}
	}


