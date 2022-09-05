package com.cg.lamdaexpression;

public class MaxFinderTest {

	public static void main(String[] args) {
		//lambda expression to call method "maximum"
		MaxFinder obj=(a,b)->a>b?a:b;
		System.out.println("The greatest value is "+obj.maximum(87, 90));

	}

}