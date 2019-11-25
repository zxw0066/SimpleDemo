package com.demo.design.template;

public class BasketBallGame extends Game {

	@Override
	void init() {
		System.out.println("start basketball!");
	}

	@Override
	void start() {
		System.out.println("basketball ing.");
	}

	@Override
	void end() {
		System.out.println("basketball end");
	}
}
