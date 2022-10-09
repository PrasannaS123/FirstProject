package org.firstassignment;

public class Child implements ParentA {

	@Override
	public void name() {
		System.out.println("jayanth");
		
	}

	@Override
	public void age() {
		System.out.println("20");
		
		
	}

	@Override
	public void fathername() {
		System.out.println("santhakumar");
		
	}
	public static void main(String[] args) {
		Child b = new Child();
		b.name();
		b.age();
		b.fathername();
		
		
	}

}
