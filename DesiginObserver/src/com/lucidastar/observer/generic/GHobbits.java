package com.lucidastar.observer.generic;

import com.lucidastar.observer.WeatherType;

public class GHobbits implements Race {

	@Override
	public void update(GWeather subject, WeatherType argument) {
		switch (argument) {
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
