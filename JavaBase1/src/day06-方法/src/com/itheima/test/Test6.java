package com.itheima.test;

public class Test6 {
	/**
	 * 数组最大值
	 * 需求：设计一个方法求数组的最大值，并将最大值返回
	 */
	public static void main(String[] args) {
		// 1.定义数组
		int[] arr = {1, 5, 7, 3, 8, 10};

		// 2.调用方法求最大值
		int max = getMax(arr);    // 先输入“getMax(arr)”，按住方法名，快捷键 command + option + v，自动补充遍历
		System.out.println(max);
	}


	// 1.我要干嘛？	--求最大值
	// 2.我干这件事情需要什么才能完成？	--数组
	// 3.方法的调用处是否需要继续使用结果？	--需要返回值
	public static int getMax(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
