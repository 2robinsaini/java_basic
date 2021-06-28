package com.robin.simple.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

	public static void main(String[] args) {

		String ldt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		String ldt2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a"));
		String ldt3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm:ss"));
		System.out.println(ldt);
		System.out.println(ldt2);
		System.out.println(ldt3);
	}

}
