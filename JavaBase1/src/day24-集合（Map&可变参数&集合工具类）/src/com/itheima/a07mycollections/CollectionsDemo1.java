package com.itheima.a07mycollections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Collections：
 * 		- import java.util.Collections：是集合工具类
 * 		- 作用：Collections不是集合，而是集合的工具类
 *
 * Collections常用的API：
 * public static <T> boolean addAll(Collection<T> c, T... elements)        批量添加元素（只能给单列集合添加。双列集合不行）
 * public static void shuffle(List<?> list)                                打乱List集合元素的顺序
 */
public class CollectionsDemo1 {
	public static void main(String[] args) {
		// 1.创建集合对象
		ArrayList<String> list = new ArrayList<>();
		// 2.addAll 批量添加元素
		Collections.addAll(list, "abc", "bcd", "qwer", "df", "asdf", "zxcv", "1234", "qwer");
		// 3.打印集合
		System.out.println(list);

		// shuffle 打乱
		Collections.shuffle(list);
		System.out.println(list);
	}
}
