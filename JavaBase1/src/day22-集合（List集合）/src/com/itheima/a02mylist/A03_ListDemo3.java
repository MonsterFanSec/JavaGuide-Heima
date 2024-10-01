package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * List系列集合的五种遍历方式：
 *      1.迭代器
 *      2.列表迭代器
 *      3.增强for
 *      4.Lambda表达式
 *      5.普通for循环
 */
public class A03_ListDemo3 {
	public static void main(String[] args) {
		// 创建集合并添加元素
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		System.out.println("====================1.迭代器======================");
		//1.迭代器
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		System.out.println("=====================2.增强for=====================");
		// 2.增强for
		// 下面的变量s，其实就是一个第三方的变量而已。在循环的过程中，依次表示集合中的每一个元素
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("=====================3.Lambda表达式=====================");
		/*
		 * 3.Lambda表达式
		 * forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
		 * 并把每一个元素传递给下面的accept方法
		 *
		 * accept方法的形参s，依次表示集合中的每一个元素
		 */
		list.forEach(s -> System.out.println(s));


		System.out.println("=====================4.普通for循环=====================");
		// 4.普通for循环
		// size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
		for (int i = 0; i < list.size(); i++) {
			// i:依次表示集合中的每一个索引
			String s = list.get(i);
			System.out.println(s);
		}

		System.out.println("=====================5.列表迭代器=====================");
		/*
		 * 5.列表迭代器
		 * 		获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
		 *
		 * 		迭代器额外添加了一个方法：在遍历的过程中，可以添加/删除元素。
		 */
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			String str = it2.next();
			if ("bbb".equals(str)) {
				it2.add("qqq");
			}
		}
		System.out.println(list);
	}
}
