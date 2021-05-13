package com.robin.eureka.server.eureka.server;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/services")
	public String check() {
		StringJoiner js = new StringJoiner(",","[","]");
		discoveryClient.getServices().stream().forEach(serv -> js.add(serv));
		return js.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
