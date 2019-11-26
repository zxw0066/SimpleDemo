package com.demo.design.builder.burger;

import com.demo.design.builder.Item;
import com.demo.design.builder.pack.Packing;
import com.demo.design.builder.pack.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	public abstract int price();

}
