package com.mphasis.training.java151.Collectionss;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableSorting 
{
	public static void main(String[] args) 
	{
		TreeSet<Product> products = new TreeSet<>();
		
		products.add(new Product(19,"MI5",10100,"Lyf",76));
		products.add(new Product(10,"Mi4",67000,"Redmi",39));
		products.add(new Product(17,"fls",87000,"oppo",64));
		products.add(new Product(15,"vls",7000,"samsung",56));
		products.add(new Product(16,"pnv",15000,"vivo",31));
		
		/*Iterator<Product> itr = products.iterator();
		while(itr.hasNext())
		{
			Product p = itr.next();
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getBrand()+" "+p.getCost());
		}*/
		
		
		// Or we can use forEach
		products.forEach(m -> 
		System.out.println(m.getPid()+" "+m.getPname()+" "+m.getBrand()+" "+m.getCost()));
			
		
		
	}
	
}
