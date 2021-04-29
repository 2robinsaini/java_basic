package com.robin.simple.practice;

public class ArrayProgramms {

	public static void main(String[] args) {

		Integer[] a = { 105, 202, 33, 4, 2, 4, 6, 5, 700, 4, 8, 98, 54, 6, 3, 5, 7, 999, 65, 0, 98 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// duplicateElementInArray(a);
		// secondHeighestElementInArray(a);
		findPairsWithSumEqualsToGivenNumber(a, 10);

	}

	private static void findPairsWithSumEqualsToGivenNumber(Integer[] a, int num) {

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == num) {
					System.out.println(a[i] + " " + a[j]);
				}
			}

		}

	}

	private static void secondHeighestElementInArray(Integer[] a) {

		int h = 0;
		int sh = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > h) {
				sh = h;
				h = a[i];
			}

			if (a[i] > sh && h > a[i]) {
				sh = a[i];
			}

		}

		System.out.println("Second Heighest: " + sh);
	}

	private static void duplicateElementInArray(Integer[] a) {

		System.out.println("\nDuplicate elements");

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] == a[i]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
