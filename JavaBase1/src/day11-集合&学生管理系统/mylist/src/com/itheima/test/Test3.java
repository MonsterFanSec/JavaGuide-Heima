package com.itheima.test;

import java.util.ArrayList;

/**
 * 需求：定义一个集合，添加字符，并进行遍历
 * 		遍历格式参照：[元素1，元素2，元素3]
 */

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();

		list.add('a');
		list.add('b');
		list.add('c');

		System.out.println(list);
	}
}
