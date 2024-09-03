package com.itheima.underlying_principle;

/**
 * 问题：下列代码的运行结果是？
 *
 * 在编译的时候，就会将"a" + "b" + "c"拼接为"abc"
 */
public class Test2 {
	public static void main(String[] args) {
		String s1 = "abc";	// 记录串池中的地址值
		String s2 = "a" + "b" + "c";	// 复用串池中的字符串
		System.out.println(s1 == s2);	// true
	}
}
