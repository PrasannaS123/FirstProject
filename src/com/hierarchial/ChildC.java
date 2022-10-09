package com.hierarchial;

public class ChildC extends MainParent {
	public void cash() {
		ChildC y = new ChildC();
		System.out.println("3 lakhs");

	}
	public static void main(String[] args) {
		ChildC care = new ChildC();
		care.loan();
		care.cash();
		
	}

}
