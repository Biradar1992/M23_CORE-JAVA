package com.tns.vector;

import java.util.ArrayList;
import java.util.Vector;

public class ExOnAddAllMethod {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(3);
		arr.add("Method");
		arr.add("Java");
		arr.add(4);
		Vector v=new Vector();
		v.addAll(arr);
		System.out.println(v);

	}

}