package com.lucidastar.observer.sys;

public enum WeatherType {
	SUNNY,RAINY,WINDY,COLD;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name().toLowerCase();
	}
}
