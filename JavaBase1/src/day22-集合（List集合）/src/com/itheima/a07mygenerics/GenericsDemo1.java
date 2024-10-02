package com.itheima.a07mygenerics;

import com.itheima.a01mycollection.Student;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 范型概述：
 *      泛型：是JDK5中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查。
 *      泛型的格式：<数据类型>
 *      注意：泛型只能支持引用数据类型。
 *
 * 没有泛型的时候，集合如何存储数据？
 *
 * 结论：
 *      如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型。此时可以往集合添加任意的数据类型。
 *      但是这样会带来一个坏处：我们在获取数据的时候，无法使用他的特有行为。
 *
 * 此时推出了泛型，可以在添加数据的时候就把类型进行统一。
 * 而且我们在获取数据的时候，也省的强转了，非常的方便。
 */
public class GenericsDemo1 {
	public static void main(String[] args) {
		// 1.创建集合的对象
		ArrayList list = new ArrayList<>();

		// 2.添加数据
		list.add(123);
		list.add("aaa");
		list.add(new Student("zhangsan", 123));


		// 3.遍历集合获取里面的每一个元素
		Iterator it = list.iterator();
		while (it.hasNext()) {
			// String str = (String) it.next();	    // 报错：class java.lang.Integer cannot be cast to class java.lang.String
			// System.out.println(str.length());


			Object obj = it.next();
			// 多态的弊端是不能访问子类的特有功能
			// obj.length();	// 报错：类型为java.lang.Object的变量 obj，没有方法 length()
			System.out.println(obj);
		}
	}
}
