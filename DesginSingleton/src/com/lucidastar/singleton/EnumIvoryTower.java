package com.lucidastar.singleton;

public enum EnumIvoryTower {
	  INSTANCE;
	  @Override
	  public String toString() {
	    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
	  }
}
