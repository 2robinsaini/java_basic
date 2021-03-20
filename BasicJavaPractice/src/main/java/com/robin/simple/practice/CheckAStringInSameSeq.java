package com.robin.simple.practice;

public class CheckAStringInSameSeq {

	public static void main(String[] args) {
		String input = "1321321s15486468a654648i5456n464656i64886";

		String key = "saini";

		StringBuilder sb = new StringBuilder();
		sb.append(".*");
		for (int i = 0; i < key.length(); i++) {
			sb.append(key.charAt(i) + ".*");
		}

		boolean isMatch = input.matches(sb.toString());

		System.out.println(isMatch);

	}

}
