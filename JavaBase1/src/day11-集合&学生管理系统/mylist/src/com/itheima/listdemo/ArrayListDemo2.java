package com.itheima.listdemo;


import java.util.ArrayList;

/**
 * 添加：
 * boolean add(E e)
 * 删除：
 * boolean remove(E e)     		--> 直接删除元素
 * E remove(int index)			--> 删除索引位置元素
 * 修改：
 * E set(int index,E e)
 * 查询：
 * E get(int index)
 * int size()        			--> 获取长度：.size()，调用方法后返回集合的长度；【注意不是.length()】
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 1.创建一个集合
		ArrayList<String> list = new ArrayList<>();


		// 2.添加元素
		boolean result = list.add("aaa");    // 不管添加什么，add都会返回true
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(result);    // true
		System.out.println(list);    // [aaa, aaa, bbb, ccc]


		// 3.删除元素
		boolean result1 = list.remove("aaa");    // 如果删除成功，返回true
		System.out.println(result1);    // true

		boolean result2 = list.remove("ddd");    // 如果删除失败，返回false
		System.out.println(result2);    // false

		String str = list.remove(2);          // 根据索引进行删除，返回被删除的元素
		System.out.println(str);        // ccc


		// 4.修改元素
		String result3 = list.set(1, "ddd");        // 将"ddd"修改为索引1位置的元素，并返回被修改元素
		System.out.println(result3);    // bbb
		System.out.println(list);       // [aaa, ddd]


		// 5.查询元素
		String s = list.get(0);
		System.out.println(s);          // aaa


		// 6.遍历
		System.out.println(list.size());    // 2
		for (int i = 0; i < list.size(); i++) {        // 快捷键：list.fori，也会自动生成代码
			// i 索引
			// list.get(i) 元素
			String str1 = list.get(i);
			System.out.println(str1);
		}
	}
}
