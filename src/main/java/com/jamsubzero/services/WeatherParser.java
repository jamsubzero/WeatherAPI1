package com.jamsubzero.services;

import org.jboss.logging.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.jamsubzero.WeatherApiApplication;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

@Component
public class WeatherParser {
	
	Logger logger = Logger.getLogger(WeatherApiApplication.class);

	public WeatherInfo parseWeather(HttpResponse<JsonNode> reponse) {
	JSONObject json = reponse.getBody().getObject();
		String loc = json.getString("name");
		
		JSONObject jsonWeather = json.getJSONArray("weather").getJSONObject(0);
		String weather = jsonWeather.getString("main");
		
		JSONObject jsonTemp = json.getJSONObject("main");
		Double temp = jsonTemp.getDouble("temp");
		
		WeatherInfo weatherInfo = new WeatherInfo(loc, weather, temp);
		logger.infof("loc:{}, weather:{}, temp:{}", loc, weather, temp);
		
		return weatherInfo;
	}
	
	
}
