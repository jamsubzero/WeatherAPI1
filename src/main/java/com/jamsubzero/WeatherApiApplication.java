package com.jamsubzero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jamsubzero.services.WeatherService;

@SpringBootApplication
public class WeatherApiApplication{

	@Autowired
	WeatherService weatherService;
	
	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}


	
}
