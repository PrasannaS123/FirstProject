package com.hierarchial;

public class ChildB extends MainParent {
	public void money() {
		ChildB j = new ChildB();
		System.out.println("2 lakhs");
}
	public static void main(String[] args) {
		ChildB web = new ChildB();
		web.loan();
		web.money();
	}

}
