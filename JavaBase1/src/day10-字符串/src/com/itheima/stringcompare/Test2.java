package com.itheima.stringcompare;

/*
 * Java的常用方法（比较）
 * 		字符串比较
 * 			- boolean equals方法（要比较的字符串）					完全一样结果才是true，否则为false
 * 			- boolean equalsIgnoreCase(要比较的字符串)			忽略大小写的比较
 */
public class Test2 {
	public static void main(String[] args) {
		// 1.创建两个字符串对象
		String s1 = new String("abc");
		String s2 = "Abc";


		// 2.==号比较
		// 基本数据类型：比的是数据值
		// 引用数据类型：比的是地址值
		System.out.println(s1 == s2);    //	false


		// 3.比较字符串对象中的内容是否相等
		boolean result1 = s1.equals(s2);
		System.out.println(result1);    //	false


		// 4.比较字符串对象中的内容是否相等，忽略大小写
		// 1，一，壹		-- 无法比较这一种（忽略大小写只能是英文状态下的a A）
		boolean result2 = s1.equalsIgnoreCase(s2);
		System.out.println(result2);    //	true
	}
}
