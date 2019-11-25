package com.demo.design.singleton;

/**
 * 懒汉模式-线程不安全
 * @author zhaoxingwu
 *
 */
public class Singleton1 {
	
	private Singleton1() {}
	
	private static Singleton1 singleton1;
	
	public static Singleton1 getInstance() {
		if (singleton1 == null) {
			singleton1 = new Singleton1();
		}
		return singleton1;
	}

}
