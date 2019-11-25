package com.demo.design.abfactory;

import com.demo.design.abfactory.animal.AnimalFactory;
import com.demo.design.abfactory.color.ColorFactory;

public class FactoryProducer {

	public static AbstractFactory factory(String chioce) {
		if("color".equals(chioce)) {
			return new ColorFactory();
		}else if("animal".equals(chioce)){
			return new AnimalFactory();
		}
		return null;
	}
}
