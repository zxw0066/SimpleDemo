package com.demo.design.builder.burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public int price() {
		return 5;
	}
}
