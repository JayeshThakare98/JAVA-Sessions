package com.finale;

public class Employee {
	int empID ; 
	String name ; 
	double salery ;
	String designation ; 
	String dept ;
	
	final String companyName ="laxumi cheat fund";
	
	public Employee(int empID, String name, double salery, String designation, String dept) {
		super();
		this.empID = empID;
		this.name = name;
		this.salery = salery;
		this.designation = designation;
		this.dept = dept;
	}

	public Employee() {
		super();
	}
	

}

