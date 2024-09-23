package org.simple;
//Method Overloading
public class StudentDetails {
//Here we have to pass argument as different because it shows duplicate error
//Eg: In 1st method if the argument will be like string and int then in the 2nd argument we have to pass like int and string
	private void StudentInfo(String name,int age) {
		System.out.println("Student name is"+name+"\n"+"Student age is"+age);
		
	}
	private void StudentInfo(int a, String s) {
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String[] args) {
		StudentDetails o= new StudentDetails();
		o.StudentInfo("swetha",20);
		o.StudentInfo(2, "prasath");
		
		
	}
}

//private void studentInfo(String name) {
//System.out.println("Student name is"+name);
//}
//private void studentInfo(int age) {
//System.out.println("Student name is"+age);
//}
//private void studentInfo(double percentage) {
//System.out.println("Student name is"+percentage);
//}
//public static void main(String[] args) {
//StudentDetails s = new StudentDetails();
//s.studentInfo("Swetha");
//s.studentInfo(20);
//s.studentInfo(91.6);
//
//
//}
