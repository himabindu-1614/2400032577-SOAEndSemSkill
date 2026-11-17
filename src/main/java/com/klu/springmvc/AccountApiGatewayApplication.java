package com.klu.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AccountApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApiGatewayApplication.class, args);
	}


}

