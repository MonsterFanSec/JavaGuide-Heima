package com.itheima.arrays;

import java.util.Arrays;

/**
 * public static String toString(数组)							把数组拼接成一个字符串
 * public static int binarySearch(数组，查找的元素)				二分查找法查找元素
 * public static int[] copyOf(原素组，新数组长度)					拷贝数组
 * public static int[] copyOfRange(原素组，起始索引，结束索引)		拷贝数组（指定范围）
 * public static void fill(数组，元素)							填充数组
 * public static void sort(数组)									按照默认方式进行数组排序
 * public static void sort(数组，排序规则)						按照指定的规则排序
 */
public class MyArraysDemo1 {
	public static void main(String[] args) {
		// toString：将数组变成字符串
		System.out.println("----------------toString--------------");
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(arr));


		/*
		 * binarySearch：二分查找法查找元素
		 *
		 * 细节1:二分查找的前提是数组中的元素必须是有序的，且数组中的元素必须是升序的。
		 * 细节2:如果要查找的元素是存在的，那么返回的是真实的索引
		 *
		 * 但是，如果要查找的元素是不存在的，则返回的是：-插入点 - 1
		 *
		 * 疑问：为什么要减1呢？
		 * 解释：如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
		 * 如果要查找数字0，此时0是不存在的；但是根据上面的规则：返回的值是-插入点，应该就是-0；此时有误
		 * 为了避免这样的情况，Java在这个基础上又减1；
		 */
		System.out.println("----------------binarySearch--------------");
		System.out.println(Arrays.binarySearch(arr, 10));    // 9
		System.out.println(Arrays.binarySearch(arr, 2));    // 1
		System.out.println(Arrays.binarySearch(arr, 20));    // -11


		/*
		 * copyOf：拷贝数组
		 * 参数一：老数组
		 * 参数二：新数组的长度
		 *
		 * 方法的底层会根据第二个参数来创建新的数组：
		 * 如果新数组的长度是小于老数组的长度，会部分拷贝
		 * 如果新数组的长度是等于老数组的长度，会完全拷贝
		 * 如果新数组的长度是大于老数组的长度，会补上默认初始值
		 */
		System.out.println("----------------copyOf--------------");
		int[] newArr1 = Arrays.copyOf(arr, 2);    // [1, 2]
		int[] newArr2 = Arrays.copyOf(arr, 10);    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		int[] newArr3 = Arrays.copyOf(arr, 20);    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(newArr2));


		/*
		 * copyOfRange：拷贝数组（指定范围）
		 * 细节：包头不包尾，包左不包右
		 */
		System.out.println("----------------copyOfRange--------------");
		int[] newArr4 = Arrays.copyOfRange(arr, 0, 7);
		System.out.println(Arrays.toString(newArr4));    // [1, 2, 3, 4, 5, 6, 7]


		//	fill:填充数组
		System.out.println("----------------fill--------------");
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));    // [100, 100, 100, 100, 100, 100, 100, 100, 100, 100]


		//	sort:排序。默认情况下，给基本数据类型进行升序排序。底层使用的是快速排序。
		System.out.println("----------------sort--------------");
		int[] arr2 = {10, 2, 4, 5, 8, 7, 3, 9, 1, 6};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
}
