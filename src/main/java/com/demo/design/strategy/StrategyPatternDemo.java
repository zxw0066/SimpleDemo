package com.demo.design.strategy;

public class StrategyPatternDemo  {
	
	public static void main(String[] args) {
		Strategy strategy = new OperationAdd();
		Context context = new Context(strategy);
		System.out.println(context.doWork(10, 15));
	}
}

