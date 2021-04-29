package com.robin.simple.practice;


public class Person implements Cloneable {

	String name;
	Addres address;
	int age;
	
	protected Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.address = (Addres) address.clone();
		return p;
	}

	
	public Person(String name, Addres address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	
	
}

class Addres implements Cloneable{
	
	String city;
	int hn;
	
	public Addres(String city, int hn) {
		super();
		this.city = city;
		this.hn = hn;
	}
	@Override
	public String toString() {
		return "Addres [city=" + city + ", hn=" + hn + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
