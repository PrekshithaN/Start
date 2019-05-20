package com.mphasis.training.java151.Collectionss;

import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack<String> s1 = new Stack<>();
		
		s1.add("qwe");
		s1.add("asd");
		s1.add("cede");
		
		System.out.println(s1);
		
		s1.push("2");
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		s1.peek();
		System.out.println(s1);
		
		s1.remove(1);
		System.out.println(s1);
		
		
		
		
		
		
	}
}
