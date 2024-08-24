package com.itheima.twodimensionarr;

public class Demo2 {

	/*
	二维数组的动态初始化:
	格式：数据类型[][] 数组名 = new 数据类型[m][n];
	m表示这个二维数组，可以存放多少个一维数组
	n表示每一个一维数组，可以存放多少个元素

	范例：int[][] arr = new int[2][3];
	该数组可以存放2个一维数组，每个一维数组中可以存放3个int类型元素*/

	//	1.利用动态初始化格式创建二维数组
	//	3：表示二维数组长度为3，可以装3个一维数组
	//	5：表示每一个一维数组的长度都是5，可以装5个int类型的元素
	public static void main(String[] args) {
		int[][] arr = new int[3][5];

		//	给二维数组赋值一个元素
		arr[0][0] = 10;

		//	遍历二维数组
		//	外循环：遍历二维数组获取里面的每一个一维数组
		//	内循环：遍历一维数组获取里面每一个元素
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}


		// 特殊情况一：
		int[][] arr4 = new int[2][];
		int[] arr5 = {11, 22};
		int[] arr6 = {44, 55, 66};
		arr4[0] = arr5;
		arr4[1] = arr6;

		//	特殊情况二：
		int[][] arr7 = new int[2][3];
		int[] arr8 = {11, 22};
		int[] arr9 = {44, 55, 66};
		arr7[0] = arr8;
		arr7[1] = arr9;
	}
}
