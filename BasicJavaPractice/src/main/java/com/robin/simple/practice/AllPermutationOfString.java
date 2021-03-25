package com.robin.simple.practice;

public class AllPermutationOfString {

	public static void main(String[] args) {

		String name = "robs";
		printAllPermutationOfaString(name, "");

	}

	static void printAllPermutationOfaString(String str, String ans) {

		System.out.println(str+" --> " + ans);
		
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printAllPermutationOfaString(ros, ans + ch);
		}
	}

}
