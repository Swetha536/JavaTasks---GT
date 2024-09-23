package org.simple;
//Method Overriding
public class CompDetailsMethodOverriding {
	private void compId(int a) {
		System.out.println(a);
		this.compId(101);
 
	}
	private void compname(String name) {
		System.out.println(name);
	    
 
	}
	public static void main(String[] args) {
		CompDetailsMethodOverriding c = new CompDetailsMethodOverriding();
		
		
	}

}
