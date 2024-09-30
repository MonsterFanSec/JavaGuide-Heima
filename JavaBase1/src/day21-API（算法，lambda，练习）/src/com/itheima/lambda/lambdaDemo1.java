package com.itheima.lambda;

import java.util.Arrays;

/*
 * 函数式编程：
 * 		函数式编程（Function programing）是一种思想特点。
 * 		函数式编程思想，忽略面向对象的复杂语法，强调做什么，而不是谁去做。
 *
 * 		面向对象：先找对象，让对象做事情。
 *
 * Lambda表达式的标准格式：
 * 		Lambda表达式是JDK8开始后的一种新语法形式。
 *
 * 		() -> {
 *
 * 		}
 *
 *
 * 		() 对应着方法的形参
 * 		-> 固定格式
 * 		{} 对应着方法的方法体
 *
 * 注意点：
 * 		- Lambda表达式可以用来简化匿名内部类的书写
 * 		- Lambda表达式只能简化函数式接口的匿名内部类的写法
 * 		- 函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
 */
public class lambdaDemo1 {
	public static void main(String[] args) {
		Integer[] arr = {10, 2, 4, 5, 8, 7, 3, 9, 1, 6};

		Arrays.sort(arr, (Integer o1, Integer o2) -> {
			return o1 - o2;
		});
		System.out.println(Arrays.toString(arr));    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
}
