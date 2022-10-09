package org.emp;

import org.company.Company;

public class Employee extends Company {
	public void empName() {
		String d = "Prasanna";
		System.out.println("empName is" +" " + d);
	}
	public static void main(String[] args) {
		Employee name = new Employee();
		name.empName();
		name.companyName();
		name.clientName();
		name.projectName();
	
	}

}
