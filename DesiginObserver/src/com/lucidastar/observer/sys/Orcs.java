package com.lucidastar.observer.sys;

import java.util.Observable;
import java.util.Observer;

public class Orcs implements Observer{
private WeatherType weatherType;
	
	public Orcs(WeatherType weatherType) {
		super();
		this.weatherType = weatherType;
	}

	public void setWeatherType(WeatherType weatherType) {
		this.weatherType = weatherType;
	}
	@Override
	public void update(Observable o, Object arg) {
	
		switch (weatherType) {
	      case COLD:
	        System.out.println( "The orcs are freezing cold.");
	        break;
	      case RAINY:
	        System.out.println( "The orcs are dripping wet.");
	        break;
	      case SUNNY:
	        System.out.println( "The sun hurts the orcs' eyes.");
	        break;
	      case WINDY:
	        System.out.println( "The orc smell almost vanishes in the wind.");
	        break;
	      default:
	        break;
	    }
	}

}
