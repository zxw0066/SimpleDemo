package com.demo.design.template;

public abstract class Game {
	
	abstract void init();
	abstract void start();
	abstract void end();
	
	// 定义模板
	public void play() {
		init();
		start();
		end();
	}

}
