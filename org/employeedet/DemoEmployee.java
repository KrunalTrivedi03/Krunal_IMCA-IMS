package org.employeedet;

import org.employeemanagement.Designation;
import org.employeemanagement.Employee;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Designation desg = new Designation();
		desg.setDesignation("Developer");
		desg.setDescription("Full-Stack");
		
		Employee em = new Employee();
		em.setEname("Krunal Trivedi");
		em.setDesignation(desg);
		
		System.out.println(desg);
		System.out.println(em);
		
	}

}