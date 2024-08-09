package com.itheima.arithmeticoperator;

/**
 * @file: 自增运算符/自减运算符
 */
public class ArithmeticOperatorDemo4 {
	public static void main(String[] args) {
		// ++ 和 --
		int a = 10;

		// 表示把变量a里面的值+1
		a++;
		System.out.println(a);	// 11

		// 表示把变量a里面的值+1
		++a;
		System.out.println(a);	// 12

		// 表示把变量a里面的值-1
		a--;
		System.out.println(a);	// 11

		// 表示把变量a里面的值-1
		--a;
		System.out.println(a);	// 10
	}
}
