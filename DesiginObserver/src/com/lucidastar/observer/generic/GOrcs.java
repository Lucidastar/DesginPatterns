package com.lucidastar.observer.generic;

import com.lucidastar.observer.WeatherType;

public class GOrcs implements Race {

	@Override
	public void update(GWeather subject, WeatherType argument) {
		switch (argument) {
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
