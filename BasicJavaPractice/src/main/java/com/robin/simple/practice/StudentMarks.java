package com.robin.simple.practice;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StudentMarks {

	public static void main(String[] args) {

		Map<String, Integer> map = getMap();

		map.entrySet().stream().forEach(ent -> System.out.println(ent.getKey() + " --> " + ent.getValue()));

		System.out.println(map.size());

	}

	private static Map<String, Integer> getMap() {

		Map<String, String> map = new TreeMap<>();

		map.put("Rashi Negi", "51");
		map.put("Adarsh Raturi", "52");
		map.put("Himangi Choudhary", "51");
		map.put("ayush Verma", "48");
		map.put("sagar tiwari", "50");
		map.put("parawati kumari", "49");
		map.put("Jyoti Nainwal", "47");
		map.put("Sarvesh Bawari", "51");
		map.put("Ismany Singh", "55");
		map.put("Shahbuddin", "54");
		map.put("Aditya", "42");
		map.put("ankita bisht", "51");
		map.put("Naman Sati", "48");
		map.put("Aisha Rawat", "52");
		map.put("Mukul Parmar", "52");
		map.put("rajat singh", "51");
		map.put("Gaurav Agarwal", "55");
		map.put("Rohit Gusain", "52");
		map.put("Ujjwal Mittal", "51");
		map.put("Vijaya Rawat", "52");
		map.put("Aman Kotiyal", "55");
		map.put("deepak kushwaha", "52");
		map.put("Anshuman das gupta", "57");
		map.put("Deep Chand", "54");
		map.put("AJIT SINGH", "51");
		map.put("Neelesh Bisht", "52");
		map.put("Karan Negi", "57");
		map.put("Sherya Dev", "53");
		map.put("prachi dhiman", "50");
		map.put("Piyush Barthwal", "58");
		map.put("Abhishek singh", "51");
		map.put("Sanchit Gusain", "57");
		map.put("Anjali Mittal", "47");
		map.put("Kamal Saini", "45");
		map.put("tushar sharma", "45");
		map.put("Anmol Bisht", "54");
		map.put("akansha Mingwal", "56");
		map.put("Nancy Agarwal", "56");
		map.put("SIMRAN RAWAT", "58");
		map.put("Anjali Rawat", "51");
		map.put("Deepak arya", "54");
		map.put("Udrasht Pal", "50");
		map.put("Tarun Chauhan", "55");
		map.put("Shubham Negi", "53");
		map.put("Anubhav Pundir", "49");
		map.put("Ashish Negi", "53");
		map.put("Shubhang Pant", "56");
		map.put("Prerna Bhatt", "54");
		map.put("Shashank Joshi", "43");
		map.put("Shubh Gupta", "56");
		map.put("Rohit Rawat", "50");
		map.put("Divya Jain", "53");
		map.put("Tushar Thakur", "54");
		map.put("pankaj kumar", "51");
		map.put("shubham pushpadh", "48");
		map.put("Franky Saxena", "55");
		map.put("Ashutosh Panwar", "48");
		map.put("Krishna Kaniyal", "51");
		map.put("Kushagra Padiyar", "57");
		map.put("Suraj Kumar", "50");
		map.put("bhanu pratap singh gusain", "43");
		map.put("Gaurav Bhardwaj", "47");
		map.put("Shashank Bhatt", "52");
		map.put("Khushboo Padiyar", "56");
		map.put("Saurabh Joshi", "53");
		map.put("Akshay chauhan", "55");
		map.put("Dhruv Maithani", "52");
		map.put("shubham Joshi", "55");
		map.put("Harshit Rana", "56");
		map.put("Amit Pant", "55");
		map.put("Urvarshi Goswami", "55");
		map.put("Varistha Nautiyal", "47");

		Map<String, Integer> newMap = map.entrySet().stream()
				.collect(Collectors.toMap(ent -> ent.toString(), ent -> Integer.parseInt(ent.getValue()) * 100 / 60));

		Map<String, Integer> newMap2 = new TreeMap<String, Integer>();

		for (Map.Entry<String, Integer> ent : newMap.entrySet()) {
			newMap2.put(ent.getKey().split("=")[0] + " --> " + convert_to_words(ent.getValue()), ent.getValue());
		}

		return newMap2;

	}

	private static String convert_to_words(int num) {
		int n = num;
		int n1 = n, n2 = n;
		int b = n1 % 10, a = n2 / 10; // n1/10 means last digit is removed and n2%10 means last digit by modulus

		String numberInWords = "";

		String[] single_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		String[] two_digits = new String[] { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
				"sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };
		if (a == 1) {
			//System.out.println(two_digits[b + 1]);
			numberInWords = two_digits[b + 1];
		} else if (b == 0) {
			//System.out.println(tens_multiple[a]);
			numberInWords = tens_multiple[a];
		} else {
			//System.out.println(tens_multiple[a] + " " + single_digits[b]);
			numberInWords = tens_multiple[a] + " " + single_digits[b];
		}

		return numberInWords;
	}

}
