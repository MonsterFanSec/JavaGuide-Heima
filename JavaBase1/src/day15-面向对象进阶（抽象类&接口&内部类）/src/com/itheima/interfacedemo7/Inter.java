package com.itheima.interfacedemo7;

public interface Inter {
	public abstract void method();

	// 静态方法不需要重写；因为：private static final不会被继承到虚方法表中
	public static void show() {
		System.out.println("Inter接口中的静态方法");
	}
}
