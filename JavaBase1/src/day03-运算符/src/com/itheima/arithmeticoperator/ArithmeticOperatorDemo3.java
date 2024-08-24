package com.itheima.arithmeticoperator;

public class ArithmeticOperatorDemo3 {
	public static void main(String[] args) {
		/**
		 * 当 “字符 + 字符” 或者 “字符 + 数字” 时，会把字符通过ASCII码表查询到对应的数字再进行计算。
		 * 如果出现 “字符串” 的相加，则变成拼接的形式。
		 */
		char c = 'a';
		int result = c + 0;
		System.out.println(result);    // 97

		System.out.println(1 + 'a');    // 98
		System.out.println('a' + "abc");    // aabc
	}
}
