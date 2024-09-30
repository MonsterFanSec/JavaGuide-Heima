package com.itheima.sort;

/*
 * 冒泡排序：
 *
 * 核心思想：
 *  1.相邻的元素两两比较，大的放右边，小的放左边。
 *  2.第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
 *  3.如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
 */
public class A01_BubbleDemo1 {
	public static void main(String[] args) {
		// 1.定义数组
		int[] arr = {2, 4, 5, 3, 1};

		// 2.利用冒泡排序将数组中的数据变成 1 2 3 4 5

		// 第一轮
		for (int j = 0; j < arr.length - 1; j++) {
			// i 依次表示数组中的每一个索引：0 1 2 3 4
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		printArr(arr);

		// 第二轮
		for (int j = 0; j < arr.length - 1 - 1; j++) {    // 表示最后一项不用再参与排序
			// i 依次表示数组中的每一个索引：0 1 2 3 4
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		printArr(arr);


		// 第三轮
		for (int j = 0; j < arr.length - 1 - 2; j++) {    // 表示最后两项不用再参与排序
			// i 依次表示数组中的每一个索引：0 1 2 3 4
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		printArr(arr);

		// 第四轮
		for (int j = 0; j < arr.length - 1 - 3; j++) {
			// i 依次表示数组中的每一个索引：0 1 2 3 4
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		printArr(arr);
	}

	private static void printArr(int[] arr) {
		// 3.遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}