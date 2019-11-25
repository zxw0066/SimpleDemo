package com.demo.design.singleton;

/**
 * 饿汉模式-线程安全
 * @author zhaoxingwu
 *
 */
public class Singleton3 {
	
	private Singleton3() {}
	
	private static Singleton3 singleton1 = new Singleton3();
	
	public static Singleton3 getInstance() {
		return singleton1;
	}

}
