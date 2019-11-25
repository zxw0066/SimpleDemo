package com.demo.design.factory;

public class ColorTest {

	public static void main(String[] args) {
		Color color = ColorFactory.getColor("green");
		color.getColor();
	}
}
