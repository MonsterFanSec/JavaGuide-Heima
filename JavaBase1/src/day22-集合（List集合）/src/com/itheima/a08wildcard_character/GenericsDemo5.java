package com.itheima.a08wildcard_character;

import java.util.ArrayList;

/**
 * 泛型的继承和通配符：
 * 泛型不具备继承性，但数据具备继承性
 */
public class GenericsDemo5 {
	public static void main(String[] args) {
		// 创建集合的对象
		ArrayList<GrandFather> list1 = new ArrayList<>();
		ArrayList<Father> list2 = new ArrayList<>();
		ArrayList<Children> list3 = new ArrayList<>();

		// 泛型不具备继承性
		method(list1);
		// method(list2);
		// method(list3);

		// 数据具备继承性
		list1.add(new GrandFather());
		list1.add(new Father());
		list1.add(new Children());
	}


	/*
	 * 此时，泛型里面写的是什么类型，那么只能传递什么类型的数据。
	 */
	public static void method(ArrayList<GrandFather> list) {

	}
}


class GrandFather {
}

class Father extends GrandFather {
}

class Children extends Father {
}
