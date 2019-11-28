package com.demo.design.responsibility;

public class FileLogger extends AbstractLogger {

	public FileLogger() {
		this.level = AbstractLogger.DEBUG;
		setNextLogger(new ErrorLogger());
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}