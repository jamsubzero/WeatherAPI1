package com.jamsubzero.controllers;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jamsubzero.services.WeatherInfo;
import com.jamsubzero.services.WeatherService;
import com.mashape.unirest.http.exceptions.UnirestException;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	@RequestMapping("/weather")
	public List<WeatherInfo> getNow() throws JSONException, UnirestException {
		
		List<WeatherInfo> weathers = new ArrayList<>();
		
		weathers.add(weatherService.getWeather("London"));
		weathers.add(weatherService.getWeather("Prague"));
		weathers.add(weatherService.getWeather("San Francisco"));
			
		return weathers;
	}
	
	
	

}
