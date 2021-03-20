package com.robin.simple.practice;

import java.util.regex.Pattern;

public class CheckVowelString {
	public static void main(String[] args) {

		String myString = "sdfghjkl";

		boolean isVowel = myString.toLowerCase().matches(".*[aeiou].*");

		boolean isVowel2 = Pattern.matches(".*[aeiou].*", myString);

		boolean isVowel3 = myString.contains("a") || myString.contains("e") || myString.contains("i")
				|| myString.contains("o") || myString.contains("u") ? true : false;

		System.out.println(isVowel);
		System.out.println(isVowel2);
		System.out.println(isVowel3);
		
		
	}
}
