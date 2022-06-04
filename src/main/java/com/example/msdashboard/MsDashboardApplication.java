package com.example.msdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDashboardApplication.class, args);
	}

}
