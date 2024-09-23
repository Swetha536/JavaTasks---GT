package org.base;

public class Employee extends Company{
	private void empID() {
		 System.out.println("E333");

	}
	private void empName() {
		 System.out.println("Swetha");

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empID();
		e.empName();
		e.compId();
		e.compName();
		e.staffId();
	}

}