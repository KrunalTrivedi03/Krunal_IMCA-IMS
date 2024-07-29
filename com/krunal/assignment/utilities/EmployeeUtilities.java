package com.krunal.assignment.utilities;

import com.krunal.assignment.employees.Employee;


public class EmployeeUtilities {

	public void display (Employee employee) {
		
		System.out.println("Name: " +employee.getEname());
		System.out.println("Employee ID: " +employee.getEmpid());
			System.out.println("Salary: " +employee.getSalary());
			
	}
}