package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/*
 * Collection系列集合三种通用的遍历方式：
 *      1.迭代器遍历
 *      2.增强for遍历
 *      3.lambda表达式遍历
 *
 * lambda表达式遍历：
 *      得益于JDK8开始的新技术Lambda表达式，提供了一种更简单、更直接的遍历集合的方式。
 *
 * lambda表达式遍历：
        default void forEach(Consumer<? super T> action):   结合lambda遍历集合
 */
public class A07_CollectionDemo6 {
	public static void main(String[] args) {
		// 1.创建集合并添加元素
		Collection<String> coll = new ArrayList<>();
		coll.add("zhangsan");
		coll.add("lisi");
		coll.add("wangwu");

		/*
		 * 2.利用匿名内部类的形式
		 *
		 * 底层原理：
		 *      其实也会自己遍历集合，依次得到每一个元素
		 *      把得到的每一个元素，传递给下面的accept方法
		 *      s依次表示集合中的每一个数据
		 */
		coll.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});

		// 3.改写成lambda表达式
		coll.forEach(s -> System.out.println(s));
	}
}
