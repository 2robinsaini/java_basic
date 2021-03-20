package com.robin.simple.practice;

public class FibonacciSeries {

	public static void main(String[] args) {

		int i = 25;

		printFibonacciSeriesWithOutRecursion(i);

		int val = printFibonacciSeriesWithRecursion(i);

		System.out.println("\nvalue is " + val);

	}

	private static void printFibonacciSeriesWithOutRecursion(int num) {

		//System.out.print("0, 1, ");
		int prev1 = 1;
		int prev2 = 0;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum = prev1 + prev2;
			prev2 = prev1;
			prev1 = sum;
			System.out.print(sum + ", ");
		}

	}

	private static int printFibonacciSeriesWithRecursion(int num) {

		if (num <= 1) {
			return num;
		} else {
			return printFibonacciSeriesWithRecursion(num - 1) + printFibonacciSeriesWithRecursion(num - 2);
		}

	}

}
