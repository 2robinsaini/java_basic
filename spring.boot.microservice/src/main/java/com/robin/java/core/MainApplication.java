package com.robin.java.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.robin.java")
@EnableEurekaClient
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

	}

}
