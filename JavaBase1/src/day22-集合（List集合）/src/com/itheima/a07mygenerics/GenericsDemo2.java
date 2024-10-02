package com.itheima.a07mygenerics;

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
 *
 * 泛型的好处：
 * 		1.统一数据类型。
 * 		2.把运行时期的问题提前到了编译时期，避免了强制类型转换可能出现的异常，因为在比编译阶段就能确定下来。
 *
 * 扩展知识点：
 * 		Java中的泛型是伪泛型：
 * 			Java文件-------(泛型的擦除)------->class文件
 *
 * 泛型的细节：
 * 		1.泛型中不能写基本数据类型（基本数据类型不能转为Object类型，如果要传基本数据，则需要转成对应的包装类；如int-->Integer）。
 * 		2.指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型。
 * 		3.如果不屑泛型，类型默认时Object
 */
public class GenericsDemo2 {
	public static void main(String[] args) {
		// 1.创建集合的对象
		ArrayList<String> list = new ArrayList<>();

		// 2.添加数据
		// list.add(123);  // 报错
		list.add("aaa");
		// list.add(new Student("zhangsan",123));     // 报错

		// 3.遍历集合获取里面的每一个元素
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
