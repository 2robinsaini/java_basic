package com.robin.simple.practice;

import java.util.HashSet;

public class Application {
	public static void main(String[] args) {
		
		//rNd();

		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);

		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));

		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());

	}

	private static void rNd() {
		int[] a = { 1, 2, 3, 4 };
		printArray(a);

		checkArray(a);

		System.out.println("After method call: ");

		printArray(a);

		Employee[] employees = { new Employee("robin"), new Employee("kumar"), new Employee("saini") };

		printArray(employees);
		changeArray(employees);
		System.out.println("After method call changeArray: ");
		printArray(employees);

		Employee e1 = new Employee("kanhaiya");
		System.out.println("Old: " + e1.getName());
		changeName(e1, "Mr. Kanhaiyla Lal");
		System.out.println("New: " + e1.getName());
		
	}

	private static void changeName(Employee e1, String newName) {
		if (e1 != null)
			e1.setName(newName);
	}

	private static void checkArray(int[] a) {
		a[0] = 0;
		System.out.println("First Index reset as zero");
	}

	private static void changeArray(Employee[] emp) {
		emp[0].setName("Mr. " + emp[0].getName());
		System.out.println("First Index reset as Mr.");
	}

	private static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + ", ");
		}
	}

	private static void printArray(Employee[] employees) {
		for (Employee e : employees) {
			System.out.print(e.getName() + ", ");
		}
	}
}

class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
}