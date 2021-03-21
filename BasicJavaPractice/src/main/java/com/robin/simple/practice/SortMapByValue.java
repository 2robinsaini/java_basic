package com.robin.simple.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);

		map.entrySet().stream().forEach(ent -> System.out.println(ent.getKey() + " --> " + ent.getValue()));

		System.out.println("After sorting...");
		
		map.entrySet().stream().sorted((ent1, ent2) -> ent1.getValue() - ent2.getValue())
				.forEach(ent -> System.out.println(ent.getKey() + " *** " + ent.getValue()));
		

	}

}
