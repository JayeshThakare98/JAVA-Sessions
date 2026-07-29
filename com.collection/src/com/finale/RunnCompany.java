package com.finale;

public class RunnCompany {
public static void main(String[] args) {
	Employee employee = new Employee() ; 
//	employee.dept; we are not able to modify variable 
	Employee employee2 = new Employee(01,"Babu bhaiya", 40000, "manager", "FInance");
	System.out.println(employee2.companyName);
	System.out.println(employee2.empID);
	System.out.println(employee2.name);
	System.out.println(employee2.salery);
	System.out.println(employee2.designation);
	System.out.println(employee2.dept);

	
}
}
