package com.itheima.a03myarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList集合底层原理：
 * 1.利用空参创建的集合，在底层创建一个默认长度为0的数组
 * 2.添加第一个元素时，底层会创建一个新的长度为10的数组
 * 3.存满时，会扩容1.5倍
 * 4.如果一次添加多个元素，1.5倍还放不下，则新创建数组的长度以实际为准
 *
 * 双击shift，搜索ArrayList，选择classes，文件位置选择All places，快捷键：command + 数字7，查看大纲。
 *
 */
public class A01_ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2);
	}
}


