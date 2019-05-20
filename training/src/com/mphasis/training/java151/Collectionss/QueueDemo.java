package com.mphasis.training.java151.Collectionss;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{
	public static void main(String[] args) 
	{
		Queue<String> q = new PriorityQueue<>();
		
		q.add("sonu");
		q.add("monu");
		q.add("tinu");
		q.add("samanvi");
		
		System.out.println(q.peek());// head of the queue
		System.out.println(q);
		System.out.println(q.poll());// retrive and remove
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(21);
		dq.add(7);
		dq.add(60);
		System.out.println(dq);
		
		dq.addFirst(73);
		System.out.println(dq);
		
		dq.addLast(3);
		System.out.println(dq);
		
		
		dq.remove();
		System.out.println(dq);
		
		dq.removeLast();
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		
		dq.remove(7);
		System.out.println(dq);
		
		
		
		
	}
}
