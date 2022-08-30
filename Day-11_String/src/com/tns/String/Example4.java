package com.tns.String;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		String str="Dhoni";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		if(str.equals(str1))
		{
			System.out.println("Matching");
		}
		else 
		{
			System.out.println("Not matching");
		}

	}

}