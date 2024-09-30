package com.itheima.test.test4;

/*
 * 练习：爬楼梯
 *
 * 可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶，有的时候一次爬三个台阶。
 * 如果这个楼梯有100个台阶，小明一共有多少种爬法呢？
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println(getCount(20));    // 121415
	}

	public static int getCount(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 4;
		}
		return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
	}
}
