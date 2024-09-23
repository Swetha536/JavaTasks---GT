package org.sample;
//Child
public class IB extends RBI{
	private void amtInIB() {
		System.out.println("Amount in IB is 15 cr");
 
	}
	public static void main(String[] args) {
		IB i = new IB();
		i.amtToIB();
		i.amtInIB();
		
	}

}