package com.demo.design.responsibility;

public class ChainPatternDemo {

	public static void main(String[] args) {
		
		AbstractLogger loggerChain = new ConsoleLogger();

		loggerChain.logMessage(AbstractLogger.INFO, "---information---");

		loggerChain.logMessage(AbstractLogger.DEBUG, "---debug---");

		loggerChain.logMessage(AbstractLogger.ERROR, "---error---");
	}
}