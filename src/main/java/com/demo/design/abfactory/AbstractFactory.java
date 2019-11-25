package com.demo.design.abfactory;

import com.demo.design.abfactory.animal.Animal;
import com.demo.design.abfactory.color.Color;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Animal getAnimal(String animal);
}
