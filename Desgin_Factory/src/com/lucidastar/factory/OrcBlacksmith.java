package com.lucidastar.factory;

public class OrcBlacksmith implements Blacksmith{

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		// TODO Auto-generated method stub
		return new OrcWeapon(weaponType);
	}

}
