package com.lucidastar.factorykit;

import java.util.function.Supplier;

public interface Builder {
	void add(WeaponType name, Supplier<Weapon> supplier);//供应商
}
