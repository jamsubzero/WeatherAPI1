package com.jamsubzero.services;

public class WeatherInfo {
	
	private String location;
	private String weather;
	private Double temperature;
	
	
	public WeatherInfo(String location, String weather, Double temperature) {
		super();
		this.location = location;
		this.weather = weather;
		this.temperature = temperature;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "WeatherInfo [location=" + location + ", weather=" + weather + ", temperature=" + temperature + "]";
	}
	
	

}
