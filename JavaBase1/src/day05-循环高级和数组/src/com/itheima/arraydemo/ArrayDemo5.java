package com.itheima.arraydemo;

public class ArrayDemo5 {
	public static void main(String[] args) {
		//1.定义一个数组
		int[] arr = {1, 2, 3, 4, 5};
		//长度：5
		//最小索引：0
		//最大索引：4（数组的长度 - 1）
		System.out.println(arr[2]);

		/**
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
		 * 	at com.itheima.arraydemo.ArrayDemo5.main(ArrayDemo5.java:22)
		 *
		 * 	索引越界异常
		 * 		原因：访问了不存在的索引
		 * 		避免：确认索引的范围
		 * 		最小索引：0
		 * 		最大索引：（数组的长度 - 1）
		 */
		System.out.println(arr[10]);
	}
}
