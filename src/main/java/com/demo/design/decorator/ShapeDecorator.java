package com.demo.design.decorator;

/**
 * shape的装饰类
 * @author xingwuzhao
 *
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	public void draw() {
		shape.draw();
	}
}
