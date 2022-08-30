package com.tns.vector;

import java.util.Stack;

public class ExOnStack {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.push(30);
		s.pop();
		System.out.println(s);

	}

}