package com.mphasis.training.java151.Collectionss;

import java.util.Comparator;

public class ComparatorName implements Comparator<Product>
{

	@Override
	public int compare(Product o1,Product o2) 
	{
		// this is valid only for int and String type
		return o1.getPname().compareTo(o2.getPname());
	}

	

}
