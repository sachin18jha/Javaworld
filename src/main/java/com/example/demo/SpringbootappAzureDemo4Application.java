package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootappAzureDemo4Application {
	@GetMapping("/message")
	public String message() {
		return "congrats ! your app deployed successfully in Azure !";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootappAzureDemo4Application.class, args);
	}

}
