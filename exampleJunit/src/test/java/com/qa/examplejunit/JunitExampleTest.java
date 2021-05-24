package com.qa.examplejunit;

//@Test
// @BeforeAll, @AfterAll - runs at start and end - once each, 
// 		^these methods must be static!^
// @BeforeEach, @AfterEach - runs before and after each @Test

//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {

	
	@BeforeAll
	public static void start1() {
	System.out.println("Start of Tests");
}
	
//	@BeforeEach
//	public void beforeEach() {
//		System.out.println("TEST STARTING");
//	}
//
//	@AfterEach
//	public void afterEach() {
//		System.out.println("TEST ENDING");
//	}
	
	@Test
	public void Test1() {
		System.out.println("Hello World - 1");
	}
	
	@Test
	public void Test2() {
	System.out.println("Hello World - 2");
}
	
	@AfterAll
	public static void start2() {
	System.out.println("End of Tests");
}

}