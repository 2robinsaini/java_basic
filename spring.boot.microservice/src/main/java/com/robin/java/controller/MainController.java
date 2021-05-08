package com.robin.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/")
	public String home() {
		return "Welcome to the Springboot Microservice!";
	}
	
	
}