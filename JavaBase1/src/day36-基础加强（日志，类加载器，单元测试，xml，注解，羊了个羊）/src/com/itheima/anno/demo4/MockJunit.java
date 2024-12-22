package com.itheima.anno.demo4;

/*
 * 案例：模拟Junit框架
 * 需求：
 * 		定义若干个方法，只要加了MyTest注解，就可以在启动时被出发执行。
 * 分析：
 * 		定义一个自定义注解MyTest，只能注解方法，存活范围是一直都在。
 * 		定义若干个方法，只要有@MyTest注解的方法就能在启动时被触发执行，没有这个注解的方法不能执行。
 */
public class MockJunit {
	// 程序运行之后，需要自动运行method1和method2
	@MyTest
	public void method1() {
		System.out.println("method1");
	}

	@MyTest
	public void method2() {
		System.out.println("method2");
	}


	public void method3() {
		System.out.println("method3");
	}
}
