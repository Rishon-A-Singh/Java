package com.masai;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is:" + this.roll);
		System.out.println("Name is:" + this.marks);
		System.out.println("Marks is:" + this.marks);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll = 996;
		s1.name = "Rishon";
		s1.marks = 99;
		Student s2 = new Student();
		s2.roll = 1;
		s2.name="Someone else";
		s2.marks=100;
		s2.displayStudentDetails();
		s1.displayStudentDetails();
		s1=null;
		s2=null;
		
	}

}
