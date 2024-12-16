package com.tierhotel.tierhotel_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TierhotelManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TierhotelManagerApplication.class, args);
		System.out.println("Tierhotel Manager started at http://localhost:8080");
	}

}
