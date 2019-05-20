package com.mphasis.training.java151.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCollections2 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l= new ArrayList<>();
		l.add(32);
		l.add(23);
		l.add(45);
		
		
		System.out.println(l);
		
		Collections.sort(l);
		l.stream().forEach(System.out::println);
		
		List<Integer> l2=l.stream().filter(i->(i%2)==0).collect(Collectors.toList());
		System.out.println("after filtering"+l2);
	}
}
