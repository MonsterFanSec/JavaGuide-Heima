package com.itheima.test.test2;

/*
 * 练习：不死神兔
 *
 * 有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起，每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子不死，问第十二个月的兔子对数为多少？
 *
 * 1月：1
 * 2月：1
 * 3月：2
 * 4月：3
 * 5月：5
 * 6月：8
 *
 * 特点：从第三个数据开始，是前两个数据和（斐波那契数列）
 */
public class Test {
	public static void main(String[] args) {
		method1();
		System.out.println(method2(12));
	}

	// 抽取方法快捷键：command + shift + M
	// 求解一：
	private static void method1() {
		//	1.创建一个长度为12的数组
		int arr[] = new int[12];

		//	2.手动给0索引和1索引的数据进行赋值
		arr[0] = 1;
		arr[1] = 1;

		//	3.利用循环给剩余的数据进行赋值
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		//	 1 1 2 3 5 8...

		//	4.获取最大索引上的数据即可
		System.out.println(arr[11]);
	}

	/*
	 * 求解2:递归的方式去完成
	 * 1.递归的出口
	 * 2.找到递归的规律
	 *
	 * Fn(12) = Fn(11) + Fn(10);
	 * Fn(11) = Fn(10) + Fn(9);
	 * Fn(10) = Fn(9) + Fn(8);
	 * ...
	 *  Fn(3) =  Fn(2) +  Fn(1);
	 *  Fn(2) = 1;
	 *  Fn(1) = 1;
	 */
	private static int method2(int month) {
		if (month == 1 || month == 2) {
			return 1;
		}
		return method2(month - 1) + method2(month - 2);
	}
}
