package com.demo.design.builder.drink;

import com.demo.design.builder.Item;
import com.demo.design.builder.pack.Bottle;
import com.demo.design.builder.pack.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	public abstract int price();
}
