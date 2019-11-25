package com.demo.design.abfactory.color;

import com.demo.design.abfactory.AbstractFactory;
import com.demo.design.abfactory.animal.Animal;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if("blue".equals(color)) {
			return new Blue();
		}else if("green".equals(color)) {
			return new Green();
		}
		return null;
	}

	@Override
	public Animal getAnimal(String animal) {
		return null;
	}
}
