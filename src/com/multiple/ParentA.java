package com.multiple;

public class ParentA {
	public void bike() {
		ParentA b = new ParentA();
		System.out.println("rx100");
		
}
	public void car() {
		ParentA b1= new ParentA();
		System.out.println("BENZ");
	
		
}
	public static void main(String[] args) {
		ParentA s = new ParentA();
		s.bike();
		s.car();
	}

}
