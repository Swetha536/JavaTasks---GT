package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("ABC Company");

	}
	private void companyId() {
		System.out.println("C123");
		 

	}
	private void companyAddress() {
		System.out.println("12 ,RKV Street");
	 
	}
	public static void main(String[] args) {
		CompanyInfo C = new CompanyInfo();
		C.companyName();
		C.companyId();
		C.companyAddress();
	}

}
