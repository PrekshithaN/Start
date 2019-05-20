package com.mphasis.training.java151.Collectionss;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BasiscProgram 
{

	public static void main(String[] args) 
	{
		List<Integer> al1 = new ArrayList<>();
		
		al1.add(4);
		al1.add(10);
		al1.add(2);
		al1.add(2,67);
		
		System.out.println(al1);
		
		Set<Integer> ts1 = new TreeSet<>();
		ts1.add(0);
		ts1.add(228);
		//ts1.add(3,87);
		ts1.add(76);
		
		System.out.println("treeset "+ts1);
		
		//ts1.retainAll(al1);
		//System.out.println(ts1);
		
		//ts1.clear();// to remove all the values
		//System.out.println(ts1);
		
		ts1.contains(0);// to check if object is there or not
		System.out.println(ts1);

	}

}
