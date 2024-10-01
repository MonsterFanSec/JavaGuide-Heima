package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection系列集合三种通用的遍历方式：
 *      1.迭代器遍历
 * 			a.迭代器不依赖索引
 * 			b.迭代器在Java中的类是Iterator，迭代器是集合专用的遍历方式。
 * 			c.Collection集合获取迭代器：
 * 				Iterator<E> iterator()  ：返回迭代器对象，默认指向当前集合的0索引（获取一个迭代器对象）
 * 			c.迭代器遍历相关的方法：
 *      		boolean hasNext()       ：判断当前指向的位置是否有元素，有元素返回true，没有元素返回false
 *      		E next()                ：获取当前位置的元素，并将迭代器对象移向下一个位置（获取当前指向的元素并移动指针）
 *      2.增强for遍历
 *      3.lambda表达式遍历
 *
 * 由于Set系列没有索引，所以无法利用普通for循环遍历
 * 普通for循环只能遍历List系列集合
 */
public class A03_CollectionDemo3 {
	public static void main(String[] args) {
		// 1.创建集合并添加元素
		Collection<String> coll = new ArrayList<>();
		coll.add("aaa");
		coll.add("bbb");
		coll.add("ccc");
		coll.add("ddd");

		// 2.获取迭代器对象
		// 迭代器就好比是一个箭头，默认指向集合的0索引处
		Iterator<String> it = coll.iterator();

		// 3.利用循环不断的去获取集合中的每一个元素
		while (it.hasNext()) {
			// 4.next方法的两件事情：获取元素并移动指针
			String str = it.next();
			System.out.println(str);
		}
	}
}
