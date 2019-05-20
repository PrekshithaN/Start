package com.mphasis.training.java151.java8;

import java.util.ArrayList;

public class EmployeeRepository 
{
	static ArrayList<Employee> emp;
	
	public EmployeeRepository()
	{
		emp = new ArrayList<>();
		
		emp.add(new Employee("kavitha", 25000));
		emp.add(new Employee("varunitha", 36000));
		emp.add(new Employee("Nisha", 25000));
		emp.add(new Employee("Mahesha", 55000));
		emp.add(new Employee("prekshitha", 21000));
	}
	
	public static ArrayList<Employee> getEmployeeList()
	{
		return emp;
	}
	
}
