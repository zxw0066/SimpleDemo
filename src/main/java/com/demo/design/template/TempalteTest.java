package com.demo.design.template;

public class TempalteTest {

	public static void main(String[] args) {
		Game game = new FootBallGame();
		game.play();
		
		System.out.println();
		
		Game game2 = new BasketBallGame();
		game2.play();
	}
}
