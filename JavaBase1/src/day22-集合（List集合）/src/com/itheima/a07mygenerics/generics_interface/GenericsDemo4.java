package com.itheima.a07mygenerics.generics_interface;

/*
 * 泛型接口：
 *      格式：
 *          修饰符 interface 接口名<类型>{
 *
 *          }
 *
 *      举例：
 *          public interface List<E>{
 *
 *          }
 *
 *
 * 泛型接口的两种使用方式：
 *  1.实现类给出具体的类型
 *  2.实现类延续泛型，创建实现类对象时再确定类型
 */
public class GenericsDemo4 {
	public static void main(String[] args) {
		// 演示1：实现类给出具体的类型
		MyArrayList2 list = new MyArrayList2();
		list.add("aaa");
		list.add("bbb");
		// list.add(111);    // 报错


		// 演示2:实现类延续泛型，创建实现类对象时再确定类型
		MyArrayList3<String> list1 = new MyArrayList3<>();
		list.add("abc");
		list.add("def");
	}
}
