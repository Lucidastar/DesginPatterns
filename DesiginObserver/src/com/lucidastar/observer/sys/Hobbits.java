package com.lucidastar.observer.sys;

import java.util.Observable;
import java.util.Observer;

public class Hobbits implements Observer {

	private WeatherType weatherType;
	
	public Hobbits(WeatherType weatherType) {
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
	        System.out.println("The hobbits are shivering in the cold weather.");
	        break;
	      case RAINY:
	        System.out.println("The hobbits look for cover from the rain.");
	        break;
	      case SUNNY:
	        System.out.println("The happy hobbits bade in the warm sun.");
	        break;
	      case WINDY:
	        System.out.println("The hobbits hold their hats tightly in the windy weather.");
	        break;
	      default:
	        break;
	    }
	}

}
