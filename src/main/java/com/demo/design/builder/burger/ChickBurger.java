package com.demo.design.builder.burger;

public class ChickBurger extends Burger {

	@Override
	public String name() {
		return "ChickBurger";
	}

	@Override
	public int price() {
		return 8;
	}
}
