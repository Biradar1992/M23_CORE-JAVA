package com.cg.array;

import java.util.Arrays;

public class UsingArray {
	static void display(int... a)
	{
		//Array.sort defines Array is a class and short is a method which sort the value
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		display(12,6,88,9,23,57,71);

	}

}