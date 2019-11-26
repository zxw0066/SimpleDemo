package com.demo.design.prototype;

public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}