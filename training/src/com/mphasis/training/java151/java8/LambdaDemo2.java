package com.mphasis.training.java151.java8;

import java.util.function.Function;
import java.util.function.Predicate;


public class LambdaDemo2 
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f1 = n->n*n;// wen we want to get output
		System.out.println("square of "+f1.apply(78));
		System.out.println("square of "+f1.apply(8));
		System.out.println("square of "+f1.apply(38));
		
		Predicate<Integer> f2 = n->(n%2)==0; // wen we want to get true r false
		System.out.println("the number is even "+f2.test(12));
		System.out.println("the number is even "+f2.test(121));
	
		//Function and predicate are functional interfaces
		
	}
	
}
