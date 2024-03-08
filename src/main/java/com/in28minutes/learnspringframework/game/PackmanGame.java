package com.in28minutes.learnspringframework.game;

public class PackmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Go Up");

	}

	@Override
	public void down() {
		System.out.println("Go Down");

	}

	@Override
	public void left() {
		System.out.println("Punch with left hand");

	}

	@Override
	public void right() {
		System.out.println("Punch wit right hand");

	}

}
