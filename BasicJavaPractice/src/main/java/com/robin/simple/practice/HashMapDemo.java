package com.robin.simple.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Student, String> stdMap = new HashMap<>();

		stdMap.put(new Student("robin1", 30), "saini");
		stdMap.put(new Student("robin2", 30), "saini");
		stdMap.put(new Student("robin3", 30), "saini");
		stdMap.put(new Student("robin4", 30), "saini");
		stdMap.put(new Student("robin5", 30), "saini");
		stdMap.put(new Student("robin6", 30), "saini");
		stdMap.put(new Student("robin7", 30), "saini");
		stdMap.put(new Student("robin8", 30), "saini");
		

		Student s9 = new Student("robin10", 30);
		Student s10 = new Student("robin11", 30);
		Student s11 = new Student("robin10", 30);
		Student s12 = new Student("robin11", 30);

		stdMap.put(s9, "saini");
		stdMap.put(s10, "saini");
		stdMap.put(s11, "saini");
		stdMap.put(s12, "saini");

		System.out.println(stdMap.size());

		stdMap.remove(s10);
		stdMap.remove(s12);
		stdMap.remove(s9);
		stdMap.remove(s11);
		
		System.out.println(stdMap.size());

	}

}

class Student {

	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; Student other = (Student) obj; if (age !=
		 * other.age) return false; if (name == null) { if (other.name != null) return
		 * false; } else if (!name.equals(other.name)) return false; return true;
		 */
	}

}