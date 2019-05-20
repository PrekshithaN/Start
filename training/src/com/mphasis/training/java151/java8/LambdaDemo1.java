package com.mphasis.training.java151.java8;

interface Inter
{
	public void add(int a, int b);
	
}


public class LambdaDemo1 
{
	
	public static void main(String[] args) 
	{
		Inter i=(a,b) -> System.out.println(a+b);
		i.add(12,34);
		i.add(98,23);
		i.add(12,56);

	}

}
