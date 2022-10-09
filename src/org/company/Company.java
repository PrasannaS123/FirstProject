package org.company;

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		String j ="TCS";
		System.out.println("companyName is " + " " + j);
	}
	public static void main(String[] args) {
		Company name = new Company();
		name.companyName();
		name.clientName();
		name.projectName();
	}

}
