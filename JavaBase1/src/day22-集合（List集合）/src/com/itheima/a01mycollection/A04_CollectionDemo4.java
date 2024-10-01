package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 迭代器的细节注意点：
 * 1.报错NoSuchElementException
 * 2.迭代器遍历完毕，指针不会复位
 * 3.循环中只能用一次next方法
 * 4.迭代器遍历时，不能用集合的方法进行增加或者删除
 * 		暂时当作一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
 * 		如果我实在要删除：那么可以用迭代器提供的remove方法进行删除。
 * 		如果我要添加，暂时没有方法。
 *
 *
 * 总结：
 * 	1.迭代器在遍历集合的时候是不依赖索引的
 *  2.迭代器需要掌握三个方法：
 * 				Iterator<String> it = coll.iterator();
 * 				while (it.hasNext()) {
 * 					String str = it.next();
 * 					System.out.println(str);
 * 				}
 *  3.迭代器的四个细节：
 * 		- 如果当前位置没有元素，还要强行获取，会报NoSuchElementException
 * 		- 迭代器遍历完毕，指针不会复位
 * 		- 循环中只能用一次next方法
 * 		- 迭代器遍历时，不能用集合的方法进行增加或者删除（没有进行遍历时，可以增加或者删除）
 */
public class A04_CollectionDemo4 {
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

		// 当上面循环结束之后，迭代器的指针已经指向了最后没有元素的位置
		// System.out.println(it.next()); // NoSuchElementException

		// 迭代器遍历完毕，指针不会复位；
		System.out.println(it.hasNext());    // 多次调用，都是false
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());

		// 如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
		Iterator<String> it2 = coll.iterator();
		while (it2.hasNext()) {
			String str1 = it2.next();
			String str2 = it2.next();
			System.out.println("str1" + str1);
			System.out.println("str2" + str2);
		}


		Iterator<String> it3 = coll.iterator();
		while (it3.hasNext()) {
			String str3 = it3.next();
			System.out.println("str3" + str3);
			if ("bbb".equals(str3)) {
				//coll.remove("bbb");        // 报错：ConcurrentModificationException
				it3.remove();
			}
		}
		System.out.println(coll);
	}
}
