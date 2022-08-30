package com.cg.exceptionhandling;

public class FinallyDemo {
	public static void print(int[] arr) 
	{
        System.out.println(arr[3]);
        System.out.println("Fourth element successfully displayed!");
	}
        

	public static void main(String[] args) 
	{
		    System.out.println("First line");
	        System.out.println("Second line");
	        try
	        {
	          int[] myIntArray = new int[]{1, 2, 3};
	          print(myIntArray);
	        
	        }
	        catch(Exception e1)
	        {
	        	System.out.println(e1);
	        }
            finally
            {
            	System.out.println("Finally block is always executed");
            }
	}

}