package org.firstassignment;

public class Volume {
	
	 public  void volume(int l,int b,int h) {
		 int v = l*b*h;
		 System.out.println("volume is " +v);
		 
		 
		}
	 public static void main(String[] args) {
	Volume h = new Volume();
	
	h.volume(20, 3, 10);
	
	System.out.println();
	
	
	}
	 

}
