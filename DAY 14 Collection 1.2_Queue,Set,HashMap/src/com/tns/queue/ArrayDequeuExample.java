package com.tns.queue;

import java.util.ArrayDeque;

public class ArrayDequeuExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Hello");
		System.out.println(a);
		a.addFirst(12);
		a.addLast("world");
		System.out.println(a);
		

	}

}