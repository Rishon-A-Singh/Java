package com.day5Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		e1.setSalary(200);
		e1.setEmployeeName("Rishon");
		e1.setEmployeeId(4);
		e1.calculateNetSalary(10);
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getSalary());
		System.out.println("net salary:"+e1.getNetSalary());
		System.out.println(getEmployeeDetails());
	}
	
	public static Employee getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		
		Employee e1 = new Employee(); 
		//I am not able to access e1 in this method without making a new object 
		
		System.out.println("enter employee id");
		int id = scanner.nextInt();
		e1.setEmployeeId(id);
		System.out.println("enter employee name");
		String name =scanner.next();
		e1.setEmployeeName(name);
		System.out.println("enter employee salary");
		int salary = scanner.nextInt();
		e1.setSalary(salary);
		
		
		
		return e1;		
	}
	
	public static int getPFPercentage() {
		Scanner scanner = new Scanner(System.in);
		
		return 7;
//		e1.setEmployeeId(3);
	}
}
