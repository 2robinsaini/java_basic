package com.robin.simple.practice;

public class CloningExample {

	public static void main(String[] args) {

		Addres a1 = new Addres("noida", 1099);
		Addres a2 = new Addres("Delhi", 1096);
		Person p1 = new Person("robin", a1, 24);
		try {
			
			//p1.setAddress(a2);
			Person p2 = null;
			p2 = (Person) p1.clone();
			p1.age = 90;
			System.out.println("--> " + p1);
			p2.address.hn = 55;
			System.out.println(p2.age);
			System.out.println("--> " + p1);
			System.out.println(p2.age);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
