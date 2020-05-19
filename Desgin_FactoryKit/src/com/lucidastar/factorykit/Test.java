package com.lucidastar.factorykit;

public class Test {

	public static void main(String[] args) {
		  WeaponFactory factory = WeaponFactory.factory(builder -> {//里头有好多的兵器
		      builder.add(WeaponType.SWORD, Sword::new);
		      builder.add(WeaponType.AXE, Axe::new);
		      builder.add(WeaponType.SPEAR, Spear::new);
		      builder.add(WeaponType.BOW, Bow::new);
		    });
		    Weapon axe = factory.create(WeaponType.BOW);//根据类型创造兵器
		    System.out.println(axe.toString());
		    System.out.println();
	}

}
