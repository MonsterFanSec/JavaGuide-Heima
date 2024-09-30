package com.itheima.sort.selectionDemo;

/*
 * 选择排序：
 *  1.从0索引开始，跟后面的元素一一比较。
 *  2.小的放前面，大的放后面。
 *  3.第一次循环结束后，最小的数据已经确定。
 *  4.第二次循环从1索引开始以此类推。
 */
public class A02_SelectionDemo1 {
	public static void main(String[] args) {
		// 1.定义数组
		int[] arr = {2, 4, 5, 3, 1};

		// 2.利用选择排序让数组变成 1 2 3 4 5

		// 第一轮：
		// 从0索引开始，跟后面的元素一一比较。
		for (int i = 0 + 1; i < arr.length; i++) {    // 第一次比较，可以拿着0索引跟后面的数据进行比较，因此后面那个数的索引可以是1开始
			if (arr[0] > arr[i]) {
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
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
