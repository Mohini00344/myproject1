package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@ComponentScan("com.*")
@SpringBootApplication

public class CustomerHomeClearningServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerHomeClearningServicesApplication.class, args);
	}

}
