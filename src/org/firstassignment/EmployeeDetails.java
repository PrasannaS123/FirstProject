package org.firstassignment;

public class EmployeeDetails {
     
	public void EmployeeName() {
    	 String s=  "Prasanna";
    	System.out.println("Employee name is" + " " +  s); 
     }
     public void EmployeeAge() {
    	 byte b= 24;
    	 System.out.println("Employee age is" + " " + b);
     }
    	 
     
     public void EmployeeDOB() {
	     String s2= "31july2001";
	     System.out.println("Employee DOB is" + " " + s2);
	     }
     public void EmployeeAdress() {
    	 String s3=  "188,kollukaatumedu,lakkapuram,po(),erode-2";
    	 System.out.println("Employee address is" +" " +  s3);
    }
     
     public void EmployeeMobileNumber() {
    	 long l= 6383087278l;
    	 System.out.println("Employee mobile number is" + " " + l);
     }
     public void Email() {
		String h = "prasannajayanth3107@gmail.com";
		System.out.println("Employee email is" + " " + h);
	}
    
     
    
     public static void main(String[] args) {
    	 EmployeeDetails object= new EmployeeDetails();
         object.EmployeeName();
         object.EmployeeAge();
         object.EmployeeDOB();
         object.EmployeeAdress();
         object.EmployeeMobileNumber();
         object.Email();
     }
		
}   