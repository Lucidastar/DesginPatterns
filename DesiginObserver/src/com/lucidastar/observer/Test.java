package com.lucidastar.observer;

import java.util.Observable;

import com.lucidastar.observer.generic.GHobbits;
import com.lucidastar.observer.generic.GOrcs;
import com.lucidastar.observer.generic.GWeather;

public class Test {
	
	public static void main(String[] args) {
	
			System.out.println("begin");
			Weather weather = new Weather();
		    weather.addObserver(new Orcs());
		    weather.addObserver(new Hobbits());

//		    weather.timePasses();
//		    weather.timePasses();
//		    weather.timePasses();
//		    weather.timePasses();
		    
		    
		    GWeather gWeather = new GWeather();
		    gWeather.addObserver(new GOrcs());
		    gWeather.addObserver(new GHobbits());

		    gWeather.timePasses();
		    gWeather.timePasses();
		    gWeather.timePasses();
		    gWeather.timePasses();
		    
	}

}
