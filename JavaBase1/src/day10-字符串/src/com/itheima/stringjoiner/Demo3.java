package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class Demo3 {
	public static void main(String[] args) {
		//1.创建对象
		StringJoiner sj = new StringJoiner(", ", "[", "]");

		//2.添加元素
		sj.add("aaa").add("bbb").add("ccc");

		int len = sj.length();
		System.out.println(sj);    // [aaa, bbb, ccc]，sj的类型为StringJoiner
		System.out.println(len);    // 15

		// 3.toString()
		String str = sj.toString();
		System.out.println(str);    // [aaa, bbb, ccc]，str的类型为String
		System.out.println(str.length());    // 15
	}
}
