package com.lucidastar.factory;

public class Test {

	private final Blacksmith blacksmith;
	
	
	public Test(Blacksmith blacksmith) {
		super();
		this.blacksmith = blacksmith;
	}


	public static void main(String[] args) {
		Test test = new Test(new OrcBlacksmith());
		test.manufactureWeapons();
		
		test = new Test(new ElfBlacksmith());
		test.manufactureWeapons();
	}
	
	
	private void manufactureWeapons() {
	    Weapon weapon;
	    weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
	    System.out.println(weapon.toString());
	    weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
	    System.out.println(weapon.toString());
	  }
}
