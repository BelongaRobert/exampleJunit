package com.qa.examplejunit.operators;

import org.junit.jupiter.api.Test;

public class CalculatorTaskTest {

	@Test
	public void addTest() {
		double result = CalculatorTask.add(12, 3);
	}

}
