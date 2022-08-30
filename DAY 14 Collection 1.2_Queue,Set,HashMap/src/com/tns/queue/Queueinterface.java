package com.tns.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueinterface {

	public static void main(String[] args) {
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.add(12);
		System.out.println(q);

	}

}