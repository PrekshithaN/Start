package com.mphasis.training.java151.java8;

class Sample
{
	Sample(String s)
	{
		System.out.println("value of s is "+s);
	}
}

interface interf
{
	public Sample get(String s);
}


public class ObjectCreationForFI 
{
	public static void main(String[] args) 
	{ 
		
		//Sample s = new Sample("varu");
		
		interf i=Sample::new;
		
		i.get("Shwetha");
		i.get("arun");
		
	}
}
