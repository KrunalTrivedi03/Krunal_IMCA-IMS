package ArrayObject;
import java.util.Scanner;

import firstproject.Employee;

public class ArrayofEmployee {
	
	public void CreateArrayOfEmp() {
		Scanner sc = new Scanner(System.in);
		int[] no = new int[12];
		Employee[] emp = new Employee[10];
		
		for(int i=0;i<3;i++)
		{
			emp[i] = new Employee();
		}

		for(int k=0;k<3;k++) {
			System.out.println("Enter Name");
			emp[k].setName(sc.nextLine());
			System.out.println("Enter Your Designation");
			emp[k].setDesignation(sc.nextLine());
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(emp[i]);
		}
		
	}
	
	
	
	

}
