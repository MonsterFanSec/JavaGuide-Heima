package com.itheima.test.test4;

/*
 * 练习：爬楼梯
 *
 * 可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
 * 如果这个楼梯有100个台阶，小明一共有多少种爬法呢？
 *
 * 运算结果：
 * 1层台阶	1种爬法（1）
 * 2层台阶	2种爬法（1，1）、（2）
 * 3层台阶	3种爬法（1，1，1）、（1，2）、（2、1）
 * 4层台阶	5种爬法（1，1，1，1）+ 3层台阶的爬法【（1，1，2）、（1，2，1）、（2，1，1）】、2层台阶的爬法【（2，2）】
 * ...
 * 7层台阶	21种爬法
 * （斐波那契数列）
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(getCount(20));    // 10946
	}

	public static int getCount(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return getCount(n - 1) + getCount(n - 2);
	}
}
