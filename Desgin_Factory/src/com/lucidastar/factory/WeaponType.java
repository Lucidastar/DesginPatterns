package com.lucidastar.factory;

public enum WeaponType {//兵器的类型
	SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");
	 private String title;

	private WeaponType(String title) {
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		
		return title;
	}
}
