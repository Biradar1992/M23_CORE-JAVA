package com.tns.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		int i;
		Queue<Integer>q=new PriorityQueue<Integer>();
		for(i=5; i>0; i--)
		{
			q.add(i);
		}
		System.out.println(q);

	}

}