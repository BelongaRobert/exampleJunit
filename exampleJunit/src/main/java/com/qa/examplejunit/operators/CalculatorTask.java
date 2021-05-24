package com.qa.examplejunit.operators;

public class CalculatorTask {

	public static int add(int num1, int num2) {
		return num1 + num2;

	}

	public static int mult(int num1, int num2) {
		return num1 * num2;

	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mod(int num1, int num2) {

		return num1 % num2;
	}

	public static int div(int num1, int num2) {
		int result = 0;

		if (num1 > num2) {
			result = num1 / num2;
		} else {
			System.out.println("Division cannot be formed");
		}
		return result;
	}

	public static int addThree(int num1, int num2, int num3) {
		return num1 + num2 + num3;

	}

}
