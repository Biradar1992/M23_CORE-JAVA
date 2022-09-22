package com.cg.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo 
{
    @Test
    public void display()
    {
    	int result=5;
    	int expected=5;
    	assertEquals(result,expected);
    }
}
