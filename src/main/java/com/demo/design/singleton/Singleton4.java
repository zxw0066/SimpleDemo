package com.demo.design.singleton;

/**
 * 双重锁(DCL)-线程安全
 * @author zhaoxingwu
 *
 */
public class Singleton4 {
	
	private Singleton4() {}
	
	private static volatile Singleton4 singleton1;
	
	public static Singleton4 getInstance() {
		if(singleton1 == null) {
			synchronized (Singleton4.class) {
				if(singleton1 == null) {
					singleton1 = new Singleton4();
				}
			}
		}
		return singleton1;
	}

}
