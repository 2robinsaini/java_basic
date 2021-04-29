package com.robin.simple.practice;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Java8Practice {

	public static void main(String[] args) {

		ZonedDateTime LAZonedDateTime = LocalDateTime.now().atZone(Calendar.getInstance().getTimeZone().toZoneId());
		System.out.println(LAZonedDateTime.toString());

		
		List<Employees> emps = new ArrayList<>();
		getEmployees(emps);

		emps.stream().forEach(e -> System.out.println(e));

		
		System.out.println("Only Cricketer");
		emps.stream().filter(e -> e.getDepartment().equalsIgnoreCase("cricket")).forEach(e -> System.out.println(e));
		
		System.out.println("city of news anchor");
		emps.stream().filter(e -> e.getDepartment().equalsIgnoreCase("news anchor")).map(e -> e.getAddress().getCity()).forEach(e -> System.out.println(e));
		
		System.out.println("HR, with name,salary as key value in Map");
		
		//Used Lambda expression as well as method reference
		Map<String,Integer> map = emps.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.toMap( e -> e.getName(),Employees::getSalary));
		map.entrySet().stream().forEach(ent -> System.out.println(ent.getKey() + " --> " + ent.getValue()));
		
		
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
