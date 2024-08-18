package com.itheima.twodimensionarr;

public class Demo1 {
	public static void main(String[] args) {
		/*
		二维数组静态初始化:
		格式：数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1,元素2}};
		范例：int[][] arr = new int[][]{{11,22},{33,44}};

		简化格式：数据类型[][] 数组名 = {{元素1,元素2},{元素1,元素2}};
		范例：int[][] arr = {{11,22},{33,44}};
			 int arr[][] = {{11,22},{33,44}};*/

		//	1.二维数组静态初始化格式
		//	数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1,元素2}};
		int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
		// 以后建议这样定义，把每一个一维数组，单独写成一行；
		//	注意：每一个一维数组其实是二维数组中的元素，所以每一个一维数组之间需要用逗号隔开，最后一个一维数组后面不需要加逗号
		int[][] arr3 = {
				{1, 2, 3},
				{4, 5, 6, 7, 8}
		};

		//	2.获取元素 arr[i][j]
		// arr：二维数组
		// i：二维数组的索引，获取出来的是里面的一维数组
		// j：表示一维数组中的索引，获取出来的就是真正的元素
		//System.out.println(arr3[0]); // 第一个一维数组的地址值：[I@36baf30c
		//System.out.println(arr3[0][0]);    // 1
		//System.out.println(arr3[1][4]);    // 8
		//System.out.println(arr3[2][0]);    // 报错：ArrayIndexOutOfBoundsException

		//	3.遍历二维数组
		//  外循环：遍历二维数组，得到里面的每一个一维数组
		for (int i = 0; i < arr3.length; i++) {
			//	i：表示二维数组中的每一个索引
			//	arr3[i]：表示二维数组中的每一个元素（一维数组地址）
			//  内循环：遍历一维数组，得到里面的每一个元素
			for (int j = 0; j < arr3[i].length; j++) {
				//	j：表述一维数组中的每一个元素
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
