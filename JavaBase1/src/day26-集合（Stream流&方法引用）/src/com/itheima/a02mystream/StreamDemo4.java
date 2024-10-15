package com.itheima.a02mystream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * 数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
 *
 * 演示：数组获取stream流
 */
public class StreamDemo4 {
	public static void main(String[] args) {
		// 1.创建数组
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    // 基本数据类型
		String[] arr2 = {"a", "b", "c"};    // 引用数据类型

		// 2.获取stream流
		Arrays.stream(arr1).forEach(s -> System.out.println(s));	// Arrays底层会根据传入数据类型调用不同的stream方法
		System.out.println("============================");

		Arrays.stream(arr2).forEach(s -> System.out.println(s));
		System.out.println("============================");
	}
}
