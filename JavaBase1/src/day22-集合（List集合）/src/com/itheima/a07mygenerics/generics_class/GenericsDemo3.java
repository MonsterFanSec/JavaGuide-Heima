package com.itheima.a07mygenerics.generics_class;

/*
 * 泛型可以在很多地方进行定义：
 *
 * 类后面，则叫：泛型类
 * 方法上面，则叫：泛型方法
 * 接口后面，则叫：泛型接口
 *
 * 泛型类：
 * 		使用场景：当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类。
 *
 * 		格式：
 * 			修饰符 class 类名<类型>{
 *
 * 			}
 *
 * 		举例：
 * 			public class ArrayList<E>{
 * 				// 创建该类对象时，E就确定类型
 * 			}
 *
 * 		此处E可以理解为变量，但是不是用来记录数据的，而是记录数据的类型，可以写成：T（type）、E（element）、K（key）、V（value）
 */
public class GenericsDemo3 {
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		System.out.println("===========================");

		MyArrayList<Integer> list2 = new MyArrayList<>();
		list2.add(123);
		list2.add(456);
		list2.add(789);

		int i = list2.get(0);
		System.out.println(i);

		System.out.println(list2);
	}
}
