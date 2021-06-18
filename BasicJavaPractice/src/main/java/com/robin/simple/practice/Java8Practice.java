package com.robin.simple.practice;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Java8Practice {

	public static void main(String[] args) {

		int[] input = new int[] { 2, 7, 4, 9, 1, 11 };
		int keyIndex = 2;
		int tmp = 0;

		// Move all the lesser number to left of value at keyIndex and move all the
		// greater number to right of value at keyIndex
		for (int j = 0; j < input.length; j++) {
			for (int i = 0; i < input.length; i++) {
				if ((input[i] > input[keyIndex] && i < keyIndex) || (input[i] < input[keyIndex] && i > keyIndex)) {
					tmp = input[keyIndex];
					input[keyIndex] = input[i];
					input[i] = tmp;
					keyIndex = i;
				}
			}
		}

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		System.out.println();

		// java8();

		int[] nums = new int[] { 34, 10, 47, 40, 120, 75, 14, 30, 457, 63, 24, 8 };

		int firstMax = 0;
		int secondMax = 0;
		int indexfirstMax = 0;
		int indexsecondMax = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > firstMax && nums[i] > secondMax) {
				secondMax = firstMax;
				indexsecondMax = indexfirstMax;
				firstMax = nums[i];
				indexfirstMax = i;

			} else if (nums[i] > firstMax) {
				firstMax = nums[i];
				indexfirstMax = i;
			} else if (nums[i] > secondMax && nums[i] < firstMax) {
				secondMax = nums[i];
				indexsecondMax = i;
			}
		}
		System.out.println(indexfirstMax + " " + indexsecondMax);

		List<List<String>> list = new ArrayList<List<String>>();
		List<String> mulkiRaj = Arrays.asList("rashmi", "robin");
		List<String> dharampal = Arrays.asList("Manju", "babli", "vikas", "babloo");
		List<String> sukhpal = Arrays.asList("ruchi", "rachna", "sonu");
		List<String> baburam = Arrays.asList("ramesh", "jawahar");
		List<String> balbeer = Arrays.asList("mamta", "madhu", "neeraj", "arti");
		List<String> satbeer = Arrays.asList("gudia", "mukul", "cheeku");

		list.add(mulkiRaj);
		list.add(dharampal);
		list.add(sukhpal);
		list.add(baburam);
		list.add(balbeer);
		list.add(satbeer);

		List<String> all = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
		System.out.println(all);

	}

	private static void java8() {
		ZonedDateTime LAZonedDateTime = LocalDateTime.now().atZone(Calendar.getInstance().getTimeZone().toZoneId());
		System.out.println(LAZonedDateTime.toString());

		List<Employees> emps = new ArrayList<>();
		getEmployees(emps);

		emps.stream().forEach(e -> System.out.println(e));

		System.out.println("Only Cricketer");
		emps.stream().filter(e -> e.getDepartment().equalsIgnoreCase("cricket")).forEach(e -> System.out.println(e));

		System.out.println("city of news anchor");
		emps.stream().filter(e -> e.getDepartment().equalsIgnoreCase("news anchor")).map(e -> e.getAddress().getCity())
				.forEach(e -> System.out.println(e));

		System.out.println("HR, with name,salary as key value in Map");

		// Used Lambda expression as well as method reference
		Map<String, Integer> map = emps.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
				.collect(Collectors.toMap(e -> e.getName(), Employees::getSalary));
		map.entrySet().stream().forEach(ent -> System.out.println(ent.getKey() + " --> " + ent.getValue()));

		System.out.println("*************************");

		List<Employees> employeesList = emps.stream().filter(ad -> ad.salary > 20000)
				.peek(e -> System.out.println(e.name + " before ")).filter(ad -> ad.age > 30)
				.peek(e -> System.out.println(e.name)).collect(Collectors.toList());

		employeesList.forEach(System.out::print);

	}

	private static void getEmployees(List<Employees> emps) {

		Address a1 = new Address("Shamli", "India", 1099, "Hasanpur Luhari");
		Address a2 = new Address("G Noida", "India", 1096, "7th Avenue");
		Address a3 = new Address("Pune", "India", 50, "Yerwadi");
		Address a4 = new Address("banglore", "India", 42, "NFC");
		Address a5 = new Address("Delhi", "India", 34, "lajpat Nagar");
		Address a6 = new Address("Gurgaon", "India", 122, "Sohna Road");
		Address a7 = new Address("Noida", "India", 122, "Sec 22");
		Address a8 = new Address("Ghaziabad", "India", 122, "Indrapuram");
		Address a9 = new Address("G Noida", "India", 1511, "Supertech EV 1");
		Address a10 = new Address("Patiala", "India", 125, "Sidhu colony");

		Employees emp1 = new Employees(27, 50000, "Robin Kumar", "IT", a1);
		Employees emp2 = new Employees(25, 35000, "Mithali Raj", "Cricket", a2);
		Employees emp3 = new Employees(24, 50000, "Deepa Mehta", "HR", a3);
		Employees emp4 = new Employees(23, 80000, "Sudhir Chaudri", "News Anchor", a4);
		Employees emp5 = new Employees(24, 82000, "Rajat Sharma", "News Anchor", a5);
		Employees emp6 = new Employees(27, 40000, "Neha Badola", "HR", a6);
		Employees emp7 = new Employees(25, 20000, "Sourabh Sharma", "BPO", a7);
		Employees emp8 = new Employees(35, 50000, "Rohit Sharma", "IT", a8);
		Employees emp9 = new Employees(42, 55000, "Virat Kohli", "Cricket", a9);
		Employees emp10 = new Employees(63, 75000, "PV Sindhu", "Badminton", a10);

		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		emps.add(emp6);
		emps.add(emp7);
		emps.add(emp8);
		emps.add(emp9);
		emps.add(emp10);

	}

}

@Data
@AllArgsConstructor
class Employees {
	int age;
	int salary;
	String name;
	String department;
	Address address;

}

@Data
@AllArgsConstructor
class Address {
	String city;
	String country;
	int houseNumber;
	String streetName;
}
