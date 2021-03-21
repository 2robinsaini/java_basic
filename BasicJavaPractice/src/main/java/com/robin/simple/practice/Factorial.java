package com.robin.simple.practice;

public class Factorial {

	public static void main(String[] args) {

		int input = 0;

		int factorialValue1 = calculateFact(input);
		int factorialValue2 = calculateFactUsingRecursion(input);

		System.out.println("Factorial of " + input + " is " + factorialValue1);
		System.out.println("Factorial of " + input + " is(By Recursion) " + factorialValue2);

	}

	private static int calculateFact(int input) {

		if (input == 0 || input == 1) {
			return 1;
		}
		int multiplyValue = 1;
		for (int i = input; i >= 2; i--) {
			multiplyValue = multiplyValue * i;
		}

		return multiplyValue;
	}

	private static int calculateFactUsingRecursion(int input) {

		if (input == 0 || input == 1) {
			return 1;
		} else {
			return input * calculateFactUsingRecursion(input - 1);
		}

	}

}
