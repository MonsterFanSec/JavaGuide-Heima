package com.itheima.lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 练习：Lambda表达式简化Comparator接口的匿名形式
 *
 * 定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
 *
 * 要求：
 * 按照字符串的长度进行排序，短的在前面，长的在后面。（暂时不比较字符串里面的内容）
 */
public class lambdaDemo4 {
	public static void main(String[] args) {
		String[] arr = {"a", "aaaa", "aaa", "aa"};

		// 如果以后我们要把数组中的数据按照指定的方式进行排序，就需要用到sort方法，而且要指定排序的规则
		// 匿名内部类的形式
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

		// lambda表达式的完整格式
		Arrays.sort(arr, (String o1, String o2) -> {
			return o1.length() - o2.length();
		});

		// lambda表达式的简写格式
		Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

		System.out.println(Arrays.toString(arr));    // [a, aa, aaa, aaaa]
	}
}
