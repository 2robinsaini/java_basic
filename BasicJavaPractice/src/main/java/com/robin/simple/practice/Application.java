package com.robin.simple.practice;

public class Application {
	public static void main(String[] args) {
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