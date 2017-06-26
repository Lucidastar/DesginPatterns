package com.lucidastar.observer.sys;

import java.util.Observable;

public class Test {

	public static void main(String[] args) {
		Weather weather = new Weather();
		Hobbits hobbits = new Hobbits(WeatherType.COLD);
		weather.addObserver(hobbits);
		weather.addObserver(new Orcs(WeatherType.COLD));
		
//		observable.notifyObservers();
		
		hobbits.setWeatherType(WeatherType.RAINY);
//		observable.notifyObservers();
//		observable.notifyObservers(hobbits);
		boolean isChange = weather.hasChanged();
		weather.setWeatherType(WeatherType.RAINY);
		
		
		System.out.println("是否改变了:"+isChange);
		
		
	}

}
