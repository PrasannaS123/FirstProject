package com.abstraction;

public class Child extends ParentA{
	@Override
	public void mothername() {
		System.out.println("jayalakshmi");
	}
	public static void main(String[] args) {
		Child b = new Child();
		b.name();
		b.age();
		b.fathername();
		b.mothername();
		
	}

}
