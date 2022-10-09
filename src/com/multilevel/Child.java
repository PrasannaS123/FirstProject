package com.multilevel;

public class Child extends Parent {
	public void toy() {
		Child p = new Child();
		System.out.println("bike");

		}
	public void chocolate() {
		Child b = new Child();
		System.out.println("5star");
	}
	public void paste() {
		Child m = new Child();
		System.out.println("colgate");
	}
	public static void main(String[] args) {
		Child red = new Child();
		red.paste();
		red.chocolate();
		red.toy();
		red.food();
		red.snacks();
	}

}
