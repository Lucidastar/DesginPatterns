package com.lucidastar.factorykit;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface WeaponFactory {//兵器工厂，通过不同的兵器类型来创造兵器
	Weapon create(WeaponType weaponType);
	
	static WeaponFactory factory(Consumer<Builder> consumer) {
	    Map<WeaponType, Supplier<Weapon>> map = new HashMap<>();
	    consumer.accept(map::put);
	    return name -> map.get(name).get();
	  }
}
