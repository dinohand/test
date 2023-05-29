package com.yodikodi.javacampus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller("/")
@SpringBootApplication
public class JavaCampusApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCampusApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello, Spring Boot";
	}

	@GetMapping("/test")
	public String index2() {
		return "Test, Spring Boot";
	}

	@PostMapping("/test")
	public String index3() {
		return "Test, Spring Boot";
	}

}
