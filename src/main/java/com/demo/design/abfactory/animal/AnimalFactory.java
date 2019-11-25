package com.demo.design.abfactory.animal;

import com.demo.design.abfactory.AbstractFactory;
import com.demo.design.abfactory.color.Color;

public class AnimalFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Animal getAnimal(String animal) {
		if("cat".equals(animal)) {
			return new Cat();
		}else if("dog".equals(animal)) {
			return new Dog();
		}
		return null;
	}

}
