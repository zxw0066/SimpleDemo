package com.demo;

class Adapter extends BeAdapted implements TargetInterface{

	@Override
	public void method2(){                // method2()方法无法通过继承获得，因而需要自己声明，这就是适配器为我们产生的接口
        System.out.println("method2");
    }
	
}