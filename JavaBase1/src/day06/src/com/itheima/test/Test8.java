package com.itheima.test;

public class Test8 {
	public static void main(String[] args) {
		/**
		 * 复制数组
		 * 需求：定义一个方法copyOfRange(int[] arr, int from, int to)
		 * 功能：将数组arr中从索引from（包含from）开始。
		 * 		到索引to结束（不包含to）的元素复制到新数组中，
		 * 		将新数组返回。
		 */

		// 1.定义原始数组
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		// 2.调用方法拷贝数据
		int[] copyArr = copyOfRange(arr, 3, 7);
		System.out.println(copyArr);    // [I@36baf30c
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}

	public static int[] copyOfRange(int[] arr, int from, int to) {    // (需要索引3～索引7，即数据3，4，5，6)
		// 1.定义数组
		// 静态初始化：知道所有元素的时候使用
		// 动态初始化：不知道所有元素，但知道要存几个元素
		int[] newArr = new int[to - from];

		// 3.伪造索引的思想
		int index = 0;

		// 2.把原是数组arr中的from到to上对应的元素，直接拷贝到newArr中
		for (int i = from; i < to; i++) {
			// 格式： 数组名[索引] = 数据值;
			newArr[index] = arr[i];
			index++;
		}

		// 4.把新数组返回
		return newArr;
	}
}
