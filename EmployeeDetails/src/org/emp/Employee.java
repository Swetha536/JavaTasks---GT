package org.emp;

public class Employee{
	private void empId() {
		 System.out.println("E123");
	}
	private void empName() {
		 System.out.println("Swetha");

	}
	private void empDob() {
		 System.out.println("05-03-2024");

	}
	private void empPhone() {
		 System.out.println("1234567890");

	}
	private void empEmail() {
		 System.out.println("swetha@gmail.com");

	}
	private void empAddress() {
		 System.out.println("ABC");

	}
	public static void main(String[] args) {
		Employee s = new Employee();
		s.empId();
		s.empName();
		s.empDob();
		s.empPhone();
		s.empEmail();
		s.empAddress();
	}
}
