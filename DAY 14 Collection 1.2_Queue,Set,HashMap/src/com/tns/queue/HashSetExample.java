package com.tns.queue;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add(11);
		s.add(null);
		System.out.println(s);

	}

}