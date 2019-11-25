package com.demo.design.template;

public class FootBallGame extends Game {

	@Override
	void init() {
		System.out.println("start football!");
	}

	@Override
	void start() {
		System.out.println("football ing.");
	}

	@Override
	void end() {
		System.out.println("football end");
	}
}
