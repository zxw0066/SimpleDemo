package com.demo.design.decorator;

public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		Shape circle = new Circle();
		System.out.println("Circle with normal border");
		circle.draw();

		
		System.out.println("\nCircle of red border");
		ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		redRectangle.draw();
	}
}