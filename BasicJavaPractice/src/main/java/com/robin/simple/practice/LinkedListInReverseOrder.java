package com.robin.simple.practice;

import java.util.LinkedList;

public class LinkedListInReverseOrder {

	public static void main(String[] args) {

		
		
		LinkedList<String> list1 = new LinkedList<>();
		
		LinkedList<String> list2 = new LinkedList<>();
		
		list1.add("robin");
		list1.add("kumar");
		list1.add("saini");

		list1.stream().forEach(name ->  System.out.print(name+", "));
		
		list1.descendingIterator().forEachRemaining(name -> list2.add(name));
		
		System.out.println("");
		
		list2.stream().forEach(name ->  System.out.print(name+", "));
		
		
	}

}
