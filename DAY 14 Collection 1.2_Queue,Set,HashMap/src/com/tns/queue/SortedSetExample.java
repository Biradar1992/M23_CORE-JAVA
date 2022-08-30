package com.tns.queue;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(45);
		s.add(35);
		s.add(25);
		System.out.println(s);
		

	}

}