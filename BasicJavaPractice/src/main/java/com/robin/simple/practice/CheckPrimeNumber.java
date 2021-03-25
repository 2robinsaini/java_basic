package com.robin.simple.practice;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int i = 17;
		boolean isPrimeNumber = checkIsPrimeNumber(i);

		System.out.println("is " + i + "  Prime number: " + isPrimeNumber);
	}

	private static boolean checkIsPrimeNumber(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
