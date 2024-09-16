package com.itheima.interfacedemo7;

public class InterImpl implements Inter {
	@Override
	public void method() {
		System.out.println("InterImpl重写的抽象方法");
	}

	// 静态方法不需要重写，如果重写了，这个也不叫重写，只说明接口实现类当中有一个重名的方法而已；如果添加@Override，会报错
	public static void show() {
		System.out.println("InterImpl实现类中的静态方法");
	}
}
