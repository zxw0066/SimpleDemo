package com.demo.design.responsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger() {
		this.level = AbstractLogger.INFO;
		setNextLogger(new FileLogger());
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}