package com.demo.design.responsibility;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger() {
		this.level = AbstractLogger.ERROR;
		setNextLogger(null);
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}