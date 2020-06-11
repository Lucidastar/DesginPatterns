package com.lucidastar.factory;

public class ElfWeapon implements Weapon{
	private WeaponType weaponType;
	public ElfWeapon(WeaponType weaponType) {
		super();
		this.weaponType = weaponType;
	}
	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}
	@Override
	public String toString() {
		return "lucida"+weaponType;
	}
}
