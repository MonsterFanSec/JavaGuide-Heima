package com.itheima.stringcompare;

/*
 * Java的常用方法（比较）
 */

public class Test1 {
	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = "aaa";
		System.out.println(s1 == s2);    // true


		String s3 = "bbb";
		System.out.println(s1 == s3);    // false


		String s4 = new String("aaa");
		System.out.println(s1 == s4);    // false
	}
}
