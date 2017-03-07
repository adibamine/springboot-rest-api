package com.adib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.adib.*")
public class Application {

	public static void main(String[] args) {
		System.out.println("ya");
		SpringApplication.run(Application.class, args);
	}
}
