package com.lucidastar.observer.sys;

import java.util.Observable;

public class Weather extends Observable{

	private WeatherType weatherType;

	public WeatherType getWeatherType() {
		return weatherType;
	}

	public void setWeatherType(WeatherType weatherType) {
		this.weatherType = weatherType;
		setChanged();
		this.notifyObservers();
	}
	
}
