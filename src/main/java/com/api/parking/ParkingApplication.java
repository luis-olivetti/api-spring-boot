package com.api.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class ParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

	/*@GetMapping("/")
	public String index() {
		return "Olá mundo";
	}

	@GetMapping("/banana")
	public String banana() {
		return "banana banana banana";
	}*/
}