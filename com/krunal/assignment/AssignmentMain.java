package com.krunal.assignment;

import com.krunal.assignment.employees.Developer;
import com.krunal.assignment.employees.Manager;
import com.krunal.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager ma = new Manager("Krunal Trivedi",8,50000,"Java");
		Developer dp = new Developer("Aryan Prajapati",22,45000,"Full-Stack");
		EmployeeUtilities eu = new EmployeeUtilities();
		
		eu.display(ma);
		System.out.println("\n");
		eu.display(dp);
		
	}

}
