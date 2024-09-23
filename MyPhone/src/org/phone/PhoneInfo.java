package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Realme6");
		 

	}
	private void phoneImeiNum() {
		System.out.println("123456789876321");
		 
	}
	private void camera() {
		System.out.println("Samsung 64MP GW1 sensor");
	 

	}
	private void storage() {
		System.out.println("64.0");
		
		 

	}
	private void osName() {
		System.out.println("Android 10");

	}
	public static void main(String[] args) {
		PhoneInfo P = new PhoneInfo();
		P.phoneName();
		P.phoneImeiNum();
		P.camera();
		P.storage();
		P.osName();
	}
}
