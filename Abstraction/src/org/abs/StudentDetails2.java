package org.abs;

public  class StudentDetails2 extends StudentDetails {
	@Override
	public void sDept() {
		System.out.println("BTech IT");
		 
		
	}
	
	public static void main(String[] args) {
		StudentDetails2 s = new StudentDetails2();
		s.sDept();
		s.sId();
		s.sName();
	}

	
	

}
