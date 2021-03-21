package com.robin.simple.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoArraySameElement {

	public static void main(String[] args) {

		// oneArrayContainsOther();

		secondHeighestElementInarray();

	}

	private static void secondHeighestElementInarray() {

		Integer[] array = { 12, 34, 45, 56, 23, 45, 56, 344, 67, 7, 34, 67, 89, 36, 67, 8945, 76, 87 };
		int highest = 0;
		int secHighest = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {
				secHighest = highest;
				highest = array[i];
			}
		}

		System.out.println(highest);
		System.out.println(secHighest);

		int secMax = Arrays.asList(array).stream().sorted().skip(array.length-2).collect(Collectors.toList()).get(0);
		
		System.out.println(secMax);

	}

	private static void oneArrayContainsOther() {
		Integer[] a1 = { 1, 2, 3 };
		Integer[] a2 = { 6, 4, 3, 6, 1, 11, 5, 6, 2, 7 };

		boolean result = Arrays.asList(a2).containsAll(Arrays.asList(a1));

		System.out.println(result);

		int sum = 0;
		for (int i = 0; i < a2.length; i++) {
			sum = sum + a2[i];
		}
		System.out.println(sum);

		int summ = Arrays.asList(a2).stream().mapToInt(Integer::intValue).sum();
		System.out.println(summ);

		int summ2 = Arrays.asList(a2).stream().reduce(0, (a, b) -> a + b);
		System.out.println(summ2);

	}

}
