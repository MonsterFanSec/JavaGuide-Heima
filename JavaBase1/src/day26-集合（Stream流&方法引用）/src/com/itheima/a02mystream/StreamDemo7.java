package com.itheima.a02mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
 * distinct            元素去重，依赖(hashCode和equals方法)
 * concat              合并a和b两个流为一个流
 *
 * 注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
 * 注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
 *
 * distinct底层是用HashSet实现去重的，所以如果流里面存的是类似Student之类的自定义对象，记得重写hashCode和equals方法
 * concat需要尽可能保持数据类型一致，如果不一致，大流的数据类型是两个子流的父类
 */
public class StreamDemo7 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "张无忌", "张无忌", "张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

		// distinct            元素去重，依赖(hashCode和equals方法)
		list1.stream().distinct().forEach(s -> System.out.println(s));

		System.out.println("===================================");

		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "周芷若", "赵敏");
		// concat              合并a和b两个流为一个流
		Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));
	}
}
