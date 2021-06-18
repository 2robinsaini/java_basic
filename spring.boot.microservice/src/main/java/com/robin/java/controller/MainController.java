package com.robin.java.controller;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		StringJoiner js = new StringJoiner(",", "[", "]");
		discoveryClient.getServices().stream().forEach(serv -> js.add(serv));
		return js.toString();
	}

	@GetMapping("/C2F/{temp}")
	public String converTempC2F(@PathVariable String temp) {
		Double f = ((Double.parseDouble(temp) * 9) / 5) + 32;
		return f.toString();
	}

	@GetMapping("/F2C/{temp}")
	public String converTempF2C(@PathVariable String temp) {
		Double c = ((Double.parseDouble(temp) - 32) * 5) / 9;
		return c.toString();
	}

}
