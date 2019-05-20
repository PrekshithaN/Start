package com.mphasis.training.java151.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredefinedFI 
{
	public static void main(String[] args) 
	{
		int[] x = {0,5,10,15,25,30,35};
		
		//Predicate
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>10;
		for(int x1:x)
		{
			if(p1.and(p2).test(x1))
			{
				System.out.println(x1);
			}
		}
		
		//BiPredicate
		BiPredicate<Integer,Integer> 
		bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(10,20));
		
		List<Integer> list=Arrays.asList(12,23,18,30,98,76);
		
		/*int result=0;
		for(int i:list)
		{
			result = result+i*2;
		}
		System.out.println(result);*/
		
		
		
		//more efficient code
		System.out.println(list.stream().map(t->t*2).reduce(0,(t,u)->t+u));
		
		
		//less efficient code
		Function<Integer,Integer> f1=i->i*2;
		BinaryOperator<Integer> bo = (sum,i)->sum+i;
		Stream<Integer> st =list.stream();
		Stream<Integer> st1=st.map(f1);
		System.out.println(st1.reduce(0,bo));
		
		
		//method reference
		System.out.println(
							list.stream().
							map(t->t*2).
							reduce(0, Integer::sum)
							);
		
		//-----------------------------------------------------------
		//sum of all the num in list which are divisible by 3
		System.out.println(list.stream()
							.filter(i->i%3==0)
							.reduce(1,(c,e)->c*e));
		
		// normal method
		
		
		}
	
	}

