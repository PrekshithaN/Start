package com.mphasis.training.java151.Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sorting 
{
	static List<Product> products = new ArrayList<>();
	public static void main(String[] args) 
	{
		
		
		products.add(new Product(16,"Mi4",61000,"Redmi",34));
		products.add(new Product(19,"fls",12700,"Oppo",34));
		products.add(new Product(11,"vls",45000,"samsung",34));
		products.add(new Product(15,"pnv",20000,"vivo",34));
		
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext())
		{
			Product p = itr.next();
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getBrand()+" "+p.getCost());
		}
		
		
		// Or we can use forEach
		
		System.out.println("using forEach loop");
		products.forEach(m -> 
		System.out.println(m.getPid()+" "+m.getPname()+" "+m.getBrand()+" "+m.getCost()));
		
		//OR we can use enhanced for loop
		
		System.out.println("using enhanced for loop");
		for(Product p:products)
		//for(int i=0;i<10;i++)
		{
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getBrand()+" "+p.getCost());
		}
		
		
		
		System.out.println("after sorting");
		Collections.sort(products);
		for(Product p:products)
		{
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getBrand()+" "+p.getCost());
		}
			
		
		
		//Collections.sort(products);
		// this method can not be used in user defined object
		// so we use comparator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("filters");
		System.out.println("1.Name \n2.Brand \n3.Cost");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
				Collections.sort(products, new ComparatorName());
				
				products.forEach(p -> 
				System.out.println(p.getPid()+" "+p.getPname()+" "+p.getBrand()+" "+p.getCost()));
				break;
			
		case 2:
				Comparator<Product> com1=
				Comparator.comparing(Product::getBrand);
				Collections.sort(products,com1);
				products.forEach(p -> 
				System.out.println(p.getPid()+" "+p.getPname()+" "+p.getBrand()+" "+p.getCost()));
				break;
				
		case 3:
				Comparator<Product> com2=
				Comparator.comparingDouble(Product::getCost);
				Collections.sort(products,com2);
				
				getProduct();
				break;
				
		default:
				System.out.println("list of products");
			

		}
	}
		
	public static void getProduct()
	{
		products.forEach(m -> 
		System.out.println(m.getPid()+" "+m.getPname()+" "+m.getBrand()+" "+m.getCost()));
	}
	

}
