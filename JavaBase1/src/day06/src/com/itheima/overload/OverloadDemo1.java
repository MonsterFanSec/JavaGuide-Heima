package com.itheima.overload;

/**
 * 方法的重载：
 * - 在同一个类中，定义了多个同名的方法，这些同名的方法具有同种的功能。
 * - 每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了重载关系。
 *
 * 简单记：同一个类中，方法名相同，参数不同的方法。与返回值无关。
 * 参数不同：个数不同、类型不同、顺序不同
 */
public class OverloadDemo1 {
	// 两个整数求和方法
	public static int sum(int a, int b) {
		return a + b;
	}

	// 三个整数求和方法
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	// 四个整数求和方法
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	//	两个小数求和方法
	public static double sum(double a, double b) {
		return a + b;
	}
}
