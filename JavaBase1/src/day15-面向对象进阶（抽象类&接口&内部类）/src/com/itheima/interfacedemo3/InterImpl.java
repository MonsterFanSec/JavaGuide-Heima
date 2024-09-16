package com.itheima.interfacedemo3;

public class InterImpl implements Inter1, Inter2 {
	/**
	 * 实现多个接口时，遇到重名方法时，只需要重写一遍即可
	 */
	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}

	@Override
	public void method4() {
		System.out.println("method4");
	}
}
