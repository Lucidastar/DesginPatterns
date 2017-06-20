package com.lucidastar.builder;

public enum Armor {//披甲
	 CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

	  private String title;

	  Armor(String title) {
	    this.title = title;
	  }

	  @Override
	  public String toString() {
	    return title;
	  }
}
