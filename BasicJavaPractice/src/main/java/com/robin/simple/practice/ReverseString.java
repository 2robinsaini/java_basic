package com.robin.simple.practice;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString revString = new ReverseString();
		String name = null;
		String reverseName1 = revString.rev1(name);
		String reverseName2 = revString.rev2(name);
		System.out.println("One Method: " + name + " --> " + reverseName1);
		System.out.println("Second Method: " + name + " --> " + reverseName2);

	}

	private String rev1(String input) {

		if (input == null) {
			throw new IllegalArgumentException("Input String is null.");
		}

		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}

	private String rev2(String input) {

		if (input == null) {
			throw new IllegalArgumentException("Input String is null.");
		}

		StringBuilder sb = new StringBuilder(input);

		return sb.reverse().toString();
	}

}
