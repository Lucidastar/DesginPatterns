package com.lucidastar.factory;

public class ElfBlacksmith implements Blacksmith{
	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		// TODO Auto-generated method stub
		return new ElfWeapon(weaponType);
	}
}
