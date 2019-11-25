package com.demo.design.singleton;

/**
 * 懒汉模式-线程安全
 * @author zhaoxingwu
 *
 */
public class Singleton2 {
	
	private Singleton2() {}
	
	private static Singleton2 singleton1;
	
	public static synchronized Singleton2 getInstance() {
		if (singleton1 == null) {
			singleton1 = new Singleton2();
		}
		return singleton1;
	}

}
