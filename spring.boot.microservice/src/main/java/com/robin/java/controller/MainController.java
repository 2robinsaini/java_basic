package com.robin.java.controller;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/")
	public String home() {
		return "Welcome to the Springboot Microservice!";
	}
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/services")
	public String check() {
		StringJoiner js = new StringJoiner(",","[","]");
		discoveryClient.getServices().stream().forEach(serv -> js.add(serv));
		return js.toString();
	}
}
