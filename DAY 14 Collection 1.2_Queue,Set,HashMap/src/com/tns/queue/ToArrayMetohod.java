package com.tns.queue;

import java.util.LinkedHashSet;

public class ToArrayMetohod {

	public static void main(String[] args) {
		 LinkedHashSet<String> set=new LinkedHashSet<String>();
		 set.add("Good");
		 set.add("for");
		 set.add("Helth");
		 System.out.println(set);
		 Object[] arr =set.toArray();
		 for(int j=0; j<arr.length; j++)
			 System.out.println();
	}

}