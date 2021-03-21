package com.robin.simple.practice;

public class BinarySearch {

	public static void main(String[] args) {

		
		//Condition: input array Must be sorted...
		int[] inputArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int searchKey = 80;

		int index = checkElementByBinarySearch(inputArray, searchKey);

		System.out.println("Index of " + searchKey + " " + index);

	}

	private static int checkElementByBinarySearch(int[] inputArray, int searchKey) {

		int startIndex = 0;
		int endIndex = inputArray.length - 1;

		int midIndex = (startIndex + endIndex) / 2;
		int finalIndex = 0;
		while (startIndex <= endIndex) {
			if (searchKey < inputArray[midIndex]) {
				endIndex = midIndex - 1;
			} else if (searchKey == inputArray[midIndex]) {
				finalIndex = midIndex;
				break;
			} else {
				startIndex = midIndex + 1;
			}
			midIndex = (startIndex + endIndex) / 2;
		}

		return finalIndex;
	}

}
