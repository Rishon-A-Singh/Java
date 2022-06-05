package com.day5Q1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employrrId) {
		this.employeeId = employrrId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
//	public void setNetSalary(double netSalary) {
//		this.netSalary = netSalary;
//	}
	
	Employee(){
		
	}
	
	public void calculateNetSalary(int pfpercentage) {
		
		double pf = (double)((pfpercentage/100)*salary);
		System.out.println("pf is" + pf);
		this.netSalary = salary - pf;
	}
	

	
	
}
