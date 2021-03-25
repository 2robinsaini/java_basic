package com.robin.simple.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 1, 2, 5 };
		
		System.out.println(Arrays.toString(a));
		int[] a2 = removeDuplicate(a);
		System.out.println(Arrays.toString(a2));

		int value = 12121;
		boolean isIntPalindrom = checkForIntegerPalindrom(value);
		System.out.println("Is " + value + " Integer palindrom:    " + isIntPalindrom);

		String name = "Levellevel";
		boolean isPalindrom = checkForStringPalindrom(name);
		System.out.println("Is " + name + " palindrom:    " + isPalindrom);

		int i = 7;
		boolean isPrime = checkForPrime(i);
		System.out.println(isPrime);

		int f = fibonacci(8);
		System.out.println(f);

	}

	private static int[] removeDuplicate(int[] a) {

		String s = "";

		int c = 0;
		int un = 0;
		for (int i : a) {
			if (!s.contains("-" + i + "-")) {
				a[c++] = i;
				un++;
			} else {
				a[c++] = -1;
			}
			s = s + "-" + i + "-";
		}
		int[] newArray = new int[un];
		int count = 0;
		for (int i : a) {
			if (i != -1) {
				newArray[count++] = i;
			}
		}

		return newArray;
	}

	private static boolean checkForIntegerPalindrom(int value) {
		List<Integer> listOfDigits = new ArrayList<>();
		int r = 1;
		int tmp = value;
		while (tmp != 0) {
			r = tmp % 10;
			listOfDigits.add(r);
			tmp = tmp / 10;
		}

		for (int i = 0; i < listOfDigits.size() / 2; i++) {
			if (listOfDigits.get(i) != listOfDigits.get(listOfDigits.size() - 1 - i)) {
				return false;
			}

		}
		return true;

	}

	private static boolean checkForStringPalindrom(String name) {

		// For case Sesative
		name = name.toLowerCase();

		for (int i = 0; i < name.length() / 2; i++) {
			if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkForPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		} else if (number == 2) {
			return true;
		} else {
			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					return false;
				}

			}
		}
		return true;
	}

	public static int fibonacci(int number) {

		if (number <= 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}

	}

}
