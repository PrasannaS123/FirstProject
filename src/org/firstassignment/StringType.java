package org.firstassignment;

public class StringType {
	 public static void main(String[] args) {
		String s= "Prasanna";
	   String s1= "Prasanna";
		
		System.out.println("ImMutable String");
	System.out.println(s);
		System.out.println(System.identityHashCode(s));
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));

	String s2=s.concat(s1);
		System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
		
 }
		
	 public static void main1(String[] args) {

			StringBuffer hi= new StringBuffer("Kalai");
			StringBuffer hy= new StringBuffer("Kalai");
			System.out.println("Mutuable String");
			System.out.println(hi);
			System.out.println(System.identityHashCode(hi));
			System.out.println(hy);
			System.out.println(System.identityHashCode(hy));
			
			hi.append(hy);
			System.out.println(hi);
			System.out.println(System.identityHashCode(hi));
		

	
	}
}
	
		
		
		
		
		
		
		

