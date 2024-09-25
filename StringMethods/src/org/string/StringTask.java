package org.string;

public class StringTask {
	public static void main(String[] args) {
		String s="swetha";
		
		char charAt = s.charAt(3);
		System.out.println(charAt);
		
		int indexOf = s.indexOf("w");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		int length = s.length();
		System.out.println(length);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains("ha");
		System.out.println(contains);
		
		String trim = s.trim();
		System.out.println(trim);
		
		boolean startsWith = s.startsWith("Sw");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("ha");
		System.out.println(endsWith);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String a="Rohini";
		String b="Malavika";
		String c="rohini";
		
		boolean equals = a.equals(b);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase(c);
		System.out.println(equalsIgnoreCase);
		
		String replace = c.replace("ni", "tha");
		System.out.println(replace);
		
		String replaceAll = b.replaceAll("Malavika", "Prasath");
		System.out.println(replaceAll);
		
		String substring = s.substring(2);
		System.out.println(substring);
		
		String substring2 = a.substring(1, 4);
		System.out.println(substring2);
		
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);			
	}

}
