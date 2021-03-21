package com.robin.simple.practice;

public class MergeSort {

	public static void main(String[] args) {

		int[] inputArray = { 7, 10, 5, 4, 12, 17, 21, 42, 0, 2 };

		printArray(inputArray);

		int[] sortedArray = sortArrayByMergeSortAlgo(inputArray, 0, inputArray.length - 1);

		System.out.println("\nSorting Done: ");

		printArray(sortedArray);

	}

	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}

	}

	private static int[] sortArrayByMergeSortAlgo(int[] inputArray, int start, int end) {

		if (start == end) {
			int[] newArray = new int[1];
			newArray[0] = inputArray[start];
			return newArray;
		}

		int mid = (start + end) / 2;
		
		int[] fh = sortArrayByMergeSortAlgo(inputArray, start, mid);
		int[] sh = sortArrayByMergeSortAlgo(inputArray, mid + 1, end);

		int[] sortedArray = mergedTwoArray(fh, sh);

		return sortedArray;
	}

	private static int[] mergedTwoArray(int[] fh, int[] sh) {

		int[] newArray = new int[fh.length + sh.length];

		int indexOfFH = 0;
		int indexOfSH = 0;
		int indexOfNewArray = 0;
		while (indexOfNewArray < newArray.length) {
			
			if (fh[indexOfFH] < sh[indexOfSH]) {
				newArray[indexOfNewArray] = fh[indexOfFH];
				indexOfFH++;
				indexOfNewArray++;
			} else {
				newArray[indexOfNewArray] = sh[indexOfSH];
				indexOfSH++;
				indexOfNewArray++;
			}

			if (indexOfFH == fh.length) {
				for (int i = indexOfSH; i < sh.length; i++) {
					newArray[indexOfNewArray] = sh[i];
					indexOfNewArray++;
				}
			}

			if (indexOfSH == sh.length) {
				for (int i = indexOfFH; i < fh.length; i++) {
					newArray[indexOfNewArray] = fh[i];
					indexOfNewArray++;
				}
			}

		}

		return newArray;
	}
}
