package org.firstassignment;

public class StringFunction {
	public static void main(String[] args) {
		String s = "Prasanna Mechanical Engineering";
		
		int length = s.length();
		System.out.println("Length:"+length);
		
		boolean equals = s.equals("prasanna mechanical enginnering");
		System.out.println("Equals:"+equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("rasanna mechanical engineering");
		System.out.println("equalsIgnoreCase:"+equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println("UpperCase:"+upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println("LowerCase:"+lowerCase);
		
		boolean startsWith = s.startsWith("ra");
		System.out.println("startsWith:"+startsWith);
		
		boolean endsWith = s.endsWith("ring");
		System.out.println("endsWith:"+endsWith);
		
		boolean contains = s.contains("ingg");
		System.out.println("contains:"+contains);
		
		int indexOf = s.indexOf("P");
		System.out.println("indexOf:"+indexOf);
		
		int lastIndexOf = s.lastIndexOf("n");
		System.out.println("lastIndexOf:"+lastIndexOf);
		
		char charAt = s.charAt(24);
		System.out.println("charAt:"+charAt);
		
		String replace = s.replace("Mechanical","Civil");
		System.out.println("replace:"+replace);
		
		String substring = s.substring(15);
		System.out.println("substring:"+substring);
		
		CharSequence subSequence = s.subSequence(5,31);
		System.out.println("subSequence:"+subSequence);
		
		boolean empty = s.isEmpty();
		System.out.println("empty:"+empty);
		
		String concat = s.concat(" NCT");
		System.out.println("concat:"+concat);
		
		String trim = s.trim();
		System.out.println("trim:"+trim);
		
		
		
		
	
	}
	
}
