package com.mphasis.training.java151.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaCollection 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(32);
		a1.add(23);
		a1.add(45);
		
		System.out.println(a1);
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(a1,c);
		System.out.println(a1);
		
		
		//-------------------------------------------------------------------------------
		
		//external iteration
		for(int i:a1)
		{
			System.out.println(i);
			
		}
		
		//internal iteration
		
		//a1.forEach(System.out::println);
		a1.forEach(i->System.out.println(i));
		
		// OR
		
		/*Consumer<Integer> consumer =new Consumer<Integer>()
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		};*/
		
		//-------------------------------------------------------------------------------
		
		// writing method and passing
		
		a1.forEach(i->doubleIt(i));
		//or
		a1.forEach(LambdaCollection::doubleIt);
		
		
		
	}

	public static void doubleIt(int i) 
	{
		System.out.println(i*2);
	}
	
}
