package com.itheima.search;

/*
 * 基本查找/顺序查找
 * 核心：从0索引开始挨个往后查找
 *
 * 需求：定义一个方法利用基本查找，查询某个元素是否存在
 * 数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
 */
public class A01_BasicSearchDemo1 {
	public static void main(String[] args) {
		int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
		int number = 81;
		System.out.println(BasicSearch(arr, number));
		;
	}

	/**
	 * 基本查找/顺序查找
	 *
	 * @param arr    数组
	 * @param number 要查找的元素
	 * @return 元素是否存在
	 */
	public static boolean BasicSearch(int[] arr, int number) {
		//	利用基本查找来查找number在数组中是否存在
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return true;
			}
		}
		return false;
	}
}
