package com.demo.design.builder;

import com.demo.design.builder.burger.ChickBurger;
import com.demo.design.builder.burger.VegBurger;
import com.demo.design.builder.drink.Coke;
import com.demo.design.builder.drink.Pesi;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickBurger());
		meal.addItem(new Pesi());
		return meal;
	}

}
