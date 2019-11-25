package com.demo.design.abfactory;

public class ABTest {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProducer.factory("color");
		abstractFactory.getColor("blue").getColor();
	}

}
