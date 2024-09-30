package com.itheima.lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Lambda表达式的省略写法
 * 省略核心：可推导，可省略
 *
 * Lambda的省略规则：
 * 	1.参数类型可以省略不写。
 * 	2.如果只有一个参数，参数类型可以省略，同时()也可以省略。
 * 	3.如果Lambda表达式的方法体只有一行；大括号，分号，return可以省略不屑，需要同时省略。
 */
public class lambdaDemo3 {
	public static void main(String[] args) {
		Integer[] arr = {10, 2, 4, 5, 8, 7, 3, 9, 1, 6};

		// 1.匿名内部类的实现
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		// 2.lambda完整格式
		Arrays.sort(arr, (Integer o1, Integer o2) -> {
			return o1 - o2;
		});

		// 3.lambda省略写法
		Arrays.sort(arr, (o1, o2) -> o1 - o2);
		System.out.println(Arrays.toString(arr));
	}
}
