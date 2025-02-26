package com.expedia.flight.offer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExpediaFlightDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpediaFlightDemoApplication.class, args);
	}

}
