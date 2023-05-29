package com.yodikodi.javacampus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JavaCampusApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCampusApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello, Spring Boot";
	}

}
