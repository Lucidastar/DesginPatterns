package com.lucidastar.builder;

public class Test {

	public static void main(String[] args) {
		Hero hero = new Hero.Builder(Profession.MAGE,"张三").withHairColor(HairColor.BROWN).withHairType(HairType.CURLY).build();
		System.out.println(hero);
	}

}
