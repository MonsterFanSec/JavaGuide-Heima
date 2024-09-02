package com.itheima.stringbuilderdemo;

/**
 * 为什么学习StringBuilder？
 *
 * StringBuilder概述
 * 		StringBuilder可以看成时一个容器，创建之后里面的内容是可变的
 * 		- 作用：提高字符串的操作效率
 */

public class Demo1 {
	public static void main(String[] args) {
		//stringAdd();
		stringBuilderAdd();
	}

	// 你就耐心的等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等等下去吧～
	public static void stringAdd() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + "abc";
		}
		System.out.println(s);
	}

	// 哎哟！这个屌 这个屌
	public static void stringBuilderAdd() {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < 1000000; i++) {
			sb.append("abc");
		}
		System.out.println(sb);
	}
}
