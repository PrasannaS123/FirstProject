package com.multilevel;

public class Parent extends GrandParent {
	public void snacks() {
		Parent u = new Parent();
			System.out.println("chips");

	}
	public void food() {
		Parent y = new Parent();
		System.out.println("chickenbiriyani");
	}
	public static void main(String[] args) {
		Parent n = new Parent();
		n.food();
		n.snacks();
		n.mobile();
		
	}

}
