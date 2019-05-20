package com.mphasis.training.java151.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class EmployeeDemo1 
{
	public static void main(String[] args) 
	{
		EmployeeRepository e = new EmployeeRepository();
		ArrayList<Employee> emp = EmployeeRepository.getEmployeeList();
		
		emp.forEach(e1 -> System.out.println(e1.getEmpName()+" "+e1.getSalary()));
		
		
		//----------------------------------------------------------------
		//incrementing salary of all employees
		System.out.println("after increment salary");
		
		BiConsumer<Employee, Integer> bc=(ee,i)->ee.salary=ee.salary+i;
		for(Employee ee:emp)
		{
			bc.accept(ee, 20);
		}
		
		emp.forEach(e1->System.out.println(e1.getEmpName()+" "+e1.getSalary()));
		
		//----------------------------------------------------------------
		//Sorting based on names
		System.out.println("after sorting");
		Comparator<Employee> c1=(o1,o2)->o1.getEmpName().compareTo(o2.getEmpName());
		
		Collections.sort(emp, c1);
		
		emp.forEach(e1->System.out.println(e1.getEmpName()+" "+e1.getSalary()));
		
		//-----------------------------------------------------------------
		//
		System.out.println("even length names");
		
		Predicate<Employee> p1 = p->(p.getEmpName().length()%2) == 0;//&& p.getSalary()>36000;
		//Predicate<Employee> p1 = p->(p.getEmpName().length()%2) == 0 && p.getSalary()>36000;
		
		for(Employee p:emp)
		{
			if(p1.test(p))
			{
				System.out.println(p.getEmpName()+" "+p.getSalary());
			}
		}
		
	}
}
