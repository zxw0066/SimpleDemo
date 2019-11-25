package com.demo.design.factory;

public class ColorFactory {

	public static Color getColor(String color) {
		if("blue".equals(color)) {
			return new Blue();
		}else {
			return new Green();
		}
	}
}
