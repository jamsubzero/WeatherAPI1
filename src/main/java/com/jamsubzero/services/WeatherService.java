package com.jamsubzero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


@Service
public class WeatherService {

	private final String APP_ID = "a560e8fb460270c4ed1d047e86676e6d";
	
	@Autowired 
	WeatherParser weatherParser;
	
	public WeatherInfo getWeather(String city) throws UnirestException {
		
		HttpResponse<JsonNode> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                .queryString("APPID",APP_ID)
                .queryString("q",city)
                .header("content-type","application/json")
                .asJson(); 
	return weatherParser.parseWeather(response);
	}
	
	
	
	
	
}
