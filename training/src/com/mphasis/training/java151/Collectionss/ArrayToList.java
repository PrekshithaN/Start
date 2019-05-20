package com.mphasis.training.java151.Collectionss;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList 
{
	public static void main(String[] args)
	{
		Integer[] arr= {1,2,4,3};
		
		List<Integer> li = Arrays.asList(arr);
		
		
		System.out.println(arr);
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
		Collections.sort(li ,Collections.reverseOrder());
		System.out.println(li);
		
		/*li.remove(1);
		System.out.println(li);*/
		
	}
}

