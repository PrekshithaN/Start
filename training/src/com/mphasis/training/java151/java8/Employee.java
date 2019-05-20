package com.mphasis.training.java151.java8;

import java.util.Comparator;

public class Employee implements Comparable<Employee> 
{
	public String empName;
	public Long salary;
	
	public Employee(String empName, long salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee arg0) {
		
		return 0;
	}

	
	
	

	
	
	
	
	
}
