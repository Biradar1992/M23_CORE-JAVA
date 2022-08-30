package com.cg.exceptionhandling;


public class NullPointerExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String str=null;
        try
        {
        	str.equals("JAVA");
        }
        catch(Exception e)
        {
        	//ALLOCATED ANEW VALUE TO STR AS "JAVA"
        	str=new String("JAVA");
        	
        	System.out.println(str.equals("JAVA"));
        }
	}

}