package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo
{
	@Test
	void division()
	{
		System.setProperty("Rohit", "Aman");
		// If Assumption is true then printing statement will print otherwise not
		Assumptions.assumeTrue("Aman".equals(System.getProperty("Rohit")));
		System.out.println("Assumption is True");
	}

}