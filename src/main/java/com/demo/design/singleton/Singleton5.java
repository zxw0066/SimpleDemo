package com.demo.design.singleton;

/**
 * 静态内部类-线程安全
 * @author zhaoxingwu
 *
 */
public class Singleton5 {
	
	private Singleton5() {}
	
	private static class SingleHolder {
		private static final Singleton5 singleton5 = new Singleton5();
	}

	public static final Singleton5 getInstance() {
		return SingleHolder.singleton5;
	}
}
