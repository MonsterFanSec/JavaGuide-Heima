package com.itheima.a05source;

import java.util.TreeMap;

/*
 * 课堂思考问题：
 * 1.TreeMap添加元素的时候，键是否需要重写hashCode和equals方法？
 * 		此时是不需要重写的。
 *
 * 2.HashMap是哈希表结构的，JDK8开始由数组，链表，红黑树组成的。既然有红黑树，HashMap的键是否需要实现Compareable接口或者传递比较器对象呢？
 * 		不需要的。
 * 		因为在HashMap的底层，默认是利用哈希值的大小关系来创建红黑树的。
 *
 * 3.TreeMap和HashMap谁的效率更高？
 * 		如果是最坏情况，添加了8个元素，这8个元素形成了链表，此时TreeMap的效率要更高。（但是这种情况出校的几率非常小）
 * 		一般而言，还是HashMap的效率要更高。
 *
 * 4.你觉得在HashMap集合中，java会提供一个“如果键重复了，不会覆盖”的put方法吗？
 * 		此时putIfAbsent方法本身逻辑不重要。
 * 		需要传递的一个思想是：
 * 			代码中的逻辑都有两面性，如果我们只知道了其中的A面，而且代码中还发现了有变量可以控制两面性的发生，那么该逻辑一定会有B面。
 * 		习惯：
 * 			boolean类型的变量控制：一般只有AB两面，因为boolean只有2个值
 * 			int类型的变量控制：一般至少有三面（如：正数，负数，零），因为int可以有多个值
 *
 * 5.三种双列集合，以后如何选择？
 * 		HashMap		LinkedHashMap		TreeMap
 *
 * 		默认：HashMap（效率最高）
 * 		如果要保证存取有序：LinkedHashMap
 * 		如果要进行排序：TreeMap
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "aaa");
		tm.put(2, "bbb");
		tm.put(3, "ccc");
		tm.put(4, "ddd");

		System.out.println(tm);
	}
}
