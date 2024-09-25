package org.scanner;
import java.util.Scanner;

public class ScannerTasks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String next = sc.next();
 		System.out.println(next);
 		
 		String a = sc.nextLine();
 		System.out.println(a);
 		
 		int b = sc.nextInt();
 		System.out.println(b);
 		
 		
 		boolean d = sc.nextBoolean();
 		System.out.println(d);
		
		short e = sc.nextShort();
		System.out.println(e);
		
		long f = sc.nextLong();
		System.out.println(f);
		
		byte g = sc.nextByte();
		System.out.println(g);
		
		double h = sc.nextDouble();
		System.out.println(h);		
	}	
}
