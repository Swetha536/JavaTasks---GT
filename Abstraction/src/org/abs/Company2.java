package org.abs;

public class Company2 implements Company1 {
	public void CompId() {
		System.out.println("123");
	}
	public void compName() {
		System.out.println("CTS");
	}
	public void compLocation() {
		System.out.println("Coimbatore");
	}
	public static void main(String[] args) {
		Company2 c = new Company2();
		c.CompId();
		c.compName();
		c.compLocation();
		
	}

}
